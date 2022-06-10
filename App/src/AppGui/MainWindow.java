package AppGui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private int windowW = 540;
    private int windowH = 680;
    private Calcul fon;



    public MainWindow() {
        
        prepareWindow();

        fon = new Calcul();

        add(fon, BorderLayout.NORTH);


        setVisible(true);
    }

    private void prepareWindow() {
        setSize(windowW, windowH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(true);
    }




}


