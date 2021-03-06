/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zuterek.rejestracja;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Michał_pc
 */
public class Rejestracja extends javax.swing.JFrame {

    /**
     * Creates new form Rejestracja
     */
    public Rejestracja() {
        initComponents();
        addKeyListenerTojTFLogin();
        addKeyListenerTojTFLoginRejestracja();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelLogowanie = new javax.swing.JPanel();
        jLabelLogowanie = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jTFLogin = new javax.swing.JTextField();
        jLabelHaslo = new javax.swing.JLabel();
        jButtonZaloguj = new javax.swing.JButton();
        jPFHaslo = new javax.swing.JPasswordField();
        jPanelRejestracja = new javax.swing.JPanel();
        jLabelRejestracja = new javax.swing.JLabel();
        jLabelLoginRejestracja = new javax.swing.JLabel();
        jTFLoginRejestracja = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jPFHasloRejestracja = new javax.swing.JPasswordField();
        jLabelHasloRejestracja = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jLabelPotwierdz = new javax.swing.JLabel();
        jPFConfrimHaslo = new javax.swing.JPasswordField();
        jButtonZarejestrujSie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelLogowanie.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelLogowanie.setText("Logowanie");

        jLabelLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLogin.setText("Login");

        jTFLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelHaslo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelHaslo.setText("Haslo");

        jButtonZaloguj.setText("ZALOGUJ");
        jButtonZaloguj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPFHaslo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelLogowanieLayout = new javax.swing.GroupLayout(jPanelLogowanie);
        jPanelLogowanie.setLayout(jPanelLogowanieLayout);
        jPanelLogowanieLayout.setHorizontalGroup(
            jPanelLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogowanieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonZaloguj, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogin)
                    .addComponent(jLabelLogowanie)
                    .addComponent(jTFLogin)
                    .addComponent(jLabelHaslo)
                    .addComponent(jPFHaslo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanelLogowanieLayout.setVerticalGroup(
            jPanelLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogowanieLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelLogowanie)
                .addGap(30, 30, 30)
                .addComponent(jLabelLogin)
                .addGap(18, 18, 18)
                .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabelHaslo)
                .addGap(18, 18, 18)
                .addComponent(jPFHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonZaloguj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Logowanie", jPanelLogowanie);

        jLabelRejestracja.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelRejestracja.setText("Rejestracja");

        jLabelLoginRejestracja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLoginRejestracja.setText("Login");

        jTFLoginRejestracja.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTFLoginRejestracja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFLoginRejestracjaActionPerformed(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEmail.setText("Email");

        jPFHasloRejestracja.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelHasloRejestracja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelHasloRejestracja.setText("Haslo");

        jTFEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelPotwierdz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPotwierdz.setText("Potwierdz Haslo");

        jPFConfrimHaslo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonZarejestrujSie.setText("ZAREJESTRUJ SIE");

        javax.swing.GroupLayout jPanelRejestracjaLayout = new javax.swing.GroupLayout(jPanelRejestracja);
        jPanelRejestracja.setLayout(jPanelRejestracjaLayout);
        jPanelRejestracjaLayout.setHorizontalGroup(
            jPanelRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRejestracjaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelRejestracja)
                        .addComponent(jLabelLoginRejestracja)
                        .addComponent(jTFLoginRejestracja)
                        .addComponent(jLabelEmail)
                        .addComponent(jPFHasloRejestracja)
                        .addComponent(jLabelHasloRejestracja)
                        .addComponent(jTFEmail)
                        .addComponent(jLabelPotwierdz)
                        .addComponent(jPFConfrimHaslo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                    .addComponent(jButtonZarejestrujSie))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanelRejestracjaLayout.setVerticalGroup(
            jPanelRejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRejestracjaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRejestracja)
                .addGap(18, 18, 18)
                .addComponent(jLabelLoginRejestracja)
                .addGap(18, 18, 18)
                .addComponent(jTFLoginRejestracja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmail)
                .addGap(18, 18, 18)
                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelHasloRejestracja)
                .addGap(18, 18, 18)
                .addComponent(jPFHasloRejestracja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPotwierdz)
                .addGap(18, 18, 18)
                .addComponent(jPFConfrimHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonZarejestrujSie, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rejestracja", jPanelRejestracja);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFLoginRejestracjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFLoginRejestracjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFLoginRejestracjaActionPerformed

    private void addKeyListenerTojTFLogin(){
        jTFLogin.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTFLogin.getText();
                char ch = e.getKeyChar();
                if((ch >= 'a' && ch <= 'z') && (temp.length() <=20 ) && (ch == KeyEvent.VK_BACK_SPACE)) {
                    jTFLogin.setEditable(true);
                }else{
                    jTFLogin.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    
    private void addKeyListenerTojTFLoginRejestracja(){
        jTFLoginRejestracja.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTFLoginRejestracja.getText();
                char ch = e.getKeyChar();
                if((ch >= 'a' && ch <= 'z') && (temp.length() <=20 ) && (ch == KeyEvent.VK_BACK_SPACE)) {
                    jTFLoginRejestracja.setEditable(true);
                }else{
                    jTFLoginRejestracja.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    
    private void addKeyListenerToTFEmail(){
        jTFEmail.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if(  (ch >= '0'  && ch <= '9'  || ch == KeyEvent.VK_BACK_SPACE) && ch >= '0'  && 
                        (ch > 'a' && ch < 'z')){
                    jTFEmail.setEditable(true); 
                    if( ch == '@'){
                    if(ch > 'a' && ch < 'z'){
                        jTFEmail.setEditable(true);
                    }
                }
                }else{
                    jTFEmail.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    
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
            java.util.logging.Logger.getLogger(Rejestracja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rejestracja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rejestracja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rejestracja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rejestracja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonZaloguj;
    private javax.swing.JButton jButtonZarejestrujSie;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelHaslo;
    private javax.swing.JLabel jLabelHasloRejestracja;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelLoginRejestracja;
    private javax.swing.JLabel jLabelLogowanie;
    private javax.swing.JLabel jLabelPotwierdz;
    private javax.swing.JLabel jLabelRejestracja;
    private javax.swing.JPasswordField jPFConfrimHaslo;
    private javax.swing.JPasswordField jPFHaslo;
    private javax.swing.JPasswordField jPFHasloRejestracja;
    private javax.swing.JPanel jPanelLogowanie;
    private javax.swing.JPanel jPanelRejestracja;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFLogin;
    private javax.swing.JTextField jTFLoginRejestracja;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
