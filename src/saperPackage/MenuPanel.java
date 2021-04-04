package saperPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel {


    JButton rankingPanel;
    MenuPanel thisPanel = this;

    public MenuPanel(MainFrame parent) {
        this.setLayout(null);
        this.setBackground(Color.red);

        parent.getContentPane().add(this);
        parent.validate();
        parent.repaint();

        rankingPanel = new JButton("Ranking");
        rankingPanel.setBounds(50,50,100,50);
        this.add(rankingPanel);


        rankingPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getContentPane().remove(thisPanel);
                new RankingPanel(parent);
            }
        });

    }
}
