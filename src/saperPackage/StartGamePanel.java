package saperPackage;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartGamePanel extends JPanel {

    JButton backToMenu = new JButton("Powrot");
    StartGamePanel thisPanel = this;
    JLabel fieldChoose = new JLabel("Wybierz rozmiar pola");
    JSlider fieldSlider = new JSlider(0,25, 0);
    JLabel valueSlider = new JLabel("Liczba kratek: " + fieldSlider.getValue());
    public StartGamePanel(MainFrame parent){

        //this.setBackground(Color.blue);
        this.setLayout(null);
        backToMenu.setBounds(500,50,100,50);
        fieldChoose.setBounds(250,10,250,50);
        fieldSlider.setBounds(250,60,100,20);
        valueSlider.setBounds(250,80,250,20);
        fieldChoose.setFont(new Font("Verdana",Font.PLAIN, 12));
        valueSlider.setFont(new Font("Verdana",Font.PLAIN, 12));

        this.add(fieldSlider);
        this.add(backToMenu);
        this.add(fieldChoose);
        this.add(valueSlider);
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

        fieldSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int val = fieldSlider.getValue()*fieldSlider.getValue();
                valueSlider.setText("Liczba kratek: " + val);
            }
        });

    }


}
