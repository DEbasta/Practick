package Logic;

import Constants.Constants;

import java.math.BigInteger;

public class VarParse {

    private static final String zero = "0";
    private static final String one = "1,";
    private static final Character zeroChar = '0';
    private static final String dash = "-";
    private static final String commaSplit = ", ";
    private static final String comma = ",";
    private final static String ex = "x";



    public static boolean parseAble(String s){
        if (s.equals(Constants.nothingString)||s.equals(Constants.emptyFieldValue))
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

    public static String remakeVar(String var){
        String s = "";
        while (var.length()>0){
            s = s.concat(var.substring(0,2) + "-");
            var = var.substring(2, var.length());
        }
        return s;
    }

    public static String decode(String input){
        return (new BigInteger(input, Constants.encodingRadix)).toString();
    }

    public static String encode(String[] mass){
        StringBuilder b = new StringBuilder();
        for (String i:mass)
            b.append(i);
        return (new BigInteger(b.toString())).toString(Constants.encodingRadix);
    }

    public static String[] specialParseDZ1(String[] array, int nuberOfFinalParam, int changeType){
        String[] mass;
        for (int i = 0; i<array.length;++i){
            if (array[i].charAt(0) == zeroChar)
                array[i] = array[i].substring(1,array[i].length());
        }
        mass = new String[nuberOfFinalParam];

        switch (changeType){
            case 1: {
                mass[0] = array[1];//first tab
                mass[1] = array[2];
                mass[2] = array[3];
                mass[3] = array[4];
                mass[4] = array[5].concat(comma + array[6]);
                mass[5] = array[7].concat(comma + array[8]);
                mass[6] = array[9];
                mass[7] = array[10].concat(comma + array[11]);
            }
                break;
            case 2: {
                mass[0] = array[1];//second tab
                mass[1] = array[2].concat(comma + array[3]);
                mass[2] = array[4];
                mass[3] = array[5];
                mass[4] = array[6];
                mass[5] = array[7].concat(comma + array[8]);
            }
                break;
            case 3: {
                mass[0] = array[1];//first tab
                mass[1] = array[2];
                mass[2] = array[3];
                mass[3] = array[4];
                mass[4] = array[5].concat(comma + array[6]);
                mass[5] = array[7].concat(comma + array[8]);
                mass[6] = array[9];
                mass[7] = array[10].concat(comma + array[11]);

                mass[8] = array[13];//second tab
                mass[9] = array[14].concat(comma + array[15]);
                mass[10] = array[16];
                mass[11] = array[17];
                mass[12] = array[18];
                mass[13] = array[19].concat(comma + array[20]);
            }
                break;
        }
        return mass;
    }



    public static String[] specialParseDZ2(String[] array, int nuberOfFinalParam){
        String[] mass;
        mass = new String[nuberOfFinalParam];
        for (int i = 0; i<array.length;++i){
            if (array[i].charAt(0) == zeroChar)
                array[i] = array[i].substring(1,array[i].length());
        }

        if (array[0].equals("11")) {
            mass[0] = array[5];//first tab
            mass[1] = array[6];
            mass[2] = array[7];
            if (array[9].equals(""))
                mass[3] = array[8];//first tab
            else
                mass[3] = array[8].concat(comma + array[9]);//first tab
            mass[4] = array[10];
            mass[5] = array[11];
        }

        if (array[1].equals("22")){
            mass[6] = array[12];//second tab
            mass[7] = array[13];
            mass[8] = array[14];
            mass[9] = array[15].concat(ex + array[16]);
            mass[10] = array[17];
        }

        if (array[2].equals("33")){
            mass[11] = (zero+comma).concat(array[18]);//third tab
            mass[12] = array[19];
            mass[13] = array[20];
        }

        if (array[3].equals("44")){
            mass[14] = array[21].concat(ex + array[22]);//fourth tab
            mass[15] = array[23];
            mass[16] = array[24];
            mass[17] = (zero+comma+zero).concat(array[25]);
            if (array[26].equals("5"))
                mass[18] = one.concat(zero+array[26]);
            else
                mass[18] = one.concat(array[26]);
            mass[19] = array[27];
            mass[20] = array[28];
            mass[21] = (zero + comma).concat(array[29].concat(array[30]));
        }

        if (array[4].equals("55")){
            mass[22] = array[31].concat(array[32]);//fifth tab
            mass[23] = array[33];
            mass[24] = array[34].concat(ex + array[35]);
            mass[25] = array[36];
            mass[26] = array[37].concat(comma + array[38]);
            mass[27] = array[39].concat(array[40].concat(comma + array[41]));
            mass[28] = array[42].concat(array[43]);
            mass[29] = array[44].concat(array[45]);
        }

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
        mass[13] = array[23].concat(commaSplit + array[24]);
        mass[14] = array[25].concat(commaSplit + array[26]);


        return mass;
    }
}
