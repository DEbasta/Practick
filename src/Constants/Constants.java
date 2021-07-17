package Constants;

public class Constants {

    public static final String mainViewName = "VarGenKTO";

    public static final String firstViewName = "VarGenKTO_HomeTask№1";

    public static final String secondViewName = "VarGenKTO_HomeTask№2";

    public static final String thirdViewName = "VarGenKTO_HomeTask№3";

    public static final String dialogViewName = "Result";

    public static final String mainViewFirstButton = "ДЗ №1";

    public static final String mainViewSecondButton = "ДЗ №2";

    public static final String mainViewThirdButton = "ДЗ №3";

    public static final String thirdViewButton = "Cгенерировать ДЗ №3";

    public static final String okButton = "Ok";

    public static final String goodResult = "Готово";

    public static final String badResult = "Параметры заданы неверно";

    public static final int mainViewWidth = 550;

    public static final int mainViewHeight = 200;

    public static final int dialogViewWidth = 180;

    public static final int dialogViewHeight = 100;

    public static final int encodingRadix = 36;

    public static final String nothingString = "";

    public static final String emptyFieldValue = "Поле для повторной генерации";

    public static final String documentFormat = ".pdf";

    public static final String documentNameDZ1 = "Variant_DZ1_";

    public static final String documentNameDZ2 = "Variant_DZ2_";

    public static final String documentNameDZ3 = "Variant_DZ3_";

    public static final String varID = "Идентификатор Варианта : ";

    public static final int singleColumn = 1;

    public static final int twoColumns = 2;

    public static final int fourColumns = 4;

    public static final int sevenColumns = 7;

    public static final int eightColumns = 8;

    public static final int decodedNumberDZ3 = 52;


    public static final String [] raz = {"BH-10","IDC-10MS","ГРПМШ2-30ГО2-В","OHП-ВГ-1-18","ГРПМ2-46ШО2-В",
                           "СНП58-16/94х9В-20","СНО63-32/95х9В-20","ППИС (РШ2Н-2)","ОНП-ВГ-1-32/46х11-В21","СНО53-60/93×9Р-23",
                           "СНП59-32/95×11Р-20-2","ГРПМ1-31ШП2-К","BH2-34 (DS1014-34, IDC2-34MS)","BH-24 (DS1013-24S, IDC-24MS)","СНО48-108/62х40В-6М-В"};

    public static final String [] ms = {"DIP16","QFP-44","SO14","SO16","SOIC14",
                          "QFP-28","TSOP24","SOT523-1-9","DIP32","SDIP32",
                          "SIP8","SOT243-1-17","ZIP-24","QFP-32","TSOP28"};

    public static final String[] headersDZ1T1 = {"Тип корпуса Разъёма","Кол-во","Тип корпуса МС","Кол-во","Коэффициент дезинтеграции","Зазор между ЭК,мм","Расстояние по торцу,мм","dпл,мм"};

    public static final String tz1DZ3 = "Задача No3. Провести расчёт надёжности функциональной ячейки (ФЯ) и сделать вывод, " +
            "удовлетворяет ли ФЯ требованиям технического задания.\n" +
            "        В табл. 4 приведены варианты задания, различные по ожидаемому сроку наработки на отказ\n" +
            "Tср, часов, номиналу и количеству элементов ФЯ и условиям эксплуатации.\n" +
            "        На рис. рис. 4-7 приведены графики для расчёта поправочного коэффициента αi(T, kн) в\n" +
            "зависимости от температуры T и коэффициента нагрузки kн. Напоминание: при уже известной форме\n" +
            "графического отображения функции её можно (и нужно) использовать для нахождения ординаты\n" +
            "точки по известной абсциссе и наоборот.\n";

    public static final String tz2DZ3 = "В табл. 5 приведены значения поправочных коэффициентов для других случаев.";

    public static final String tz3DZ3 = "Некоторые значения интенсивности отказов для различных типов элементов можно " +
            "увидеть в таблице 6.";

    public static final String table4Name = "Таблица 4. Условия задачи No3.";

    public static final String table5Name = "Таблица 5. Значения поправочных коэффициентов.\n";

    public static final String table6Name = "Таблица 6. Интенсивность отказов по типам элементов.\n";

    public static final String nameOfImage4 = "Рисунок 4 – Обобщенные зависимости поправочного коэффициента от температуры и коэффициента нагрузки: а) для контактных элементов (разъемов, реле,\n" +
            "переключателей и т.п.); б) для соединений пайкой; в) для резисторов типов МЛТ и ОМЛТ; г) для переменных проволочных резисторов\n";

