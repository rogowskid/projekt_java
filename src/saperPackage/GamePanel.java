package saperPackage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import java.util.Timer;

public class GamePanel extends JPanel {
    public static int counterPink=0;
    JPanel topPanel = new JPanel();
    JPanel mainBoardPanel = new JPanel();

    public static JLabel scoreValue = new JLabel ("Score: " + counterPink);




    GamePanel thisPanel = this;
    Field[] fields;

    public GamePanel(MainFrame parent, int numberOfFields, int bombsNumber) {

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
        scoreValue.setForeground(Color.white);
        scoreValue.setFont(new Font("Verdana", Font.PLAIN, 22));
        scoreValue.setBounds(0,130,200,20);




        topPanel.add(scoreValue);



        generateBombs(fields,bombsNumber); //Tymczasowo 2 parametr

        for(int i = 0; i < fields.length; i++)
            fields[i].setValue(checkNeighbor(fields, i));

    }

    public static void generateBombs(Field[] fields, int number_of_bombs){
        Random random = new Random();
        int randValue;
        for(int i = 0; i < number_of_bombs; i++){
            while (true){
                randValue = random.nextInt(fields.length);
                if(fields[randValue].isBomb()){
                    continue;
                }else{
                    fields[randValue].setBomb(true);
                    break;
                }
            }
        }
    }

    public static int checkNeighbor(Field[] fields, int index){
        int lengthSqrt = (int)Math.sqrt(fields.length);
        int counter = 0;

        if(fields[index].isBomb())
            return -1;

        //Po prawej
        if( (index+1 < fields.length) && !isInLastColumn(index, fields.length) && fields[index+1].isBomb())
            counter++;

        //Po lewej
        if((index % lengthSqrt) != 0 && fields[index-1].isBomb())
            counter++;

        //Dół
        if((index + lengthSqrt) < fields.length && fields[index+lengthSqrt].isBomb())
            counter++;

        //Góra
        if((index - lengthSqrt) >= 0 && fields[index-lengthSqrt].isBomb())
            counter++;

        //Dół prawo
        if((index + lengthSqrt+1) < fields.length && !isInLastColumn(index, fields.length) && fields[index+lengthSqrt+1].isBomb())
            counter++;

        //Doł lewo
        if(index % lengthSqrt != 0  && (index + lengthSqrt-1) < fields.length && fields[index+lengthSqrt-1].isBomb())
            counter++;

        //Góra prawo
        if((index - lengthSqrt+1) >= 0 && !isInLastColumn(index, fields.length) && fields[index-lengthSqrt+1].isBomb())
            counter++;

        //Góra lewo
        if((index - lengthSqrt-1) >= 0 && index % lengthSqrt != 0  && fields[index-lengthSqrt-1].isBomb())
            counter++;

        return counter;
    }

    public static boolean isInLastColumn(int index, int length){
        for(int i = (int)Math.sqrt(length)-1; i < length; i += (int)Math.sqrt(length))
            if(index == i)
                return true;
        return false;
    }

}
