package Logic;

import java.util.Random;

public class T1Random {
    final static Random random = new Random();
    static int var;

    public static String gen1() {
        String varNum="";

        varNum = varNum.concat("11-");//спецключ

        varNum = varNum.concat(String.valueOf(random.nextInt(15))+"-");//1 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(5)+1)+"-");//2 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(15))+"-");//3 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(17)+4)+"-");//4 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(2)+1)+"-");//5 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(10))+"-");//6 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(13))+"-");//7 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(4)*25)+"-");//8 параметр 1 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(11) + 1)+"-");//9 параметр 1 таблица

        var = random.nextInt(2)+1;
        if (var == 1)
            varNum = varNum.concat(1+"-"+5);//10 и 11 параметры 1 таблица
        else
            varNum = varNum.concat(2+"-"+0);//10 и 11 параметры 1 таблица
        return varNum;
    }

    public static String gen2() {
        String varNum="";

        varNum = varNum.concat("22-");//спецключ

        varNum = varNum.concat(String.valueOf(random.nextInt(2))+"-");//1 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(2)+1)+"-");//2 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(10))+"-");//3 параметр 2 таблица

        var = random.nextInt(11) + 10;

        varNum = varNum.concat(String.valueOf(var - (var % 2))+"-");//4 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(6)+5)+"-");//5 параметр 2 таблица

        varNum = varNum.concat(String.valueOf(random.nextInt(6)+3)+"-");//6 параметр 2 таблица

        varNum = varNum.concat("1-");//7 параметр 2 таблица

        varNum = varNum.concat("5");//8 параметр 2 таблица

        return varNum;

    }

    public static String gen(){
        String varNum="";

        varNum = varNum.concat(gen1() + "-" + varNum.concat(gen2()));



        return varNum;
    }

}
