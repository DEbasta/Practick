package PDF_Gen;

import Constants.Constants;
import Logic.T1Random;
import Logic.VarParse;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;

public class CreatePDF_Z1 extends AbstractCreatePDF{
    String var;
    String key;
    String[] array;
    private final int numberOfFinalParam = 14;
    private final int keysAmount = 19;

    public CreatePDF_Z1(String var, String key) throws DocumentException, IOException, URISyntaxException {
        this.var = var;
        this.key = key;
        if (var.equals(Constants.nothingString)) {
            var = T1Random.gen();
            this.array = VarParse.parse(var,true,0);
        }
        else
            this.array = VarParse.parse(var,false, keysAmount);
        if (key.equals(Constants.nothingString))
            this.key = VarParse.encode(array);
        change();
    }
    private void change(){
        int number = Integer.parseInt(array[0]);
        array[0] = Constants.rowDZ1T1raz[number-1];
        number = Integer.parseInt(array[2]);
        array[2] = Constants.rowDZ1T1ms[number-1];
        number = Integer.parseInt(array[11]);
        array[11] = Constants.rowDZ1T2blockConstr[number];
    }
    public void create() throws IOException, DocumentException, URISyntaxException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(Constants.documentNameDZ1 + String.valueOf(key) + Constants.documentFormat_pdf));

        String[] finalArray;

        finalArray = new String[numberOfFinalParam];

        finalArray = VarParse.specialParseDZ1(array, numberOfFinalParam);

        document.open();

        Paragraph varStringPDF=new Paragraph( Constants.varID + key,new Font(times,fontSize14));
        // строки ТЗ для ДЗ
        Paragraph tz1 = new Paragraph(Constants.tz1DZ1, new Font(times,fontSize11));
        Paragraph tz2 = new Paragraph(Constants.tz2DZ1, new Font(times,fontSize11));
        Paragraph tz3 = new Paragraph(Constants.tz3DZ1, new Font(times,fontSize11));

        Paragraph table1Name = new Paragraph(Constants.table1DZ1Name, new Font(times,fontSize8));
        table1Name.setAlignment(Element.ALIGN_RIGHT);
        Paragraph table2Name = new Paragraph(Constants.table1DZ1Name, new Font(times,fontSize8));
        table2Name.setAlignment(Element.ALIGN_RIGHT);

        PdfPTable table1 = new PdfPTable(Constants.eightColumns);
        addTableHeader(table1,Constants.headersDZ1T1,fontSize11);
        addRows(table1, finalArray, fontSize11,0,8);

        PdfPTable table2 = new PdfPTable(Constants.sixColumns);
        addTableHeader(table2,Constants.headersDZ1T2,fontSize11);
        addRows(table2, finalArray, fontSize11,8,14);



        document.add(varStringPDF);
        document.add(emptyParagpaph);
        document.add(tz1);
        document.add(emptyParagpaph);
        document.add(tz2);
        document.add(emptyParagpaph);
        document.add(table1Name);
        document.add(table1);
        document.add(emptyParagpaph);
        document.add(tz3);
        document.add(emptyParagpaph);
        document.add(table2Name);
        document.add(table2);



        document.close();
    }


}
