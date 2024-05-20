package view;

public class RegEmprestimo extends javax.swing.JFrame {

   public RegEmprestimo() {
        initComponents();
        setLocationRelativeTo(null);
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        BVoltarE = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de empréstimos");

        BVoltarE.setText("Voltar");
        BVoltarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(BVoltarE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(BVoltarE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarEActionPerformed
        MenuPrincipal janela = new MenuPrincipal();
        janela.setVisible(true);
        RegEmprestimo.this.dispose();
    }//GEN-LAST:event_BVoltarEActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BVoltarE;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
