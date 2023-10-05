/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo.pires
 * Jframe principal, apenas para devs, não é acessível ao usuário.
 */
public class PrincipalJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalJFrame
     */
    public PrincipalJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameClientes = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuItemVersao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrameClientes.setClosable(true);
        jInternalFrameClientes.setIconifiable(true);
        jInternalFrameClientes.setMaximizable(true);
        jInternalFrameClientes.setResizable(true);
        jInternalFrameClientes.setTitle("Cadastro de clientes");
        jInternalFrameClientes.setVisible(false);

        javax.swing.GroupLayout jInternalFrameClientesLayout = new javax.swing.GroupLayout(jInternalFrameClientes.getContentPane());
        jInternalFrameClientes.getContentPane().setLayout(jInternalFrameClientesLayout);
        jInternalFrameClientesLayout.setHorizontalGroup(
            jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrameClientesLayout.setVerticalGroup(
            jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuCadastro.setText("Cadastro");

        jMenuItemCliente.setText("Clientes");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuBar1.add(jMenuCadastro);

        jMenuOpcoes.setText("Opções");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemSair);

        jMenuItemVersao.setText("Versão");
        jMenuItemVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVersaoActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemVersao);

        jMenuBar1.add(jMenuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jInternalFrameClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(764, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jInternalFrameClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        int result = JOptionPane.showConfirmDialog(this,"Deseja sair da aplicação?", "Sair",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        jInternalFrameClientes = new JInternalFrame("Created from Menu");
        jInternalFrameClientes.setResizable(true);
        jInternalFrameClientes.setClosable(true);
        jInternalFrameClientes.setIconifiable(true);
        jInternalFrameClientes.setSize(800,600);
        jInternalFrameClientes.setLocation(0, 0);

        jInternalFrameClientes.getContentPane().setLayout(new BorderLayout());
       

        jInternalFrameClientes.setVisible(true);
        this.add(jInternalFrameClientes);
        //desk.add(iFrame);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVersaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemVersaoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrameClientes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemVersao;
    private javax.swing.JMenu jMenuOpcoes;
    // End of variables declaration//GEN-END:variables
}
