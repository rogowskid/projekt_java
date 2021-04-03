package saperPackage;

import javax.swing.*;
import java.awt.*;

public class GamePanel{

    JButton returnButton = new JButton("Return");




    public GamePanel(JPanel parent) {

        parent.setBackground(Color.green);
        parent.add(returnButton);
        returnButton.setBounds(200,200, 100, 50);


    }



}
