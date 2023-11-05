package view;

import controller.AssuntoController;
import controller.DisciplinaController;
import controller.QuestaoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Assunto;
import model.Disciplina;

public class AddQuestaoDialog extends javax.swing.JDialog {
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Assunto> assuntos;
    private int ID_Assunto;
    private char Resposta, Dificuldade;
    
    public AddQuestaoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadjComboBoxDisciplinas();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupResposta = new javax.swing.ButtonGroup();
        buttonGroupDificuldade = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxDisciplinas = new javax.swing.JComboBox<>();
        jComboBoxAssuntos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEnunciado = new javax.swing.JTextArea();
        jRadioButtonA = new javax.swing.JRadioButton();
        jRadioButtonB = new javax.swing.JRadioButton();
        jRadioButtonC = new javax.swing.JRadioButton();
        jRadioButtonD = new javax.swing.JRadioButton();
        jRadioButtonE = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonFacil = new javax.swing.JRadioButton();
        jRadioButtonMedia = new javax.swing.JRadioButton();
        jRadioButtonDificil = new javax.swing.JRadioButton();
        jButtonSubmit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaAlt_A = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaAlt_B = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaAlt_C = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaAlt_D = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaAlt_E = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar questão");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logomini.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jComboBoxDisciplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDisciplinas.setBorder(javax.swing.BorderFactory.createTitledBorder("Disciplina"));
        jComboBoxDisciplinas.setPreferredSize(new java.awt.Dimension(69, 52));
        jComboBoxDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDisciplinasActionPerformed(evt);
            }
        });

        jComboBoxAssuntos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxAssuntos.setBorder(javax.swing.BorderFactory.createTitledBorder("Assunto"));
        jComboBoxAssuntos.setPreferredSize(new java.awt.Dimension(69, 52));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enunciado"));

        jTextAreaEnunciado.setColumns(20);
        jTextAreaEnunciado.setLineWrap(true);
        jTextAreaEnunciado.setRows(5);
        jTextAreaEnunciado.setToolTipText("");
        jScrollPane1.setViewportView(jTextAreaEnunciado);

        buttonGroupResposta.add(jRadioButtonA);
        jRadioButtonA.setText("a");

        buttonGroupResposta.add(jRadioButtonB);
        jRadioButtonB.setText("b");

        buttonGroupResposta.add(jRadioButtonC);
        jRadioButtonC.setText("c");

        buttonGroupResposta.add(jRadioButtonD);
        jRadioButtonD.setText("d");

        buttonGroupResposta.add(jRadioButtonE);
        jRadioButtonE.setText("e");

        jLabel1.setText("Alternativa correta");

        jLabel2.setText("Dificuldade");

        buttonGroupDificuldade.add(jRadioButtonFacil);
        jRadioButtonFacil.setText("Fácil");

        buttonGroupDificuldade.add(jRadioButtonMedia);
        jRadioButtonMedia.setText("Média");

        buttonGroupDificuldade.add(jRadioButtonDificil);
        jRadioButtonDificil.setText("Difícil");

        jButtonSubmit.setText("Ok");
        jButtonSubmit.setPreferredSize(new java.awt.Dimension(130, 30));
        jButtonSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSubmitMouseClicked(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaAlt_A.setColumns(20);
        jTextAreaAlt_A.setLineWrap(true);
        jTextAreaAlt_A.setRows(5);
        jTextAreaAlt_A.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa a"));
        jScrollPane3.setViewportView(jTextAreaAlt_A);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaAlt_B.setColumns(20);
        jTextAreaAlt_B.setLineWrap(true);
        jTextAreaAlt_B.setRows(5);
        jTextAreaAlt_B.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa b"));
        jScrollPane4.setViewportView(jTextAreaAlt_B);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaAlt_C.setColumns(20);
        jTextAreaAlt_C.setLineWrap(true);
        jTextAreaAlt_C.setRows(5);
        jTextAreaAlt_C.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa c"));
        jScrollPane5.setViewportView(jTextAreaAlt_C);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaAlt_D.setColumns(20);
        jTextAreaAlt_D.setLineWrap(true);
        jTextAreaAlt_D.setRows(5);
        jTextAreaAlt_D.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa d"));
        jScrollPane6.setViewportView(jTextAreaAlt_D);

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaAlt_E.setColumns(20);
        jTextAreaAlt_E.setLineWrap(true);
        jTextAreaAlt_E.setRows(5);
        jTextAreaAlt_E.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa e"));
        jScrollPane7.setViewportView(jTextAreaAlt_E);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxDisciplinas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxAssuntos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jRadioButtonB))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jRadioButtonFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jRadioButtonMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jRadioButtonDificil))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jRadioButtonA)
                                .addGap(112, 112, 112)
                                .addComponent(jRadioButtonC)
                                .addGap(30, 30, 30)
                                .addComponent(jRadioButtonD)
                                .addGap(33, 33, 33)
                                .addComponent(jRadioButtonE)))
                        .addContainerGap(74, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jComboBoxDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxAssuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonA)
                    .addComponent(jRadioButtonB)
                    .addComponent(jRadioButtonC)
                    .addComponent(jRadioButtonD)
                    .addComponent(jRadioButtonE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonFacil)
                    .addComponent(jRadioButtonDificil)
                    .addComponent(jRadioButtonMedia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void loadjComboBoxDisciplinas() {
        disciplinas = DisciplinaController.getAllDisciplinas();
        jComboBoxDisciplinas.removeAllItems();
        for (Disciplina disciplina : disciplinas) {
            jComboBoxDisciplinas.addItem(disciplina.getNome_Disciplina());
        }
    }
    
    private void getID_Assunto() {
        String Nome_Assunto = (String) jComboBoxAssuntos.getSelectedItem();
        
        if(Nome_Assunto != null) {
            for (Assunto assunto : assuntos) {
                if(assunto.getNome_Assunto().equals(Nome_Assunto)) {
                    ID_Assunto = assunto.getID_Assunto();
                    break;
                }
            }
        }
    }
    
    private void getResposta() {
        if(jRadioButtonA.isSelected()) {
            Resposta = 'a';
        } else if(jRadioButtonB.isSelected()) {
            Resposta = 'b';
        } else if(jRadioButtonC.isSelected()) {
            Resposta = 'c';
        } else if(jRadioButtonD.isSelected()) {
            Resposta = 'd';
        } else {
            Resposta = 'e';
        }
    }
    
    private void getDificuldade() {
        if(jRadioButtonFacil.isSelected()) {
            Dificuldade = 'f';
        } else if(jRadioButtonMedia.isSelected()) {
            Dificuldade = 'm';
        } else {
            Dificuldade = 'd';
        }
    }
    
    private void jComboBoxDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDisciplinasActionPerformed
        // TODO add your handling code here:
        int ID_Disciplina = -1;
        String Nome_Disciplina = (String) jComboBoxDisciplinas.getSelectedItem();
        if(Nome_Disciplina != null) {
            for (Disciplina disciplina : disciplinas) {
                if(disciplina.getNome_Disciplina().equals(Nome_Disciplina)) {
                    ID_Disciplina = disciplina.getID_Disciplina();
                    break;
                }
            }
            assuntos = AssuntoController.getAssuntosbyDisciplina(ID_Disciplina);
            jComboBoxAssuntos.removeAllItems();
            for (Assunto assunto : assuntos) {
                jComboBoxAssuntos.addItem(assunto.getNome_Assunto());
            }
        }
    }//GEN-LAST:event_jComboBoxDisciplinasActionPerformed

    private void jButtonSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSubmitMouseClicked
        // TODO add your handling code here:
        getID_Assunto();
        getResposta();
        getDificuldade();
        
        if(!jTextAreaEnunciado.getText().isEmpty() && !jTextAreaAlt_A.getText().isEmpty() 
                && !jTextAreaAlt_B.getText().isEmpty()&& !jTextAreaAlt_C.getText().isEmpty() 
                && !jTextAreaAlt_D.getText().isEmpty()&& !jTextAreaAlt_E.getText().isEmpty()) {
            
            QuestaoController.addQuestao(jTextAreaEnunciado.getText(), ("a) " + jTextAreaAlt_A.getText()), 
                    ("b) " + jTextAreaAlt_B.getText()), ("c) " + jTextAreaAlt_C.getText()), 
                    ("d) " + jTextAreaAlt_D.getText()), ("e) " + jTextAreaAlt_E.getText()), 
                    Resposta, Dificuldade, ID_Assunto);
            JOptionPane.showMessageDialog(this, "Questão adicionada com sucesso.");
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSubmitMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDificuldade;
    private javax.swing.ButtonGroup buttonGroupResposta;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox<String> jComboBoxAssuntos;
    private javax.swing.JComboBox<String> jComboBoxDisciplinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonA;
    private javax.swing.JRadioButton jRadioButtonB;
    private javax.swing.JRadioButton jRadioButtonC;
    private javax.swing.JRadioButton jRadioButtonD;
    private javax.swing.JRadioButton jRadioButtonDificil;
    private javax.swing.JRadioButton jRadioButtonE;
    private javax.swing.JRadioButton jRadioButtonFacil;
    private javax.swing.JRadioButton jRadioButtonMedia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextAreaAlt_A;
    private javax.swing.JTextArea jTextAreaAlt_B;
    private javax.swing.JTextArea jTextAreaAlt_C;
    private javax.swing.JTextArea jTextAreaAlt_D;
    private javax.swing.JTextArea jTextAreaAlt_E;
    private javax.swing.JTextArea jTextAreaEnunciado;
    // End of variables declaration//GEN-END:variables
}
