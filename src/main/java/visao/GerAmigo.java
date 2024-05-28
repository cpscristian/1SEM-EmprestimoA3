package visao;

import modelo.Amigo;
import javax.swing.JOptionPane;

public class GerAmigo extends javax.swing.JFrame {

    private Amigo objetoamigo; // cria o vínculo com o Amigo
    public GerAmigo() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.objetoamigo = new Amigo(); // carrega objeto vazio de Amigo
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
        BListaA = new javax.swing.JButton();

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

        BListaA.setText("Lista");
        BListaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BListaAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFNomeA)
                    .addComponent(TFTelefoneA, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BVoltarA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSalvarA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BListaA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFNomeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFTelefoneA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(BListaA)
                .addGap(36, 36, 36)
                .addComponent(BSalvarA)
                .addGap(35, 35, 35)
                .addComponent(BVoltarA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            //nomeAmigo = TFNomeA
            //telefone = TFTelefoneA
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        }
    }//GEN-LAST:event_BSalvarAActionPerformed
    //Vai pra Lista
    private void BListaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BListaAActionPerformed
        ListaAmigo janela = new ListaAmigo();
        janela.setVisible(true);
        GerAmigo.this.dispose();
    }//GEN-LAST:event_BListaAActionPerformed

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
    private javax.swing.JButton BListaA;
    private javax.swing.JButton BSalvarA;
    private javax.swing.JButton BVoltarA;
    private javax.swing.JTextField TFNomeA;
    private javax.swing.JTextField TFTelefoneA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
