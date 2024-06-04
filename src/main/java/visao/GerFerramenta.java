package visao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Ferramenta;

public class GerFerramenta extends javax.swing.JFrame {
    
    private Ferramenta objetoferramenta; // cria um vínculo com a Ferramenta
    public GerFerramenta() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.objetoferramenta = new Ferramenta(); // carrega objeto vazio de ferramenta
        this.carregaLista();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BVoltarF = new javax.swing.JButton();
        BSalvarF = new javax.swing.JButton();
        TFMarcaF = new javax.swing.JTextField();
        TFPrecoF = new javax.swing.JTextField();
        TFNomeF = new javax.swing.JTextField();
        BAlterarF = new javax.swing.JButton();
        BExcluirF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TListaF = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Ferramenta");

        jLabel1.setText("Nome:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Preço:");

        BVoltarF.setText("Voltar");
        BVoltarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarFActionPerformed(evt);
            }
        });

        BSalvarF.setText("Salvar");
        BSalvarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalvarFActionPerformed(evt);
            }
        });

        BAlterarF.setText("Alterar");
        BAlterarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAlterarFActionPerformed(evt);
            }
        });

        BExcluirF.setText("Excluir");
        BExcluirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirFActionPerformed(evt);
            }
        });

        TListaF.setModel(new javax.swing.table.DefaultTableModel(
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
        TListaF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TListaFMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TListaF);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BSalvarF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BVoltarF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BAlterarF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BExcluirF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFMarcaF, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFPrecoF, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFNomeF, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFNomeF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFMarcaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFPrecoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSalvarF)
                    .addComponent(BAlterarF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVoltarF)
                    .addComponent(BExcluirF))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Botão Voltar
    private void BVoltarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarFActionPerformed
        MenuPrincipal janela = new MenuPrincipal();
        janela.setVisible(true);
        GerFerramenta.this.dispose();
    }//GEN-LAST:event_BVoltarFActionPerformed

//Botão Salvar
    private void BSalvarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalvarFActionPerformed
        try {
            String nomeFerramenta = "";
            String marca = "";
            double preco = 0.0;
            //Restrições
            if (this.TFNomeF.getText().length() < 2) {
                throw new Mensagem("Nome da ferramenta deve conter ao menos 2 caracteres.");
            } else {
                nomeFerramenta = this.TFNomeF.getText();
            }
            
            if (this.TFMarcaF.getText().length() < 1) {
                throw new Mensagem("Marca deve conter mais de 1 caractere.");
            } else {
                marca = this.TFMarcaF.getText();
            }
            
            if (this.TFPrecoF.getText().equals("0")) {
                throw new Mensagem("A ferramenta não pode ser grátis.");
            } else {
                preco = Double.parseDouble(this.TFPrecoF.getText());
            }
            
            
            // envia os dados para o Controlador cadastrar
            if (this.objetoferramenta.insertFerramentaBD(nomeFerramenta, marca, preco)) {
                JOptionPane.showMessageDialog(null, "Ferramenta cadastrada com sucesso!");
                // limpa campos da interface
                this.TFNomeF.setText("");
                this.TFMarcaF.setText("");
                this.TFPrecoF.setText ("");
            }        
            
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Apenas números.");
        }
        carregaLista();
    }//GEN-LAST:event_BSalvarFActionPerformed

    private void BExcluirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirFActionPerformed
        try {
            // validando dados da interface gráfica.
            int idFerramenta = 0;
            if (this.TListaF.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro selecione uma ferramenta para EXCLUIR");
            } else {
                idFerramenta = Integer.parseInt(this.TListaF.getValueAt(this.TListaF.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esta Ferramenta ?");

            if (respostaUsuario == 0) {// clicou em SIM
                // envia os dados para o Aluno processar
                if (this.objetoferramenta.deleteFerramentaBD(idFerramenta)) {
                    // limpa os campos
                    this.TFNomeF.setText("");
                    this.TFMarcaF.setText("");
                    this.TFPrecoF.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta apagado com sucesso!");
                }
            }
            // atualiza a tabela.
            System.out.println(this.objetoferramenta.getMinhaListaFerramenta().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaLista();
        }
        
    }//GEN-LAST:event_BExcluirFActionPerformed

    private void BAlterarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlterarFActionPerformed
        try {
            int idFerramenta = 0;
            if (this.TListaF.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro selecione uma ferramenta para ALTERAR");
            } else {
                idFerramenta = Integer.parseInt(this.TListaF.getValueAt(this.TListaF.getSelectedRow(), 0).toString());
            }
            String marca = this.TFMarcaF.getText();
            String nomeFerramenta = "";
            double preco = 0.0;
            
            if (this.TFNomeF.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nomeFerramenta = this.TFNomeF.getText();
            }
            
            if (this.TFPrecoF.getText().equals(0)) {
                throw new Mensagem("A ferramenta não deve ser de graça!");
            } else {
                preco = Double.parseDouble(this.TFPrecoF.getText());
            }
            
            // envia os dados para o Controlador cadastrar
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar esta Ferramenta?");

            if (respostaUsuario == 0) {// clicou em SIM
                // envia os dados para o Aluno processar
                if (this.objetoferramenta.updateFerramentaBD(idFerramenta, nomeFerramenta, marca, preco)) {
                    // limpa os campos
                    this.TFNomeF.setText("");
                    this.TFMarcaF.setText("");
                    this.TFPrecoF.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta alterado com sucesso!");
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
    }//GEN-LAST:event_BAlterarFActionPerformed

    private void TListaFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TListaFMouseClicked
        if (this.TListaF.getSelectedRow() != -1) {
            String nomeFerramenta = this.TListaF.getValueAt(this.TListaF.getSelectedRow(), 1).toString();
            String marca = this.TListaF.getValueAt(this.TListaF.getSelectedRow(), 2).toString();
            double preco = Double.parseDouble(this.TListaF .getValueAt(this.TListaF.getSelectedRow(), 3).toString());

            this.TFNomeF.setText(nomeFerramenta);
            this.TFMarcaF.setText(marca);
            this.TFPrecoF.setText(String.valueOf(preco));
        }
    }//GEN-LAST:event_TListaFMouseClicked
    public void carregaLista() {
        DefaultTableModel modelo = (DefaultTableModel) this.TListaF.getModel();
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
        
        for (int i = 0; i < TListaF.getColumnCount(); i++) {
            TListaF.getColumnModel().getColumn(i).setCellRenderer(centralizado);
        }
    }

    public String getTableData() {
    StringBuilder data = new StringBuilder();
    // Adiciona cabeçalhos
    data.append(String.format("%-40s %-40s %-40s %-40s\n", "ID", "Nome", "Marca", "Preço"));
    data.append("------------------------------------------------------------------------------------------------------------------\n");
    // Adiciona dados da tabela
    for (int i = 0; i < TListaF.getRowCount(); i++) {
        data.append(String.format("%-40s %-40s %-40s %-40s\n", 
            TListaF.getValueAt(i, 0).toString(), 
            TListaF.getValueAt(i, 1).toString(), 
            TListaF.getValueAt(i, 2).toString(), 
            TListaF.getValueAt(i, 3).toString()));
    }
    return data.toString();
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
            java.util.logging.Logger.getLogger(GerFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerFerramenta().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAlterarF;
    private javax.swing.JButton BExcluirF;
    private javax.swing.JButton BSalvarF;
    private javax.swing.JButton BVoltarF;
    private javax.swing.JTextField TFMarcaF;
    private javax.swing.JTextField TFNomeF;
    private javax.swing.JTextField TFPrecoF;
    private javax.swing.JTable TListaF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
