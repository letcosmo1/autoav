package view;

import controller.DisciplinaController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Disciplina;

public class ViewDisciplinasDialog extends javax.swing.JDialog {
    private DefaultTableModel tablemodel = new DefaultTableModel();
    private ArrayList<Disciplina> disciplinas;

    public ViewDisciplinasDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tablemodel.addColumn("Disciplinas");
        loadTableData();
    }

    private void loadTableData() {
        tablemodel.setNumRows(0);
        disciplinas = DisciplinaController.getAllDisciplinas();
        for (Disciplina disciplina : disciplinas) {
            tablemodel.addRow(new Object[]{disciplina.getNome_Disciplina()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPaneTable = new javax.swing.JScrollPane();
        jTableDisciplinas = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View disciplinas");

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

        jTableDisciplinas.setBackground(new java.awt.Color(242, 242, 242));
        jTableDisciplinas.setModel(tablemodel);
        jTableDisciplinas.setRowHeight(30);
        jScrollPaneTable.setViewportView(jTableDisciplinas);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jButtonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonUpdate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMouseClicked
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(this, "Excluir esta disciplina junto com todos seus assuntos e questões?", "", JOptionPane.YES_NO_OPTION);
        if (input == 0) {
            int linha_selecionada = -1;
            linha_selecionada = jTableDisciplinas.getSelectedRow();
            if (linha_selecionada >= 0) {
                String Nome_Disciplina = (String) jTableDisciplinas.getValueAt(linha_selecionada, 0);
                int ID_Disciplina = -1;
                for (Disciplina disciplina : disciplinas) {
                    if (disciplina.getNome_Disciplina().equals(Nome_Disciplina)) {
                        ID_Disciplina = disciplina.getID_Disciplina();
                        break;
                    }
                }
                if (ID_Disciplina != -1) {
                    DisciplinaController.deleteDisciplina(ID_Disciplina);
                    loadTableData();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione uma disciplina.");
            }
        }
    }//GEN-LAST:event_jButtonDeleteMouseClicked

    private void jButtonUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUpdateMouseClicked
        // TODO add your handling code here:
        int linha_selecionada = -1;
        linha_selecionada = jTableDisciplinas.getSelectedRow();
        if (linha_selecionada >= 0) {
            String novo_nome = JOptionPane.showInputDialog(this, "Novo nome da disciplina");
            if (novo_nome != null) {
                String Nome_Disciplina = (String) jTableDisciplinas.getValueAt(linha_selecionada, 0);
                int ID_Disciplina = -1;
                for (Disciplina disciplina : disciplinas) {
                    if (disciplina.getNome_Disciplina().equals(Nome_Disciplina)) {
                        ID_Disciplina = disciplina.getID_Disciplina();
                        break;
                    }
                }
                if (ID_Disciplina != -1) {
                    DisciplinaController.updateDisciplina(ID_Disciplina, novo_nome);
                    loadTableData();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma disciplina.");
        }
    }//GEN-LAST:event_jButtonUpdateMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneTable;
    private javax.swing.JTable jTableDisciplinas;
    // End of variables declaration//GEN-END:variables
}
