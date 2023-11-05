package view;

import controller.AssuntoController;
import controller.DisciplinaController;
import controller.QuestaoController;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.Box;
import model.Assunto;
import model.Disciplina;
import model.Questao;

public class ViewQuestoesDialog extends javax.swing.JDialog {
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Assunto> assuntos;
    private ArrayList<Questao> questoes;
    
    public ViewQuestoesDialog(java.awt.Frame parent, boolean modal) {
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
        jScrollPaneQuestoes = new javax.swing.JScrollPane();
        jPanelQuestoes = new javax.swing.JPanel();
        jComboBoxDisciplinas = new javax.swing.JComboBox<>();
        jComboBoxAssuntos = new javax.swing.JComboBox<>();
        jButtonSubmit = new javax.swing.JButton();
        jComboBoxDificuldade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View questões");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logomini.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPaneQuestoes.setBackground(new java.awt.Color(51, 255, 0));
        jScrollPaneQuestoes.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneQuestoes.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneQuestoes.setMaximumSize(new java.awt.Dimension(648, 418));
        jScrollPaneQuestoes.setMinimumSize(new java.awt.Dimension(648, 418));
        jScrollPaneQuestoes.setPreferredSize(new java.awt.Dimension(648, 418));

        jPanelQuestoes.setBackground(new java.awt.Color(50, 80, 174));
        jPanelQuestoes.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jPanelQuestoesComponentRemoved(evt);
            }
        });
        jPanelQuestoes.setLayout(new javax.swing.BoxLayout(jPanelQuestoes, javax.swing.BoxLayout.Y_AXIS));
        jScrollPaneQuestoes.setViewportView(jPanelQuestoes);

        jComboBoxDisciplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDisciplinas.setBorder(javax.swing.BorderFactory.createTitledBorder("Disciplina"));
        jComboBoxDisciplinas.setPreferredSize(new java.awt.Dimension(76, 52));
        jComboBoxDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDisciplinasActionPerformed(evt);
            }
        });

        jComboBoxAssuntos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxAssuntos.setBorder(javax.swing.BorderFactory.createTitledBorder("Assunto"));

        jButtonSubmit.setText("Ok");
        jButtonSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSubmitMouseClicked(evt);
            }
        });

        jComboBoxDificuldade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDificuldade.setBorder(javax.swing.BorderFactory.createTitledBorder("Dificuldade"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneQuestoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAssuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(jComboBoxAssuntos)
                            .addComponent(jComboBoxDificuldade))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPaneQuestoes, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSubmitMouseClicked
        // TODO add your handling code here:
        jPanelQuestoes.removeAll();
        int ID_Assunto = getID_Assunto();
        char Dificuldade = getDificuldade();
        
        questoes = QuestaoController.getQuestoesByAssunto(ID_Assunto, Dificuldade);
        for (Questao questao : questoes) {
            jPanelQuestoes.add(Box.createRigidArea(new Dimension(0, 10)));
            jPanelQuestoes.add(new QuestaoViewPanel(questao.getID_Questao(), questao.getEnunciado(), questao.getAlt_A(), questao.getAlt_B(), questao.getAlt_C(), questao.getAlt_D(), questao.getAlt_E(), questao.getResposta()));
        }
        this.validate();  
    }//GEN-LAST:event_jButtonSubmitMouseClicked

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

    private void jPanelQuestoesComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanelQuestoesComponentRemoved
        // TODO add your handling code here:
        jPanelQuestoes.validate();
        jPanelQuestoes.repaint();
    }//GEN-LAST:event_jPanelQuestoesComponentRemoved
    
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
        for (int i = 0; i < dificuldades.length; i++) {
            jComboBoxDificuldade.addItem(dificuldades[i]);
        }
    }
    
    private int getID_Assunto() {
        int ID_Assunto = -1;
        String Nome_Assunto = (String) jComboBoxAssuntos.getSelectedItem();
        if(Nome_Assunto != null) {
            for (Assunto assunto : assuntos) {
                if(assunto.getNome_Assunto().equals(Nome_Assunto)) {
                    ID_Assunto = assunto.getID_Assunto();
                    break;
                }
            }
        }
        return ID_Assunto;
    }
    
    private char getDificuldade() {
        char Dificuldade = 'x';
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
        return Dificuldade;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox<String> jComboBoxAssuntos;
    private javax.swing.JComboBox<String> jComboBoxDificuldade;
    private javax.swing.JComboBox<String> jComboBoxDisciplinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelQuestoes;
    private javax.swing.JScrollPane jScrollPaneQuestoes;
    // End of variables declaration//GEN-END:variables
}
