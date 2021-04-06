package saperPackage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;



public class Field extends JPanel {

    private int index;
    private int value;

    private boolean isBomb = false;



    private void msgbox(String text)
    {

        JOptionPane.showMessageDialog(null, text, "Saper", JOptionPane.PLAIN_MESSAGE);
    }

    private Field thisField = this;
    private JLabel valueText  = new JLabel(thisField.getValue()+"", SwingConstants.CENTER);

    public int getIndex() {
        return index;
    }

    public Field(int index) {
        this.index = index;
        this.setBackground(Color.gray);

        this.setBorder(BorderFactory.createBevelBorder(1));
        this.setLayout(new GridLayout(1,1));



        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(thisField.getIndex());
                if (e.getButton() == MouseEvent.BUTTON1)
                {
                    if(thisField.isBomb) {
                        thisField.setBackground(Color.red);
                        valueText.setText("");
                        msgbox("Koniec gry");

                    }else {

                        thisField.setBackground(Color.PINK);
                        valueText.setText(thisField.getValue()+"");
                        GamePanel.counterPink++;
                        GamePanel.scoreValue.setText("Score: " + GamePanel.counterPink);



                    }





                    thisField.add(valueText);

                }

                if (e.getButton() == MouseEvent.BUTTON3)
                {
                    //tutaj wklej obrazek

                }




                validate();
                repaint();
            }


        });


    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isBomb() {
        return isBomb;
    }

    public void setBomb(boolean bomb) {
        isBomb = bomb;
    }


}
