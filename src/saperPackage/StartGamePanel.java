package saperPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartGamePanel extends JPanel {

    JButton backToMenu = new JButton("Powrot");
    StartGamePanel thisPanel = this;

    public StartGamePanel(MainFrame parent){

        this.setBackground(Color.blue);
        this.setLayout(null);
        backToMenu.setBounds(500,50,100,50);
        this.add(backToMenu);
        parent.getContentPane().add(this);
        parent.validate();
        parent.repaint();


        backToMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getContentPane().remove(thisPanel);
                new MenuPanel(parent);
            }
        });

    }


}
