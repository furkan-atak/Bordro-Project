package bordroproject;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class Bordro extends javax.swing.JFrame {

    ArrayList<Personel> bordroArray;
    DefaultComboBoxModel comboBox = new DefaultComboBoxModel();

    public Bordro(ArrayList a) {
        initComponents();
        bordroArray = a;
        this.setLocationRelativeTo(null);
        comboBox.addElement("");
        comboBox.addElement("Personel");
        comboBox.addElement("Memur");
        comboBox.addElement("İşçi");
        comboBox.addElement("Yönetici");
        türBox.setModel(comboBox);

    }

    public Bordro() {
        initComponents();
        //ssk prim esas = brüt;
        //ssk isci payı brüt %14;
        //gelir vergisinden parayı agi ile devlet geri veriyor;
        // 14.000 e kdr %15;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adiTxt = new javax.swing.JTextField();
        personelAdiLabel = new javax.swing.JLabel();
        soyAdiTxt = new javax.swing.JTextField();
        soyAdıLabel = new javax.swing.JLabel();
        kimlikNoLabel = new javax.swing.JLabel();
        tcText = new javax.swing.JTextField();
        türLabel = new javax.swing.JLabel();
        türBox = new javax.swing.JComboBox<>();
        ücretLabel = new javax.swing.JLabel();
        brütÜcret = new javax.swing.JLabel();
        netÜcretLabel = new javax.swing.JLabel();
        netÜcret = new javax.swing.JLabel();
        sskEsas = new javax.swing.JLabel();
        esasÜcret = new javax.swing.JLabel();
        primİşçi = new javax.swing.JLabel();
        isciPayı = new javax.swing.JLabel();
        gelirVergisiLabel = new javax.swing.JLabel();
        gelirVergisi = new javax.swing.JLabel();
        agiLabel = new javax.swing.JLabel();
        agi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        damgaLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        isVereneMaaliyet = new javax.swing.JLabel();
        sorgulaButon = new javax.swing.JButton();
        hataLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        personelAdiLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        personelAdiLabel.setText("Adı :");

        soyAdıLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        soyAdıLabel.setText("Soyadı :");

        kimlikNoLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        kimlikNoLabel.setText("T.C Kimlik No :");

        tcText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcTextActionPerformed(evt);
            }
        });
        tcText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tcTextKeyPressed(evt);
            }
        });

        türLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        türLabel.setText("Personel Türü :");

        ücretLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ücretLabel.setText("Brüt Ücret Tutarı :");

        netÜcretLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        netÜcretLabel.setText("Net Ücret :");

        netÜcret.setText(" ");

        sskEsas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sskEsas.setText("SSk Primine Esas Ücret :");

        primİşçi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        primİşçi.setText("SSK Primi İşçi Payı :");

        isciPayı.setText(" ");

        gelirVergisiLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        gelirVergisiLabel.setText("Hesaplanan Gelir Vergisi :");

        gelirVergisi.setText(" ");

        agiLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        agiLabel.setText("Asgari Geçim İndirimi :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Damga Vergisi :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Toplam İşverene Düşen Maaliyet :");

        sorgulaButon.setText("Sorgula");
        sorgulaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorgulaButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(personelAdiLabel)
                                    .addComponent(soyAdıLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(soyAdiTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(adiTxt))
                                .addGap(56, 56, 56))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sskEsas)
                                    .addComponent(primİşçi)
                                    .addComponent(gelirVergisiLabel))
                                .addGap(6, 6, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(gelirVergisi, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(esasÜcret, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(isciPayı, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(kimlikNoLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tcText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(türLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(türBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(damgaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                            .addComponent(isVereneMaaliyet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(agiLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(agi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(netÜcretLabel)
                                .addGap(18, 18, 18)
                                .addComponent(netÜcret, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(ücretLabel)
                        .addGap(26, 26, 26)
                        .addComponent(brütÜcret, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(hataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(sorgulaButon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personelAdiLabel)
                    .addComponent(kimlikNoLabel)
                    .addComponent(tcText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyAdiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyAdıLabel)
                    .addComponent(türLabel)
                    .addComponent(türBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorgulaButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(netÜcretLabel)
                                .addComponent(netÜcret, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(brütÜcret, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ücretLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agiLabel)
                            .addComponent(agi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(esasÜcret, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sskEsas)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isciPayı)
                    .addComponent(jLabel3)
                    .addComponent(damgaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primİşçi))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gelirVergisiLabel)
                    .addComponent(gelirVergisi)
                    .addComponent(jLabel2)
                    .addComponent(isVereneMaaliyet, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sorgulaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorgulaButonActionPerformed
        // TODO add your handling code here:
        SskKaynak kaynak = new SskKaynak();
        boolean kontrol = true;

        if (bordroArray.size() == -1) {
            hataLabel.setText("HATA !");
        }
        for (int i = 0; i < bordroArray.size(); i++) {
            Personel p = bordroArray.get(i);
            if ((p.getAdi().equalsIgnoreCase(adiTxt.getText()) && p.getSoyAdi().equalsIgnoreCase(soyAdiTxt.getText()))
                    && (p.getTcNo().equalsIgnoreCase(tcText.getText()) && p.getTür().equalsIgnoreCase(türBox.getSelectedItem().toString()))) {
                kontrol = false;
                hataLabel.setVisible(false);
                p.setKesintiler((kaynak.getSskİsciPay(p) + kaynak.getSskDamga(p) + kaynak.getGelirVergisi(p)) - kaynak.getSskAgi(p));
                p.setNetMaas(p.getBrütMaas());
                netÜcret.setText(String.valueOf(p.getNetMaas()));
                esasÜcret.setText(String.valueOf(p.getBrütMaas()));
                brütÜcret.setText(String.valueOf(p.getBrütMaas()));
                isciPayı.setText(String.valueOf(kaynak.getSskİsciPay(p)));
                agi.setText(String.valueOf(kaynak.getSskAgi(p)));
                damgaLabel.setText(String.valueOf(kaynak.getSskDamga(p)));
                gelirVergisi.setText(String.valueOf(kaynak.getGelirVergisi(p)));
                isVereneMaaliyet.setText(String.valueOf(p.getBrütMaas()));
            }
        }
        if (kontrol) {
            hataLabel.setVisible(true);
            hataLabel.setText("Personel Bulunamadı.");
            netÜcret.setText("");
            esasÜcret.setText("");
            brütÜcret.setText("");
            isciPayı.setText("");
            agi.setText("");
            damgaLabel.setText("");
            gelirVergisi.setText("");
            isVereneMaaliyet.setText("");
        }
    }//GEN-LAST:event_sorgulaButonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        hataLabel.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_formKeyTyped

    private void tcTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcTextActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_tcTextActionPerformed

    private void tcTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcTextKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_tcTextKeyPressed

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
            java.util.logging.Logger.getLogger(Bordro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bordro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bordro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bordro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bordro().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adiTxt;
    private javax.swing.JLabel agi;
    private javax.swing.JLabel agiLabel;
    private javax.swing.JLabel brütÜcret;
    private javax.swing.JLabel damgaLabel;
    private javax.swing.JLabel esasÜcret;
    private javax.swing.JLabel gelirVergisi;
    private javax.swing.JLabel gelirVergisiLabel;
    private javax.swing.JLabel hataLabel;
    private javax.swing.JLabel isVereneMaaliyet;
    private javax.swing.JLabel isciPayı;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel kimlikNoLabel;
    private javax.swing.JLabel netÜcret;
    private javax.swing.JLabel netÜcretLabel;
    private javax.swing.JLabel personelAdiLabel;
    private javax.swing.JLabel primİşçi;
    private javax.swing.JButton sorgulaButon;
    private javax.swing.JTextField soyAdiTxt;
    private javax.swing.JLabel soyAdıLabel;
    private javax.swing.JLabel sskEsas;
    private javax.swing.JTextField tcText;
    private javax.swing.JComboBox<String> türBox;
    private javax.swing.JLabel türLabel;
    private javax.swing.JLabel ücretLabel;
    // End of variables declaration//GEN-END:variables
}
