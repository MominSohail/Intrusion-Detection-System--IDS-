/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idspack;

import java.sql.*;
import DBLOGS.ShowLogsTable;
import idspack.Splash.*;
import javax.swing.JOptionPane;
import idspack.logsinfo;
import javax.swing.ImageIcon;

/**
 *
 * @author SOHAIL MOMIN
 */
public class deletelog extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    static String userName;
    static String psw;

    /**
     * Creates new form deletelog
     */
    public deletelog() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        pswD = new javax.swing.JPasswordField();
        Closebtn = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        delbtn = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pswD.setBorder(null);
        getContentPane().add(pswD, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 220, 30));

        Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/close_btn.png"))); // NOI18N
        Closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClosebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClosebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClosebtnMouseExited(evt);
            }
        });
        getContentPane().add(Closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 8, 26, 19));

        txt6.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        txt6.setForeground(new java.awt.Color(255, 255, 255));
        txt6.setText("Delete");
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 215, 60, -1));

        delbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png"))); // NOI18N
        delbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delbtnMouseExited(evt);
            }
        });
        getContentPane().add(delbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragMouseDragged(evt);
            }
        });
        drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragMousePressed(evt);
            }
        });
        getContentPane().add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 20));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logdel.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(500, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClosebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseClicked
        setVisible(false);
        ShowLogsTable SLT=new ShowLogsTable();
        SLT.setVisible(true);
    }//GEN-LAST:event_ClosebtnMouseClicked

    private void ClosebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseEntered
        Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/close_btn_clk.png")));
    }//GEN-LAST:event_ClosebtnMouseEntered

    private void ClosebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseExited
        Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/close_btn.png")));
    }//GEN-LAST:event_ClosebtnMouseExited

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_dragMouseDragged

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void delbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delbtnMouseClicked
        //String usr = uname.getText();

        System.out.println("column no for delete " + ShowLogsTable.logidPK);

        try {
            Connection conn1 = null;
            String driverName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "SOHAIL-PC";
            String serverPort = "1521";
            String sid = "XE";
            String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":" + sid;
            String username = "ids";
            String password = "mypassword";
            conn1 = DriverManager.getConnection(url, username, password);

            try {

                Statement st = conn1.createStatement();

                ResultSet rs = st.executeQuery("Select * from login");
                while (rs.next()) {

                    userName = rs.getString(1).toString();
                    psw = rs.getString(2).toString();
                    System.out.println(" " + userName + " " + psw);
                }
                rs.close();

            } catch (Exception e) {
                e.printStackTrace();

            }
            String psd = new String(pswD.getPassword());
            if (psd.equals(psw)) {
                try {
                    Statement stmt;
                    stmt = conn1.createStatement();

                    //    String sql = "Update logs set sdt = ('" + currentTime + "') " + " where logid =('" + id + "')";
                    String sql = "DELETE FROM logs WHERE logid=('" + ShowLogsTable.logidPK + "')";

                    stmt.executeUpdate(sql);

                    System.out.println("Record is deleted...!!");

                    //logsid();
                    // conn1.close();
                    //aWriter.write(currentTime + " " + s + "\n");
                } catch (Exception e) {
                    e.printStackTrace();

                }
                try {
                    Statement stmt;
                    stmt = conn1.createStatement();

                    //    String sql = "Update logs set sdt = ('" + currentTime + "') " + " where logid =('" + id + "')";
                    String sql = "DELETE FROM imgtable WHERE logid=('" + ShowLogsTable.logidPK + "')";

                    stmt.executeUpdate(sql);

                    System.out.println("Image is deleted...!!");
                    ShowLogsTable frame = new ShowLogsTable();//to close logsinfo jfram
                       frame.setVisible(true);
                       
                    jOptionPane1.showMessageDialog(null, "Log is deleted Completly...", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                    this.setVisible(false);
                    
                      
                } catch (Exception e) {
                    e.printStackTrace();

                }
                
            }
            else {
                jOptionPane1.showMessageDialog(null, "Please Enter Corret Password", "Success", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_delbtnMouseClicked

    private void delbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delbtnMouseEntered
        delbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_hower.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_delbtnMouseEntered

    private void delbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delbtnMouseExited
        delbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_delbtnMouseExited

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
            java.util.logging.Logger.getLogger(deletelog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletelog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletelog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletelog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletelog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Closebtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel delbtn;
    private javax.swing.JLabel drag;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPasswordField pswD;
    private javax.swing.JLabel txt6;
    // End of variables declaration//GEN-END:variables
}
