package saperPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class startFrame {
    public JFrame frame;
    public JPanel panel;
    public JPanel panel2;
    public JButton startG;
    public JButton ranking;
    public startFrame(){

        panel = new JPanel();
        frame = new JFrame();
        panel2 = new JPanel();
        //definicja przyciskow
        startG = new JButton("Start Game"); //definicja przycisku Start Game
        ranking = new JButton("Ranking");
        panel.add(startG);
        panel2.add(ranking);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Wczytanie znaku zamkniecie w prawym rogu
        frame.setTitle("Saper"); //Nazwa okna
        frame.pack();
        frame.setSize(700,700); //ustawienie szerokosci jak i wysokosci okna
        frame.setVisible(true); //true oznacza ze okno jest widczone
        panel.setBorder(BorderFactory.createEmptyBorder(100, 0, 500, 0));
        panel2.setBorder(BorderFactory.createEmptyBorder(200, 0, 500, 0));
        frame.add(panel);
        frame.add(panel2);




        System.out.println("Adrian tu był!");
        System.out.println("Adrian tu był!");
        System.out.println("Adrian tu był!");
        System.out.println("Adrian tu był!");
        System.out.println("Adrian tu był!");
        System.out.println("Adrian tu był!");

        System.out.println("Daniel tu był!");
        System.out.println("Daniel tu był!");
        System.out.println("Daniel tu był!");
        System.out.println("Daniel tu byłsadas!");

        System.out.println("Adrian tu był!");
        System.out.println("Adrian tu był!");

    }

}
