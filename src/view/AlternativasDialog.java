package view;

public class AlternativasDialog extends javax.swing.JDialog {

    public AlternativasDialog(java.awt.Frame parent, boolean modal, String Alt_A, String Alt_B, String Alt_C, String Alt_D, String Alt_E, char Resposta) {
        super(parent, modal);
        initComponents();
        jTextAreaAlt_A.setText(Alt_A);
        jTextAreaAlt_B.setText(Alt_B);
        jTextAreaAlt_C.setText(Alt_C);
        jTextAreaAlt_D.setText(Alt_D);
        jTextAreaAlt_E.setText(Alt_E);
        jTextFieldResposta.setText(String.valueOf(Resposta));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldResposta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAlt_B = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaAlt_C = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaAlt_D = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaAlt_E = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaAlt_A = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldResposta.setEditable(false);
        jTextFieldResposta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldResposta.setText("A");

        jLabel1.setText("Resposta");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa b"));

        jTextAreaAlt_B.setEditable(false);
        jTextAreaAlt_B.setColumns(20);
        jTextAreaAlt_B.setLineWrap(true);
        jTextAreaAlt_B.setRows(5);
        jTextAreaAlt_B.setPreferredSize(new java.awt.Dimension(232, 103));
        jScrollPane2.setViewportView(jTextAreaAlt_B);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa c"));

        jTextAreaAlt_C.setEditable(false);
        jTextAreaAlt_C.setColumns(20);
        jTextAreaAlt_C.setLineWrap(true);
        jTextAreaAlt_C.setRows(5);
        jScrollPane3.setViewportView(jTextAreaAlt_C);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa d"));

        jTextAreaAlt_D.setEditable(false);
        jTextAreaAlt_D.setColumns(20);
        jTextAreaAlt_D.setLineWrap(true);
        jTextAreaAlt_D.setRows(5);
        jScrollPane4.setViewportView(jTextAreaAlt_D);

        jScrollPane5.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa e"));

        jTextAreaAlt_E.setEditable(false);
        jTextAreaAlt_E.setColumns(20);
        jTextAreaAlt_E.setLineWrap(true);
        jTextAreaAlt_E.setRows(5);
        jScrollPane5.setViewportView(jTextAreaAlt_E);

        jScrollPane6.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa a"));

        jTextAreaAlt_A.setEditable(false);
        jTextAreaAlt_A.setColumns(20);
        jTextAreaAlt_A.setLineWrap(true);
        jTextAreaAlt_A.setRows(5);
        jScrollPane6.setViewportView(jTextAreaAlt_A);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTextFieldResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextAreaAlt_A;
    private javax.swing.JTextArea jTextAreaAlt_B;
    private javax.swing.JTextArea jTextAreaAlt_C;
    private javax.swing.JTextArea jTextAreaAlt_D;
    private javax.swing.JTextArea jTextAreaAlt_E;
    private javax.swing.JTextField jTextFieldResposta;
    // End of variables declaration//GEN-END:variables
}
