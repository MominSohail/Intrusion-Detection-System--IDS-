package idspack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jpcap.JpcapCaptor;
import jpcap.JpcapWriter;
import jpcap.NetworkInterface;
import jpcap.PacketReceiver;
import jpcap.packet.DatalinkPacket;
import jpcap.packet.EthernetPacket;
import jpcap.packet.IPPacket;
import jpcap.packet.Packet;

/**
 *
 * @author Ameya
 */
public class Sniffer extends javax.swing.JFrame implements PacketReceiver {
//Global Variables
int xMouse;
int yMouse;
static int i = 0;
String protocoll[] = {"HOPOPT", "ICMP", "IGMP", "GGP", "IPV4", "ST", "TCP", "CBT", "EGP", "IGP", "BBN", "NV2", "PUP", "ARGUS", "EMCON", "XNET", "CHAOS", "UDP", "mux"};
public int no, count=0, ex, pacno=0;
static NetworkInterface [] devices =JpcapCaptor.getDeviceList();
JpcapCaptor jpcap;
JpcapWriter writer;
String s =null;
private interinfo in;
/**
     * Creates new form Sniffer
     */
    public Sniffer() {
        initComponents();
         this.setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage()); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt8 = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        minibtn = new javax.swing.JLabel();
        Closebtn = new javax.swing.JLabel();
        selectbtn = new javax.swing.JLabel();
        infobtn = new javax.swing.JLabel();
        stopbtn = new javax.swing.JLabel();
        listbtn = new javax.swing.JLabel();
        savebtn = new javax.swing.JLabel();
        exitbtn = new javax.swing.JLabel();
        startbtn = new javax.swing.JLabel();
        pacsel = new javax.swing.JLabel();
        nicsel = new javax.swing.JTextField();
        pacq = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new java.awt.TextArea();
        drag = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt8.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        txt8.setForeground(new java.awt.Color(255, 255, 255));
        txt8.setText("Exit");
        getContentPane().add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 455, 50, -1));

        txt7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        txt7.setForeground(new java.awt.Color(255, 255, 255));
        txt7.setText("Save");
        getContentPane().add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 455, 50, -1));

        txt6.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        txt6.setForeground(new java.awt.Color(255, 255, 255));
        txt6.setText("Stop");
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 455, 50, -1));

        txt5.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        txt5.setForeground(new java.awt.Color(255, 255, 255));
        txt5.setText("Information");
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 455, 100, -1));

        txt4.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        txt4.setText("Select");
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 455, 50, -1));

        txt3.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setText("List");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 455, 50, -1));

        txt2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setText("Select Packets");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 385, 100, -1));

        txt1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText("Start Capturing");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 388, 110, -1));

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
        getContentPane().add(minibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 7, -1, -1));

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
        getContentPane().add(Closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 7, -1, -1));

        selectbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png"))); // NOI18N
        selectbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectbtnMouseExited(evt);
            }
        });
        getContentPane().add(selectbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, -1));

        infobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png"))); // NOI18N
        infobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infobtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infobtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infobtnMouseExited(evt);
            }
        });
        getContentPane().add(infobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 450, -1, -1));

        stopbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png"))); // NOI18N
        stopbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stopbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stopbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stopbtnMouseExited(evt);
            }
        });
        getContentPane().add(stopbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 450, -1, -1));

        listbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png"))); // NOI18N
        listbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listbtnMouseExited(evt);
            }
        });
        getContentPane().add(listbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 450, -1, -1));

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
        getContentPane().add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 450, -1, -1));

        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png"))); // NOI18N
        exitbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitbtnMouseExited(evt);
            }
        });
        getContentPane().add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        startbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png"))); // NOI18N
        startbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startbtnMouseExited(evt);
            }
        });
        getContentPane().add(startbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 379, -1, -1));

        pacsel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png"))); // NOI18N
        pacsel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pacselMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pacselMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pacselMouseExited(evt);
            }
        });
        getContentPane().add(pacsel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 376, -1, -1));

        nicsel.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        nicsel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nicsel.setText("Interface No.");
        nicsel.setBorder(null);
        nicsel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nicselMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nicselMouseEntered(evt);
            }
        });
        getContentPane().add(nicsel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 130, 30));

        pacq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pacq.setText("Packet Quantity");
        pacq.setBorder(null);
        pacq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pacqMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pacqMouseEntered(evt);
            }
        });
        getContentPane().add(pacq, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 140, 30));

        jScrollPane2.setBorder(null);

        output.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(output);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 56, 750, 290));

        drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragMousePressed(evt);
            }
        });
        drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragMouseDragged(evt);
            }
        });
        getContentPane().add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sniffer.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        setSize(new java.awt.Dimension(799, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public int devcount()
    {
    for(int k=0;k<=devices.length;k++)
    {
        count=count+1;
    }
    return count;
    }
    
    public void receivePacket(Packet packet){
        if (packet != null) {
         output.append("\nPacket No. : "+i);
         output.append("\nPacket : "+packet);i++;
         IPPacket tpt=(IPPacket)packet;
         int ppp=tpt.protocol;
         String proto=protocoll[ppp];
         if(tpt.dont_frag){
            output.append("\nDFT BI is SET. Packet WILL NOT be FRAGMENTED!! ");
            }else{
            output.append("\nDFT BI is NOT SET. Packet WILL  be FRAGMENTED!! ");
            }
         output.append("\nSource IP : "+tpt.src_ip);
         output.append("\nDestination IP : "+tpt.dst_ip);
         output.append("\nHop Limit : "+tpt.hop_limit);
         output.append("\nIdentification Field : "+tpt.ident);
         output.append("\nPacket Length : "+tpt.length);
         output.append("\nPacket Priority : "+(int)tpt.priority);
         output.append("\nService Field Type : "+tpt.rsv_tos);
         if(tpt.r_flag){
            output.append("\nThis is Releiable Transmission!!!");
         }else{
            output.append("\nThis is NOT Reliable Transmissinon!!!");
         }
         output.append("\nProtocol Version : "+(int)tpt.version);
         output.append("\nFlow Label Field : "+tpt.flow_label);
         DatalinkPacket dp = packet.datalink;
         EthernetPacket ept=(EthernetPacket)dp;
         output.append("\nSource MAC Address : "+ept.getSourceAddress());
         output.append("\nDestination MAC Address : "+ept.getDestinationAddress());
    }
         else{
         output.append("\nNull Packet Receievd or Timeout");
         
    }
        output.append("\n---------------------------------------------------------------------------------------------------------------------------------------------");
}
   
    
    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();

        this.setLocation(x- xMouse, y-yMouse);
    }//GEN-LAST:event_dragMouseDragged

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void minibtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseClicked
        this.setState(Splash.ICONIFIED);
    }//GEN-LAST:event_minibtnMouseClicked

    private void ClosebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseClicked
        setVisible(false);
        Mainfrm mf = new Mainfrm();
        mf.setVisible(true);
    }//GEN-LAST:event_ClosebtnMouseClicked

    private void listbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listbtnMouseClicked
           intersel inter = new intersel();
            inter.setVisible(true);
    }//GEN-LAST:event_listbtnMouseClicked

    private void selectbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectbtnMouseClicked
        int c = devcount();
        ex = Integer.parseInt(nicsel.getText());
        if("Interface No.".equals(nicsel.getText())){
            JOptionPane.showMessageDialog(null,"Please Select a Valid Interface ","Error", JOptionPane.ERROR_MESSAGE); 
            return;
        }           
        else if(ex < 0 || ex > c)
                {
                    JOptionPane.showMessageDialog(null,"Please Enter Valid Interface Number","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
        else{
            s = nicsel.getText();
            no = Integer.parseInt(nicsel.getText());
            JOptionPane.showMessageDialog(null,"Interface Selected : " + no);
        }
    }//GEN-LAST:event_selectbtnMouseClicked

    private void startbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startbtnMouseClicked
                if(s == null ){
            JOptionPane.showMessageDialog(null," Select Interface","Error",JOptionPane.ERROR_MESSAGE);
            }
        else if(pacno==0){
        JOptionPane.showMessageDialog(null,"Please Select Packet Quntity","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            output.setText("Interface "+no+" Is Selected\nInterface Description : "+devices[no].description+"\n");
            output.append("----------------------------------------------------------------------------------------------------------------------------------------------\n");
            try{
            jpcap = JpcapCaptor.openDevice(devices[no], 65535, true, 10);
            jpcap.loopPacket(pacno, (PacketReceiver)this);
            }
            catch(IOException e){
            Logger.getLogger(intersel.class.getName()).log(Level.SEVERE, null, e);
            }
         }
        
    }//GEN-LAST:event_startbtnMouseClicked

    private void stopbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopbtnMouseClicked
        jpcap.close();
        jpcap.breakLoop();
    }//GEN-LAST:event_stopbtnMouseClicked

    private void exitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseClicked
        setVisible(false);
        new Mainfrm().setVisible(true);
    }//GEN-LAST:event_exitbtnMouseClicked

    private void savebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseClicked
             String savedata = output.getText();
              try{
                 File data = new File("Saved Data.txt");
                 FileOutputStream datastream = new FileOutputStream(data);
                 PrintStream out;
                 out = new PrintStream(datastream);
                 out.println(savedata);
                 
                 JOptionPane.showMessageDialog(null,"Data Saved Successfully!!","Information",JOptionPane.INFORMATION_MESSAGE);
             }
             catch(IOException e){
             JOptionPane.showMessageDialog(null,"File Access Error Cannot Save Data","Error",JOptionPane.ERROR_MESSAGE);
             }
    }//GEN-LAST:event_savebtnMouseClicked

    private void selectbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectbtnMouseEntered
        selectbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_hower.png")));
        selectbtn.setToolTipText("Click to select Interface");
    }//GEN-LAST:event_selectbtnMouseEntered

    private void listbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listbtnMouseEntered
        listbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_hower.png")));
        listbtn.setToolTipText("Click to See List of Interfaces");
    }//GEN-LAST:event_listbtnMouseEntered

    private void savebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseEntered
        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_hower.png")));
        savebtn.setToolTipText("Click to Save The Data");
    }//GEN-LAST:event_savebtnMouseEntered

    private void infobtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infobtnMouseEntered
        infobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_hower.png")));
        infobtn.setToolTipText("Click to see the Information about the Selected Interface");
    }//GEN-LAST:event_infobtnMouseEntered

    private void stopbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopbtnMouseEntered
        stopbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_hower.png")));
        stopbtn.setToolTipText("Click to stop Packet Capturing");
    }//GEN-LAST:event_stopbtnMouseEntered

    private void exitbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseEntered
        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_hower.png")));
        exitbtn.setToolTipText("Click to Return to Main Page");
    }//GEN-LAST:event_exitbtnMouseEntered

    private void startbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startbtnMouseEntered
        startbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_hower.png")));
        startbtn.setToolTipText("Click to Start Packet Capturing");
    }//GEN-LAST:event_startbtnMouseEntered

    private void nicselMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nicselMouseEntered
        nicsel.setToolTipText("Enter the number of Interface");
    }//GEN-LAST:event_nicselMouseEntered

    private void ClosebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseEntered
        Closebtn.setToolTipText("Click to Close");
        Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/close_btn_clk.png")));
    }//GEN-LAST:event_ClosebtnMouseEntered

    private void minibtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseEntered
        minibtn.setToolTipText("Click to Minimize");
        minibtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/mini_btn_clk.png")));
    }//GEN-LAST:event_minibtnMouseEntered

    private void infobtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infobtnMouseClicked
        
        interinfo i1 = new interinfo();    
        interinfo.intnum.setText(nicsel.getText());
        i1.setVisible(true);
    }//GEN-LAST:event_infobtnMouseClicked

    private void nicselMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nicselMouseClicked
        nicsel.setText("");
    }//GEN-LAST:event_nicselMouseClicked

    private void pacselMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacselMouseClicked
        if("Packet Quantity".equals(pacq.getText()))
        {
        JOptionPane.showMessageDialog(null, " Please Select a Quantity","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        pacno = Integer.parseInt(pacq.getText());
        JOptionPane.showMessageDialog(null, pacno+" Quantity Selected","Confirmed",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_pacselMouseClicked

    private void pacselMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacselMouseEntered
        pacsel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_hower.png")));
        pacsel.setToolTipText("Click to Select Packet Quantity");
    }//GEN-LAST:event_pacselMouseEntered

    private void pacqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacqMouseClicked
        pacq.setText("");
    }//GEN-LAST:event_pacqMouseClicked

    private void pacqMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacqMouseEntered
        pacq.setToolTipText("Enter the Amount of Packets");
    }//GEN-LAST:event_pacqMouseEntered

    private void minibtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseExited
        minibtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/mini_btn.png")));
    }//GEN-LAST:event_minibtnMouseExited

    private void ClosebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseExited
            Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/close_btn.png")));
    }//GEN-LAST:event_ClosebtnMouseExited

    private void startbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startbtnMousePressed
        startbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_pressed.png")));
    }//GEN-LAST:event_startbtnMousePressed

    private void startbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startbtnMouseReleased
        startbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_startbtnMouseReleased

    private void startbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startbtnMouseExited
        startbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_startbtnMouseExited

    private void pacselMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacselMouseExited
       pacsel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_pacselMouseExited

    private void pacselMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacselMousePressed
        pacsel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_pressed.png")));
    }//GEN-LAST:event_pacselMousePressed

    private void pacselMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacselMouseReleased
        pacsel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_pacselMouseReleased

    private void listbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listbtnMouseExited
       listbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_listbtnMouseExited

    private void listbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listbtnMousePressed
       listbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_pressed.png")));
    }//GEN-LAST:event_listbtnMousePressed

    private void listbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listbtnMouseReleased
        listbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_listbtnMouseReleased

    private void selectbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectbtnMouseExited
        selectbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_selectbtnMouseExited

    private void selectbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectbtnMousePressed
        selectbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_pressed.png")));
    }//GEN-LAST:event_selectbtnMousePressed

    private void selectbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectbtnMouseReleased
 selectbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_selectbtnMouseReleased

    private void infobtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infobtnMouseExited
        infobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_infobtnMouseExited

    private void infobtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infobtnMousePressed
        infobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_pressed.png")));
    }//GEN-LAST:event_infobtnMousePressed

    private void infobtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infobtnMouseReleased
        infobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_infobtnMouseReleased

    private void stopbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopbtnMouseExited
        stopbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_stopbtnMouseExited

    private void stopbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopbtnMousePressed
stopbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_pressed.png")));
    }//GEN-LAST:event_stopbtnMousePressed

    private void stopbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopbtnMouseReleased
stopbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_stopbtnMouseReleased

    private void savebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseExited
savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_savebtnMouseExited

    private void savebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMousePressed
savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_pressed.png")));
    }//GEN-LAST:event_savebtnMousePressed

    private void savebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseReleased
savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_savebtnMouseReleased

    private void exitbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseExited
exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_exitbtnMouseExited

    private void exitbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMousePressed
 exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_pressed.png")));
    }//GEN-LAST:event_exitbtnMousePressed

    private void exitbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseReleased
exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button.png")));
    }//GEN-LAST:event_exitbtnMouseReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sniffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sniffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sniffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sniffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sniffer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Closebtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel exitbtn;
    private javax.swing.JLabel infobtn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listbtn;
    private javax.swing.JLabel minibtn;
    private javax.swing.JTextField nicsel;
    private java.awt.TextArea output;
    private javax.swing.JTextField pacq;
    private javax.swing.JLabel pacsel;
    private javax.swing.JLabel savebtn;
    private javax.swing.JLabel selectbtn;
    private javax.swing.JLabel startbtn;
    private javax.swing.JLabel stopbtn;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt8;
    // End of variables declaration//GEN-END:variables
}