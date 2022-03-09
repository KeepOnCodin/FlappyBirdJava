package flappybird;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {

    private static final long serialVersionUID = 1l;

    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);
    }
}
