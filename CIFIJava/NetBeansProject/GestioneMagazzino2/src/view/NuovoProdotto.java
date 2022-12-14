/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Categoria;
import model.DaoCategoria;
import model.DaoProdotto;
import model.Prodotto;

/**
 *
 * @author faroe
 */
public class NuovoProdotto extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form NuovoProdotto
     */
    public NuovoProdotto() {
        initComponents();
        loadCategorie();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblCodice = new javax.swing.JLabel();
        txtCodice = new javax.swing.JTextField();
        lnlNobe = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCodice2 = new javax.swing.JLabel();
        lblCodice3 = new javax.swing.JLabel();
        txtPrezzo = new javax.swing.JTextField();
        lblCodice4 = new javax.swing.JLabel();
        txtGiacenza = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescrizione = new javax.swing.JTextArea();
        btnInvia = new javax.swing.JButton();
        btnCancella = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Nuovo Prodotto");

        jLabel1.setText("Nuovo Prodotto");

        lblCodice.setText("Codice");

        lnlNobe.setText("Nome");

        lblCodice2.setText("Descrizione");

        lblCodice3.setText("Prezzo");

        lblCodice4.setText("Giacenza");

        txtDescrizione.setColumns(20);
        txtDescrizione.setRows(5);
        jScrollPane1.setViewportView(txtDescrizione);

        btnInvia.setText("Invia");
        btnInvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInviaActionPerformed(evt);
            }
        });

        btnCancella.setText("Cancella");
        btnCancella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancellaActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCodice3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCodice4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnInvia)
                                                .addGap(38, 38, 38)
                                                .addComponent(btnCancella))
                                            .addComponent(txtGiacenza, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCodice2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lnlNobe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCodice)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodice, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodice3)
                    .addComponent(txtPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodice4)
                    .addComponent(txtGiacenza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInvia)
                    .addComponent(btnCancella))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInviaActionPerformed
        // TODO add your handling code here:
        try {
            
            DaoProdotto dao = new DaoProdotto();
            
            DaoCategoria daoCategoria = new DaoCategoria();
            Categoria categoria = daoCategoria.getByNome((String)cbxCategoria.getModel().getSelectedItem());
            
            
            Prodotto prodotto = new Prodotto();
            prodotto.setCodice(Integer.parseInt(txtCodice.getText()));
            prodotto.setCategoria(categoria);
            prodotto.setNome(txtNome.getText());
            prodotto.setDescrizione(txtDescrizione.getText());
            prodotto.setPrezzo(Double.parseDouble(txtPrezzo.getText()));
            prodotto.setGiacenza(Integer.parseInt(txtGiacenza.getText()));
                        
            boolean flag = dao.insert(prodotto);
           
            if (flag) {
                JOptionPane.showMessageDialog(this, "Inserimento dati avvenuto con successo");
            } else {
                JOptionPane.showMessageDialog(this, "Inserimento fallito");
            }
            
            resetForm();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(this, e.getMessage());
        }  

    }//GEN-LAST:event_btnInviaActionPerformed

    private void btnCancellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancellaActionPerformed
        // TODO add your handling code here:

        if (JOptionPane.showConfirmDialog(this, "Eliminare tutti i dati?") == 0) {
            resetForm();
        }

    }//GEN-LAST:event_btnCancellaActionPerformed

    
    
    
    void resetForm() {
        txtCodice.setText("");
        txtNome.setText("");
        txtDescrizione.setText("");
        txtPrezzo.setText("");
        txtGiacenza.setText("");

    }

    void loadCategorie(){
    
    DaoCategoria dao = new DaoCategoria();
    ArrayList<Categoria> elenco = dao.getAll();
    
    for(Categoria c : elenco)
        cbxCategoria.addItem(c.getNome());        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancella;
    private javax.swing.JButton btnInvia;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodice;
    private javax.swing.JLabel lblCodice2;
    private javax.swing.JLabel lblCodice3;
    private javax.swing.JLabel lblCodice4;
    private javax.swing.JLabel lnlNobe;
    private javax.swing.JTextField txtCodice;
    private javax.swing.JTextArea txtDescrizione;
    private javax.swing.JTextField txtGiacenza;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrezzo;
    // End of variables declaration//GEN-END:variables
}
