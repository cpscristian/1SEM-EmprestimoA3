package visao;

import java.util.ArrayList;
import modelo.Amigo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerAmigo extends javax.swing.JFrame {

    private Amigo objetoamigo; // cria o vínculo com o Amigo
    public GerAmigo() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.objetoamigo = new Amigo(); // carrega objeto vazio de Amigo
        this.carregaLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFTelefoneA = new javax.swing.JTextField();
        BVoltarA = new javax.swing.JButton();
        BSalvarA = new javax.swing.JButton();
        TFNomeA = new javax.swing.JTextField();
        BExcluirA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TListaA = new javax.swing.JTable();
        BAlterarA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Amigo");
        setResizable(false);

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone:");

        BVoltarA.setText("Voltar");
        BVoltarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarAActionPerformed(evt);
            }
        });

        BSalvarA.setText("Salvar");
        BSalvarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalvarAActionPerformed(evt);
            }
        });

        BExcluirA.setText("Excluir");
        BExcluirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirAActionPerformed(evt);
            }
        });

        TListaA.setModel(new javax.swing.table.DefaultTableModel(
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
        TListaA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TListaAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TListaA);

        BAlterarA.setText("Alterar");
        BAlterarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAlterarAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFNomeA)
                            .addComponent(TFTelefoneA, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BVoltarA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BSalvarA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BExcluirA, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(BAlterarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFNomeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFTelefoneA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSalvarA)
                    .addComponent(BAlterarA))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVoltarA)
                    .addComponent(BExcluirA))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Volta pra outra página
    private void BVoltarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarAActionPerformed
        MenuPrincipal janela = new MenuPrincipal();
        janela.setVisible(true);
        GerAmigo.this.dispose();
    }//GEN-LAST:event_BVoltarAActionPerformed
    //Cadastra no BD
    private void BSalvarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalvarAActionPerformed
        try {
            String nomeAmigo = "";
            String telefone = "";
            
            if (this.TFNomeA.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nomeAmigo = this.TFNomeA.getText();
            }
            
            if (this.TFTelefoneA.getText().length() < 8) {
                throw new Mensagem("Idade deve ser número e maior que zero.");
            } else {
                telefone = this.TFTelefoneA.getText();
            }
            
            // envia os dados para o Controlador cadastrar
            if (this.objetoamigo.insertAmigoBD(nomeAmigo, telefone)) {
                JOptionPane.showMessageDialog(null, "Amigo cadastrado com Sucesso!");
                // limpa campos da interface
                this.TFNomeA.setText("");
                this.TFTelefoneA.setText("");
            }
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally{
            //Atualiza a tabela
            carregaLista();
        }
    }//GEN-LAST:event_BSalvarAActionPerformed

    private void BExcluirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirAActionPerformed
       try {
            // validando dados da interface gráfica.
            int idAmigo = 0;
            if (this.TListaA.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro selecione um amigo para EXCLUIR");
            } else {
                idAmigo = Integer.parseInt(this.TListaA.getValueAt(this.TListaA.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este Amigo ?");

            if (respostaUsuario == 0) {// clicou em SIM
                // envia os dados para o Aluno processar
                if (this.objetoamigo.deleteAmigoBD(idAmigo)) {
                    // limpa os campos
                    this.TFNomeA.setText("");
                    this.TFTelefoneA.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Amigo apagado com sucesso!");
                }
            }
            // atualiza a tabela.
            System.out.println(this.objetoamigo.getMinhaListaAmigo().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaLista();
        }
    }//GEN-LAST:event_BExcluirAActionPerformed

    private void TListaAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TListaAMouseClicked
        if (this.TListaA.getSelectedRow() != -1) {
            String nomeAmigo = this.TListaA.getValueAt(this.TListaA.getSelectedRow(), 1).toString();
            String telefone = this.TListaA.getValueAt(this.TListaA.getSelectedRow(), 2).toString();

            this.TFNomeA.setText(nomeAmigo);
            this.TFTelefoneA.setText(telefone);
        }
    }//GEN-LAST:event_TListaAMouseClicked

    private void BAlterarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlterarAActionPerformed
        try {
            int idAmigo = 0;
            if (this.TListaA.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro selecione um amigo para ALTERAR");
            } else {
                idAmigo = Integer.parseInt(this.TListaA.getValueAt(this.TListaA.getSelectedRow(), 0).toString());
            }
            
            String nomeAmigo = "";
            String telefone = "";
            
            if (this.TFNomeA.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nomeAmigo = this.TFNomeA.getText();
            }
            
            if (this.TFTelefoneA.getText().length() < 8) {
                throw new Mensagem("telefone ter pelo menos 8 caracteres");
            } else {
                telefone = this.TFTelefoneA.getText();
            }
            
            // envia os dados para o Controlador cadastrar
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar este Amigo ?");

            if (respostaUsuario == 0) {// clicou em SIM
                // envia os dados para o Aluno processar
                if (this.objetoamigo.updateAmigoBD(idAmigo, nomeAmigo, telefone)) {
                    // limpa os campos
                    this.TFNomeA.setText("");
                    this.TFTelefoneA.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Amigo alterado com sucesso!");
                }
            }
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally{
            //Atualiza a tabela
            carregaLista();
        }
    }//GEN-LAST:event_BAlterarAActionPerformed
    
    public void carregaLista() {
        DefaultTableModel modelo = (DefaultTableModel) this.TListaA.getModel();
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
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(GerAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAlterarA;
    private javax.swing.JButton BExcluirA;
    private javax.swing.JButton BSalvarA;
    private javax.swing.JButton BVoltarA;
    private javax.swing.JTextField TFNomeA;
    private javax.swing.JTextField TFTelefoneA;
    private javax.swing.JTable TListaA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
