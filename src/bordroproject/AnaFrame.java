package bordroproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pc
 */
public class AnaFrame extends javax.swing.JFrame {

    /**
     * Creates new form AnaFrame
     */
    ArrayList<Personel> personeller = new ArrayList();
    public AnaFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        YönGiris.pack();
        YönGiris.setLocationRelativeTo(null);
        
    }
    DefaultTableModel dtm = new DefaultTableModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        YönGiris = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kullanıcıAdı = new javax.swing.JTextField();
        buSifre = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        uyarıLabel = new javax.swing.JLabel();
        kurumGiris = new javax.swing.JButton();
        bordro = new javax.swing.JButton();
        yonetimButon = new javax.swing.JButton();
        kurumButon = new javax.swing.JButton();
        cikisButon = new javax.swing.JButton();

        YönGiris.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        YönGiris.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                YönGirisWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                YönGirisWindowClosing(evt);
            }
        });

        jLabel2.setText("Kullanıcı Adı :");

        jLabel3.setText("Şifre :");

        kullanıcıAdı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanıcıAdıActionPerformed(evt);
            }
        });

        buSifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buSifreActionPerformed(evt);
            }
        });

        login.setText("Yönetim Giris");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        kurumGiris.setText("Kurum Giris");
        kurumGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurumGirisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout YönGirisLayout = new javax.swing.GroupLayout(YönGiris.getContentPane());
        YönGiris.getContentPane().setLayout(YönGirisLayout);
        YönGirisLayout.setHorizontalGroup(
            YönGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YönGirisLayout.createSequentialGroup()
                .addGroup(YönGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(YönGirisLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(YönGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43)
                        .addGroup(YönGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullanıcıAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(YönGirisLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(YönGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kurumGiris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, YönGirisLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(uyarıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        YönGirisLayout.setVerticalGroup(
            YönGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YönGirisLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(YönGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kullanıcıAdı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(YönGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(buSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kurumGiris)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uyarıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        bordro.setText("Personel-Bordro");
        bordro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bordroActionPerformed(evt);
            }
        });

        yonetimButon.setText("Yönetim");
        yonetimButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yonetimButonActionPerformed(evt);
            }
        });

        kurumButon.setText("Kurum");
        kurumButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurumButonActionPerformed(evt);
            }
        });

        cikisButon.setText("Çıkış");
        cikisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bordro, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(yonetimButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(250, 250, 250))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(kurumButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cikisButon, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(bordro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yonetimButon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kurumButon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(cikisButon)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void bordroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bordroActionPerformed
        // TODO add your handling code here:     
        Bordro ana_Bordro = new Bordro(personeller);    
        if(ana_Bordro.isVisible()){
            ana_Bordro.setAutoRequestFocus(true);
            }else{
            ana_Bordro.setVisible(true);
            
            }             
    }//GEN-LAST:event_bordroActionPerformed

    private void kurumButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurumButonActionPerformed
        // TODO add your handling code here:  
        login.setVisible(false);
        kurumGiris.setVisible(true);
        int i = JOptionPane.showConfirmDialog(rootPane, "Bu Alana Sadece \"Yöneticiler\" girebilir.", "Yönetici Alanı", 2, JOptionPane.WARNING_MESSAGE);
        if (i == 0) {
            YönGiris.setVisible(true);
        } else {
            YönGiris.dispose();
        }
    }//GEN-LAST:event_kurumButonActionPerformed

    private void cikisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisButonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cikisButonActionPerformed

    private void yonetimButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yonetimButonActionPerformed
        // TODO add your handling code here:
        login.setVisible(true);
        kurumGiris.setVisible(false);
        if (YönGiris.isVisible()) {
            YönGiris.setAutoRequestFocus(true);
        } else {
            YönGiris.setVisible(true);
        }
    }//GEN-LAST:event_yonetimButonActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        YönetimFrame yönetimFrame = new YönetimFrame(personeller);
        while (personeller.size() <= 0) {
            Personel p = new Yönetici("admin", null, null, "000", null, "",0,0);
            personeller.add(p);
        }
        String degiskenKullanıcıAdı = "";
        String degiskenSifre = "";
        for (int i = 0; i < personeller.size(); i++) {
            if (kullanıcıAdı.getText().equals(personeller.get(i).getAdi()) && personeller.get(i) instanceof Yönetici) {
                degiskenKullanıcıAdı = personeller.get(i).getAdi();
                degiskenSifre = personeller.get(i).getTcNo();
            }

        }
        if (kullanıcıAdı.getText().equalsIgnoreCase(degiskenKullanıcıAdı) && buSifre.getText().equalsIgnoreCase(degiskenSifre)) {
            YönGiris.dispose();
            kullanıcıAdı.setText("");
            buSifre.setText("");
            yönetimFrame.setVisible(true);
        } else {
            uyarıLabel.setText("Kullanıcı adı veya şifre hatalı!!!");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_formKeyPressed

    private void kurumGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurumGirisActionPerformed
        // TODO add your handling code here:
        KurumFrame kurumFrame = new KurumFrame(personeller);
        while (personeller.size() <= 0) {
            Personel p = new Yönetici("admin", null, null, "000", null, "",0,0);
            personeller.add(p);
        }
        String degiskenKullanıcıAdı = "";
        String degiskenSifre = "";
        for (int i = 0; i < personeller.size(); i++) {
            if (kullanıcıAdı.getText().equals(personeller.get(i).getAdi()) && personeller.get(i) instanceof Yönetici) {
                degiskenKullanıcıAdı = personeller.get(i).getAdi();
                degiskenSifre = personeller.get(i).getTcNo();
            }

        }
        if (kullanıcıAdı.getText().equalsIgnoreCase(degiskenKullanıcıAdı) && buSifre.getText().equalsIgnoreCase(degiskenSifre)) {
            YönGiris.dispose();
            kullanıcıAdı.setText("");
            buSifre.setText("");
            kurumFrame.setVisible(true);
        } else {
            uyarıLabel.setText("Kullanıcı adı veya şifre hatalı!!!");
        }
    }//GEN-LAST:event_kurumGirisActionPerformed

    private void kullanıcıAdıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanıcıAdıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullanıcıAdıActionPerformed

    private void buSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buSifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buSifreActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowActivated

    private void YönGirisWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_YönGirisWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_YönGirisWindowClosed

    private void YönGirisWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_YönGirisWindowClosing
        // TODO add your handling code here:
        
    }//GEN-LAST:event_YönGirisWindowClosing

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
            java.util.logging.Logger.getLogger(AnaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame YönGiris;
    private javax.swing.JButton bordro;
    private javax.swing.JPasswordField buSifre;
    private javax.swing.JButton cikisButon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField kullanıcıAdı;
    private javax.swing.JButton kurumButon;
    private javax.swing.JButton kurumGiris;
    private javax.swing.JButton login;
    private javax.swing.JLabel uyarıLabel;
    private javax.swing.JButton yonetimButon;
    // End of variables declaration//GEN-END:variables
}
