package PDF_Gen;

import Constants.Constants;
import Logic.T3Z3Random;
import Logic.VarParse;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;

public class CreatePDF_Z3 extends  AbstractCreatePDF{
    String var;
    String key;
    String[] array;

    static BaseFont times;
    public CreatePDF_Z3(String var,String key) throws DocumentException, IOException, URISyntaxException {
        this.var = var;
        this.key = key;
        if (var.equals("")) {
            var = T3Z3Random.gen();
        }
        this.array = VarParse.parse(var);
        if (key.equals(""))
            this.key = VarParse.encode(array);
//        change();
        create();
    }
    private void change(){//замена случайного числа, на соответствующую строку
//        int number = Integer.parseInt(array[0]);
//        array[0] = Constants.raz[number-1];
//        number = Integer.parseInt(array[2]);
//        array[2] = Constants.ms[number-1];
    }
    private void create() throws IOException, DocumentException, URISyntaxException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Variant" + key + ".pdf"));

        document.open();

        times = BaseFont.createFont("fonts/times.ttf","cp1251",BaseFont.EMBEDDED);
        Paragraph varStringPDF=new Paragraph("Номер Варианта : " + String.valueOf(key),new Font(times,14));

//        PdfPTable table = new PdfPTable(7);
//        addTableHeader(table,Constants.headersDZ3T1,11);
//        addRows(table, array, 14,0,7);
        document.add(varStringPDF);
//        document.add(emptyParagpaph);
//        document.add(table);


        document.close();
    }

}
