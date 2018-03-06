package idspack;
import java.sql.*;
import javax.swing.ImageIcon;
public class ChangePsw extends javax.swing.JFrame {
        int xMouse;
        int yMouse;
        static String userName;
        static String psw;
    public ChangePsw() {
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
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        userlbl = new javax.swing.JLabel();
        nunamelb = new javax.swing.JLabel();
        cpswdlb = new javax.swing.JLabel();
        npwlb = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        nuname = new javax.swing.JTextField();
        cpswd = new javax.swing.JPasswordField();
        npswd = new javax.swing.JPasswordField();
        minibtn = new javax.swing.JLabel();
        Closebtn = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JLabel();
        savebtn = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText("Save");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 458, 60, -1));

        txt2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setText("Cancel");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 458, 60, -1));

        userlbl.setFont(new java.awt.Font("Myriad Pro", 0, 20)); // NOI18N
        userlbl.setForeground(new java.awt.Color(255, 255, 255));
        userlbl.setText("Current Username");
        getContentPane().add(userlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 160, 30));

        nunamelb.setFont(new java.awt.Font("Myriad Pro", 0, 20)); // NOI18N
        nunamelb.setForeground(new java.awt.Color(255, 255, 255));
        nunamelb.setText("New Username");
        getContentPane().add(nunamelb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 176, 160, 30));

        cpswdlb.setFont(new java.awt.Font("Myriad Pro", 0, 20)); // NOI18N
        cpswdlb.setForeground(new java.awt.Color(255, 255, 255));
        cpswdlb.setText("Current Password");
        getContentPane().add(cpswdlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 267, 160, 30));

        npwlb.setFont(new java.awt.Font("Myriad Pro", 0, 20)); // NOI18N
        npwlb.setForeground(new java.awt.Color(255, 255, 255));
        npwlb.setText("New Password");
        getContentPane().add(npwlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 355, 160, 30));

        uname.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        uname.setBorder(null);
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 91, 230, 30));

        nuname.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        nuname.setBorder(null);
        getContentPane().add(nuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 177, 230, 30));

        cpswd.setBorder(null);
        getContentPane().add(cpswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 267, 230, 30));

        npswd.setBorder(null);
        getContentPane().add(npswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 355, 230, 30));

        minibtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/mini_btn.png"))); // NOI18N
        minibtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minibtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minibtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minibtnMouseExited(evt);
            }
        });
        getContentPane().add(minibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 9, -1, -1));

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
        getContentPane().add(Closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 9, -1, -1));

        cancelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png"))); // NOI18N
        cancelbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelbtnMouseExited(evt);
            }
        });
        getContentPane().add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 453, -1, -1));

        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png"))); // NOI18N
        savebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savebtnMouseExited(evt);
            }
        });
        getContentPane().add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 453, -1, -1));

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

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changepsw.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minibtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseClicked
        this.setState(Splash.ICONIFIED);
    }//GEN-LAST:event_minibtnMouseClicked

    private void ClosebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseClicked
        this.setVisible(false);
        Mainfrm mf = new Mainfrm();
        mf.setVisible(true);
    }//GEN-LAST:event_ClosebtnMouseClicked

    private void cancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseClicked
            this.setVisible(false);
        Mainfrm mf = new Mainfrm();
        mf.setVisible(true);
        
    }//GEN-LAST:event_cancelbtnMouseClicked

    private void savebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseClicked

        String cusr=uname.getText();
        String nusr=nuname.getText();
            String cpsd=new String (cpswd.getPassword());
            String npsd=new String (npswd.getPassword());
              
            System.out.println(" " + userName +" " + psw);
            if(cusr.equals(userName) && cpsd.equals(psw))
            {
                 Connection conn1=null;
       try
       {
           String driverName ="oracle.jdbc.driver.OracleDriver";
           Class.forName(driverName);
           String serverName="SOHAIL-PC";
           String serverPort="1521";
           String sid="XE";
           String url="jdbc:oracle:thin:@"+ serverName + ":" + serverPort + ":" + sid;
           String username="ids";
           String password="mypassword";
           conn1=DriverManager.getConnection(url,username,password);
           
           
             try
         {
         Statement stmt;
          stmt = conn1.createStatement();
       
      String sql = "UPDATE login set user_name='"+nusr+"', psw='"+npsd+"' where no = 1";
      stmt.executeUpdate(sql);
      
      System.out.println("updated");
      
      
       try{
           Statement st= conn1.createStatement();
           ResultSet rs=st.executeQuery("Select * from login");
           while(rs.next())
           {
               
               String nam=rs.getString(1).toString();
                 String psw=rs.getString(2).toString();
               System.out.println(" " + nam +" " + psw);
           }
           rs.close();
           
       }catch(Exception e)
       {
           e.printStackTrace();
           
       }
      
      
      
      
      
      conn1.close();
         //aWriter.write(currentTime + " " + s + "\n");
    }catch(Exception e)
       {
           e.printStackTrace();
           
       }
       } 
        catch(ClassNotFoundException | SQLException e)
       {
           System.out.println(e);
       }
                
            }
            
   else
            {
                jOptionPane1.showMessageDialog(null,"Please Enter correct Username & Password.");
            }
            
    }//GEN-LAST:event_savebtnMouseClicked

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x- xMouse, y-yMouse);
    }//GEN-LAST:event_dragMouseDragged

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void minibtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseEntered
minibtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/mini_btn_clk.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_minibtnMouseEntered

    private void minibtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseExited
 minibtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/mini_btn.png")));       // TODO add your handling code here:
    }//GEN-LAST:event_minibtnMouseExited

    private void ClosebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseEntered
Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/close_btn_clk.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_ClosebtnMouseEntered

    private void ClosebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseExited
Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/close_btn.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_ClosebtnMouseExited

    private void savebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseEntered
savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_hower.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_savebtnMouseEntered

    private void savebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseExited
savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));         // TODO add your handling code here:
    }//GEN-LAST:event_savebtnMouseExited

    private void cancelbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseEntered
cancelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_hower.png")));         // TODO add your handling code here:
    }//GEN-LAST:event_cancelbtnMouseEntered

    private void cancelbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseExited
cancelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));         // TODO add your handling code here:
    }//GEN-LAST:event_cancelbtnMouseExited

    public static void main(String args[]) {
        
        
          Connection conn=null;
       try
       {
           String driverName ="oracle.jdbc.driver.OracleDriver";
           Class.forName(driverName);
           String serverName="SOHAIL-PC";
           String serverPort="1521";
           String sid="XE";
           String url="jdbc:oracle:thin:@"+ serverName + ":" + serverPort + ":" + sid;
           String username="ids";
           String password="mypassword";
           conn=DriverManager.getConnection(url,username,password);
          // System.out.println("Connection Successfull...");
           
           
           
           
           try{
              
             Statement st= conn.createStatement();
             
           ResultSet rs=st.executeQuery("Select * from login");
           while(rs.next())
           {
           
               
                userName =rs.getString(1).toString();
               psw =rs.getString(2).toString();
              // System.out.println(" " + userName +" " + psw);
           }
           rs.close();
           conn.close();
       }catch(Exception e)
       {
           e.printStackTrace();
           
       }
           
           
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.println(e);
       }
        
      
        
        
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
            java.util.logging.Logger.getLogger(ChangePsw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePsw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePsw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePsw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePsw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Closebtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel cancelbtn;
    private javax.swing.JPasswordField cpswd;
    private javax.swing.JLabel cpswdlb;
    private javax.swing.JLabel drag;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JLabel minibtn;
    private javax.swing.JPasswordField npswd;
    private javax.swing.JLabel npwlb;
    private javax.swing.JTextField nuname;
    private javax.swing.JLabel nunamelb;
    private javax.swing.JLabel savebtn;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel userlbl;
    // End of variables declaration//GEN-END:variables
}
