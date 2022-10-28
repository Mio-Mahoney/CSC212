package npw;

import painter.SPainter;
import shapes.SCircle;
import javax.swing.*;
import java.awt.*;

public class Target {
    private void PaintTheImage() {

        double bigRadius = 200;
        SPainter Klee = new SPainter("Target Logo", 600, 600);
        SCircle outsideRing = new SCircle(bigRadius);
        Klee.setColor(Color.RED);
        Klee.paint(outsideRing);
        Klee.setColor(Color.WHITE);
        SCircle whiteRing = new SCircle(bigRadius * 0.666);
        Klee.paint(whiteRing);
        Klee.setColor(Color.RED);
        SCircle redRing = new SCircle(bigRadius * 0.333);
        Klee.paint(redRing);

    }

    public Target() {
        PaintTheImage();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater((new Runnable() {

            @Override
            public void run() {
                new Target();
            }
        }));
    }
}
