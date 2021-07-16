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


    public static String[] parse(String s){
        String[] vect = s.split("-");
        for (int i = 0; i < vect.length; ++i)
            if (vect[i].length()==1)
                vect[i] = "0".concat(vect[i]);
        return vect;
    }

    public static String encode(String[] mass){
        StringBuilder b = new StringBuilder();
        for (String i:mass)
            b.append(i);
        return (new BigInteger(b.toString())).toString(36);
    }
}
