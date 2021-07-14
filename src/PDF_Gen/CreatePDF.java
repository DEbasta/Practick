package PDF_Gen;

import Constants.Constants;
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

public class CreatePDF {
    String var;
    String[] array;

    static BaseFont times;
    public CreatePDF(String var) throws DocumentException, IOException, URISyntaxException {
        this.var = var;
        this.array = VarParse.parse(var);
        change();
        create();
    }
    private void change(){
        int number = Integer.parseInt(array[0]);
        array[0] = Constants.raz[number-1];
        number = Integer.parseInt(array[2]);
        array[2] = Constants.ms[number-1];
    }
    private void create() throws IOException, DocumentException, URISyntaxException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Variant.pdf"));

        document.open();

        times = BaseFont.createFont("fonts/times.ttf","cp1251",BaseFont.EMBEDDED);
        Paragraph varStringPDF=new Paragraph("Номер Варианта : " + String.valueOf(var),new Font(times,14));

        Paragraph emptyParagpaph  = new Paragraph(" " ,new Font(times,14));// Пустая строка для отступа в файле

        PdfPTable table = new PdfPTable(8);
        addTableHeader(table);
        addRows(table);
        //addCustomRows(table);

        document.add(varStringPDF);
        document.add(emptyParagpaph);
        document.add(table);
        document.close();
    }

    private void addTableHeader(PdfPTable table) {
        for (String i:Constants.headersDZ1T1)
        table.addCell(new Paragraph(i,new Font(times,11)));

//        Stream.of("column header 1", "column header 2", "column header 3")
//                .forEach(columnTitle -> {
//                    PdfPCell header = new PdfPCell();
//                    header.setBackgroundColor(BaseColor.WHITE);
//                    header.setPhrase(new Phrase(columnTitle));
//                    table.addCell(header);
//                });
    }

    private void addRows(PdfPTable table) {
        for (String i : array)
        table.addCell(new Paragraph(i,new Font(times,14)));
    }

    /*private static void addCustomRows(PdfPTable table) throws URISyntaxException, BadElementException, IOException {

//        Image img = Image.getInstance("image.png");
//        img.scalePercent(10);
//
//        PdfPCell imageCell = new PdfPCell(img);
//        table.addCell(imageCell);

        PdfPCell toplAlignCell = new PdfPCell(new Phrase("row 2, col 1"));
        toplAlignCell.setHorizontalAlignment(Element.ALIGN_TOP);
        table.addCell(toplAlignCell);

        PdfPCell horizontalAlignCell = new PdfPCell(new Phrase("row 2, col 2"));
        horizontalAlignCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(horizontalAlignCell);

        PdfPCell verticalAlignCell = new PdfPCell(new Phrase("row 2, col 3"));
        verticalAlignCell.setVerticalAlignment(Element.ALIGN_BOTTOM);
        table.addCell(verticalAlignCell);
    }*/

}
