package view;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BFechar = new javax.swing.JButton();
        BGerF = new javax.swing.JButton();
        BGerA = new javax.swing.JButton();
        BGerE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jLabel1.setText("Empréstimo de ferramentas");

        BFechar.setText("Sair");
        BFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharActionPerformed(evt);
            }
        });

        BGerF.setText("Gerenciar ferramenta");
        BGerF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGerFActionPerformed(evt);
            }
        });

        BGerA.setText("Gerenciar amigo");
        BGerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGerAActionPerformed(evt);
            }
        });

        BGerE.setText("Gerenciar empréstimo");
        BGerE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGerEActionPerformed(evt);
            }
        });

        jButton1.setText("Histórico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BFechar)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BGerE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BGerA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BGerF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(BGerF)
                .addGap(18, 18, 18)
                .addComponent(BGerA)
                .addGap(18, 18, 18)
                .addComponent(BGerE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(BFechar)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BFecharActionPerformed

    private void BGerFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGerFActionPerformed
        CadFerramenta janela = new CadFerramenta();
        janela.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_BGerFActionPerformed

    private void BGerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGerAActionPerformed
        CadAmigo janela = new CadAmigo();
        janela.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_BGerAActionPerformed

    private void BGerEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGerEActionPerformed
        RegEmprestimo janela = new RegEmprestimo();
        janela.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_BGerEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JHistorico janela = new JHistorico();
        janela.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFechar;
    private javax.swing.JButton BGerA;
    private javax.swing.JButton BGerE;
    private javax.swing.JButton BGerF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
