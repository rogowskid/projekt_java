package saperPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Field extends JPanel {

    private int index;
    private int value;
    private int counterOfpink=0;
    private boolean isBomb = false;



    private Field thisField = this;
    private JLabel valueText  = new JLabel(thisField.getValue()+"", SwingConstants.CENTER);
    private JLabel scoreValue = new JLabel ("Score: " + counterOfpink);
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

                if(thisField.isBomb) {
                    thisField.setBackground(Color.red);
                    valueText.setText("");
                }else {
                    thisField.setBackground(Color.PINK);
                    valueText.setText(thisField.getValue()+"");
                    counterOfpink++;
                }

                thisField.add(valueText);

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
