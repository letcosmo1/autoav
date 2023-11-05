package util;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.Questao;

public class PdfCreator {
    private String Nome_Disciplina, instituicao, professor, Nome_Assunto;
    private ArrayList<Questao> questoes_selecionadas;
    private JDialog parent;
    
    public PdfCreator(String Nome_Disciplina, String instituicao, String professor, ArrayList<Questao> questoes_selecionadas, String Nome_Assunto, JDialog parent) {
        this.Nome_Disciplina = Nome_Disciplina;
        this.instituicao = instituicao;
        this.professor = professor;
        this.questoes_selecionadas = questoes_selecionadas;
        this.Nome_Assunto = Nome_Assunto;
        this.parent = parent;
    }
    
    public void create() {
        SimpleDateFormat date_format = new SimpleDateFormat("dd-MM-yyyyHHmmss");
        String doc_name = Nome_Disciplina + date_format.format(new Date());
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("pdfs/" + doc_name + ".pdf"));
            document.open();
            document.add(new Paragraph(instituicao));
            document.add(new Paragraph("Disciplina: " + Nome_Disciplina));
            document.add(new Paragraph("Assunto: " + Nome_Assunto));
            document.add(new Paragraph("Professor: " + professor));
            document.add(new Paragraph("Data: _____/_____/_____"));
            document.add(new Paragraph("Turma: "));
            document.add(new Paragraph("Aluno: "));
            document.add(new Paragraph(" "));
            for (int i = 0; i < questoes_selecionadas.size(); i++) {
                document.add(new Paragraph(i+1 + " - " +questoes_selecionadas.get(i).getEnunciado()));
                document.add(new Paragraph(questoes_selecionadas.get(i).getAlt_A()));
                document.add(new Paragraph(questoes_selecionadas.get(i).getAlt_B()));
                document.add(new Paragraph(questoes_selecionadas.get(i).getAlt_C()));
                document.add(new Paragraph(questoes_selecionadas.get(i).getAlt_D()));
                document.add(new Paragraph(questoes_selecionadas.get(i).getAlt_E()));
                document.add(new Paragraph(" "));
            }
            document.close();
            JOptionPane.showMessageDialog(parent, "PDF salvo na pasta 'pdfs' como '" + doc_name + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
