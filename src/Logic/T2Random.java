package Logic;

import java.util.Random;

public class T2Random {
    static final Random random = new Random();


    public static String gen1() {
        int var;
        String varNum="";

        varNum = varNum.concat(String.valueOf(random.nextInt(4)) + "-");//1 параметр 1 таблица 5 индекс

        varNum = varNum.concat(String.valueOf(random.nextInt(4)) + "-");//2 параметр 1 таблица 6 индекс

        varNum = varNum.concat(String.valueOf(random.nextInt(7) + 1) + "-");//3 параметр 1 таблица 7 индекс

        var = random.nextInt(2)+1;
        if (var == 1)
            varNum = varNum.concat(1+"-"+5+"-");//4 и 5 параметры 1 таблица 8,9 индекс
        else
            varNum = varNum.concat(2+"-"+0+"-");//4 и 5 параметры 1 таблица 8,9 индекс




        varNum = varNum.concat(String.valueOf(random.nextInt(7)+1) + "-");//1 параметр 2 таблица 10 индекс

        varNum = varNum.concat(String.valueOf(random.nextInt(7)+1) + "-");//2 параметр 2 таблица 11 индекс

        return varNum;
    }


    public static String gen2() {
        String varNum="";

        varNum = varNum.concat(String.valueOf(random.nextInt(4)) + "-");//1 параметр 3 таблица 12 индекс

        varNum = varNum.concat(String.valueOf(random.nextInt(4)) + "-");//2 параметр 3 таблица 13 индекс

        varNum = varNum.concat(String.valueOf(random.nextInt(7) + 1) + "-");//3 параметр 3 таблица 14 индекс

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//4 параметр 3 таблица 15 индекс

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//5 параметр 3 таблица 16 индекс

        varNum = varNum.concat(String.valueOf(random.nextInt(32)+18) + "-");//6 параметр 3 таблица 17 индекс

        return varNum;
    }


    public static String gen3() {
        String varNum="";

        varNum = varNum.concat(String.valueOf(random.nextInt(5)+2) + "-");//1 параметр 4 таблица 18 индекс

        varNum = varNum.concat(String.valueOf(random.nextInt(5)+1) + "-");//2 параметр 4 таблица 19 индекс

        varNum = varNum.concat(String.valueOf(random.nextInt(4)) + "-");//3 параметр 4 таблица 20 индекс

        return varNum;
    }


    public static String gen4() {
        int var;
        String varNum="";

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//1 параметр 5 таблица 21

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//2 параметр 5 таблица 22

        var = random.nextInt(11) + 14;

        varNum = varNum.concat(String.valueOf(var - (var % 2)) + "-");//3 параметр 5 таблица 23

        varNum = varNum.concat(String.valueOf(random.nextInt(41) + 30) + "-");//4 параметр 5 таблица 24

        varNum = varNum.concat(String.valueOf(random.nextInt(3) + 5) + "-");//5 параметр 5 таблица 25

        varNum = varNum.concat(String.valueOf(random.nextInt(6)*5) + "-");//6 параметр 5 таблица 26

        varNum = varNum.concat(String.valueOf(random.nextInt(2)+3) + "-");//7 параметр 5 таблица 27

        varNum = varNum.concat(String.valueOf(random.nextInt(7)) + "-");//8 параметр 5 таблица 28

        varNum = varNum.concat(String.valueOf(random.nextInt(6)+10) + "-");//9 параметр 5 таблица 29

        varNum = varNum.concat(String.valueOf(random.nextInt(2)*5) + "-");//10 параметр 5 таблица 30

        return varNum;
    }


    public static String gen5() {
        String varNum="";

        varNum = varNum.concat(String.valueOf(random.nextInt(9)+8) + "-");//1 параметр 6 таблица 31

        varNum = varNum.concat(String.valueOf(random.nextInt(10)) + "-");//2 параметр 6 таблица 32

        varNum = varNum.concat(String.valueOf(random.nextInt(32)+18) + "-");//3 параметр 6 таблица 33

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//4 параметр 6 таблица 34

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//5 параметр 6 таблица 35

        varNum = varNum.concat(String.valueOf(random.nextInt(10)) + "-");//6 параметр 6 таблица 36

        varNum = varNum.concat(String.valueOf(random.nextInt(4)+6) + "-");//7 параметр 6 таблица 37

        varNum = varNum.concat(String.valueOf(random.nextInt(4)*25) + "-");//8 параметр 6 таблица 38

        varNum = varNum.concat(String.valueOf(random.nextInt(2)+9) + "-");//9 параметр 6 таблица 39

        varNum = varNum.concat(String.valueOf(random.nextInt(8)+2) + "-");//10 параметр 6 таблица 40

        varNum = varNum.concat(String.valueOf(random.nextInt(2)*5) + "-");//11 параметр 6 таблица 41

        varNum = varNum.concat(String.valueOf(random.nextInt(7)+6) + "-");//12 параметр 6 таблица 42

        varNum = varNum.concat(String.valueOf(random.nextInt(2)*5) + "-");//13 параметр 6 таблица 43

        varNum = varNum.concat(String.valueOf(random.nextInt(9)+31) + "-");//14 параметр 6 таблица 44

        varNum = varNum.concat(String.valueOf(random.nextInt(10)));//15 параметр 6 таблица 45


        return varNum;
    }


