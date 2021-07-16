package PDF_Gen;

import Constants.Constants;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;

public abstract class AbstractCreatePDF {

    static BaseFont times;// шрифт  TimesNewRoman
    static Paragraph emptyParagpaph  = new Paragraph(" " ,new Font(times,14));// Пустая строка для отступа в файле

    void addTableHeader(PdfPTable table, String[] headers, int fontSize) { // запись заголовков
        for (String i : headers)
            table.addCell(new Paragraph(i, new Font(times, fontSize)));
    }

    void addRows(PdfPTable table, String[] array, int fontSize, int begIndex, int endIndex) {// запись данных под заголовки
        for (int i = begIndex; i < endIndex; ++i)
            table.addCell(new Paragraph(array[i],new Font(times,fontSize)));
    }
}
