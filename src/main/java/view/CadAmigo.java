package view;

public class CadAmigo extends javax.swing.JFrame {

    public CadAmigo() {
        initComponents();
        setLocationRelativeTo(null);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Amigo");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFTelefoneA, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(TFNomeA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(BVoltarA)
                .addGap(18, 18, 18)
                .addComponent(BExcluirA)
                .addGap(18, 18, 18)
                .addComponent(BSalvarA)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFNomeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFTelefoneA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVoltarA)
                    .addComponent(BSalvarA)
                    .addComponent(BExcluirA))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarAActionPerformed
        MenuPrincipal janela = new MenuPrincipal();
        janela.setVisible(true);
        CadAmigo.this.dispose();
    }//GEN-LAST:event_BVoltarAActionPerformed

    private void BSalvarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalvarAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BSalvarAActionPerformed

    private void BExcluirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BExcluirAActionPerformed

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
            java.util.logging.Logger.getLogger(CadAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BExcluirA;
    private javax.swing.JButton BSalvarA;
    private javax.swing.JButton BVoltarA;
    private javax.swing.JTextField TFNomeA;
    private javax.swing.JTextField TFTelefoneA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
