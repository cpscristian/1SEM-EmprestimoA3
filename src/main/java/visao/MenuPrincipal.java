package visao;

import visao.relatorios.MenuRelatorios;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BFechar = new javax.swing.JButton();
        BGerF = new javax.swing.JButton();
        BGerA = new javax.swing.JButton();
        BGerE = new javax.swing.JButton();
        BRelatorios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        BRelatorios.setText("Relatórios");
        BRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRelatoriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BGerE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BGerA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BGerF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(BRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(BFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(BGerF)
                .addGap(18, 18, 18)
                .addComponent(BGerA)
                .addGap(18, 18, 18)
                .addComponent(BGerE)
                .addGap(18, 18, 18)
                .addComponent(BRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(BFechar)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BFecharActionPerformed

    private void BGerFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGerFActionPerformed
        GerFerramenta janela = new GerFerramenta();
        janela.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_BGerFActionPerformed

    private void BGerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGerAActionPerformed
        GerAmigo janela = new GerAmigo();
        janela.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_BGerAActionPerformed

    private void BGerEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGerEActionPerformed
        GerEmprestimo janela = new GerEmprestimo();
        janela.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_BGerEActionPerformed

    private void BRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRelatoriosActionPerformed
        MenuRelatorios janela = new MenuRelatorios();
        janela.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_BRelatoriosActionPerformed

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
    private javax.swing.JButton BRelatorios;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
