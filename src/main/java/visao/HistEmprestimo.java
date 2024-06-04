package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;

public class HistEmprestimo extends javax.swing.JFrame {
    private Emprestimo objetoemprestimo;
    public HistEmprestimo() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.objetoemprestimo = new Emprestimo();
        this.carregaHistorico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BVoltarHE = new javax.swing.JButton();
        BExcluirHE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        THistorico = new javax.swing.JTable();
        BDevolvido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BVoltarHE.setText("Voltar");
        BVoltarHE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarHEActionPerformed(evt);
            }
        });

        BExcluirHE.setText("Excluir");
        BExcluirHE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirHEActionPerformed(evt);
            }
        });

        THistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID do Amigo", "ID da Ferramenta", "Data de início", "Data de devolução", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(THistorico);

        BDevolvido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BDevolvido.setText("Marcar como devolvido/ativo");
        BDevolvido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDevolvidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BVoltarHE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BExcluirHE)
                        .addGap(16, 16, 16))))
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(BDevolvido)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(BDevolvido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVoltarHE)
                    .addComponent(BExcluirHE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarHEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarHEActionPerformed
        GerEmprestimo janela = new GerEmprestimo();
        janela.setVisible(true);
        HistEmprestimo.this.dispose();
    }//GEN-LAST:event_BVoltarHEActionPerformed

    private void BExcluirHEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirHEActionPerformed
            try {
            int idEmprestimo = 0;
            if (this.THistorico.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro selecione um amigo para EXCLUIR");
            } else {
                idEmprestimo = Integer.parseInt(this.THistorico.getValueAt(this.THistorico.getSelectedRow(), 0).toString());
            }

            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este Emprestimo ?");

            if (respostaUsuario == 0) {// clicou em SIM
                // envia os dados para o Aluno processar
                if (this.objetoemprestimo.deleteEmprestimoBD(idEmprestimo)) {
                    JOptionPane.showMessageDialog(rootPane, "Amigo apagado com sucesso!");
                }
            }
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaHistorico();
        }
    }//GEN-LAST:event_BExcluirHEActionPerformed

    private void BDevolvidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDevolvidoActionPerformed
        int selectedRow = THistorico.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) THistorico.getModel();
            String status = (String) model.getValueAt(selectedRow, 5);
        
        // Alternar entre "ativo" e "devolvido"
        if (status.equals("Ativo")) {
            model.setValueAt("Devolvido", selectedRow, 5);
            objetoemprestimo.updateStatusEmprestimoBD((int) model.getValueAt(selectedRow, 0), true);
        } else if (status.equals("Devolvido")) {
            model.setValueAt("Ativo", selectedRow, 5);
            objetoemprestimo.updateStatusEmprestimoBD((int) model.getValueAt(selectedRow, 0), false);
        }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um empréstimo para marcar como devolvido.");
        }
    }//GEN-LAST:event_BDevolvidoActionPerformed
    
    public void carregaHistorico() {
        DefaultTableModel modelo = (DefaultTableModel) this.THistorico.getModel();
        modelo.setNumRows(0); // Posiciona na primeira linha da tabela
        // Carrega a lista de objetos emprestimo
        ArrayList<Emprestimo> minhaListaEmprestimo = objetoemprestimo.getMinhaListaEmprestimo();
        for (Emprestimo a : minhaListaEmprestimo) {
            modelo.addRow(new Object[]{
                a.getIdEmprestimo(),
                a.getIdAmigoEmprestimo(),
                a.getIdFerramentaEmprestimo(),
                a.getDataInicio(),
                a.getDataDevolucao(),
                a.isStatus() ? "Devolvido" : "Ativo"
            });
        }
        //Centraliza as colunas
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        
        for (int i = 0; i < THistorico.getColumnCount(); i++) {
            THistorico.getColumnModel().getColumn(i).setCellRenderer(centralizado);
        }
    }
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HistEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BDevolvido;
    private javax.swing.JButton BExcluirHE;
    private javax.swing.JButton BVoltarHE;
    private javax.swing.JTable THistorico;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
