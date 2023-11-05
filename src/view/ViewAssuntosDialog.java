package view;

import controller.AssuntoController;
import controller.DisciplinaController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Assunto;
import model.Disciplina;

public class ViewAssuntosDialog extends javax.swing.JDialog {
    private DefaultTableModel tablemodel = new DefaultTableModel();
    private ArrayList<Assunto> assuntos;
    private ArrayList<Disciplina> disciplinas;

    public ViewAssuntosDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tablemodel.addColumn("Assuntos");
        tablemodel.addColumn("Disciplinas");
        jTableAssuntos.getColumnModel().getColumn(1).setPreferredWidth(0);
        loadTableData();
    }

    private void loadTableData() {
        tablemodel.setNumRows(0);
        assuntos = AssuntoController.getAllAssuntos();
        disciplinas = DisciplinaController.getAllDisciplinas();
        String Nome_Disciplina = null;
        for (Assunto assunto : assuntos) {
            for (Disciplina disciplina : disciplinas) {
                if(assunto.getID_Disciplina() == disciplina.getID_Disciplina()) {
                    Nome_Disciplina = disciplina.getNome_Disciplina();
                    break;
                }
            }
            tablemodel.addRow(new Object[]{assunto.getNome_Assunto(), Nome_Disciplina});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAssuntos = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View assuntos");

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

        jTableAssuntos.setBackground(new java.awt.Color(242, 242, 242));
        jTableAssuntos.setModel(tablemodel);
        jTableAssuntos.setRowHeight(30);
        jScrollPane1.setViewportView(jTableAssuntos);

        jButtonDelete.setText("Excluir");
        jButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteMouseClicked(evt);
            }
        });

        jButtonUpdate.setText("Alterar");
        jButtonUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUpdateMouseClicked(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonUpdate))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMouseClicked
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(this, "Excluir este assunto e todas suas questões?", "", JOptionPane.YES_NO_OPTION);
        if (input == 0) {
            int linha_selecionada = -1;
            linha_selecionada = jTableAssuntos.getSelectedRow();
            if (linha_selecionada >= 0) {
                String Nome_Assunto = (String) jTableAssuntos.getValueAt(linha_selecionada, 0);
                int ID_Assunto = -1;
                for (Assunto assunto : assuntos) {
                    if (assunto.getNome_Assunto().equals(Nome_Assunto)) {
                        ID_Assunto = assunto.getID_Assunto();
                        break;
                    }
                }
                if (ID_Assunto != -1) {
                    AssuntoController.deleteAssunto(ID_Assunto);
                    loadTableData();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um assunto");
            }
        }
    }//GEN-LAST:event_jButtonDeleteMouseClicked

    private void jButtonUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUpdateMouseClicked
        // TODO add your handling code here:
        int linha_selecionada = -1;
        linha_selecionada = jTableAssuntos.getSelectedRow();
        if (linha_selecionada >= 0) {
            String novo_nome = JOptionPane.showInputDialog(this, "Novo nome do assunto");
            if (novo_nome != null) {
                String Nome_Assunto = (String) jTableAssuntos.getValueAt(linha_selecionada, 0);
                int ID_Assunto = -1;
                for (Assunto assunto : assuntos) {
                    if (assunto.getNome_Assunto().equals(Nome_Assunto)) {
                        ID_Assunto = assunto.getID_Assunto();
                        break;
                    }
                }
                if (ID_Assunto != -1) {
                    AssuntoController.updateAssunto(ID_Assunto, novo_nome);
                    loadTableData();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um assunto.");
        }
    }//GEN-LAST:event_jButtonUpdateMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAssuntos;
    // End of variables declaration//GEN-END:variables
}
