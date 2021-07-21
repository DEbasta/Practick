package Logic;

import java.util.Random;

public class T3Random {
    public static String gen(){
        final Random random = new Random();
        int var;
        int helper;
        String varNum="";

        varNum = varNum.concat(String.valueOf(random.nextInt(22)+55) + "-");//1 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//2 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(10)+7) + "-");//3 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(5)+47) + "-");//4 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(15)+35) + "-");//5 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//6 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(4)+1) + "-");//7 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(51)+10) + "-");//8 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(7)) + "-");//9 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(41)+50) + "-");//10 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(15)+1) + "-");//11 параметр 1 таблица



        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//1 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(17)+10) + "-");//2 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(2)) + "-");//3 параметр 2 таблица

        var = random.nextInt(73)+150;

        varNum = varNum.concat(String.valueOf(var).substring(0,2) + "-");//4 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(var).charAt(2) + "-");//5 параметр 2 таблица

        var = random.nextInt(61)+250;

        varNum = varNum.concat(String.valueOf(var).substring(0,2) + "-");//6 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(var).charAt(2) + "-");//7 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(3)+1) + "-");//8 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//9 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(5)+1) + "-");//10 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//11 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(3)+1) + "-");//12 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(9)) + "-");//13 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(10)+7) + "-");//14 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(15)));//15 параметр 2 таблица

        return varNum;
    }
}
