/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptedchat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author npilusa
 */
public class Tests {
    public static void main(String[] args){
        HashSet<String> names = new HashSet<String>();
        JFrame frame = new JFrame("Online clients");
        
        JPanel panel = new JPanel();
        names.add("Norman");
        names.add("Tom");
        names.add("Norman2");
        names.add("Tom2");
        
        String nameList = names.toString();        
        nameList = nameList.substring(1, nameList.length()-1);

        
        for(String name : nameList.split(",")){
            //Dynamically create buttons
            JButton btn = new JButton(name.trim());
            
            //Create action listener for button
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(e.getActionCommand());//name of online person selected
                }
            });
            panel.add(btn);//Add button to panel
            
        }
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/* Client: Get list of online client and select one to chat to
else if(line.startsWith("[")){//List of clients online
    line = line.substring(1, line.length()-1);
                
    for(String client : line.split(",")){
        friends.add(client.trim());
    }
}*/ 