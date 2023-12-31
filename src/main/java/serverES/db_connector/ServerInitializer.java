/*
 * Luca Bolelli - 749137 - VA
 * Natanail Danailov Danailov - 739887 - VA
 * Riccardo Rosarin - 749914 - VA
 * Eleonora Macchi - 748736 - VA
 */
package serverES.db_connector;

import org.apache.commons.lang3.*;
import serverES.*;

/**
 *Classe il cui scopo è quello di inizializzare il server e la connessione di questo al database centrale.
 */
public class ServerInitializer extends javax.swing.JFrame {

    /**
     * Creates new form DBConnectorIniitalizer
     */
    ServerES server;
    
    /**
     * Metodo costruttore della classe
     * @param serverToInit: istanza del server da inizializzare
     */
    public ServerInitializer(ServerES serverToInit) {
        server = serverToInit;
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        portDbTextLabel = new javax.swing.JTextField();
        idDbTextLabel = new javax.swing.JTextField();
        passwordDbTextLabel = new javax.swing.JTextField();
        connectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID DB POSTGRES:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PASSWORD DB POSTGRES:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DB PORT:");

        portDbTextLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        portDbTextLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        portDbTextLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portDbTextLabelActionPerformed(evt);
            }
        });

        idDbTextLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        idDbTextLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idDbTextLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDbTextLabelActionPerformed(evt);
            }
        });

        passwordDbTextLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        passwordDbTextLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordDbTextLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordDbTextLabelActionPerformed(evt);
            }
        });

        connectButton.setBackground(new java.awt.Color(0, 204, 0));
        connectButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        connectButton.setForeground(new java.awt.Color(255, 255, 255));
        connectButton.setText("CONNECT");
        connectButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        connectButton.setOpaque(true);
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(portDbTextLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idDbTextLabel)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordDbTextLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(connectButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idDbTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordDbTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(portDbTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(connectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );

        connectButton.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void portDbTextLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portDbTextLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portDbTextLabelActionPerformed

    private void idDbTextLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idDbTextLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idDbTextLabelActionPerformed

    private void passwordDbTextLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordDbTextLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordDbTextLabelActionPerformed

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        initConnection();
    }//GEN-LAST:event_connectButtonActionPerformed
    
    private void initConnection(){
        boolean idOk,passwordOK,portOk;
        idOk = !(idDbTextLabel.getText().isBlank());
        passwordOK = !(passwordDbTextLabel.getText().isBlank());
        portOk = !(portDbTextLabel.getText().isBlank()) 
                && 
                StringUtils.isNumeric(portDbTextLabel.getText());
        
        if(!idOk)
            idDbTextLabel.setText("Insert the id needed to connect to your db!");
        
        if(!passwordOK)
            passwordDbTextLabel.setText("Insert the password needed to connect to your db!");
        
        if(!portOk) 
            portDbTextLabel.setText("Insert the port number needed to connect to your db!");
        
        if(!(idOk) || !(passwordOK) || !(portOk)){
            revalidate();
            repaint();
            return;
        }
        DBConnector.connectToPostgres(idDbTextLabel.getText(), passwordDbTextLabel.getText(), Integer.parseInt(portDbTextLabel.getText()));
        server.startServer();
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectButton;
    private javax.swing.JTextField idDbTextLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passwordDbTextLabel;
    private javax.swing.JTextField portDbTextLabel;
    // End of variables declaration//GEN-END:variables
}
