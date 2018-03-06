/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idspack;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ameya
 */
public class systemtray {
    
    static TrayIcon icon;
    
    public systemtray()
    {
        showtray();
    }
    
    public static void showtray()
    {
        if(!SystemTray.isSupported())
        {
                JOptionPane.showInternalMessageDialog(null,"Sorry Your System Does Not Support System Tray Icon","Error",JOptionPane.ERROR_MESSAGE);
                return ;
        }
        
        
        
        final PopupMenu popup = new PopupMenu();
        icon = new TrayIcon(createimg("/images/trayico.png","Tray Icon"));
        final SystemTray tray = SystemTray.getSystemTray();
        
        icon.setToolTip("Intrusion Detection System\n              Version 1.0");
        
        //Creating menus
        MenuItem About = new MenuItem("About");
        MenuItem exit = new MenuItem("Exit");
        
        //add menu item
        popup.add(About);
        popup.addSeparator();
        popup.add(exit);
       
        About.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                about ab = new about();
                ab.setVisible(true);
            }
        });
        
        exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
        
        
        icon.setPopupMenu(popup);
        try {
            tray.add(icon);
        } catch (AWTException ex) {
            Logger.getLogger(systemtray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Image createimg(String path,String desc)
    {
        URL imgurl = systemtray.class.getResource(path);
        return(new ImageIcon(imgurl, desc).getImage());
        
    }
}
