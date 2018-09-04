/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package emansi;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author katrox
 */
public class cetak {

    public cetak() {
    }

    public void cetak(JTable tbl) {
        DefaultTableModel tabel = (DefaultTableModel) tbl.getModel();
        String namaFile = "/home/acek/Laporan_EMANSI.pdf";
        Document doc = new Document(PageSize.A4.rotate());
        doc.setMargins(100, 100, 100, 100);
        PdfWriter pw = null;
        try {
            pw = PdfWriter.getInstance(doc, new FileOutputStream(namaFile));
            doc.open();

            doc.add(new Phrase("LAPORAN EVENT MANAGEMENT SISTEM INFORMASI \n"));
            doc.add(new Phrase("Tabel Detail Pendaftaran dan Acara : "));
            PdfPTable table = new PdfPTable(tabel.getColumnCount()); // 3 columns.
            for (int i = 0; i < tabel.getColumnCount(); i++) {
                table.addCell(new PdfPCell(new Paragraph(tabel.getColumnName(i))));
            }
            for (int i = 0; i < tabel.getRowCount(); i++) {
                for (int j = 0; j < tabel.getColumnCount(); j++) {
                    table.addCell(new PdfPCell(new Paragraph(tabel.getValueAt(i, j).toString())));
                }
            }
            doc.add(table);
            doc.close();
            //open it
            File FileOpen = new File(namaFile);
            Desktop desktop = Desktop.getDesktop();
            desktop.open(FileOpen);
        } catch (Exception egg) {
            System.out.println("ERROR :" + egg);
        }
    }
}