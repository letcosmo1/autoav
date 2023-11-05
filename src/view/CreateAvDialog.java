package view;

import controller.AssuntoController;
import controller.DisciplinaController;
import controller.QuestaoController;
import java.util.ArrayList;
import model.Assunto;
import model.Disciplina;

public class CreateAvDialog extends javax.swing.JDialog {
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Assunto> assuntos;
    private int ID_Disciplina, ID_Assunto, questoes_count;
    private char Dificuldade;

    public CreateAvDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadjComboBoxDisciplinas();
        loadjComboBoxDificuldade();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldInstituicao = new javax.swing.JTextField();
        jTextFieldProfessor = new javax.swing.JTextField();
        jComboBoxDisciplinas = new javax.swing.JComboBox<>();
        jComboBoxAssuntos = new javax.swing.JComboBox<>();
        jComboBoxQuantidade = new javax.swing.JComboBox<>();
        jButtonSubmit = new javax.swing.JButton();
        jComboBoxDificuldade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar av");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logomini.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTextFieldInstituicao.setBorder(javax.swing.BorderFactory.createTitledBorder("Instituição"));
        jTextFieldInstituicao.setMinimumSize(new java.awt.Dimension(69, 40));
        jTextFieldInstituicao.setPreferredSize(new java.awt.Dimension(69, 40));

        jTextFieldProfessor.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do Professor"));
        jTextFieldProfessor.setMinimumSize(new java.awt.Dimension(69, 40));
        jTextFieldProfessor.setPreferredSize(new java.awt.Dimension(69, 40));

        jComboBoxDisciplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDisciplinas.setBorder(javax.swing.BorderFactory.createTitledBorder("Disciplina"));
        jComboBoxDisciplinas.setMinimumSize(new java.awt.Dimension(69, 40));
        jComboBoxDisciplinas.setPreferredSize(new java.awt.Dimension(69, 52));
        jComboBoxDisciplinas.setRequestFocusEnabled(false);
        jComboBoxDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDisciplinasActionPerformed(evt);
            }
        });

        jComboBoxAssuntos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxAssuntos.setBorder(javax.swing.BorderFactory.createTitledBorder("Assunto"));
        jComboBoxAssuntos.setMinimumSize(new java.awt.Dimension(69, 40));
        jComboBoxAssuntos.setPreferredSize(new java.awt.Dimension(69, 52));
        jComboBoxAssuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAssuntosActionPerformed(evt);
            }
        });

        jComboBoxQuantidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Número De Questões"));
        jComboBoxQuantidade.setMinimumSize(new java.awt.Dimension(69, 40));
        jComboBoxQuantidade.setPreferredSize(new java.awt.Dimension(69, 52));

        jButtonSubmit.setText("Ok");
        jButtonSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSubmitMouseClicked(evt);
            }
        });

        jComboBoxDificuldade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDificuldade.setBorder(javax.swing.BorderFactory.createTitledBorder("Dificuldade"));
        jComboBoxDificuldade.setMinimumSize(new java.awt.Dimension(69, 40));
        jComboBoxDificuldade.setPreferredSize(new java.awt.Dimension(69, 52));
        jComboBoxDificuldade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDificuldadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInstituicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxAssuntos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxDisciplinas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxDificuldade, 0, 160, Short.MAX_VALUE)
                            .addComponent(jComboBoxQuantidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTextFieldInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxAssuntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxDificuldade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDisciplinasActionPerformed
        // TODO add your handling code here:
        String Nome_Disciplina = getNome_Disciplina();
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
        if(!jTextFieldInstituicao.getText().isEmpty() && !jTextFieldProfessor.getText().isEmpty() 
                && getQuantidade() != 0) {
            MainScreen.ID_Disciplina = ID_Disciplina;
            MainScreen.ID_Assunto = ID_Assunto;
            MainScreen.quantidade = getQuantidade();
            MainScreen.Dificuldade = Dificuldade;
            MainScreen.Nome_Disciplina = getNome_Disciplina();
            MainScreen.Nome_Instituicao = this.jTextFieldInstituicao.getText();
            MainScreen.Nome_Professor = this.jTextFieldProfessor.getText();
            MainScreen.Nome_Assunto = getNome_Assunto();
            MainScreen.createav_submitted = true;
            this.dispose();
        }        
    }//GEN-LAST:event_jButtonSubmitMouseClicked

    private void jComboBoxAssuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAssuntosActionPerformed
        // TODO add your handling code here:
        String Nome_Assunto = getNome_Assunto();
        if(Nome_Assunto != null) {
            for (Assunto assunto : assuntos) {
                if(assunto.getNome_Assunto().equals(Nome_Assunto)) {
                    ID_Assunto = assunto.getID_Assunto();
                    break;
                }
            }
        }
        questoes_count = QuestaoController.getQuestoesCount(ID_Assunto, Dificuldade);
        loadjComboBoxQuantidade();
    }//GEN-LAST:event_jComboBoxAssuntosActionPerformed

    private void jComboBoxDificuldadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDificuldadeActionPerformed
        // TODO add your handling code here:
        if(jComboBoxDificuldade.getSelectedItem() != null) {
            switch(jComboBoxDificuldade.getSelectedItem().toString()) {
                case "Fácil":
                    Dificuldade = 'f';
                    break;
                case "Médio":
                    Dificuldade = 'm';
                    break;
                case "Difícil":
                    Dificuldade = 'd';
                    break;
            }
        }
        questoes_count = QuestaoController.getQuestoesCount(ID_Assunto, Dificuldade);
        loadjComboBoxQuantidade();
    }//GEN-LAST:event_jComboBoxDificuldadeActionPerformed
    
    private void loadjComboBoxDisciplinas() {
        disciplinas = DisciplinaController.getAllDisciplinas();
        jComboBoxDisciplinas.removeAllItems();
        for (Disciplina disciplina : disciplinas) {
            jComboBoxDisciplinas.addItem(disciplina.getNome_Disciplina());
        }
    }
    
    private void loadjComboBoxDificuldade() {
        String[] dificuldades = {"Fácil", "Médio", "Difícil"};
        jComboBoxDificuldade.removeAllItems();
        for (String dificuldade : dificuldades) {
            jComboBoxDificuldade.addItem(dificuldade);
        }
    }
    
    private void loadjComboBoxQuantidade() {
        jComboBoxQuantidade.removeAllItems();
        if(questoes_count == 0) {
            jComboBoxQuantidade.addItem("0");
        }else if(questoes_count < 10) {
            for (int i = 1; i <= questoes_count; i++) {
                jComboBoxQuantidade.addItem(String.valueOf(i));
            }
        } else {
            for (int i = 1; i <= 10; i++) {
                jComboBoxQuantidade.addItem(String.valueOf(i));
            }
        }
    }
    
    private int getQuantidade() {
        int quantidade = Integer.parseInt(jComboBoxQuantidade.getSelectedItem().toString());
        return quantidade;
    }
    
    private String getNome_Disciplina() {
        String Nome_Disciplina = (String) jComboBoxDisciplinas.getSelectedItem();
        return Nome_Disciplina;
    }
    
    private String getNome_Assunto() {
        String Nome_Assunto = (String) jComboBoxAssuntos.getSelectedItem();
        return Nome_Assunto;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox<String> jComboBoxAssuntos;
    private javax.swing.JComboBox<String> jComboBoxDificuldade;
    private javax.swing.JComboBox<String> jComboBoxDisciplinas;
    private javax.swing.JComboBox<String> jComboBoxQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldInstituicao;
    private javax.swing.JTextField jTextFieldProfessor;
    // End of variables declaration//GEN-END:variables
}
