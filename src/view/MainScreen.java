package view;

import controller.HistoricoController;
import controller.QuestaoController;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.Box;
import model.Questao;
import util.RandomNumberArray;

public class MainScreen extends javax.swing.JFrame {

    protected static int ID_Disciplina, ID_Questao, ID_Assunto, quantidade;
    protected static char Dificuldade;
    protected static String Nome_Disciplina, Nome_Instituicao, Nome_Professor, Nome_Assunto;
    protected static boolean createav_submitted = false, export_submitted = false, historicos_submitted = false; 
    protected static ArrayList<Questao> questoes_selecionadas;
    private ArrayList<Questao> questoes;

    public MainScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneQuestoes = new javax.swing.JScrollPane();
        jPanelQuestoes = new javax.swing.JPanel();
        jButtonFinalize = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelHeader = new javax.swing.JPanel();
        jPanelFooter = new javax.swing.JPanel();
        jPanelSidebar = new javax.swing.JPanel();
        jButtonAddDisciplina = new javax.swing.JButton();
        jButtonViewDisciplinas = new javax.swing.JButton();
        jButtonAddAssunto = new javax.swing.JButton();
        jButtonViewAssuntos = new javax.swing.JButton();
        jButtonAddQuestao = new javax.swing.JButton();
        jButtonViewQuestoes = new javax.swing.JButton();
        jPanelBackground = new javax.swing.JPanel();
        jPanelHome = new javax.swing.JPanel();
        jButtonCreateAv = new javax.swing.JButton();
        jButtonHistorico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jScrollPaneQuestoes.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneQuestoes.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneQuestoes.setPreferredSize(new java.awt.Dimension(800, 2786));

