package AppGui;

import javax.swing.*;
import java.awt.*;

public class Calcul extends JPanel {

    private JPanel Greeting;
    private JPanel EnterArea;
    private JPanel Nums;
    private JButton b0;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton bPlus;
    private JButton bMinus;
    private JButton bDel;
    private JButton bMul;
    private JButton bEquals;


    public Calcul(){

    setLayout(new GridLayout(3,1));
    GreetingText();
    EnterArea();
    Nums();



    add(Greeting);
    add(EnterArea);
    add(Nums);
    }
    public void GreetingText(){
        Greeting = new JPanel();
        Greeting.add(new JLabel("Greeting Text"));
        Greeting.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
    }
    public void EnterArea(){
        EnterArea = new JPanel();
        EnterArea.add(new JTextArea("Enter Area"));
        EnterArea.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
    }
    public void Nums(){
        Nums = new JPanel();
        Nums.setLayout(new GridLayout(4,4));

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bPlus = new JButton("+");
        bMinus = new JButton("-");
        bMul = new JButton("*");
        bDel = new JButton("/");
        bEquals = new JButton("=");

        Nums.add(b0);
        Nums.add(b1);
        Nums.add(b2);
        Nums.add(b3);
        Nums.add(b4);
        Nums.add(b5);
        Nums.add(b6);
        Nums.add(b7);
        Nums.add(b8);
        Nums.add(b9);
        Nums.add(bPlus);
        Nums.add(bMinus);
        Nums.add(bMul);
        Nums.add(bDel);
        Nums.add(bEquals);



    }
}
