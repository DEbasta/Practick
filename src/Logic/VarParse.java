package Logic;

import Constants.Constants;

import java.math.BigInteger;

public class VarParse {

    private static final String zero = "0";
    private static final Character zeroChar = '0';
    private static final String dash = "-";
    private static final String commaSplit = ", ";
    private static final String comma = ",";



    public static boolean parseAble(String s){
        if (s.equals("")||s.equals(Constants.emptyFieldValue))
            return true;
        else {
            String decoded_s = (new BigInteger(s, 36)).toString();
            return decoded_s.length() % 2 == 0;
        }
    }


    public static String[] parse(String s, boolean flag, int amount){
        if (flag) {
            String[] vect = s.split(dash);
            for (int i = 0; i < vect.length; ++i)
                if (vect[i].length() == 1)
                    vect[i] = zero.concat(vect[i]);
            return vect;
        }
        else {
            String[] vect;
            vect = new String[amount];
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
        return (new BigInteger(b.toString())).toString(Constants.encodingRadix);
    }

    public static String[] specialParseDZ1(String[] array, int nuberOfFinalParam){
        String[] mass;
        for (int i = 0; i<array.length;++i){
            if (array[i].charAt(0) == zeroChar)
                array[i] = array[i].substring(1,array[i].length());
        }
        mass = new String[nuberOfFinalParam];
        mass[0] = array[0];
        mass[1] = array[1];
        mass[2] = array[2];
        mass[3] = array[3];
        mass[4] = array[4].concat(comma + array[5]);
        mass[5] = array[6].concat(comma + array[7]);
        mass[6] = array[8];
        mass[7] = array[9].concat(comma + array[10]);


        mass[8] = array[11];
        mass[9] = array[12].concat(comma + array[13]);
        mass[10] = array[14];
        mass[11] = array[15];
        mass[12] = array[16];
        mass[13] = array[17].concat(comma + array[18]);

        return mass;
    }

    public static String[] specialParseDZ3(String[] array, int nuberOfFinalParam){
        String[] mass;
        for (int i = 0; i<array.length;++i){
            if (array[i].charAt(0) == zeroChar)
                array[i] = array[i].substring(1,array[i].length());
        }
        mass = new String[nuberOfFinalParam];
        mass[0] = array[0];
        mass[1] = array[1].concat(commaSplit + array[2]);
        mass[2] = array[3];
        mass[3] = array[4];
        mass[4] = array[5].concat(commaSplit + array[6].concat(commaSplit + array[7]));
        mass[5] = array[8];
        mass[6] = array[9].concat(commaSplit + array[10]);

        mass[7] = array[11].concat(commaSplit + array[12]);
        mass[8] = array[13].concat(commaSplit + array[14].concat(array[15]));
        mass[9] = array[16].concat(array[17]);
        mass[10] = array[18];
        mass[11] = array[19].concat(commaSplit + array[20]);
        mass[12] = array[21].concat(commaSplit + array[22]);
        mass[13] = array[23].concat(array[24]);
        mass[14] = array[25];


        return mass;
    }
}
