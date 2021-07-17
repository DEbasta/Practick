package PDF_Gen;

import Constants.Constants;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;

import java.io.IOException;

public abstract class AbstractCreatePDF {

    static BaseFont times;// шрифт  TimesNewRoman

    static int fontSize8 = 8;
    static int fontSize11 = 11;
    static int fontSize14 = 14;

    static {
        try {
            times = BaseFont.createFont("fonts/times.ttf","cp1251",BaseFont.EMBEDDED);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Paragraph emptyParagpaph  = new Paragraph(" " ,new Font(times,fontSize14));// Пустая строка для отступа в файле

    void addTableHeader(PdfPTable table, String[] headers, int fontSize) { // запись заголовков
        for (String i : headers)
            table.addCell(new Paragraph(i, new Font(times, fontSize)));
    }

    void addRows(PdfPTable table, String[] array, int fontSize, int begIndex, int endIndex) {// запись данных под заголовки
        for (int i = begIndex; i < endIndex; ++i)
            table.addCell(new Paragraph(array[i],new Font(times,fontSize)));
    }

    void addSingleValueToTable(PdfPTable table, String string, int fontSize){
        table.addCell(new Paragraph(string, new Font(times,fontSize)));
    }
}