        jPanelQuestoes.setBackground(new java.awt.Color(204, 204, 204));
        jPanelQuestoes.setRequestFocusEnabled(false);
        jPanelQuestoes.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jPanelQuestoesComponentRemoved(evt);
            }
        });
        jPanelQuestoes.setLayout(new javax.swing.BoxLayout(jPanelQuestoes, javax.swing.BoxLayout.Y_AXIS));
        jScrollPaneQuestoes.setViewportView(jPanelQuestoes);

        jButtonFinalize.setText("Finalizar");
        jButtonFinalize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFinalizeMouseClicked(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AutoAv");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1050, 800));

        jPanelHeader.setBackground(new java.awt.Color(50, 80, 174));
        jPanelHeader.setForeground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 974, Short.MAX_VALUE)
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanelFooter.setBackground(new java.awt.Color(50, 80, 174));
        jPanelFooter.setLayout(new javax.swing.BoxLayout(jPanelFooter, javax.swing.BoxLayout.X_AXIS));

        jPanelSidebar.setBackground(new java.awt.Color(204, 204, 204));

        jButtonAddDisciplina.setBackground(new java.awt.Color(250, 250, 250));
        jButtonAddDisciplina.setText("+ Disciplina");
        jButtonAddDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddDisciplinaMouseClicked(evt);
            }
        });

        jButtonViewDisciplinas.setBackground(new java.awt.Color(250, 250, 250));
        jButtonViewDisciplinas.setText("Disciplinas");
        jButtonViewDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonViewDisciplinasMouseClicked(evt);
            }
        });

        jButtonAddAssunto.setBackground(new java.awt.Color(250, 250, 250));
        jButtonAddAssunto.setText("+ Assunto");
        jButtonAddAssunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddAssuntoMouseClicked(evt);
            }
        });

        jButtonViewAssuntos.setBackground(new java.awt.Color(250, 250, 250));
        jButtonViewAssuntos.setText("Assuntos");
        jButtonViewAssuntos.setToolTipText("");
        jButtonViewAssuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonViewAssuntosMouseClicked(evt);
            }
        });

        jButtonAddQuestao.setBackground(new java.awt.Color(250, 250, 250));
        jButtonAddQuestao.setText("+ Questão");
        jButtonAddQuestao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddQuestaoMouseClicked(evt);
            }
        });

        jButtonViewQuestoes.setBackground(new java.awt.Color(250, 250, 250));
        jButtonViewQuestoes.setText("Questões");
        jButtonViewQuestoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonViewQuestoesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelSidebarLayout = new javax.swing.GroupLayout(jPanelSidebar);
        jPanelSidebar.setLayout(jPanelSidebarLayout);
        jPanelSidebarLayout.setHorizontalGroup(
            jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonViewDisciplinas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddAssunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonViewAssuntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddQuestao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonViewQuestoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSidebarLayout.setVerticalGroup(
            jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSidebarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButtonAddDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonViewDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAddAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonViewAssuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAddQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonViewQuestoes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        jPanelBackground.setBackground(new java.awt.Color(0, 204, 0));
        jPanelBackground.setPreferredSize(new java.awt.Dimension(800, 2786));
        jPanelBackground.setLayout(new javax.swing.BoxLayout(jPanelBackground, javax.swing.BoxLayout.LINE_AXIS));

        jPanelHome.setBackground(new java.awt.Color(204, 204, 204));
        jPanelHome.setForeground(new java.awt.Color(255, 255, 255));

        jButtonCreateAv.setBackground(new java.awt.Color(250, 250, 250));
        jButtonCreateAv.setText("Nova Av");
        jButtonCreateAv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateAvMouseClicked(evt);
            }
        });

        jButtonHistorico.setBackground(new java.awt.Color(250, 250, 250));
        jButtonHistorico.setText("Histórico");
        jButtonHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonHistoricoMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logomedium.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jButtonCreateAv, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButtonHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreateAv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(261, 261, 261))
        );

        jPanelBackground.add(jPanelHome);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelQuestoesComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanelQuestoesComponentRemoved
        // TODO add your handling code here:
        if (evt.getChild().getClass().toString().equals("class view.QuestaoPanel")) {
            for (int i = 0; i < questoes_selecionadas.size(); i++) {
                if (questoes_selecionadas.get(i).getID_Questao() == ID_Questao) {
                    questoes_selecionadas.remove(i);
                    break;
                }
            }
        }
        jPanelQuestoes.validate();
        jPanelQuestoes.repaint();
    }//GEN-LAST:event_jPanelQuestoesComponentRemoved

    private void jButtonCreateAvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateAvMouseClicked
        // TODO add your handling code here:
        CreateAvDialog createavdialog = new CreateAvDialog(this, false);
        createavdialog.setVisible(true);
        createavdialog.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                if(createav_submitted) {
                    createav_submitted = false;
                    createAv();
                }
            }
        });
    }//GEN-LAST:event_jButtonCreateAvMouseClicked

    private void jButtonFinalizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFinalizeMouseClicked
        // TODO add your handling code here:
        ExportDialog exportdialog = new ExportDialog(this, false, Nome_Disciplina, Nome_Instituicao, Nome_Professor, questoes_selecionadas, Nome_Assunto);
        exportdialog.setVisible(true);
        exportdialog.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                if(export_submitted) {
                    export_submitted = false;
                    HistoricoController.addHistorico(Nome_Instituicao, Nome_Professor, ID_Disciplina, ID_Assunto, questoes_selecionadas);
                    jPanelQuestoes.removeAll();
                    addjPanelHome();
                    removeFooterButtons();
                }                
            }
        });
    }//GEN-LAST:event_jButtonFinalizeMouseClicked

    private void jButtonAddDisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddDisciplinaMouseClicked
        // TODO add your handling code here:
        AddDisciplinaDialog adddisciplina = new AddDisciplinaDialog(this, false);
        adddisciplina.setVisible(true);
    }//GEN-LAST:event_jButtonAddDisciplinaMouseClicked

    private void jButtonViewDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonViewDisciplinasMouseClicked
        // TODO add your handling code here:
        ViewDisciplinasDialog viewdisciplinas = new ViewDisciplinasDialog(this, false);
        viewdisciplinas.setVisible(true);
    }//GEN-LAST:event_jButtonViewDisciplinasMouseClicked

    private void jButtonAddAssuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddAssuntoMouseClicked
        // TODO add your handling code here:
        AddAssuntoDialog addassunto = new AddAssuntoDialog(this, false);
        addassunto.setVisible(true);
    }//GEN-LAST:event_jButtonAddAssuntoMouseClicked

    private void jButtonViewAssuntosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonViewAssuntosMouseClicked
        // TODO add your handling code here:
        ViewAssuntosDialog viewassuntos = new ViewAssuntosDialog(this, false);
        viewassuntos.setVisible(true);
    }//GEN-LAST:event_jButtonViewAssuntosMouseClicked

    private void jButtonAddQuestaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddQuestaoMouseClicked
        // TODO add your handling code here:
        AddQuestaoDialog addquestao = new AddQuestaoDialog(this, false);
        addquestao.setVisible(true);
    }//GEN-LAST:event_jButtonAddQuestaoMouseClicked

    private void jButtonViewQuestoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonViewQuestoesMouseClicked
        // TODO add your handling code here:
        ViewQuestoesDialog viewquestoes = new ViewQuestoesDialog(this, false);
        viewquestoes.setVisible(true);
    }//GEN-LAST:event_jButtonViewQuestoesMouseClicked

    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked
        // TODO add your handling code here:
        jPanelQuestoes.removeAll();
        addjPanelHome();
        removeFooterButtons();
    }//GEN-LAST:event_jButtonCancelMouseClicked

    private void jButtonHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHistoricoMouseClicked
        // TODO add your handling code here:
        ViewHistoricosDialog viewhistoricos = new ViewHistoricosDialog(this, false);
        viewhistoricos.setVisible(true);
        viewhistoricos.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                if(historicos_submitted) {
                    historicos_submitted = false;
                    loadAv();
                }                
            }
        });
    }//GEN-LAST:event_jButtonHistoricoMouseClicked

    private void jButtonAdicionarQuestaoMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (jPanelQuestoes.getComponentCount() < 25) {
            Questao questao = pickQuestao();
            if (questao != null) {
                jPanelQuestoes.remove(jPanelQuestoes.getComponentCount() - 1);
                jPanelQuestoes.remove(jPanelQuestoes.getComponentCount() - 1);
                jPanelQuestoes.remove(jPanelQuestoes.getComponentCount() - 1);
                jPanelQuestoes.add(Box.createRigidArea(new Dimension(0, 10)));
                jPanelQuestoes.add(new QuestaoPanel(questao.getID_Questao(), questao.getEnunciado(), questao.getAlt_A(), questao.getAlt_B(), questao.getAlt_C(), questao.getAlt_D(), questao.getAlt_E(), questao.getResposta()));
                jPanelQuestoes.add(Box.createRigidArea(new Dimension(0, 10)));
                jPanelQuestoes.add(jButtonAdicionarQuestao);
                jPanelQuestoes.add(Box.createRigidArea(new Dimension(0, 10)));
                this.validate();
            }
        }
    }

    private void createAv() {
        addjPanelQuestoes();
        addFooterButtons();
        jPanelQuestoes.add(Box.createRigidArea(new Dimension(0, 10)));
        jPanelQuestoes.add(new CabecalhoPanel(Nome_Instituicao, Nome_Disciplina, Nome_Assunto, Nome_Professor));
        questoes_selecionadas = pickQuestoes(this.quantidade, this.ID_Assunto, this.Dificuldade);
        for (Questao questao : questoes_selecionadas) {
            jPanelQuestoes.add(Box.createRigidArea(new Dimension(0, 10)));
            jPanelQuestoes.add(new QuestaoPanel(questao.getID_Questao(), questao.getEnunciado(), questao.getAlt_A(), questao.getAlt_B(), questao.getAlt_C(), questao.getAlt_D(), questao.getAlt_E(), questao.getResposta()));
        }
        jButtonAdicionarQuestao = new javax.swing.JButton();
        jButtonAdicionarQuestao.setText("Adicionar tarefa");
        jButtonAdicionarQuestao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAdicionarQuestaoMouseClicked(evt);
            }
        });
        jButtonAdicionarQuestao.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanelQuestoes.add(Box.createRigidArea(new Dimension(0, 10)));
        jPanelQuestoes.add(jButtonAdicionarQuestao);
        jPanelQuestoes.add(Box.createRigidArea(new Dimension(0, 10)));
        this.validate();
    }
    
    private void loadAv() {
        addjPanelQuestoes();
        addFooterButtons();
        jPanelQuestoes.add(Box.createRigidArea(new Dimension(0, 10)));
        jPanelQuestoes.add(new CabecalhoPanel(Nome_Instituicao, Nome_Disciplina, Nome_Assunto, Nome_Professor));
        for (Questao questao : questoes_selecionadas) {
            jPanelQuestoes.add(Box.createRigidArea(new Dimension(0, 10)));
            jPanelQuestoes.add(new QuestaoPanel(questao.getID_Questao(), questao.getEnunciado(), questao.getAlt_A(), questao.getAlt_B(), questao.getAlt_C(), questao.getAlt_D(), questao.getAlt_E(), questao.getResposta()));
        }
        jButtonAdicionarQuestao = new javax.swing.JButton();
        jButtonAdicionarQuestao.setText("Adicionar tarefa");
        jButtonAdicionarQuestao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAdicionarQuestaoMouseClicked(evt);
            }
        });
        jButtonAdicionarQuestao.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanelQuestoes.add(Box.createRigidArea(new Dimension(0, 10)));
        jPanelQuestoes.add(jButtonAdicionarQuestao);
        jPanelQuestoes.add(Box.createRigidArea(new Dimension(0, 10)));
        this.validate();
    }
    
    private void addjPanelQuestoes() {
        jPanelBackground.remove(jPanelHome);
        jPanelBackground.add(jScrollPaneQuestoes);
        jPanelQuestoes.setSize(jPanelBackground.getWidth(), jPanelBackground.getHeight());
        jScrollPaneQuestoes.setVisible(true);
    }
    
    private void addjPanelHome() {
        jScrollPaneQuestoes.setVisible(false);
        jPanelBackground.remove(jScrollPaneQuestoes);
        jPanelBackground.add(jPanelHome);
        jPanelHome.setVisible(true);
    }
    
    private void addFooterButtons() {
        jButtonCancel.setVisible(true);
        jButtonFinalize.setVisible(true);
        jPanelFooter.add(Box.createHorizontalGlue());
        jPanelFooter.add(jButtonCancel);
        jButtonCancel.setSize(130, 23);
        jPanelFooter.add(Box.createRigidArea(new Dimension(30, 0)));
        jPanelFooter.add(jButtonFinalize);
        jButtonFinalize.setSize(130, 23);
        jPanelFooter.add(Box.createRigidArea(new Dimension(30, 0)));
    }
    
    private void removeFooterButtons() {
        jPanelFooter.remove(jPanelFooter.getComponentCount() - 1);
        jButtonCancel.setVisible(false);
        jPanelFooter.remove(jButtonCancel);
        jPanelFooter.remove(jPanelFooter.getComponentCount() - 1);
        jButtonFinalize.setVisible(false);
        jPanelFooter.remove(jButtonFinalize);
        jPanelFooter.remove(jPanelFooter.getComponentCount() - 1);
    }
    
    private ArrayList<Questao> pickQuestoes(int quantidade, int ID_Assunto, char Dificuldade) {
        questoes = QuestaoController.getQuestoesByAssunto(ID_Assunto, Dificuldade);
        int[] indexes = RandomNumberArray.getArray(quantidade, questoes.size());
        ArrayList<Questao> picked_questoes = new ArrayList<Questao>();
        for (int i = 0; i < indexes.length; i++) {
            picked_questoes.add(questoes.get(indexes[i]));
        }
        return picked_questoes;
    }

    private Questao pickQuestao() {
        int[] indexes = RandomNumberArray.getArray(questoes.size(), questoes.size());
        Questao questao = null;
        boolean flag;
        for (int i = 0; i < questoes.size(); i++) {
            flag = true;
            for (int j = 0; j < questoes_selecionadas.size(); j++) {
                if (questoes_selecionadas.get(j).getID_Questao() == questoes.get(indexes[i]).getID_Questao()) {
                    flag = false;
                }
            }
            if (flag) {
                questoes_selecionadas.add(questoes.get(indexes[i]));
                return questoes.get(indexes[i]);
            }
        }
        return questao;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddAssunto;
    private javax.swing.JButton jButtonAddDisciplina;
    private javax.swing.JButton jButtonAddQuestao;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreateAv;
    private javax.swing.JButton jButtonFinalize;
    private javax.swing.JButton jButtonHistorico;
    private javax.swing.JButton jButtonViewAssuntos;
    private javax.swing.JButton jButtonViewDisciplinas;
    private javax.swing.JButton jButtonViewQuestoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelQuestoes;
    private javax.swing.JPanel jPanelSidebar;
    private javax.swing.JScrollPane jScrollPaneQuestoes;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JButton jButtonAdicionarQuestao;

}
