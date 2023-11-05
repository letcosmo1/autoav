package view;

import controller.DisciplinaController;
import controller.HistoricoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Disciplina;
import model.Historico;

public class ViewHistoricosDialog extends javax.swing.JDialog {

    private DefaultTableModel tablemodel = new DefaultTableModel();
    private ArrayList<Historico> historicos;
    private ArrayList<Disciplina> disciplinas;

    public ViewHistoricosDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tablemodel.addColumn("Disciplina");
        tablemodel.addColumn("Data");
        tablemodel.addColumn("Hora");
        DefaultTableCellRenderer center_renderer = new DefaultTableCellRenderer();
        center_renderer.setHorizontalAlignment(0);
        jTableHistoricos.getColumnModel().getColumn(1).setCellRenderer( center_renderer );
        jTableHistoricos.getColumnModel().getColumn(2).setCellRenderer( center_renderer );
        loadTableData();
    }

    private void loadTableData() {
        historicos = HistoricoController.getAllHistoricos();
        disciplinas = DisciplinaController.getAllDisciplinas();
        String Nome_Disciplina = null;
        for (Historico historico : historicos) {
            for (Disciplina disciplina : disciplinas) {
                if (historico.getID_Disciplina() == disciplina.getID_Disciplina()) {
                    Nome_Disciplina = disciplina.getNome_Disciplina();
                    break;
                }
            }
            tablemodel.addRow(new Object[]{Nome_Disciplina, historico.getData_Salvo(), historico.getHora_Salvo()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHistoricos = new javax.swing.JTable();
        jButtonSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View históricos");

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

        jTableHistoricos.setBackground(new java.awt.Color(242, 242, 242));
        jTableHistoricos.setModel(tablemodel);
        jTableHistoricos.setRowHeight(30);
        jScrollPane1.setViewportView(jTableHistoricos);

        jButtonSubmit.setText("Carregar");
        jButtonSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSubmitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSubmit)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSubmit)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSubmitMouseClicked
        // TODO add your handling code here:
        MainScreen.historicos_submitted = true;
        int linha_selecionada = -1;
        linha_selecionada = jTableHistoricos.getSelectedRow();
        if (linha_selecionada >= 0) {
            int ID_Historico = -1;
            String Nome_Disciplina = (String) jTableHistoricos.getValueAt(linha_selecionada, 0);
            String Nome_Instituicao = null, Nome_Professor = null;
            String Data_Salvo = (String) jTableHistoricos.getValueAt(linha_selecionada, 1);
            String Hora_Salvo = (String) jTableHistoricos.getValueAt(linha_selecionada, 2);
            for (Historico historico : historicos) {
                if(historico.getData_Salvo().equals(Data_Salvo) && historico.getHora_Salvo().equals(Hora_Salvo)) {
                    ID_Historico = historico.getID_Historico();
                    Nome_Instituicao = historico.getNome_Instituicao();
                    Nome_Professor = historico.getNome_Professor();
                    break;
                }
            }
            MainScreen.questoes_selecionadas = HistoricoController.getQuestoesHistorico(ID_Historico);
            MainScreen.Nome_Disciplina = Nome_Disciplina;
            MainScreen.Nome_Instituicao = Nome_Instituicao;
            MainScreen.Nome_Professor = Nome_Professor;
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um histórico.");
        }
    }//GEN-LAST:event_jButtonSubmitMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHistoricos;
    // End of variables declaration//GEN-END:variables
}
