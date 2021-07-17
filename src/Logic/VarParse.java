package Logic;

import java.math.BigInteger;

public class VarParse {

    public static boolean parseAble(String s){
        if (s.equals("")||s.equals("Поле для повторной генерации"))
            return true;
        else {
            String decoded_s = (new BigInteger(s, 36)).toString();
            return decoded_s.length() % 2 == 0;
        }
    }
    public static boolean parseAble4Data(String s){
        return true;
    }


    public static String[] parse(String s, boolean flag){
        if (flag) {
            String[] vect = s.split("-");
            for (int i = 0; i < vect.length; ++i)
                if (vect[i].length() == 1)
                    vect[i] = "0".concat(vect[i]);
            return vect;
        }
        else {
            String[] vect;
            vect = new String[26];
            int i = 0;
            while (s.length() > 0) {
                vect[i] = s.substring(0,2);
                s = s.substring(2,s.length());
                ++i;
            }
            return vect;
        }

    }

    public static String encode(String[] mass){
        StringBuilder b = new StringBuilder();
        for (String i:mass)
            b.append(i);
        return (new BigInteger(b.toString())).toString(36);
    }

    public static String[] specialParseDZ3(String[] array){
        String[] mass;
        for (int i = 0; i<array.length;++i){
            if (array[i].charAt(0) == '0')
                array[i] = array[i].substring(1,array[i].length());
        }
        mass = new String[15];
        mass[0] = array[0];
        mass[1] = array[1].concat(", "+array[2]);
        mass[2] = array[3];
        mass[3] = array[4];
        mass[4] = array[5].concat(", "+array[6].concat(", "+array[7]));
        mass[5] = array[8];
        mass[6] = array[9].concat(", "+array[10]);

        mass[7] = array[11].concat(", "+array[12]);
        mass[8] = array[13].concat(", "+array[14].concat(array[15]));
        mass[9] = array[16].concat(array[17]);
        mass[10] = array[18];
        mass[11] = array[19].concat(", "+array[20]);
        mass[12] = array[21].concat(", "+array[22]);
        mass[13] = array[23].concat(array[24]);
        mass[14] = array[25];


        return mass;
    }
}
