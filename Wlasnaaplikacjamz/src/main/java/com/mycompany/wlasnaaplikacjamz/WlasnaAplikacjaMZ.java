/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wlasnaaplikacjamz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Michał_pc
 */
public class WlasnaAplikacjaMZ extends javax.swing.JFrame {

    /**
     * Creates new form WlasnaAplikacjaMZ
     */
    public WlasnaAplikacjaMZ() {
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

        mz_buttonGroupWaifu = new javax.swing.ButtonGroup();
        mz_buttonGroupHusbando = new javax.swing.ButtonGroup();
        mz_jPanelMain = new javax.swing.JPanel();
        mz_jLabelWaifu = new javax.swing.JLabel();
        mz_jLabelHusbando = new javax.swing.JLabel();
        mz_jButtonZapisz = new javax.swing.JButton();
        mz_jComboBoxWaifu = new javax.swing.JComboBox<>();
        mz_jComboBoxHusbando = new javax.swing.JComboBox<>();
        mz_jScrollPane = new javax.swing.JScrollPane();
        mz_jTextArea1 = new javax.swing.JTextArea();
        mz_jMenuBarMain = new javax.swing.JMenuBar();
        mz_jMenuFile = new javax.swing.JMenu();
        mz_jMenuItemZapisz = new javax.swing.JMenuItem();
        mz_jMenuItemWczytaj = new javax.swing.JMenuItem();
        mz_jMenuItemExit = new javax.swing.JMenuItem();
        mz_jMenuEdit = new javax.swing.JMenu();
        mz_jMenuItemFont = new javax.swing.JMenuItem();
        mz_jMenuItemTlo = new javax.swing.JMenuItem();
        mz_jMenuProgram = new javax.swing.JMenu();
        mz_jMenuItemInfo = new javax.swing.JMenuItem();
        mz_jMenuItemHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WLASNY PROJEKT ");

        mz_jLabelWaifu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mz_jLabelWaifu.setText("Wybierz swoją ulubioną waifu:");

        mz_jLabelHusbando.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mz_jLabelHusbando.setText("Wybierz swojego husbando:");

        mz_jButtonZapisz.setText("Zapisz");
        mz_jButtonZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mz_jButtonZapiszActionPerformed(evt);
            }
        });

        mz_jComboBoxWaifu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mikasa", "Mai-san", "Meidri", "Asuna" }));

        mz_jComboBoxHusbando.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Levi", "Dio", "Jotaro", "Akira" }));

        mz_jTextArea1.setColumns(20);
        mz_jTextArea1.setRows(5);
        mz_jScrollPane.setViewportView(mz_jTextArea1);

        javax.swing.GroupLayout mz_jPanelMainLayout = new javax.swing.GroupLayout(mz_jPanelMain);
        mz_jPanelMain.setLayout(mz_jPanelMainLayout);
        mz_jPanelMainLayout.setHorizontalGroup(
            mz_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mz_jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mz_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mz_jButtonZapisz, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mz_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mz_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mz_jLabelHusbando, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mz_jLabelWaifu, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                        .addComponent(mz_jComboBoxWaifu, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mz_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mz_jScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(mz_jComboBoxHusbando, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        mz_jPanelMainLayout.setVerticalGroup(
            mz_jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mz_jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mz_jLabelWaifu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mz_jComboBoxWaifu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mz_jLabelHusbando, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mz_jComboBoxHusbando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(mz_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mz_jButtonZapisz, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        mz_jMenuFile.setText("File");
        mz_jMenuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mz_jMenuFileActionPerformed(evt);
            }
        });

        mz_jMenuItemZapisz.setText("Zapisz");
        mz_jMenuItemZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mz_jMenuItemZapiszActionPerformed(evt);
            }
        });
        mz_jMenuFile.add(mz_jMenuItemZapisz);

        mz_jMenuItemWczytaj.setText("Wczytaj");
        mz_jMenuItemWczytaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mz_jMenuItemWczytajActionPerformed(evt);
            }
        });
        mz_jMenuFile.add(mz_jMenuItemWczytaj);

        mz_jMenuItemExit.setText("Exit");
        mz_jMenuFile.add(mz_jMenuItemExit);

        mz_jMenuBarMain.add(mz_jMenuFile);

        mz_jMenuEdit.setText("Edit");

        mz_jMenuItemFont.setText("Zmiana czcionki");
        mz_jMenuEdit.add(mz_jMenuItemFont);

        mz_jMenuItemTlo.setText("Tło");
        mz_jMenuEdit.add(mz_jMenuItemTlo);

        mz_jMenuBarMain.add(mz_jMenuEdit);

        mz_jMenuProgram.setText("Program");

        mz_jMenuItemInfo.setText("Info");
        mz_jMenuProgram.add(mz_jMenuItemInfo);

        mz_jMenuItemHelp.setText("Help");
        mz_jMenuItemHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mz_jMenuItemHelpActionPerformed(evt);
            }
        });
        mz_jMenuProgram.add(mz_jMenuItemHelp);

        mz_jMenuBarMain.add(mz_jMenuProgram);

        setJMenuBar(mz_jMenuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mz_jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mz_jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mz_jMenuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mz_jMenuFileActionPerformed
        
    }//GEN-LAST:event_mz_jMenuFileActionPerformed

    private void mz_jMenuItemZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mz_jMenuItemZapiszActionPerformed
        String Waifu = (String) mz_jComboBoxWaifu.getSelectedItem();
        String Husbando = (String) mz_jComboBoxHusbando.getSelectedItem();
        mz_jTextArea1.setText(""+Waifu+" + "+Husbando+" = <3");
        
        File f = new File(Waifu+"_"+Husbando+".txt");        
        try{
                   
            FileWriter fw = new FileWriter(f);
            fw.write(mz_jTextArea1.getText());
            fw.close();
        } catch(IOException e){
            System.out.println("błąd: "+e.toString());
        }
    }//GEN-LAST:event_mz_jMenuItemZapiszActionPerformed

    private void mz_jMenuItemHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mz_jMenuItemHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mz_jMenuItemHelpActionPerformed

    private void mz_jButtonZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mz_jButtonZapiszActionPerformed
        String Waifu = (String) mz_jComboBoxWaifu.getSelectedItem();
        String Husbando = (String) mz_jComboBoxHusbando.getSelectedItem();
        mz_jTextArea1.setText(""+Waifu+" + "+Husbando+" = <3");
    }//GEN-LAST:event_mz_jButtonZapiszActionPerformed

    private void mz_jMenuItemWczytajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mz_jMenuItemWczytajActionPerformed
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showDialog(this,"Wybierz plik");

        try {
            String text ="";
            File f = jFileChooser.getSelectedFile();
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                text = text+sc.nextLine()+"\n";
            }
            mz_jTextArea1.setText(text);
        }catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_mz_jMenuItemWczytajActionPerformed

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
            java.util.logging.Logger.getLogger(WlasnaAplikacjaMZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WlasnaAplikacjaMZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WlasnaAplikacjaMZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WlasnaAplikacjaMZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WlasnaAplikacjaMZ().setVisible(true);
            }
        });
    }
    String absolutePathToResources = "C:\\Users\\Michał_pc\\Documents\\NetBeansProjects\\Wlasnaaplikacjamz\\src\\main\\java\\resources\\";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup mz_buttonGroupHusbando;
    private javax.swing.ButtonGroup mz_buttonGroupWaifu;
    private javax.swing.JButton mz_jButtonZapisz;
    private javax.swing.JComboBox<String> mz_jComboBoxHusbando;
    private javax.swing.JComboBox<String> mz_jComboBoxWaifu;
    private javax.swing.JLabel mz_jLabelHusbando;
    private javax.swing.JLabel mz_jLabelWaifu;
    private javax.swing.JMenuBar mz_jMenuBarMain;
    private javax.swing.JMenu mz_jMenuEdit;
    private javax.swing.JMenu mz_jMenuFile;
    private javax.swing.JMenuItem mz_jMenuItemExit;
    private javax.swing.JMenuItem mz_jMenuItemFont;
    private javax.swing.JMenuItem mz_jMenuItemHelp;
    private javax.swing.JMenuItem mz_jMenuItemInfo;
    private javax.swing.JMenuItem mz_jMenuItemTlo;
    private javax.swing.JMenuItem mz_jMenuItemWczytaj;
    private javax.swing.JMenuItem mz_jMenuItemZapisz;
    private javax.swing.JMenu mz_jMenuProgram;
    private javax.swing.JPanel mz_jPanelMain;
    private javax.swing.JScrollPane mz_jScrollPane;
    private javax.swing.JTextArea mz_jTextArea1;
    // End of variables declaration//GEN-END:variables
}
