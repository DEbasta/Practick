package PDF_Gen;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import java.io.IOException;

public class CreatePDF_Z2 {
    private void addCustomRows(PdfPTable table)
            throws BadElementException, IOException {
        Image img = Image.getInstance("Images/DZ2T2EskizImage1.png");
        img.scalePercent(50);
        Image img1 = Image.getInstance("Images/DZ2T2FormulaImage1.png");
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
