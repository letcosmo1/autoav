package view;

import controller.QuestaoController;
import javax.swing.JOptionPane;

public class QuestaoViewPanel extends javax.swing.JPanel {
    private QuestaoViewPanel me;
    private int ID_Questao;
    private String Alt_A, Alt_B, Alt_C, Alt_D, Alt_E;
    private char Resposta;
    
    public QuestaoViewPanel() {
        initComponents();
    }

    public QuestaoViewPanel(int ID_Questao, String Enunciado, String Alt_A, String Alt_B, String Alt_C, String Alt_D, String Alt_E, char Resposta) {
        initComponents();
        this.ID_Questao = ID_Questao;
        this.jTextAreaEnunciado.setText(Enunciado);
        this.Alt_A = Alt_A;
        this.Alt_B = Alt_B;
        this.Alt_C = Alt_C;
        this.Alt_D = Alt_D;
        this.Alt_E = Alt_E;
        this.Resposta = Resposta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEnunciado = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(590, 108));
        setMinimumSize(new java.awt.Dimension(590, 108));
        setPreferredSize(new java.awt.Dimension(590, 108));

        jTextAreaEnunciado.setEditable(false);
        jTextAreaEnunciado.setColumns(20);
        jTextAreaEnunciado.setLineWrap(true);
        jTextAreaEnunciado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaEnunciado);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/olho.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(30, 24));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButtonRemove.setText("X");
        jButtonRemove.setPreferredSize(new java.awt.Dimension(23, 24));
        jButtonRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRemoveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        AlternativasDialog alternativasdialog = new AlternativasDialog(null, false, Alt_A, Alt_B, Alt_C, Alt_D, Alt_E, Resposta);
        alternativasdialog.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButtonRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemoveMouseClicked
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(this, "Excluir esta questão?", "", JOptionPane.YES_NO_OPTION);
        if(input == 0) {
            QuestaoController.deleteQuestao(ID_Questao);
            me = this;
            me.getParent().remove(me.getParent().getComponentZOrder(me) - 1);
            me.getParent().remove(me);
        } 
    }//GEN-LAST:event_jButtonRemoveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaEnunciado;
    // End of variables declaration//GEN-END:variables
}
