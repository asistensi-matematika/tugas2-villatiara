
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sunarto
 */
public class Villa_Tiara_Anugerah_TUGAS2 extends javax.swing.JFrame {

    /**
     * Creates new form Villa_Tiara_Anugerah_TUGAS2
     */
    public Villa_Tiara_Anugerah_TUGAS2() {
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

        pilihansoal = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nilaia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nilain = new javax.swing.JTextField();
        nilaix = new javax.swing.JTextField();
        hasil = new javax.swing.JTextField();
        rbNo1 = new javax.swing.JRadioButton();
        rbNo2 = new javax.swing.JRadioButton();
        rbNo3 = new javax.swing.JRadioButton();
        soal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tugas 2 Asistensi Alpro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 11, -1, -1));

        jLabel2.setText("Input a =");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 43, -1, -1));

        jLabel3.setText("Input n =");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 81, -1, -1));

        jLabel4.setText("Input x =");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 119, -1, -1));

        nilaia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiaActionPerformed(evt);
            }
        });
        getContentPane().add(nilaia, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 40, 100, -1));

        jLabel5.setText("Nilai f(x) =");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 212, -1, -1));

        nilain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilainActionPerformed(evt);
            }
        });
        getContentPane().add(nilain, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 78, 100, -1));

        nilaix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaixActionPerformed(evt);
            }
        });
        getContentPane().add(nilaix, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 116, 100, -1));

        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });
        getContentPane().add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 209, 195, -1));

        pilihansoal.add(rbNo1);
        rbNo1.setText("No.3");
        rbNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNo1ActionPerformed(evt);
            }
        });
        getContentPane().add(rbNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 70, -1, -1));

        pilihansoal.add(rbNo2);
        rbNo2.setText("No.4");
        rbNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNo2ActionPerformed(evt);
            }
        });
        getContentPane().add(rbNo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 112, -1, -1));

        pilihansoal.add(rbNo3);
        rbNo3.setText("No.5");
        rbNo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNo3ActionPerformed(evt);
            }
        });
        getContentPane().add(rbNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 154, -1, -1));

        soal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soalActionPerformed(evt);
            }
        });
        getContentPane().add(soal, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 70, 189, 107));

        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 206, -1, -1));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 168, -1, -1));

        jButton3.setText("Hitung");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 168, -1, -1));

        jLabel6.setText("Pilih Soal :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nilaiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiaActionPerformed

    private void nilainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilainActionPerformed

    private void nilaixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaixActionPerformed

    private void rbNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNo1ActionPerformed
        // TODO add your handling code here:
        rbNo1.setText("");
        rbNo2.setText(null);
        rbNo3.setText("");
        hasil.setText(null);
        soal.setText("f(x) = cosh (-6x)");
    }//GEN-LAST:event_rbNo1ActionPerformed

    private void rbNo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNo2ActionPerformed
        // TODO add your handling code here:
        rbNo1.setText("");
        rbNo2.setText(null);
        rbNo3.setText("");
        hasil.setText(null);
        soal.setText("f(x) sin(2x)");
    }//GEN-LAST:event_rbNo2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void soalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soalActionPerformed
        // TODO add your handling code here:
        String soal = "";
        if (rbNo1.isSelected()){
            soal = rbNo1.getText();
        } else if (rbNo2.isSelected()) {
            soal = rbNo3.getText();
        }
        //show all inputs valuegetText
        System.out.println("Soal : " + soal);
    }//GEN-LAST:event_soalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
     nilaia.setText(null);
     nilain.setText(null);
     nilaix.setText(null);
     hasil.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbNo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNo3ActionPerformed
        // TODO add your handling code here:
        rbNo1.setText("");
        rbNo2.setText(null);
        rbNo3.setText("");
        hasil.setText(null);
        soal.setText("f(x) = x/(1-x)");
    }//GEN-LAST:event_rbNo3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        double a = Double.parseDouble(nilaia.getText());
        double n = Double.parseDouble(nilain.getText());
        double x = Double.parseDouble(nilaix.getText());
        if(rbNo1.isSelected()){
            hasil.setText(String.valueOf(soalno3(a, n, x)));
        }
        if(rbNo2.isSelected()){
            hasil.setText(String.valueOf(soalno4(a, n, x)));
        }
        if(rbNo3.isSelected()){
            hasil.setText(String.valueOf(soalno5(a, n, x)));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilActionPerformed

    //Mencari nilai faktorial
    public static double faktorial (int number){
        if(number==1 || number==0) {
           return 1; 
        } else{
            return number * faktorial(number-1);
        }
    }
    
    //Menghitumg Soal No.3
    public static double soalno3(double a, double n, double x){
        double[] f = new double[10001];
        double es = 0.5*Math.pow(10, 2-n);
        double function = 0;
        f[0] = Math.exp(6*a)+Math.exp(-6*a)/2;
        for(int i=1; i<10000; i++){
            if (a!=0){
                f[1] = f[i-1]+((Math.exp(6*a)+Math.pow(-1,i)*
                Math.exp(-6*a))*(Math.pow(x-a,i)))/(2*(faktorial(i)));
            }else{
                f[i] = f[i-1]+Math.pow(6*x,2*i)/faktorial(2*i);
            }
            double ea = ((f[i]-f[i-1])/f[i]*100);
            if(Math.abs(ea)<es){
            function += f[i];
            break;
        }
        }
        //hasilno3
        double hasil3=Math.floor(function*1000)/1000;
            return hasil3;
    }
    
    //Menghitung Soal No.4
    public static double soalno4(double a, double n, double x){
        double[] f = new double[10001];
        double es = 0.5*Math.pow(10, 2-n);
        double function = 0;
        f[0]=Math.log(-a);
        for(int i=1; i<=10000; i++){
            f[i] = f[i-1]+(Math.pow(-1,i+1)*Math.pow(x-a, i))/(i*Math.pow(a,i));
        double ea = ((f[i]-f[i-1])/f[i])*100;
        if(Math.abs(ea)<es){
            function += f[i];
            break;
        }
        }
        //hasilno4
        double hasil4=Math.floor(function*1000)/1000;
            return hasil4;
    }
    
    //Menghitung Soal No. 5
    public static double soalno5(double a, double n, double x){
        double[] f = new double[10001];
        double es = 0.5*Math.pow(10, 2-n);
        double function = 0;
        f[0] = a / (1-a);
        double F=0;
        double ah = 0.5 * Math.pow(10,2-n);
        for (int i=1; 1<=10000;i++){
            f[i] = f[i-1]+((Math.pow(x-a,i))*(x)*(Math.pow(-1,i))/(Math.pow(1-x,i+1)));
            double ih = ((f[i]-f[i-1])/f[i])*100;
            if (Math.abs(ih)<ah) {
                F += f[i];
            System.out.println(i);
            break;
            }
        }
        //hasilno5
        double hasil5=Math.floor(function*1000)/1000;
            return hasil5; 
    }
    
    //
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
            java.util.logging.Logger.getLogger(Villa_Tiara_Anugerah_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Villa_Tiara_Anugerah_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Villa_Tiara_Anugerah_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Villa_Tiara_Anugerah_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Villa_Tiara_Anugerah_TUGAS2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hasil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nilaia;
    private javax.swing.JTextField nilain;
    private javax.swing.JTextField nilaix;
    private javax.swing.ButtonGroup pilihansoal;
    private javax.swing.JRadioButton rbNo1;
    private javax.swing.JRadioButton rbNo2;
    private javax.swing.JRadioButton rbNo3;
    private javax.swing.JTextField soal;
    // End of variables declaration//GEN-END:variables
}
