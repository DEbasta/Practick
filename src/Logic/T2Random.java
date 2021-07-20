package Logic;

import java.util.Random;

public class T2Random {
    public static String gen(){
        final Random random = new Random();
        int var;
        String varNum="";

        varNum = varNum.concat(String.valueOf(random.nextInt(4)) + "-");//1 параметр 1 таблица 0

        varNum = varNum.concat(String.valueOf(random.nextInt(4)) + "-");//2 параметр 1 таблица 1

        varNum = varNum.concat(String.valueOf(random.nextInt(7) + 1) + "-");//3 параметр 1 таблица 2

        var = random.nextInt(2)+1;
        if (var == 1)
            varNum = varNum.concat(1+"-"+5+"-");//4 и 5 параметры 1 таблица 3,4
        else
            varNum = varNum.concat(2+"-"+0+"-");//4 и 5 параметры 1 таблица 3,4




        varNum = varNum.concat(String.valueOf(random.nextInt(7)) + "-");//1 параметр 2 таблица 5

        varNum = varNum.concat(String.valueOf(random.nextInt(7)) + "-");//2 параметр 2 таблица 6




        varNum = varNum.concat(String.valueOf(random.nextInt(4)) + "-");//1 параметр 3 таблица 7

        varNum = varNum.concat(String.valueOf(random.nextInt(4)) + "-");//2 параметр 3 таблица 8

        varNum = varNum.concat(String.valueOf(random.nextInt(7) + 1) + "-");//3 параметр 3 таблица 9

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//4 параметр 3 таблица 10

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//5 параметр 3 таблица 11

        varNum = varNum.concat(String.valueOf(random.nextInt(32)+18) + "-");//6 параметр 3 таблица 12




        varNum = varNum.concat(String.valueOf(random.nextInt(5)+2) + "-");//1 параметр 4 таблица 13

        varNum = varNum.concat(String.valueOf(random.nextInt(5)+1) + "-");//2 параметр 4 таблица 14

        varNum = varNum.concat(String.valueOf(random.nextInt(5)) + "-");//3 параметр 4 таблица 15




        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//1 параметр 5 таблица 16

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//2 параметр 5 таблица 17

        var = random.nextInt(11) + 14;

        varNum = varNum.concat(String.valueOf(var - (var % 2)) + "-");//3 параметр 5 таблица 18

        varNum = varNum.concat(String.valueOf(random.nextInt(41) + 30) + "-");//4 параметр 5 таблица 19

        varNum = varNum.concat(String.valueOf(random.nextInt(3) + 5) + "-");//5 параметр 5 таблица 20

        varNum = varNum.concat(String.valueOf(random.nextInt(6)*5) + "-");//6 параметр 5 таблица 21

        varNum = varNum.concat(String.valueOf(random.nextInt(2)+3) + "-");//7 параметр 5 таблица 22

        varNum = varNum.concat(String.valueOf(random.nextInt(7)) + "-");//8 параметр 5 таблица 23

        varNum = varNum.concat(String.valueOf(random.nextInt(6)+10) + "-");//9 параметр 5 таблица 25

        varNum = varNum.concat(String.valueOf(random.nextInt(2)*5) + "-");//10 параметр 5 таблица 26




        varNum = varNum.concat(String.valueOf(random.nextInt(9)+8) + "-");//1 параметр 6 таблица 27

        varNum = varNum.concat(String.valueOf(random.nextInt(10)) + "-");//2 параметр 6 таблица 28

        varNum = varNum.concat(String.valueOf(random.nextInt(32)+18) + "-");//3 параметр 6 таблица 29

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//4 параметр 6 таблица 30

        varNum = varNum.concat(String.valueOf(random.nextInt(15)) + "-");//5 параметр 6 таблица 31

        varNum = varNum.concat(String.valueOf(random.nextInt(10)) + "-");//6 параметр 6 таблица 32

        varNum = varNum.concat(String.valueOf(random.nextInt(4)+6) + "-");//7 параметр 6 таблица 33

        varNum = varNum.concat(String.valueOf(random.nextInt(4)*25) + "-");//8 параметр 6 таблица 34

        varNum = varNum.concat(String.valueOf(random.nextInt(2)+9) + "-");//9 параметр 6 таблица 35

        varNum = varNum.concat(String.valueOf(random.nextInt(8)+2) + "-");//10 параметр 6 таблица 36

        varNum = varNum.concat(String.valueOf(random.nextInt(2)*5) + "-");//11 параметр 6 таблица 37

        varNum = varNum.concat(String.valueOf(random.nextInt(7)+6) + "-");//12 параметр 6 таблица 38

        varNum = varNum.concat(String.valueOf(random.nextInt(2)*5) + "-");//13 параметр 6 таблица 39

        varNum = varNum.concat(String.valueOf(random.nextInt(9)+31) + "-");//14 параметр 6 таблица 40

        varNum = varNum.concat(String.valueOf(random.nextInt(10)));//15 параметр 6 таблица 41



    return varNum;
    }
}
