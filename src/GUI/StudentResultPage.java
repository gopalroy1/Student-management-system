/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProviderCode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gopal Roy
 */
public class StudentResultPage extends javax.swing.JFrame {

    /**
     * Creates new form StudentResultPage
     */
    public StudentResultPage() {
        initComponents();
    }
    public StudentResultPage(String rollNo){
        initComponents();
        roll.setText(rollNo);
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
        roll = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        branch = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        course = new javax.swing.JTextField();
        father_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        verdict = new javax.swing.JTextField();
        exitStudentResultPage = new javax.swing.JButton();
        biology = new javax.swing.JTextField();
        physics = new javax.swing.JTextField();
        maths = new javax.swing.JTextField();
        chemistry = new javax.swing.JTextField();
        electrical = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 500));
        setMinimumSize(new java.awt.Dimension(550, 500));
        setPreferredSize(new java.awt.Dimension(550, 500));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Roll No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 60, -1));

        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });
        getContentPane().add(roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 120, -1));

        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setText("Course");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel5.setText("Father Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel6.setText("Branch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 110, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 110, -1));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 110, -1));
        getContentPane().add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 110, -1));
        getContentPane().add(father_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 110, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Subjects");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Total Marks");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Passing Marks");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Marks Obtained");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jLabel11.setText("Physics");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel12.setText("Maths");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel13.setText("Chemistry");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel14.setText("Electrical");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel15.setText("Biology");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jLabel16.setText("100");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jLabel17.setText("100");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 20, -1));

        jLabel18.setText("100");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel19.setText("100");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel20.setText("100");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        jLabel21.setText("30");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 50, -1));

        jLabel22.setText("30");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 50, -1));

        jLabel23.setText("30");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 50, -1));

        jLabel24.setText("30");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 50, -1));

        jLabel25.setText("30");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 50, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Total Marks");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Verdict");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));
        getContentPane().add(verdict, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        exitStudentResultPage.setForeground(new java.awt.Color(255, 0, 0));
        exitStudentResultPage.setText("Log Out");
        exitStudentResultPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitStudentResultPageActionPerformed(evt);
            }
        });
        getContentPane().add(exitStudentResultPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 80, 30));
        getContentPane().add(biology, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));
        getContentPane().add(physics, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));
        getContentPane().add(maths, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));
        getContentPane().add(chemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));
        getContentPane().add(electrical, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String rollNo = roll.getText();
        try{
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from student inner join result where student.rollNo ='"+rollNo+"' and result.rollNo ='"+rollNo+"'");
            if(!rs.first()){
                JOptionPane.showMessageDialog(null,"Entered roll number does not exits");
            }
            else{
                name.setText(rs.getString(1));
                name.setEditable(false);
                gender.setText(rs.getString(3));
                gender.setEditable(false);
                father_name.setText(rs.getString(4));
                father_name.setEditable(false);
                course.setText(rs.getString(5));
                course.setEditable(false);
                branch.setText(rs.getString(6));
                branch.setEditable(false);
                
                physics.setText(rs.getString(8));
                physics.setEditable(false);
                maths.setText(rs.getString(9));
                maths.setEditable(false);
                chemistry.setText(rs.getString(10));
                chemistry.setEditable(false);
                electrical.setText(rs.getString(11));
                electrical.setEditable(false);
                biology.setText(rs.getString(12));
                biology.setEditable(false);
                total.setText(rs.getString(13));
                total.setEditable(false);
                
                
                int physicsMarks = Integer.parseInt(rs.getString(8));
                int mathsMarks = Integer.parseInt(rs.getString(9));
                int chemistryMarks = Integer.parseInt(rs.getString(10));
                int electricalMarks = Integer.parseInt(rs.getString(11));
                int bioMarks = Integer.parseInt(rs.getString(12));
                if(physicsMarks>=30 && mathsMarks>=30 && chemistryMarks>=30 &&electricalMarks>=30 && bioMarks>=30){
                    verdict.setText("PASS");
                }
                else{
                    verdict.setText("FAIL");
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void exitStudentResultPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitStudentResultPageActionPerformed
        // TODO add your handling code here:
           int res = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?", "submit" , JOptionPane.YES_NO_OPTION);
        if(res==0){
            setVisible(false);
            setVisible(false);
            Student frame = new Student();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        
    }//GEN-LAST:event_exitStudentResultPageActionPerformed

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
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField biology;
    private javax.swing.JTextField branch;
    private javax.swing.JTextField chemistry;
    private javax.swing.JTextField course;
    private javax.swing.JTextField electrical;
    private javax.swing.JButton exitStudentResultPage;
    private javax.swing.JTextField father_name;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField maths;
    private javax.swing.JTextField name;
    private javax.swing.JTextField physics;
    private javax.swing.JTextField roll;
    private javax.swing.JTextField total;
    private javax.swing.JTextField verdict;
    // End of variables declaration//GEN-END:variables
}
