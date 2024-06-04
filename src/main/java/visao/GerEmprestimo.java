package visao;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Amigo;
import modelo.Emprestimo;
import modelo.Ferramenta;

public class GerEmprestimo extends javax.swing.JFrame {
    private Emprestimo objetoemprestimo;
    private Amigo objetoamigo;
    private Ferramenta objetoferramenta;
   public GerEmprestimo() {
       
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.objetoamigo = new Amigo();
        this.objetoferramenta = new Ferramenta();
        this.objetoemprestimo = new Emprestimo();
        this.carregaListaAmigo();
        this.carregaListaFerramenta();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSlider1 = new javax.swing.JSlider();
        scrollPane1 = new java.awt.ScrollPane();
        list1 = new java.awt.List();
        BVoltarE = new javax.swing.JButton();
        BSalvarE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TListaFE = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TListaAE = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BHistoricoE = new javax.swing.JButton();
        TFIDAmigoE = new javax.swing.JTextField();
        TFIDFerramentaE = new javax.swing.JTextField();
        TFDataInicioE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFDataDevolucaoE = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de empréstimos");

        BVoltarE.setText("Voltar");
        BVoltarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarEActionPerformed(evt);
            }
        });

        BSalvarE.setText("Salvar");
        BSalvarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalvarEActionPerformed(evt);
            }
        });

        TListaFE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Marca", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TListaFE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TListaFEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TListaFE);

        TListaAE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TListaAE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TListaAEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TListaAE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Amigo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Ferramenta");

        BHistoricoE.setText("Histórico");
        BHistoricoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHistoricoEActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de Início:");

        jLabel4.setText("ID do Amigo:");

        jLabel5.setText("ID da Ferramenta");

        jLabel6.setText("Data de devolução:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(BVoltarE, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(BHistoricoE, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(BSalvarE, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TFDataInicioE, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(TFIDAmigoE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(TFIDFerramentaE, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFDataDevolucaoE)))))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFIDAmigoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFIDFerramentaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFDataInicioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TFDataDevolucaoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(BSalvarE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BVoltarE)
                            .addComponent(BHistoricoE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarEActionPerformed
        MenuPrincipal janela = new MenuPrincipal();
        janela.setVisible(true);
        GerEmprestimo.this.dispose();
    }//GEN-LAST:event_BVoltarEActionPerformed

    private void BSalvarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalvarEActionPerformed
            int idAmigoEmprestimo = Integer.parseInt(TFIDAmigoE.getText());
            int idFerramentaEmprestimo = Integer.parseInt(TFIDFerramentaE.getText());
            LocalDate dataInicio = LocalDate.parse(TFDataInicioE.getText());
            LocalDate dataDevolucao = LocalDate.parse(TFDataDevolucaoE.getText());
            
        
            if (this.objetoemprestimo.insertEmprestimoBD(idAmigoEmprestimo, idFerramentaEmprestimo, dataInicio, dataDevolucao)) {
                    JOptionPane.showMessageDialog(null, "Empréstimo cadastrado com Sucesso!");
                    // limpa campos da interface
                    this.TFIDAmigoE.setText("");
                    this.TFIDFerramentaE.setText("");
                    this.TFDataInicioE.setText("");
                    this.TFDataDevolucaoE.setText("");
            }
    }//GEN-LAST:event_BSalvarEActionPerformed

    private void BHistoricoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHistoricoEActionPerformed
        HistEmprestimo janela = new HistEmprestimo();
        janela.setVisible(true);
        GerEmprestimo.this.dispose();
    }//GEN-LAST:event_BHistoricoEActionPerformed

    private void TListaAEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TListaAEMouseClicked
         if (this.TListaAE.getSelectedRow() != -1) {
            String idAmigo = this.TListaAE.getValueAt(this.TListaAE.getSelectedRow(), 0).toString();

            this.TFIDAmigoE.setText(idAmigo);
        }
    }//GEN-LAST:event_TListaAEMouseClicked

    private void TListaFEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TListaFEMouseClicked
            if (this.TListaFE.getSelectedRow() != -1) {
            String idFerramenta = this.TListaFE.getValueAt(this.TListaFE.getSelectedRow(), 0).toString();

            this.TFIDFerramentaE.setText(idFerramenta);
        }
    }//GEN-LAST:event_TListaFEMouseClicked
    
    public void carregaListaAmigo() {
        DefaultTableModel modelo = (DefaultTableModel) this.TListaAE.getModel();
        modelo.setNumRows(0); // Posiciona na primeira linha da tabela
        // Carrega a lista de objetos aluno
        ArrayList<Amigo> minhaListaAmigo = objetoamigo.getMinhaListaAmigo();
        for (Amigo a : minhaListaAmigo) {
            modelo.addRow(new Object[]{
                a.getIdAmigo(),
                a.getNomeAmigo(),
                a.getTelefone()
            });
        }
        //Centraliza as colunas
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        
        for (int i = 0; i < TListaAE.getColumnCount(); i++) {
            TListaAE.getColumnModel().getColumn(i).setCellRenderer(centralizado);
        }
    }
    
    public void carregaListaFerramenta() {
        DefaultTableModel modelo = (DefaultTableModel) this.TListaFE.getModel();
        modelo.setNumRows(0); // Posiciona na primeira linha da tabela
        // Carrega a lista de objetos aluno
        ArrayList<Ferramenta> minhaListaFerramenta = objetoferramenta.getMinhaListaFerramenta();
        for (Ferramenta a : minhaListaFerramenta) {
            modelo.addRow(new Object[]{
                a.getIdFerramenta(),
                a.getNomeFerramenta(),
                a.getMarca(),
                a.getPreco()
            });
        }
        //Centraliza as colunas
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        
        for (int i = 0; i < TListaFE.getColumnCount(); i++) {
            TListaFE.getColumnModel().getColumn(i).setCellRenderer(centralizado);
        }
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHistoricoE;
    private javax.swing.JButton BSalvarE;
    private javax.swing.JButton BVoltarE;
    private javax.swing.JTextField TFDataDevolucaoE;
    private javax.swing.JTextField TFDataInicioE;
    private javax.swing.JTextField TFIDAmigoE;
    private javax.swing.JTextField TFIDFerramentaE;
    private javax.swing.JTable TListaAE;
    private javax.swing.JTable TListaFE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private java.awt.List list1;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
