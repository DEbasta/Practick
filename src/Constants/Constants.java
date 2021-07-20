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

    public static final String firstViewButton = "Cгенерировать ДЗ №1";

    public static final String secondViewButton = "Cгенерировать ДЗ №2";

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

    public static final String documentFormat_pdf = ".pdf";

    public static final String documentFormat_png = ".png";

    public static final String documentNameDZ1 = "Variant_DZ1_";

    public static final String documentNameDZ2 = "Variant_DZ2_";

    public static final String documentNameDZ3 = "Variant_DZ3_";

    public static final String varID = "Идентификатор Варианта : ";

    public static final int singleColumn = 1;

    public static final int twoColumns = 2;

    public static final int threeColumns = 3;

    public static final int fourColumns = 4;

    public static final int fiveColumns = 5;

    public static final int sixColumns = 6;

    public static final int sevenColumns = 7;

    public static final int eightColumns = 8;

    public static final int decodedNumberDZ1 = 38;

    public static final int decodedNumberDZ2 = 82;

    public static final int decodedNumberDZ3 = 52;

    public static final String DZ2ImagePathEskiz = "Images/DZ2T2EskizImage";

    public static final String DZ2ImagePathFormula = "Images/DZ2T2FormulaImage";

    public static final String DZ2ImagePathNote = "Images/DZ2T2NoteImage.png";

    public static final String DZ3ImagePath = "Images/DZ3Image";




    public static final String tz1DZ1 = "Задача No1. Рассчитать ориентировочную площадь ПП и выбрать рекомендуемые линейные размеры\n" +
            "ПП. Варианты заданий приведены в таблице 1.\n";

    public static final String tz2DZ1 = "Задача No2. Рассчитать площадь ПП, скомпоновать конструкторско-технологические зоны для\n" +
            "размещения на ПП ячейки электронного компонента (ЭК), элементов контроля функционирования\n" +
            "электрического соединения, крепления и фиксации ячейки, а также выбрать линейные размеры ПП и\n" +
            "оценить возможность размещения микросхем на плате. Варианты заданий приведены в таблице 1.";

    public static final String tz3DZ1 = "Задача No3. Рассчитать ориентировочные габариты и выбрать типоразмер блока электронного\n" +
            "изделия. Размеры печатной платы и электронных компонентов взять из задачи No1. Остальные\n" +
            "значения выбрать из таблицы 2 в соответствии с полученным вариантом. Примечание: ФЯ –\n" +
            "«функциональная ячейка».";

    public static final String table1DZ1Name = "Таблица 1. Варианты задачи No1, 2";

    public static final String table2DZ1Name = "Таблица 2.Варианты задачи No3";

    public static final String[] headersDZ1T1 = {"Тип корпуса Разъёма","Кол-во","Тип корпуса МС","Кол-во","Коэффициент дезинтеграции","Зазор между ЭК,мм","Расстояние по торцу,мм","dпл,мм"};

    public static final String[] headersDZ1T2 = {"Тип конструкции блока", "Толщина платы dпл, мм", "Ширина панели HК, мм", "Зазор между ФЯ Δhя , мм", "Кол-во ФЯ в блоке nфя, шт.", "Высота пайки Hm, мм"};

    public static final String [] rowDZ1T1raz = {"BH-10","IDC-10MS","ГРПМШ2-30ГО2-В","OHП-ВГ-1-18","ГРПМ2-46ШО2-В",
            "СНП58-16/94х9В-20","СНО63-32/95х9В-20","ППИС (РШ2Н-2)","ОНП-ВГ-1-32/46х11-В21","СНО53-60/93×9Р-23",
            "СНП59-32/95×11Р-20-2","ГРПМ1-31ШП2-К","BH2-34 (DS1014-34, IDC2-34MS)","BH-24 (DS1013-24S, IDC-24MS)","СНО48-108/62х40В-6М-В"};

    public static final String [] rowDZ1T1ms = {"DIP16","QFP-44","SO14","SO16","SOIC14",
            "QFP-28","TSOP24","SOT523-1-9","DIP32","SDIP32",
            "SIP8","SOT243-1-17","ZIP-24","QFP-32","TSOP28"};

    public static final String [] rowDZ1T2blockConstr = {"Разъёмный", "Книжный"};


    public static final String tz1DZ2 = "Задача No1. Провести расчёт печатной платы на действие вибрации и сделать выводы по\n" +
            "полученным результатам. В качестве размеров ПП взять размеры, полученные при решении\n" +
            "задачи No1 задания No1. Диапазон действующих вибраций Δf взять из таблицы 1 согласно\n" +
            "полученному варианту. Способ закрепления платы взять из таблицы 2 согласно полученному\n" +
            "варианту. Виброускорение принять за a0=19,6 м/с2.\n";

    public static final String tz2DZ2 = "Задача No2. Выполнить расчёт толщины печатной платы. Способ закрепления платы выбрать\n" +
            "из таблицы 2 согласно полученному варианту. Остальные данные задачи взять из таблицы 3\n" +
            "согласно полученному варианту.";

    public static final String tz3DZ2 = "Задача No3. Оценить, возможно ли использование рассчитанной в задаче No2 толщины ПП при\n" +
            "заданных наименьшем диаметре отверстия, классе точности и типе разъёма (данные выбрать из\n" +
            "таблицы 4 согласно полученному варианту). Рассчитать:\n" +
            "\uF0B7\n" +
            "         1)отношение заданного диаметра металлизированного отверстия к толщине ПП;\n" +
            "\uF0B7\n" +
            "         2)отношение диаметра металлизированного отверстия по заданному классу точности в соответствии с ГОСТ к толщине ПП.\n" +
            "Оценить возможность пайки разъёма. Сделать выводы.\n";

    public static final String tz4DZ2 = "Задача No4. Определить число слоев и толщину многослойной печатной платы (МПП). Данные\n" +
            "задачи выбрать из таблицы 5 согласно полученному варианту.\n";

    public static final String tz5DZ2 = "Задача No5. Проверить условие ударопрочности конструкции. Условия задачи выбрать из\n" +
            "таблицы 6 согласно полученному варианту.\n";

    public static final String table1DZ2Name = "Таблица 1. Условия задачи No1. Материалы и внешние воздействия";

    public static final String table2DZ2Name = "Таблица 2. Условия задачи No1. Способы закрепления печатной платы";

    public static final String table3DZ2Name = "Таблица 3. Условия задачи No2.";

    public static final String table4DZ2Name = "Таблица 4. Условия задачи No3";

    public static final String table5DZ2Name = "Таблица 5. Условия задачи No4";

    public static final String table6DZ2Name = "Таблица 6. Условия задачи No5";

    public static final String[] headersDZ2T1 = {"Материал ПП", "Диапазон вибраций Δf, Гц", "Способ закрепления платы", "Толщина платы, мм"};

    public static final String[] headersDZ2T2 = {"Эскиз закрепления платы", "Формула для определения Ка."};

    public static final String[] headersDZ2T3 = {"Материал ПП", "Диапазон вибраций Δf, Гц", "Способ закрепления платы", "Размеры плтаы, мм", "Масса ЭК,гр"};

    public static final String[] headersDZ2T4 = {"Наименьший диаметр отверстия, мм", "Класс точности", "Тип разъёма"};

    public static final String[] headersDZ2T5 = {"Габаритные размеры МПП, мм", "Кол-во задействоанных вымодов ИМС, шт", "Кол-во ИМС, шт", "Коэффициент прпорциональности", "Толщина экранного слоя, мм", "Число сигнальных слоёв, шт", "Материал МПП", "Толщина прокладки стеклоткани, мм"};

    public static final String[] headersDZ2T6 = {"Масса ПП, гр", "Масса ЭК, гр", "Размеры ПП, мм", "Материал ПП", "Длительность удара, мс", "Ускорение м/с^2", "Частота ударов, Гц", "Частота собственных колебаний платы f0, Гц"};

    public static final String [] rowDZ2dimensions = {"40", "50", "60", "75", "80", "90", "100", "110", "120", "130", "140", "150", "160", "180", "200"};


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

    public static final String table4DZ3Name = "Таблица 4. Условия задачи No3.";

    public static final String table5DZ3Name = "Таблица 5. Значения поправочных коэффициентов.";

    public static final String table6DZ3Name = "Таблица 6. Интенсивность отказов по типам элементов.";

    public static final String nameOfImage4 = "Рисунок 4 – Обобщенные зависимости поправочного коэффициента от температуры и коэффициента нагрузки: а) для контактных элементов (разъемов, реле, " +
            "переключателей и т.п.); б) для соединений пайкой; в) для резисторов типов МЛТ и ОМЛТ; г) для переменных проволочных резисторов\n";

    public static final String nameOfImage5 = "Рисунок 5 – Обобщённые зависимости поправочного коэффициента от температуры и коэффициента нагрузки: а) для резисторов; б) - для неполярных " +
            "конденсаторов; в) для изделий, имеющих обмотки; г) для электролитических конденсаторов";

    public static final String nameOfImage6 = "Рисунок 6 – Обобщённые зависимости поправочного коэффициента от температуры и коэффициента нагрузки для полупроводниковых приборов: а) " +
            "германиевых диодов; б) кремниевых диодов; в) германиевых" +
            "транзисторов; г) кремниевых транзисторов";

    public static final String nameOfImage7 = "Рисунок 7 – Обобщённые зависимости поправочного коэффициента от температуры и коэффициента нагрузки: а) для кремниевых высокочастотных " +
            "транзисторов; б) для германиевых высокочастотных транзисторов; в) для полупроводниковых цифровых интегральных микросхем; г) для полупроводниковых линейно-" +
            "импульсных интегральных микросхем";

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
