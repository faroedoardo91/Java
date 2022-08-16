/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.Categoria;
import model.DaoCategoria;

/**
 *
 * @author faroe
 */
public class ModificaCategoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificaCategoria
     */
    public ModificaCategoria() {
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

        txtCodice = new javax.swing.JTextField();
        txtCerca = new javax.swing.JTextField();
        btnInvia = new javax.swing.JButton();
        btnCerca = new javax.swing.JButton();
        lnlNobe = new javax.swing.JLabel();
        btnCancella = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        lblCodice2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCodice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescrizione = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modifica Categoria");

        txtCodice.setEnabled(false);

        btnInvia.setText("Invia");
        btnInvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInviaActionPerformed(evt);
            }
        });

        btnCerca.setText("Cerca");
        btnCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaActionPerformed(evt);
            }
        });

        lnlNobe.setText("Nome");

        btnCancella.setText("Cancella");
        btnCancella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancellaActionPerformed(evt);
            }
        });

        lblCodice2.setText("Descrizione");

        jLabel1.setText("Modifica  Categoria");

        lblCodice.setText("Id");

        txtDescrizione.setColumns(20);
        txtDescrizione.setRows(5);
        jScrollPane1.setViewportView(txtDescrizione);

        jLabel2.setText("Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lnlNobe)
                                                .addComponent(lblCodice))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCodice, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCodice2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnInvia)
                                                    .addGap(38, 38, 38)
                                                    .addComponent(btnCancella))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(5, 5, 5)))
                                    .addComponent(txtCerca, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCerca)
                            .addComponent(jLabel1))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerca))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodice)
                    .addComponent(txtCodice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnlNobe)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodice2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancella)
                    .addComponent(btnInvia))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInviaActionPerformed
        // TODO add your handling code here:
        // parametri per accesso al database

        try {
            
            DaoCategoria dao = new DaoCategoria();
            
           boolean flag = dao.update(new Categoria(Integer.parseInt(txtCodice.getText()),txtNome.getText(),txtDescrizione.getText()));
           
            if (flag) {
                JOptionPane.showMessageDialog(this, "Modifica dati avvenuta con successo");
            } else {
                JOptionPane.showMessageDialog(this, "Modifica fallita");
            }
            
            resetForm();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnInviaActionPerformed

    private void btnCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaActionPerformed
        // TODO add your handling code here:
        // parametri per accesso al database

        try {
            int id = Integer.parseInt(txtCerca.getText());

            DaoCategoria dao = new DaoCategoria();
            Categoria c = dao.getById(id);
            if(c!=null){
                txtCodice.setText(c.getId()+"");
                txtNome.setText(c.getNome());
                txtDescrizione.setText(c.getDescrizione());
            } else {
                JOptionPane.showMessageDialog(this, "Categoria non trovata");
                resetForm();
            }
            

        } catch (Exception e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 

    }//GEN-LAST:event_btnCercaActionPerformed

    private void btnCancellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancellaActionPerformed
        // TODO add your handling code here:

        if (JOptionPane.showConfirmDialog(this, "Eliminare tutti i dati?") == 0) {
            resetForm();
        }
    }//GEN-LAST:event_btnCancellaActionPerformed
    
    private void resetForm() {
        txtCerca.setText("");
        txtCodice.setText("");
        txtNome.setText("");
        txtDescrizione.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancella;
    private javax.swing.JButton btnCerca;
    private javax.swing.JButton btnInvia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodice;
    private javax.swing.JLabel lblCodice2;
    private javax.swing.JLabel lnlNobe;
    private javax.swing.JTextField txtCerca;
    private javax.swing.JTextField txtCodice;
    private javax.swing.JTextArea txtDescrizione;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
