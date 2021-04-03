package saperPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class startFrame implements ActionListener {
    public JFrame frame;
    public JPanel panel;
    public JButton startG;
    public JButton ranking;
    public JButton quitGame;
    public ranking Ranking;

    public startFrame(){

        panel = new JPanel();
        frame = new JFrame();

        //definicja przyciskow
        startG = new JButton("Start Game"); //definicja przycisku Start Game
        ranking = new JButton("Ranking");
        quitGame = new JButton("Quit");



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Wczytanie znaku zamkniecie w prawym rogu
        frame.setTitle("Saper"); //Nazwa okna
        frame.setSize(700,700); //ustawienie szerokosci jak i wysokosci okna
        frame.setVisible(true); //true oznacza ze okno jest widczone
        panel.setBorder(BorderFactory.createEmptyBorder(100, 0, 500, 0));

        frame.getContentPane().add(panel);
        frame.setResizable(false);
        startG.addActionListener(this);
        ranking.addActionListener(this);
        quitGame.addActionListener(this);

        makeMainPanel();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == startG) {

            panel.removeAll();
            panel.repaint();

            GamePanel gamePanel = new GamePanel(panel);

        }

        if (source == ranking)
        {
        }

        if (source == quitGame)
        {
        }

    }

    public void makeMainPanel(){
        panel.setLayout(null);
        panel.add(startG);
        panel.add(ranking);
        panel.add(quitGame);
        startG.setBounds(300,100,100,40);
        ranking.setBounds(300,150,100,40);
        quitGame.setBounds(300,200,100,40);
    }

}
