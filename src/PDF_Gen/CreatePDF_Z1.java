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
    private boolean flag12, flag3;
    private int numberOfFinalParam;
    private final int keysAmount = 21; //raised ricently
    private int changeType;

    public CreatePDF_Z1(String var, String key,boolean flag12, boolean flag3) throws DocumentException, IOException, URISyntaxException {
        this.var = var;
        this.key = key;
        this.flag12 = flag12;
        this.flag3 = flag3;
        if (var.equals(Constants.nothingString)) {
            if (flag12 && !flag3) {
                var = T1Random.gen1();
                this.numberOfFinalParam = 8;
                changeType = 1;
            }
            if (!flag12 && flag3) {
                var = T1Random.gen2();
                this.numberOfFinalParam = 6;
                changeType = 2;
            }
            if ((flag12 && flag3) || (!flag12 && !flag3)) {
                var = T1Random.gen();
                this.numberOfFinalParam = 14;
                changeType = 3;
            }
            this.array = VarParse.parse(var,true,0);
        }
        else {
            String subKey = var.substring(0,2);
            if (flag12 && !flag3) {
                if (subKey.equals("11")) {
                    var = T1Random.gen1();
                    this.numberOfFinalParam = 8;
                    key = Constants.nothingString;
                    this.array = VarParse.parse(var,true,0);
                    changeType = 1;
                }
                else {
                    System.out.println(subKey);
                    subKey = VarParse.remakeVar(var);
                    subKey = subKey.substring(0, subKey.length()-1);//cut last dash
                    var = T1Random.gen1().concat("-" + subKey);
                    this.numberOfFinalParam = 14;
                    key = Constants.nothingString;
                    this.array = VarParse.parse(var,true,0);
                    changeType = 3;
                }
            }
            if (!flag12 && flag3) {
                if (subKey.equals("22")) {
                    var = T1Random.gen2();
                    this.numberOfFinalParam = 6;
                    key = Constants.nothingString;
                    this.array = VarParse.parse(var,true,0);
                    changeType = 2;
                }
                else {
                    subKey = VarParse.remakeVar(var);
                    var = subKey.concat(T1Random.gen2());
                    this.numberOfFinalParam = 14;
                    key = Constants.nothingString;
                    this.array = VarParse.parse(var,true,0);
                    changeType = 3;
                }
            }
            if (flag12 && flag3) {
                var = T1Random.gen();
                this.numberOfFinalParam = 14;
                key = Constants.nothingString;
                this.array = VarParse.parse(var,true,0);
                changeType = 3;
            }
            if (!flag12 && !flag3) {
                if (VarParse.decode(key).length()==24) {
                    this.array = VarParse.parse(var, false, 12);
                    this.numberOfFinalParam = 8;
                    changeType = 1;
                }

                if (VarParse.decode(key).length()==18) {
                    this.array = VarParse.parse(var, false, 9);
                    this.numberOfFinalParam = 6;
                    changeType = 2;
                }

                if (VarParse.decode(key).length()==42) {
                    this.array = VarParse.parse(var, false, keysAmount);
                    this.numberOfFinalParam = 14;
                    changeType = 3;
                }
            }
        }
        if (key.equals(Constants.nothingString)) {
            this.key = VarParse.encode(array);
        }
        change(changeType);

    }

    private void change(int changeType){
        switch (changeType){
            case 1:
                array[1] = Constants.rowDZ1T1raz[Integer.parseInt(array[1])];
                array[3] = Constants.rowDZ1T1ms[Integer.parseInt(array[3])];
                break;
            case 2:
                array[1] = Constants.rowDZ1T2blockConstr[Integer.parseInt(array[1])];
                break;
            case 3:
                array[1] = Constants.rowDZ1T1raz[Integer.parseInt(array[1])];
                array[3] = Constants.rowDZ1T1ms[Integer.parseInt(array[3])];
                array[13] = Constants.rowDZ1T2blockConstr[Integer.parseInt(array[13])];
                break;
        }
    }


    public void create() throws IOException, DocumentException, URISyntaxException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(Constants.documentNameDZ1 + String.valueOf(key) + Constants.documentFormat_pdf));

        String[] finalArray;

        finalArray = new String[numberOfFinalParam];

        finalArray = VarParse.specialParseDZ1(array, numberOfFinalParam, changeType);

        document.open();

        Paragraph DZTitle = new Paragraph( Constants.DZ1title,new Font(times,fontSize14));
        Paragraph varStringPDF = new Paragraph( Constants.varID + key,new Font(times,fontSize14));
        // строки ТЗ для ДЗ
        Paragraph tz1 = new Paragraph(Constants.tz1DZ1, new Font(times,fontSize11));
        Paragraph tz2 = new Paragraph(Constants.tz2DZ1, new Font(times,fontSize11));
        Paragraph tz3 = new Paragraph(Constants.tz3DZ1, new Font(times,fontSize11));

        Paragraph table1Name = new Paragraph(Constants.table1DZ1Name, new Font(times,fontSize8));
        table1Name.setAlignment(Element.ALIGN_RIGHT);
        Paragraph table2Name = new Paragraph(Constants.table2DZ1Name, new Font(times,fontSize8));
        table2Name.setAlignment(Element.ALIGN_RIGHT);

        document.add(DZTitle);
        document.add(emptyParagpaph);
        document.add(varStringPDF);
        document.add(emptyParagpaph);

        switch (changeType){
            case 1: {
                PdfPTable table1 = new PdfPTable(Constants.eightColumns);
                addTableHeader(table1, Constants.headersDZ1T1, fontSize11);
                addRows(table1, finalArray, fontSize11, 0, 8);

                document.add(tz1);
                document.add(emptyParagpaph);
                document.add(tz2);
                document.add(emptyParagpaph);
                document.add(table1Name);
                document.add(emptyParagpaph);
                document.add(table1);
            }
                break;
            case 2: {
                PdfPTable table2 = new PdfPTable(Constants.sixColumns);
                addTableHeader(table2, Constants.headersDZ1T2, fontSize11);
                addRows(table2, finalArray, fontSize11, 0, 6);

                document.add(tz3);
                document.add(emptyParagpaph);
                document.add(table2Name);
                document.add(emptyParagpaph);
                document.add(table2);
            }
                break;
            case 3: {
                PdfPTable table1 = new PdfPTable(Constants.eightColumns);
                addTableHeader(table1, Constants.headersDZ1T1, fontSize11);
                addRows(table1, finalArray, fontSize11, 0, 8);

                PdfPTable table2 = new PdfPTable(Constants.sixColumns);
                addTableHeader(table2, Constants.headersDZ1T2, fontSize11);
                addRows(table2, finalArray, fontSize11, 8, 14);

                document.add(tz1);
                document.add(emptyParagpaph);
                document.add(tz2);
                document.add(emptyParagpaph);
                document.add(table1Name);
                document.add(emptyParagpaph);
                document.add(table1);
                document.add(emptyParagpaph);
                document.add(tz3);
                document.add(emptyParagpaph);
                document.add(table2Name);
                document.add(emptyParagpaph);
                document.add(table2);
            }
                break;
        }





        document.close();
    }


}
