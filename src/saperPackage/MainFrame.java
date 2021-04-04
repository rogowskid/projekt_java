package saperPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

//    saperPackage.MainFrame thisFrame = this;

//    JPanel panel1 = new JPanel();
//    JPanel panel2 = new JPanel();
//
//    JLabel label1 = new JLabel("Panel1");
//    JLabel label2 = new JLabel("Panel2");
//
//    JButton button1 = new JButton("Go to P2");
//    JButton button2 = new JButton("Go to P1");

    public MainFrame() throws HeadlessException {

        this.setBounds(200,200,300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(1,1));

//
//        panel1.add(label1);
//        panel1.setBackground(Color.green);
//        panel1.add(button1);
//
//        panel2.add(label2);
//        panel2.setBackground(Color.blue);
//        panel2.add(button2);
//
//        this.getContentPane().add(panel1);
//
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                thisFrame.getContentPane().remove(panel1);
//
//
//
//                thisFrame.getContentPane().add(panel2);
////                panel1.validate();
////                panel1.repaint();
////                panel2.validate();
////                panel2.repaint();
//                thisFrame.repaint();
//                thisFrame.validate();
//            }
//        });
//
//        button2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                thisFrame.getContentPane().remove(panel2);
//                thisFrame.getContentPane().add(panel1);
//                thisFrame.repaint();
//                thisFrame.validate();
//            }
//        });
//

        new MenuPanel(this);

        this.setVisible(true);
    }

}