    public static String gen(boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, String var){
    String varNum = "", specialKey = "";


    if (var.equals("")){
        if ((flag1 && flag2 && flag3 && flag4 && flag5) || (!flag1 && !flag2 && !flag3 && !flag4 && !flag5)) {
            varNum = varNum.concat(gen1().concat(gen2().concat(gen3().concat(gen4().concat(gen5())))));
            specialKey = specialKey.concat("11-22-33-44-55-");
        }
        else {
            if (flag1) {
                varNum = varNum.concat(gen1());
                specialKey = specialKey.concat("11-");
            } else {
                varNum = varNum.concat("00-00-00-00-00-00-00-");
                specialKey = specialKey.concat("10-");
            }

            if (flag2) {
                varNum = varNum.concat(gen2());
                specialKey = specialKey.concat("22-");
            } else {
                varNum = varNum.concat("00-00-00-00-00-00-");
                specialKey = specialKey.concat("20-");
            }

            if (flag3) {
                varNum = varNum.concat(gen3());
                specialKey = specialKey.concat("33-");
            } else {
                varNum = varNum.concat("00-00-00-");
                specialKey = specialKey.concat("30-");
            }

            if (flag4) {
                varNum = varNum.concat(gen4());
                specialKey = specialKey.concat("44-");
            } else {
                varNum = varNum.concat("00-00-00-00-00-00-00-00-00-00-");
                specialKey = specialKey.concat("40-");
            }

            if (flag5) {
                varNum = varNum.concat(gen5());
                specialKey = specialKey.concat("55-");
            } else {
                varNum = varNum.concat("00-00-00-00-00-00-00-00-00-00-00-00-00-00-00");
                specialKey = specialKey.concat("50-");
            }

        }
        varNum = specialKey.concat(varNum);
    } else {
        if ((flag1 && flag2 && flag3 && flag4 && flag5)) {
            varNum = varNum.concat(gen1().concat(gen2().concat(gen3().concat(gen4().concat(gen5())))));
            specialKey = specialKey.concat("11-22-33-44-55-");
        }
        else{
            String [] tmp = new String[6];
            var = VarParse.remakeVar(var);
            tmp[0] = var.substring(0,15);//key
            tmp[1] = var.substring(15,36);//first gen data
            tmp[2] = var.substring(36,54);//second gen data
            tmp[3] = var.substring(54,63);//third gen data
            tmp[4] = var.substring(63,93);//fourth gen data
            tmp[5] = var.substring(93,var.length());//fifth gen data

            if (flag1) {
                varNum = varNum.concat(gen1());
                specialKey = specialKey.concat("11-");
                tmp[0] = tmp[0].substring(3, tmp[0].length());
            } else {
                varNum = varNum.concat(tmp[1]);
                specialKey = specialKey.concat(tmp[0].substring(0,3));
                tmp[0] = tmp[0].substring(3, tmp[0].length());
            }

            if (flag2) {
                varNum = varNum.concat(gen2());
                specialKey = specialKey.concat("22-");
                tmp[0] = tmp[0].substring(3, tmp[0].length());
            } else {
                varNum = varNum.concat(tmp[2]);
                specialKey = specialKey.concat(tmp[0].substring(0,3));
                tmp[0] = tmp[0].substring(3, tmp[0].length());
            }

            if (flag3) {
                varNum = varNum.concat(gen3());
                specialKey = specialKey.concat("33-");
                tmp[0] = tmp[0].substring(3, tmp[0].length());
            } else {
                varNum = varNum.concat(tmp[3]);
                specialKey = specialKey.concat(tmp[0].substring(0,3));
                tmp[0] = tmp[0].substring(3, tmp[0].length());
            }

            if (flag4) {
                varNum = varNum.concat(gen4());
                specialKey = specialKey.concat("44-");
                tmp[0] = tmp[0].substring(3, tmp[0].length());
            } else {
                varNum = varNum.concat(tmp[4]);
                specialKey = specialKey.concat(tmp[0].substring(0,3));
                tmp[0] = tmp[0].substring(3, tmp[0].length());
            }

            if (flag5) {
                varNum = varNum.concat(gen5());
                specialKey = specialKey.concat("55-");
                tmp[0] = tmp[0].substring(3, tmp[0].length());
            } else {
                varNum = varNum.concat(tmp[5]);
                specialKey = specialKey.concat(tmp[0].substring(0,3));
                tmp[0] = tmp[0].substring(3, tmp[0].length());
            }



        }
        varNum = specialKey.concat(varNum);

    }

    return varNum;
    }
}
