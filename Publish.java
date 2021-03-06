/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author saiprasoona
 */
import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JOptionPane;

public class Publish extends javax.swing.JFrame {

    /**
     * Creates new form Publish
     */
    static String uID;
    static String bID;
    static int wallet;
    public Publish(String userID,int w) {
        initComponents();
        uID=userID;
        wallet=w;
    }
    public Publish(String userID, String bookID,int w){
        initComponents();
        bID=bookID;
        uID=userID;
        wallet=w;
        jTextField6.setText(bID);
        jTextField6.setEditable(false);
       try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select *from book where bookID='"+bID+"'");
                if(rs.next()){
                jTextField1.setText(rs.getString(1));
                jTextField2.setText(rs.getString(3));
                jTextField3.setText(rs.getString(4));
                jTextField4.setText(rs.getString(5));
                jTextField5.setText(rs.getString(6));
                
                }
       }
       catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"Connection Error");
       }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel1.setText("Book Title");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 140, 40));

        jLabel2.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel2.setText("Authors");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 110, 40));

        jLabel3.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel3.setText("Publisher");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 130, 40));

        jLabel4.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel4.setText("Edition");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 110, 40));

        jLabel5.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel5.setText("Year");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 80, 30));

        jTextField1.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 170, 40));

        jTextField2.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 170, 40));

        jTextField3.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 170, 40));

        jTextField4.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 170, 40));

        jTextField5.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 170, 40));

        jButton1.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("/Users/saiprasoona/OOPS PROJECT/save/1x/baseline_save_black_36dp.png")); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, -1));

        jButton2.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("/Users/saiprasoona/OOPS PROJECT/close/1x/baseline_cancel_black_36dp.png")); // NOI18N
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, -1, -1));

        jLabel7.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel7.setText("Book ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jTextField6.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 170, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/saiprasoona/OOPS PROJECT/images/ss 2022-04-26 at 12.47.11 AM.png")); // NOI18N
        jLabel6.setText("jLabel4");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
         new newUser(uID,wallet).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String BookTitle = jTextField1.getText();
       String author = jTextField2.getText();
       String publisher = jTextField3.getText();
       String edition = jTextField4.getText();
       String year = jTextField5.getText();
       String bookID;
       String owner =uID;
       if(BookTitle.isEmpty() || author.isEmpty() || publisher.isEmpty() || edition.isEmpty() || year.isEmpty()){
           JOptionPane.showMessageDialog(null, "Please fill all details");
           return;
       }
       
       String status="available";
       
       try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            if((bID!=null)){
                bookID=bID;
//                jTextField6.setText(bID);
//                jTextField6.setEditable(false);
//                ResultSet rs = st.executeQuery("select *from book where bookID='"+bID+"'");
//                jTextField1.setText(rs.getString(1));
//                jTextField2.setText(rs.getString(3));
//                jTextField3.setText(rs.getString(4));
//                jTextField4.setText(rs.getString(5));
//                jTextField5.setText(rs.getString(6));
                ResultSet rs = st.executeQuery("select *from book where bookID='"+bookID+"'");
                if(rs.next()){
//                rs.updateString(1, BookTitle);
//                rs.updateString(3, author);
//                rs.updateString(4, publisher);
//                rs.updateString(5, edition);
//                rs.updateString(6, year);
//                rs.updateString(7, status);
//                rs.updateString(8, uID);
//                rs.updateString(9, owner);
                st.executeUpdate("update book set BookTitle='"+BookTitle+"' where bookID='"+bookID+"'");
                st.executeUpdate("update book set author='"+author+"' where bookID='"+bookID+"'");
                st.executeUpdate("update book set publisher='"+publisher+"' where bookID='"+bookID+"'");
                st.executeUpdate("update book set edition='"+edition+"' where bookID='"+bookID+"'");
                st.executeUpdate("update book set year='"+year+"' where bookID='"+bookID+"'");
                st.executeUpdate("update book set status='available' where bookID='"+bookID+"'");
                st.executeUpdate("update book set userID='"+uID+"' where bookID='"+bookID+"'");
                st.executeUpdate("update book set owner='"+owner+"' where bookID='"+bookID+"'");
                }
                JOptionPane.showMessageDialog(null, "Successfully Updated");
                setVisible(false);
                new newUser(uID,wallet).setVisible(true);
            }
            else{
                bookID = jTextField6.getText();
                
                
                st.executeUpdate("Insert into book values('"+ BookTitle +"' , '"+ bookID+"' , '"+author+"' , '"+ publisher+"' , '"+edition+"' , '"+ year +"' , '"+status+"' , '"+uID+"' ,'"+owner+"')");
                JOptionPane.showMessageDialog(null, "Successfully Updated");
                setVisible(false);
                new newUser(uID,wallet).setVisible(true);
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Book ID already exists");
            setVisible(false);
            new Publish(uID,wallet).setVisible(true);
        }
       
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(Publish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Publish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Publish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Publish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Publish(uID,wallet).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
