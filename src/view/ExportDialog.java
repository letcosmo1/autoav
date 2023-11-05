package view;

import java.util.ArrayList;
import model.Questao;
import util.PdfCreator;
import util.WordFileCreator;

public class ExportDialog extends javax.swing.JDialog {
    private String Nome_Disciplina, instituicao, professor, Nome_Assunto;
    private ArrayList<Questao> questoes_selecionadas;
    
    public ExportDialog(java.awt.Frame parent, boolean modal, String Nome_Disciplina, String instituicao, String professor, ArrayList<Questao> questoes_selecionadas, String Nome_Assunto) {
        super(parent, modal);
        initComponents();
        this.Nome_Disciplina = Nome_Disciplina;
        this.instituicao = instituicao;
        this.professor = professor;
        this.questoes_selecionadas = questoes_selecionadas;
        this.Nome_Assunto = Nome_Assunto;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonPdf = new javax.swing.JRadioButton();
        jRadioButtonWord = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(jRadioButtonPdf);
        jRadioButtonPdf.setText("PDF");

        buttonGroup1.add(jRadioButtonWord);
        jRadioButtonWord.setText("Word (.docx)");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logomini.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSubmit.setText("Ok");
        jButtonSubmit.setPreferredSize(new java.awt.Dimension(130, 30));
        jButtonSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSubmitMouseClicked(evt);
            }
        });

        jLabel1.setText("Selecione o tipo do arquivo a ser exportado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jRadioButtonWord, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPdf)
                    .addComponent(jRadioButtonWord))
                .addGap(18, 18, 18)
                .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSubmitMouseClicked
        // TODO add your handling code here:
        if(jRadioButtonPdf.isSelected()) {
            MainScreen.export_submitted = true;
            this.setVisible(false);
            PdfCreator pdfcreator = new PdfCreator(Nome_Disciplina, instituicao, professor, questoes_selecionadas, Nome_Assunto, this);
            pdfcreator.create();
            this.dispose();
        }
        
        if(jRadioButtonWord.isSelected()) {
            MainScreen.export_submitted = true;
            this.setVisible(true);
            WordFileCreator wordcreator = new WordFileCreator(Nome_Disciplina, instituicao, professor, questoes_selecionadas, Nome_Assunto, this);
            wordcreator.create();
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSubmitMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonPdf;
    private javax.swing.JRadioButton jRadioButtonWord;
    // End of variables declaration//GEN-END:variables
}
