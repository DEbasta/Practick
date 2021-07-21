package PDF_Gen;


import Constants.Constants;
import Logic.T3Random;
import Logic.VarParse;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;

import static Constants.Constants.*;

public class CreatePDF_Z3 extends  AbstractCreatePDF{
    String var;
    String key;
    String[] array;
    private final int keysAmount = 26;
    private final int numberOfFinalParam = 15;
    private final int rowsTable5_2amount = 3;
    private final int rowsTable5_3amount = 4;
    private final int rowsTable6amount = 8;
    private final int imagesCount = 4;


    public CreatePDF_Z3(String var,String key) throws DocumentException, IOException, URISyntaxException {
        this.var = var;
        this.key = key;
        if (var.equals(Constants.nothingString)) {
            var = T3Random.gen();
            this.array = VarParse.parse(var,true,0);
        }
        else
            this.array = VarParse.parse(var,false,keysAmount);
        if (key.equals(Constants.nothingString))
            this.key = VarParse.encode(array);
        change();
    }
    private void change(){//замена случайного числа, на соответствующую строку

        array[0] = array[0].concat(Constants.rowDZ3T4Zeroes);
        array[1] = rowDZ3T4schemeSeries[Integer.parseInt(array[1])];
        array[5] = rowDZ3T4raz[Integer.parseInt(array[5])];
        array[8] = rowDZ3T4UslExpl[Integer.parseInt(array[8])];
        array[11] = rowDZ3T4condens[Integer.parseInt(array[11])];
        array[13] = rowDZ3T4connection[Integer.parseInt(array[13])];
        array[19] = rowDZ3T4diod[Integer.parseInt(array[19])];
        array[21] = rowDZ3T4switcher[Integer.parseInt(array[21])];
        array[23] = rowDZ3T4resistor[Integer.parseInt(array[23])];
        array[25] = rowDZ3T4relay[Integer.parseInt(array[25])];

    }
    public void create() throws IOException, DocumentException, URISyntaxException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(Constants.documentNameDZ3 + key + Constants.documentFormat_pdf));

        String[] finalArray;

        finalArray = new String[numberOfFinalParam];

        finalArray = VarParse.specialParseDZ3(array,numberOfFinalParam);

        document.open();

        Paragraph varStringPDF=new Paragraph( Constants.varID + key,new Font(times,fontSize14));
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
        for (int i = 0; i < rowsTable5_2amount; ++i){
            String[] row5_2 = {Constants.rowDZ3T5_2Vlaj[i],Constants.rowDZ3T5_2Coef[i]};
            addRows(table5_2, row5_2,fontSize11,0,2);
        }


        PdfPTable table5_3 = new PdfPTable(Constants.fourColumns);
        addTableHeader(table5_3,Constants.headersDZ3T5_3,fontSize11);
        for (int i = 0; i < rowsTable5_3amount;++i) {
            String[] row5_3 = {Constants.rowDZ3T5_3Vis[i], Constants.rowDZ3T5_3Coef[i], Constants.rowDZ3T5_3Vis[i+4], Constants.rowDZ3T5_3Coef[i+4]};
            addRows(table5_3, row5_3, fontSize11, 0 , 4);
        }



        PdfPTable table6 = new PdfPTable(Constants.fourColumns);
        addTableHeader(table6,Constants.headersDZ3T6,fontSize11);
        for (int i = 0; i < rowsTable6amount; ++i){
            String[] row6 = {Constants.rowDZ3T6Elem[i], Constants.rowDZ3T6Obozm[i], Constants.rowDZ3T6Lambd[i], Constants.rowDZ3T6Col[i]};
            addRows(table6,row6,fontSize11,0,4);
        }

        Image[] images;
        images = new Image[4];
        for (int i = 0; i < imagesCount; ++i){
            images[i] = Image.getInstance(Constants.DZ3ImagePath + String.valueOf(i+4) + Constants.documentFormat_png);
            images[i].scalePercent(50);
        }




        document.add(varStringPDF);
        document.add(emptyParagpaph);
        document.add(tz1);
        document.add(emptyParagpaph);
        document.add(table4_1);
        document.add(table4_2);
        document.add(table4Name);
        document.add(emptyParagpaph);
        //add image here
        document.add(images[0]);
        document.add(nameOfImage4);
        document.add(emptyParagpaph);
        //add image here
        document.add(images[1]);
        document.add(emptyParagpaph);
        document.add(nameOfImage5);
        document.add(emptyParagpaph);
        //add image here
        document.add(images[2]);
        document.add(nameOfImage6);
        document.add(emptyParagpaph);
        //add image here
        document.add(images[3]);
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
