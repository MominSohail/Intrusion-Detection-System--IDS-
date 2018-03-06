package idspack;

import javax.swing.ImageIcon;

public class about extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
   
    
    public about() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minibtn = new javax.swing.JLabel();
        Closebtn = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(minibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 9, -1, -1));

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
        getContentPane().add(Closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 9, -1, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/idslogo.gif"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

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

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aboutus.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(500, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minibtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseClicked
        this.setState(Splash.ICONIFIED);
    }//GEN-LAST:event_minibtnMouseClicked

    private void minibtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseEntered
        minibtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/mini_btn_clk.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_minibtnMouseEntered

    private void minibtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseExited
        minibtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/mini_btn.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_minibtnMouseExited

    private void ClosebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseClicked
        setVisible(false);
         Mainfrm SLT=new Mainfrm();
        SLT.setVisible(true); 
    }//GEN-LAST:event_ClosebtnMouseClicked

    private void ClosebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseEntered
        Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/close_btn_clk.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_ClosebtnMouseEntered

    private void ClosebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseExited
        Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/close_btn.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_ClosebtnMouseExited

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();

        this.setLocation(x- xMouse, y-yMouse);
    }//GEN-LAST:event_dragMouseDragged

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

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
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Closebtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel minibtn;
    // End of variables declaration//GEN-END:variables
}
