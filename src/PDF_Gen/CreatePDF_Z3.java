package PDF_Gen;


import Constants.Constants;
import Logic.T3Z3Random;
import Logic.VarParse;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;

import static Constants.Constants.rowDZ3T4UslExpl;

public class CreatePDF_Z3 extends  AbstractCreatePDF{
    String var;
    String key;
    String[] array;
    int numberOfFinalParam = 15;

    public CreatePDF_Z3(String var,String key) throws DocumentException, IOException, URISyntaxException {
        this.var = var;
        this.key = key;
        if (var.equals(Constants.nothingString)) {
            var = T3Z3Random.gen();
            this.array = VarParse.parse(var,true);
        }
        else
            this.array = VarParse.parse(var,false);
        if (key.equals(Constants.nothingString))
            this.key = VarParse.encode(array);
        change();
    }
    private void change(){//замена случайного числа, на соответствующую строку
        int number = Integer.parseInt(array[0]);
        array[0] = array[0].concat(Constants.rowDZ3T4Zeroes);
        number = Integer.parseInt(array[8]);
        array[8] = rowDZ3T4UslExpl[number-1];
    }
    public void create() throws IOException, DocumentException, URISyntaxException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(Constants.documentNameDZ3 + key + Constants.documentFormat));

        String[] finalArray;

        finalArray = new String[numberOfFinalParam];

        finalArray = VarParse.specialParseDZ3(array);

        document.open();

        Paragraph varStringPDF=new Paragraph( Constants.varID + String.valueOf(key),new Font(times,fontSize14));
        // строки ТЗ для ДЗ
        Paragraph tz1 = new Paragraph(Constants.tz1DZ3, new Font(times,fontSize11));
        Paragraph tz2 = new Paragraph(Constants.tz2DZ3, new Font(times,fontSize11));
        Paragraph tz3 = new Paragraph(Constants.tz3DZ3, new Font(times,fontSize11));
        //строки и их распооложение для таблиц
        Paragraph table4Name = new Paragraph(Constants.table4DZ3Name, new Font(times,fontSize8));
        table4Name.setAlignment(Element.ALIGN_RIGHT);
        Paragraph table5Name = new Paragraph(Constants.table5DZ3Name, new Font(times,fontSize8));
        table5Name.setAlignment(Element.ALIGN_RIGHT);
        Paragraph table6Name = new Paragraph(Constants.table6DZ3Name, new Font(times,fontSize8));
        table6Name.setAlignment(Element.ALIGN_RIGHT);
        //строки и их распооложение для картинок
        Paragraph nameOfImage4 = new Paragraph(Constants.nameOfImage4, new Font(times,fontSize11));
        nameOfImage4.setAlignment(Element.ALIGN_CENTER);
        Paragraph nameOfImage5 = new Paragraph(Constants.nameOfImage5, new Font(times,fontSize11));
        nameOfImage5.setAlignment(Element.ALIGN_CENTER);
        Paragraph nameOfImage6 = new Paragraph(Constants.nameOfImage6, new Font(times,fontSize11));
        nameOfImage6.setAlignment(Element.ALIGN_CENTER);
        Paragraph nameOfImage7 = new Paragraph(Constants.nameOfImage7, new Font(times,fontSize11));
        nameOfImage7.setAlignment(Element.ALIGN_CENTER);

        PdfPTable table4_1 = new PdfPTable(Constants.sevenColumns);
        addTableHeader(table4_1,Constants.headersDZ3T4_1,fontSize11);
        addRows(table4_1, finalArray, fontSize11,0,7);

        PdfPTable table4_2 = new PdfPTable(Constants.eightColumns);
        addTableHeader(table4_2,Constants.headersDZ3T4_2,fontSize11);
        addRows(table4_2, finalArray, fontSize11,7,15);

        PdfPTable singleTable5_1 = new PdfPTable(Constants.singleColumn);
        addSingleValueToTable(singleTable5_1,Constants.headerSingleDZ3T5_1,fontSize11);

        PdfPTable singleTable5_2 = new PdfPTable(Constants.singleColumn);
        addSingleValueToTable(singleTable5_2,Constants.headerSingleDZ3T5_2,fontSize11);

        PdfPTable singleTable5_3 = new PdfPTable(Constants.singleColumn);
        addSingleValueToTable(singleTable5_3,Constants.headerSingleDZ3T5_3,fontSize11);

        PdfPTable table5_1 = new PdfPTable(Constants.twoColumns);
        addTableHeader(table5_1,Constants.headersDZ3T5_1,fontSize11);
        addRows(table5_1, addRow5_1(), fontSize11,0,2);

        PdfPTable table5_2 = new PdfPTable(Constants.twoColumns);
        addTableHeader(table5_2,Constants.headersDZ3T5_2,fontSize11);
        String[] row5_2_1 = {Constants.rowDZ3T5_2Vlaj[0],Constants.rowDZ3T5_2Coef[0]};
        String[] row5_2_2 = {Constants.rowDZ3T5_2Vlaj[1],Constants.rowDZ3T5_2Coef[1]};
        String[] row5_2_3 = {Constants.rowDZ3T5_2Vlaj[2],Constants.rowDZ3T5_2Coef[2]};
        addRows(table5_2,row5_2_1,fontSize11,0,2);
        addRows(table5_2,row5_2_2,fontSize11,0,2);
        addRows(table5_2,row5_2_3,fontSize11,0,2);

        PdfPTable table5_3 = new PdfPTable(Constants.fourColumns);
        addTableHeader(table5_3,Constants.headersDZ3T5_3,fontSize11);
        String[] row5_3_1 = {Constants.rowDZ3T5_3Vis[0], Constants.rowDZ3T5_3Coef[0], Constants.rowDZ3T5_3Vis[4], Constants.rowDZ3T5_3Coef[4]};
        String[] row5_3_2 = {Constants.rowDZ3T5_3Vis[1], Constants.rowDZ3T5_3Coef[1], Constants.rowDZ3T5_3Vis[5], Constants.rowDZ3T5_3Coef[5]};
        String[] row5_3_3 = {Constants.rowDZ3T5_3Vis[2], Constants.rowDZ3T5_3Coef[2], Constants.rowDZ3T5_3Vis[6], Constants.rowDZ3T5_3Coef[6]};
        String[] row5_3_4 = {Constants.rowDZ3T5_3Vis[3], Constants.rowDZ3T5_3Coef[3], Constants.rowDZ3T5_3Vis[7], Constants.rowDZ3T5_3Coef[7]};
        addRows(table5_3,row5_3_1,fontSize11,0,4);
        addRows(table5_3,row5_3_2,fontSize11,0,4);
        addRows(table5_3,row5_3_3,fontSize11,0,4);
        addRows(table5_3,row5_3_4,fontSize11,0,4);


        PdfPTable table6 = new PdfPTable(Constants.fourColumns);
        addTableHeader(table6,Constants.headersDZ3T6,fontSize11);
        String[] row6_1 = {Constants.rowDZ3T6Elem[0], Constants.rowDZ3T6Obozm[0], Constants.rowDZ3T6Lambd[0], Constants.rowDZ3T6Col[0]};
        String[] row6_2 = {Constants.rowDZ3T6Elem[1], Constants.rowDZ3T6Obozm[1], Constants.rowDZ3T6Lambd[1], Constants.rowDZ3T6Col[1]};
        String[] row6_3 = {Constants.rowDZ3T6Elem[2], Constants.rowDZ3T6Obozm[2], Constants.rowDZ3T6Lambd[2], Constants.rowDZ3T6Col[2]};
        String[] row6_4 = {Constants.rowDZ3T6Elem[3], Constants.rowDZ3T6Obozm[3], Constants.rowDZ3T6Lambd[3], Constants.rowDZ3T6Col[3]};
        String[] row6_5 = {Constants.rowDZ3T6Elem[4], Constants.rowDZ3T6Obozm[4], Constants.rowDZ3T6Lambd[4], Constants.rowDZ3T6Col[4]};
        String[] row6_6 = {Constants.rowDZ3T6Elem[5], Constants.rowDZ3T6Obozm[5], Constants.rowDZ3T6Lambd[5], Constants.rowDZ3T6Col[5]};
        String[] row6_7 = {Constants.rowDZ3T6Elem[6], Constants.rowDZ3T6Obozm[6], Constants.rowDZ3T6Lambd[6], Constants.rowDZ3T6Col[6]};
        String[] row6_8 = {Constants.rowDZ3T6Elem[7], Constants.rowDZ3T6Obozm[7], Constants.rowDZ3T6Lambd[7], Constants.rowDZ3T6Col[7]};
        addRows(table6,row6_1,fontSize11,0,4);
        addRows(table6,row6_2,fontSize11,0,4);
        addRows(table6,row6_3,fontSize11,0,4);
        addRows(table6,row6_4,fontSize11,0,4);
        addRows(table6,row6_5,fontSize11,0,4);
        addRows(table6,row6_6,fontSize11,0,4);
        addRows(table6,row6_7,fontSize11,0,4);
        addRows(table6,row6_8,fontSize11,0,4);

        Image image4 = Image.getInstance("Images/DZ3Image4.png");
        image4.scalePercent(50);
        Image image5 = Image.getInstance("Images/DZ3Image5.png");
        image5.scalePercent(50);
        Image image6 = Image.getInstance("Images/DZ3Image6.png");
        image6.scalePercent(50);
        Image image7 = Image.getInstance("Images/DZ3Image7.png");
        image7.scalePercent(50);



        document.add(varStringPDF);
        document.add(emptyParagpaph);
        document.add(tz1);
        document.add(emptyParagpaph);
        document.add(table4_1);
        document.add(table4_2);
        document.add(table4Name);
        document.add(emptyParagpaph);
        //add image here
        document.add(image4);
        document.add(nameOfImage4);
        document.add(emptyParagpaph);
        //add image here
        document.add(image5);
        document.add(emptyParagpaph);
        document.add(nameOfImage5);
        document.add(emptyParagpaph);
        //add image here
        document.add(image6);
        document.add(nameOfImage6);
        document.add(emptyParagpaph);
        //add image here
        document.add(image7);
        document.add(nameOfImage7);
        document.add(emptyParagpaph);
        document.add(tz2);
        document.add(emptyParagpaph);
        document.add(table5Name);
        document.add(emptyParagpaph);

        document.add(singleTable5_1);
        document.add(table5_1);
        document.add(singleTable5_2);
        document.add(table5_2);
        document.add(singleTable5_3);
        document.add(table5_3);

        document.add(tz3);
        document.add(emptyParagpaph);
        document.add(table6Name);
        document.add(emptyParagpaph);
        document.add(table6);




        document.close();
    }

    private String[] addRow5_1(){
        String[] spclRow;
        spclRow = new String[2];
        if (array[8].equals(rowDZ3T4UslExpl[0])){
            spclRow[0] = rowDZ3T4UslExpl[0];
            spclRow[1] = Constants.rowDZ3T5_1Coef[0];
        }

        if (array[8].equals(rowDZ3T4UslExpl[1])){
            spclRow[0] = rowDZ3T4UslExpl[1];
            spclRow[1] = Constants.rowDZ3T5_1Coef[1];
        }

        if (array[8].equals(rowDZ3T4UslExpl[2])){
            spclRow[0] = rowDZ3T4UslExpl[2];
            spclRow[1] = Constants.rowDZ3T5_1Coef[1];
        }

        if (array[8].equals(rowDZ3T4UslExpl[3])){
            spclRow[0] = rowDZ3T4UslExpl[3];
            spclRow[1] = Constants.rowDZ3T5_1Coef[2];
        }

        if (array[8].equals(rowDZ3T4UslExpl[4])){
            spclRow[0] = rowDZ3T4UslExpl[4];
            spclRow[1] = Constants.rowDZ3T5_1Coef[3];
        }

        if (array[8].equals(rowDZ3T4UslExpl[5])){
            spclRow[0] = rowDZ3T4UslExpl[5];
            spclRow[1] = Constants.rowDZ3T5_1Coef[4];
        }

        if (array[8].equals(rowDZ3T4UslExpl[6])){
            spclRow[0] = rowDZ3T4UslExpl[6];
            spclRow[1] = Constants.rowDZ3T5_1Coef[5];
        }
        return spclRow;
    }


}
