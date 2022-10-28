package npw;

import java.awt.Color;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;


public class BlueDot {

    private void PaintTheImage() {
        SPainter Klee = new SPainter("Blue Dot", 600, 600);
        SCircle dot = new SCircle(200);
        Klee.setColor(Color.BLUE);
        Klee.paint(dot);
    }
    public BlueDot() {
        PaintTheImage();
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater((new Runnable() {

            @Override
            public void run() {
                new BlueDot();
            }
        }));
    }
}
