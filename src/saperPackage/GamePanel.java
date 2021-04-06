package saperPackage;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    JPanel topPanel = new JPanel();
    JPanel mainBoardPanel = new JPanel();

    GamePanel thisPanel = this;
    Field[] fields;

    public GamePanel(MainFrame parent, int numberOfFields) {

        parent.setSize(655,838);
        this.setBackground(Color.gray);
        this.setLayout(null);
        parent.getContentPane().add(this);

        fields = new Field[numberOfFields];

        mainBoardPanel.setLayout(new GridLayout((int)Math.sqrt(numberOfFields), (int)Math.sqrt(numberOfFields)));

        for (int i = 0; i < fields.length; i++) {
            fields[i] = new Field(i);
            mainBoardPanel.add(fields[i]);
        }


        parent.validate();
        parent.repaint();

        mainBoardPanel.setBounds(0,160, 640,640);
        mainBoardPanel.setBackground(Color.CYAN);
        this.add(mainBoardPanel);

        topPanel.setBounds(0,0,640,160);
        topPanel.setBackground(Color.darkGray);
        this.add(topPanel);


    }
}
