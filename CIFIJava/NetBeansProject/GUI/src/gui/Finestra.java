/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author faroe
 */
public class Finestra extends javax.swing.JFrame {

    /**
     * Creates new form Finestra
     */
    public Finestra() {
        initComponents();
        lblRisultato.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitolo = new javax.swing.JLabel();
        lblTesto = new javax.swing.JLabel();
        txtTesto = new javax.swing.JTextField();
        btnInvia = new javax.swing.JButton();
        lblRisultato = new javax.swing.JLabel();
        btnCancella = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        lblTitolo.setText("Titolo");

        lblTesto.setText("Inserisci un testo");

        btnInvia.setText("Invia");
        btnInvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInviaActionPerformed(evt);
            }
        });

        lblRisultato.setText("Risultato");

        btnCancella.setText("Cancella");
        btnCancella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancellaActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pompelmo", "Limone", "Mandarino", "Arancia", "Begamotto" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(lblTitolo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblTesto)
                        .addGap(18, 18, 18)
                        .addComponent(txtTesto, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnInvia)
                        .addGap(31, 31, 31)
                        .addComponent(btnCancella))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRisultato))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitolo)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTesto)
                    .addComponent(txtTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvia)
                    .addComponent(btnCancella))
                .addGap(91, 91, 91)
                .addComponent(lblRisultato)
                .addGap(90, 90, 90)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInviaActionPerformed
        // TODO add your handling code here:
        
        String txt = txtTesto.getText();
        
        JOptionPane.showMessageDialog(this,"Hai inserito del testo!");
        
        lblRisultato.setText("Hai inserito il seguente testo: "+txt.toUpperCase());
        lblRisultato.setVisible(true);
        
    }//GEN-LAST:event_btnInviaActionPerformed

    private void btnCancellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancellaActionPerformed
        // TODO add your handling code here:
        
        int scelta = JOptionPane.showConfirmDialog(this, "Sicuro di voler cancellare tutto?");
        
        if(scelta!=0)
            return;
        
        txtTesto.setText("");
        lblRisultato.setVisible(false);
        
    }//GEN-LAST:event_btnCancellaActionPerformed

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
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finestra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancella;
    private javax.swing.JButton btnInvia;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblRisultato;
    private javax.swing.JLabel lblTesto;
    private javax.swing.JLabel lblTitolo;
    private javax.swing.JTextField txtTesto;
    // End of variables declaration//GEN-END:variables
}
