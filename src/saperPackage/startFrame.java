package saperPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class startFrame {
    public JFrame frame;
    public JPanel panel;
    public JButton startG;
    public startFrame(){

        panel = new JPanel();
        frame = new JFrame();
        startG = new JButton("Start Game"); //definicja przycisku Start Game
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Wczytanie znaku zamkniecie w prawym rogu
        frame.setTitle("Saper"); //Nazwa okna
        frame.pack();
        frame.setSize(700,700); //ustawienie szerokosci jak i wysokosci okna
        frame.setVisible(true); //true oznacza ze okno jest widczone
        panel.setBorder(BorderFactory.createEmptyBorder(0, 300, 100, 0));

        panel.setLayout(new GridLayout(0,1));
        panel.add(startG);
        frame.add(panel, BorderLayout.CENTER);

    }

}
