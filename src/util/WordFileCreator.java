package util;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.Questao;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class WordFileCreator {
    private String Nome_Disciplina, instituicao, professor, Nome_Assunto;
    private ArrayList<Questao> questoes_selecionadas;
    private JDialog parent;
    
    public WordFileCreator(String Nome_Disciplina, String instituicao, String professor, ArrayList<Questao> questoes_selecionadas, String Nome_Assunto, JDialog parent) {
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
        XWPFDocument document = new XWPFDocument();
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        
        run.setText(instituicao);
        run.addBreak();
        run.setText("Disciplina: " + Nome_Disciplina);
        run.addBreak();
        run.setText("Assunto: " + Nome_Assunto);
        run.addBreak();
        run.setText("Professor: " + professor);
        run.addBreak();
        run.setText("Data: _____/_____/_____");
        run.addBreak();
        run.setText("Turma: ");
        run.addBreak();
        run.setText("Aluno: ");
        run.addBreak();
        run.addBreak();
        
        for (int i = 0; i < questoes_selecionadas.size(); i++) {
            run.setText(i+1 + " - " +questoes_selecionadas.get(i).getEnunciado());
            run.addBreak();
            run.setText(questoes_selecionadas.get(i).getAlt_A());
            run.addBreak();
            run.setText(questoes_selecionadas.get(i).getAlt_B());
            run.addBreak();
            run.setText(questoes_selecionadas.get(i).getAlt_C());
            run.addBreak();
            run.setText(questoes_selecionadas.get(i).getAlt_D());
            run.addBreak();
            run.setText(questoes_selecionadas.get(i).getAlt_E());
            run.addBreak();
            run.addBreak();
        }
        try {
            FileOutputStream file = new FileOutputStream(new File("word-docs/" + doc_name + ".docx"));
            document.write(file);
            file.close();
            JOptionPane.showMessageDialog(parent, "Docx salvo na pasta 'word-docs' como '" + doc_name + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
