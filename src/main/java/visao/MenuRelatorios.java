package visao;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import visao.MenuPrincipal;

public class MenuRelatorios extends javax.swing.JFrame {

    public MenuRelatorios() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BFerramentasR = new javax.swing.JButton();
        BAmigosR = new javax.swing.JButton();
        BEmprestimosR = new javax.swing.JButton();
        BVoltarR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de relatórios");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Relatórios");

        BFerramentasR.setText("Ferramentas");
        BFerramentasR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFerramentasRActionPerformed(evt);
            }
        });

        BAmigosR.setText("Amigos");
        BAmigosR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAmigosRActionPerformed(evt);
            }
        });

        BEmprestimosR.setText("Empréstimos");
        BEmprestimosR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEmprestimosRActionPerformed(evt);
            }
        });

        BVoltarR.setText("Voltar");
        BVoltarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BVoltarR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BEmprestimosR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BAmigosR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BFerramentasR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(BFerramentasR)
                .addGap(35, 35, 35)
                .addComponent(BAmigosR)
                .addGap(33, 33, 33)
                .addComponent(BEmprestimosR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(BVoltarR)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Volta à página anterior
    private void BVoltarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarRActionPerformed
        MenuPrincipal janela = new MenuPrincipal();
        janela.setVisible(true);
        MenuRelatorios.this.dispose();
    }//GEN-LAST:event_BVoltarRActionPerformed
    
    //Gera o relatório das ferramentas cadastradas
    private void BFerramentasRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFerramentasRActionPerformed
        GerFerramenta gerFerramenta = new GerFerramenta(); // Instancia a classe GerFerramenta
        String data = gerFerramenta.getTableData(); //Pega o método para obter os dados da tabela

        JTextArea textArea = new JTextArea(30,50);
        textArea.setEditable(true);
        textArea.setText(data); // Define o texto no JTextArea
        JScrollPane painelRolagem = new JScrollPane(textArea);
    
        JOptionPane.showMessageDialog(null, painelRolagem, "Relatório de Ferramentas", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BFerramentasRActionPerformed
    
    //Gera o relatório dos amigos cadastrados
    private void BAmigosRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAmigosRActionPerformed
        GerAmigo gerAmigo = new GerAmigo(); // Instancia a classe GerAmigo
        String data = gerAmigo.getTableData(); //Pega o método para obter os dados da tabela

        JTextArea textArea = new JTextArea(30,50);
        textArea.setEditable(true);
        textArea.setText(data); // Define o texto no JTextArea
        JScrollPane painelRolagem = new JScrollPane(textArea);
    
        JOptionPane.showMessageDialog(null, painelRolagem, "Relatório de Amigos", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BAmigosRActionPerformed

    //Gera o relatório dos empréstimos cadastrados
    private void BEmprestimosRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEmprestimosRActionPerformed
        HistEmprestimo HistEmprestimo = new HistEmprestimo(); // Instancia a classe HistEmprestimo
        String data = HistEmprestimo.getTableData(); //Pega o método para obter os dados da tabela

        JTextArea textArea = new JTextArea(30,60);
        textArea.setEditable(true);
        textArea.setText(data); // Define o texto no JTextArea
        JScrollPane painelRolagem = new JScrollPane(textArea);
        
        JOptionPane.showMessageDialog(null, painelRolagem, "Relatório de Amigos", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BEmprestimosRActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAmigosR;
    private javax.swing.JButton BEmprestimosR;
    private javax.swing.JButton BFerramentasR;
    private javax.swing.JButton BVoltarR;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