    public static final String nameOfImage5 = "Рисунок 5 – Обобщённые зависимости поправочного коэффициента от температуры и коэффициента нагрузки: а) для резисторов; б) - для неполярных\n" +
            "конденсаторов; в) для изделий, имеющих обмотки; г) для электролитических конденсаторов\n";

    public static final String nameOfImage6 = "Рисунок 6 – Обобщённые зависимости поправочного коэффициента от температуры и коэффициента нагрузки для полупроводниковых приборов: а)\n" +
            "германиевых диодов; б) кремниевых диодов; в) германиевых\n" +
            "транзисторов; г) кремниевых транзисторов\n";

    public static final String nameOfImage7 = "Рисунок 7 – Обобщённые зависимости поправочного коэффициента от температуры и коэффициента нагрузки: а) для кремниевых высокочастотных\n" +
            "транзисторов; б) для германиевых высокочастотных транзисторов; в) для полупроводниковых цифровых интегральных микросхем; г) для полупроводниковых линейно-\n" +
            "импульсных интегральных микросхем\n";

    public static final String[] headersDZ3T4_1 = {"Тср, час", "Серия м-схем, шт.","Температура для\n" +
            "всех ЭК,","Кол-во металл-\n" + "ых отверстий, шт.","Разъем, кол-во, кол-\n" + "во контактов, шт.","Условия эксплуатации","Отн. влажность, %, высота\n" + " над уров. моря, км."};

    public static final String[] headersDZ3T4_2 = {"Конденсатор, шт.","Паяное соединение, шт.","Печ-ый проводник, шт.","Плата, шт.","Диоды, шт.","Переключатель, шт.","Резистор, шт.","Реле, шт."};

    public static final String[] headersDZ3T5_1 = {"Условия эксплуатации", "Значение коэффициента"};

    public static final String[] headersDZ3T5_2 = {"Относительная влажность", "Значение коэффициента"};

    public static final String[] headersDZ3T5_3 = {"Высота, км", "Значение коэффициента", "Высота, км", "Значение коэффициента"};

    public static final String headerSingleDZ3T5_1 = "Значения поправочных коэффициентов, учитывающих влияние механических воздействий";

    public static final String headerSingleDZ3T5_2 = "Значения поправочных коэффициентов, учитывающих влияние относительной влажности";

    public static final String headerSingleDZ3T5_3 = "Значения поправочных коэффициентов, учитывающих атмосферное давление (высоту над уровнем моря)";

    public static final String rowDZ3T4Zeroes = " 000";

    public static final String[] rowDZ3T4UslExpl = {"Лабораторный", "Стационарные", "Полевые", "Корабельные", "Автомобильные", "Железнодорожные", "Самолётные"};

    public static final String[] headersDZ3T6 = {"Элемент", "Обозначение", "λ 0t· 10^(–6), 1/ч", "Кол-во, шт."};

    
    public static final String[] rowDZ3T5_1Coef = {"1,00","1,07", "1,37", "1,46", "1,57", "1,65"};

    public static final String[] rowDZ3T5_2Vlaj = {"60...70% при t = 20...40 oС", "90...98% при t = 20...25 oС", "90...98% при t = 30...40 oС"};

    public static final String[] rowDZ3T5_2Coef = {"1,00", "2,00", "2,50"};

    public static final String[] rowDZ3T5_3Vis = {"0...1", "1...2", "2...3", "3...5", "5...6", "6...8", "8...10", "10...15"};

    public static final String[] rowDZ3T5_3Coef = {"1,00", "1,05", "1,10", "1,14", "1,16", "1,20", "1,25", "1,30"};

    public static final String[] rowDZ3T6Elem = {"Резисторы: C2-33H-0,25; C2-33H-0,5; C2-33H-2", "Диоды: 2Д522Б; 2Д106А", "Конденсаторы: К10-17", "Реле РЭС80", "Печатная плата", "Паяное соединение", "Микросхемы", "Соединитель"};

    public static final String[] rowDZ3T6Obozm = {"λ0.R1; λ0.R2; λ0.R3", "λ0.vd1; λ0.vd2", "λ0.ос1", "λ0.ок1", "λ0.пп", "λ0.ом", "λ0.имс", "λ0.соед"};

    public static final String[] rowDZ3T6Lambd = {"0,987", "0,2", "0,04", "2", "0,7", "0,01", "0,013", "0,062x96"};

    public static final String[] rowDZ3T6Col = {"25; 12; 3", "7; 3", "8", "13", "1", "300", "3", "1"};

}
