package Logic;

import java.util.Random;

public class T1Z1Random {
    public static String gen(){
        final Random random = new Random();
        int var;
        int helper;
        String varNum="";

        var = random.nextInt(15);
        varNum = varNum.concat(String.valueOf(var+1)+"-");

        var = random.nextInt(5);
        varNum = varNum.concat(String.valueOf(var+1)+"-");

        var = random.nextInt(15);
        varNum = varNum.concat(String.valueOf(var+1)+"-");

        var = random.nextInt(17);
        varNum = varNum.concat(String.valueOf(var+4)+"-");

        var = random.nextInt(2);
        helper = random.nextInt(5);
        varNum = varNum.concat(String.format("%.1f",var+1+0.1*(helper+5))+"-");

        var = random.nextInt(8);
        helper = random.nextInt(3);
        varNum = varNum.concat(String.format("%.2f",var+5+0.25*(helper+1))+"-");

        var = random.nextInt(9);
        varNum = varNum.concat(String.valueOf(var+2)+"-");

        var = random.nextInt(2);
        double d = 0.5;;
        if (var != 1) {
            varNum =  varNum.concat(String.format("%.1f",var+1.5));
        }
        else
            varNum = varNum.concat(String.valueOf(var+1));
        return varNum;
    }

}
