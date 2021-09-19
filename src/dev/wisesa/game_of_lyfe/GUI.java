package dev.wisesa.game_of_lyfe;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    GUI() {
        super("Game Of Life");
        final int DIMENSION = 800;
        Grid grid = new Grid(DIMENSION, 40, 0.06, 60);
        add(grid);
        setSize(DIMENSION, DIMENSION);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
