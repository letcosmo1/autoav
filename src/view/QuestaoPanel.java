package view;

public class QuestaoPanel extends javax.swing.JPanel {

    private QuestaoPanel me;
    
    public QuestaoPanel() {
        initComponents();
    }
    
    public QuestaoPanel(int ID_Questao, String Enunciado, String Alt_A, String Alt_B, String Alt_C, String Alt_D, String Alt_E, char Resposta) {
        initComponents();
        this.ID_Questao = ID_Questao;
        this.Enunciado.setText(Enunciado);
        this.Alt_A.setText(Alt_A);
        this.Alt_B.setText(Alt_B);
        this.Alt_C.setText(Alt_C);
        this.Alt_D.setText(Alt_D);
        this.Alt_E.setText(Alt_E);
        this.Resposta.setText(String.valueOf(Resposta));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Enunciado = new javax.swing.JTextArea();
        Alt_A = new javax.swing.JTextField();
        Alt_B = new javax.swing.JTextField();
        Alt_C = new javax.swing.JTextField();
        Alt_D = new javax.swing.JTextField();
        Alt_E = new javax.swing.JTextField();
        Resposta = new javax.swing.JTextField();
        jLabelResposta = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 226));

        jButtonRemove.setText("X");
        jButtonRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRemoveMouseClicked(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(244, 54));

        Enunciado.setEditable(false);
        Enunciado.setColumns(20);
        Enunciado.setLineWrap(true);
        Enunciado.setRows(4);
        Enunciado.setMaximumSize(new java.awt.Dimension(232, 70));
        Enunciado.setPreferredSize(new java.awt.Dimension(232, 70));
        jScrollPane1.setViewportView(Enunciado);

        Alt_A.setEditable(false);
        Alt_A.setText("jTextField1");

        Alt_B.setEditable(false);
        Alt_B.setText("jTextField2");

        Alt_C.setEditable(false);
        Alt_C.setText("jTextField3");

        Alt_D.setEditable(false);
        Alt_D.setText("jTextField4");

        Alt_E.setEditable(false);
        Alt_E.setText("jTextField5");

        Resposta.setEditable(false);
        Resposta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Resposta.setText("A");

        jLabelResposta.setText("Resposta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRemove)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Alt_A, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Alt_D, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Alt_C, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Alt_B)
                            .addComponent(Alt_E))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelResposta)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alt_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alt_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelResposta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alt_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alt_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alt_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemoveMouseClicked
        // TODO add your handling code here:
        MainScreen.ID_Questao = this.ID_Questao;
        me = this;
        me.getParent().remove(me.getParent().getComponentZOrder(me) - 1);
        me.getParent().remove(me);
    }//GEN-LAST:event_jButtonRemoveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alt_A;
    private javax.swing.JTextField Alt_B;
    private javax.swing.JTextField Alt_C;
    private javax.swing.JTextField Alt_D;
    private javax.swing.JTextField Alt_E;
    private javax.swing.JTextArea Enunciado;
    private javax.swing.JTextField Resposta;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabelResposta;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    public int ID_Questao;
}
