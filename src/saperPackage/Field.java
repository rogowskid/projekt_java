package saperPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Field extends JPanel {

    private int index;
    Field thisField = this;

    public int getIndex() {
        return index;
    }

    public Field(int index) {
        this.index =index;
        this.setBackground(Color.gray);
        this.setBorder(BorderFactory.createBevelBorder(1));

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(thisField.getIndex());
            }
        });


    }
}
