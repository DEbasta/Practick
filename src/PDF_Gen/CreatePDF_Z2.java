package PDF_Gen;

import Constants.Constants;
import Logic.T2Random;

import Logic.VarParse;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;


public class CreatePDF_Z2 extends AbstractCreatePDF{
    String var;
    String key;
    String[] array;
    private final int numberOfFinalParam = 30;
    private final int keysAmount = 41;



    public CreatePDF_Z2(String var,String key) throws DocumentException, IOException, URISyntaxException {
        this.var = var;
        this.key = key;
        if (var.equals(Constants.nothingString)) {
            var = T2Random.gen();
            this.array = VarParse.parse(var,true,0);
        }
        else
            this.array = VarParse.parse(var,false,keysAmount);
        if (key.equals(Constants.nothingString))
            this.key = VarParse.encode(array);
        change();

    }
    private void change(){//замена случайного числа, на соответствующую строку
        array[0] = Constants.rowDZ2ppMaterial[Integer.parseInt(array[0])];
        array[1] = Constants.rowDZ2vibration[Integer.parseInt(array[1])];
        array[7] = Constants.rowDZ2ppMaterial[Integer.parseInt(array[7])];
        array[8] = Constants.rowDZ2vibration[Integer.parseInt(array[8])];
        array[15] = Constants.rowDZ2razType[Integer.parseInt(array[15])];
        array[23] = Constants.rowDZ2mppMaterial[Integer.parseInt(array[23])];
        array[32] = Constants.rowDZ2T6ppMaterial[Integer.parseInt(array[32])];
        array[10] = Constants.rowDZ2dimensions[Integer.parseInt(array[10])];
        array[11] = Constants.rowDZ2dimensions[Integer.parseInt(array[11])];
        array[16] = Constants.rowDZ2dimensions[Integer.parseInt(array[16])];
        array[17] = Constants.rowDZ2dimensions[Integer.parseInt(array[17])];
        array[29] = Constants.rowDZ2dimensions[Integer.parseInt(array[29])];
        array[30] = Constants.rowDZ2dimensions[Integer.parseInt(array[30])];
    }

    public void create() throws IOException, DocumentException, URISyntaxException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(Constants.documentNameDZ2 + String.valueOf(key) + Constants.documentFormat_pdf));

        String[] finalArray;

        finalArray = new String[numberOfFinalParam];

        finalArray = VarParse.specialParseDZ2(array, numberOfFinalParam);

        Paragraph DZTitle = new Paragraph( Constants.DZ2title,new Font(times,fontSize14));

        Paragraph varStringPDF=new Paragraph( Constants.varID + key,new Font(times,fontSize14));

        Paragraph tz1 = new Paragraph(Constants.tz1DZ2, new Font(times,fontSize11));
        Paragraph tz2 = new Paragraph(Constants.tz2DZ2, new Font(times,fontSize11));
        Paragraph tz3 = new Paragraph(Constants.tz3DZ2, new Font(times,fontSize11));
        Paragraph tz4 = new Paragraph(Constants.tz4DZ2, new Font(times,fontSize11));
        Paragraph tz5 = new Paragraph(Constants.tz5DZ2, new Font(times,fontSize11));

        Paragraph table1Name = new Paragraph(Constants.table1DZ2Name, new Font(times,fontSize8));
        table1Name.setAlignment(Element.ALIGN_RIGHT);
        Paragraph table2Name = new Paragraph(Constants.table2DZ2Name, new Font(times,fontSize8));
        table2Name.setAlignment(Element.ALIGN_RIGHT);
        Paragraph table3Name = new Paragraph(Constants.table3DZ2Name, new Font(times,fontSize8));
        table3Name.setAlignment(Element.ALIGN_RIGHT);
        Paragraph table4Name = new Paragraph(Constants.table4DZ2Name, new Font(times,fontSize8));
        table4Name.setAlignment(Element.ALIGN_RIGHT);
        Paragraph table5Name = new Paragraph(Constants.table5DZ2Name, new Font(times,fontSize8));
        table5Name.setAlignment(Element.ALIGN_RIGHT);
        Paragraph table6Name = new Paragraph(Constants.table6DZ2Name, new Font(times,fontSize8));
        table6Name.setAlignment(Element.ALIGN_RIGHT);

        PdfPTable table1 = new PdfPTable(Constants.fourColumns);
        addTableHeader(table1,Constants.headersDZ2T1,fontSize11);
        addRows(table1, finalArray, fontSize11,0,4);

        PdfPTable table2 = new PdfPTable(Constants.twoColumns);
        addTableHeader(table2,Constants.headersDZ2T2,fontSize11);
        addCustomRows(table2,Integer.parseInt(finalArray[4]), Integer.parseInt(finalArray[5]));

        Image img = Image.getInstance(Constants.DZ2ImagePathNote);
        img.scalePercent(50);

        PdfPTable table3 = new PdfPTable(Constants.fiveColumns);
        addTableHeader(table3,Constants.headersDZ2T3,fontSize11);
        addRows(table3, finalArray, fontSize11,6,11);

        PdfPTable table4 = new PdfPTable(Constants.threeColumns);
        addTableHeader(table4,Constants.headersDZ2T4,fontSize11);
        addRows(table4, finalArray, fontSize11,11,14);

        PdfPTable table5 = new PdfPTable(Constants.eightColumns);
        addTableHeader(table5,Constants.headersDZ2T5,fontSize11);
        addRows(table5, finalArray, fontSize11,14,22);

        PdfPTable table6 = new PdfPTable(Constants.eightColumns);
        addTableHeader(table6,Constants.headersDZ2T6,fontSize11);
        addRows(table6, finalArray, fontSize11,22,30);






        document.open();


        document.add(DZTitle);
        document.add(emptyParagpaph);
        document.add(varStringPDF);
        document.add(emptyParagpaph);
        document.add(tz1);
        document.add(emptyParagpaph);
        document.add(table1Name);
        document.add(emptyParagpaph);
        document.add(table1);
        document.add(emptyParagpaph);
        document.add(table2Name);
        document.add(emptyParagpaph);
        document.add(table2);
        document.add(emptyParagpaph);
        document.add(img);
        document.add(emptyParagpaph);
        document.add(tz2);
        document.add(emptyParagpaph);
        document.add(table3Name);
        document.add(emptyParagpaph);
        document.add(table3);
        document.add(emptyParagpaph);
        document.add(tz3);
        document.add(emptyParagpaph);
        document.add(table4Name);
        document.add(emptyParagpaph);
        document.add(table4);
        document.add(emptyParagpaph);
        document.add(tz4);
        document.add(emptyParagpaph);
        document.add(table5Name);
        document.add(emptyParagpaph);
        document.add(table5);
        document.add(emptyParagpaph);
        document.add(tz5);
        document.add(emptyParagpaph);
        document.add(table6Name);
        document.add(emptyParagpaph);
        document.add(table6);


        document.close();
    }
    private void addCustomRows(PdfPTable table, int eskizInstance, int formulaInstance)
            throws BadElementException, IOException {
        Image img = Image.getInstance(Constants.DZ2ImagePathEskiz + String.valueOf(eskizInstance) + Constants.documentFormat_png);
        img.scalePercent(50);
        Image img1 = Image.getInstance(Constants.DZ2ImagePathFormula + String.valueOf(formulaInstance) + Constants.documentFormat_png);
        img1.scalePercent(50);

        PdfPCell imageCell = new PdfPCell(img);
        PdfPCell imageCell1 = new PdfPCell(img1);
        imageCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        imageCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        imageCell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
        imageCell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(imageCell);
        table.addCell(imageCell1);

    }
}
