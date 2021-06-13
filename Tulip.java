import javax.swing.*;
import java.awt.*;

public class Tulip extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.setColor(new Color(43, 222, 172));  // green
        graphics2D.setFont(new Font("Didot",Font.BOLD,10));
        graphics2D.drawString("Tulip: The flowers are usually large, showy and brightly colored ",50,20);

        // Draw the stem.
        graphics2D.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        graphics2D.setColor(new Color(0, 128, 0));  // green
        graphics2D.drawLine( adjustX(80),  adjustY(190),  adjustX(80),  adjustY(70));


        for (int angle = 0; angle <= 360; angle += 45) {
            graphics2D.rotate(Math.toRadians(angle), 200, 150);
            graphics2D.setColor(new Color(255, 1, 212));
            graphics2D.fillArc(100, 130, 60, 100, 0, 360);
        }

        for (int angle = 0; angle <= 360; angle += 45) {
            graphics2D.rotate(Math.toRadians(angle), 200, 150);
            graphics2D.setColor(new Color(109, 255, 0));
            graphics2D.drawArc(120, 100, 60, 100, 0, 360);
        }


        // Draw the center.
        graphics2D.setColor(new Color(109, 255, 0));
        graphics2D.fillOval( adjustX(65),  adjustY(47),  adjustX(35),  adjustY(35));


        //Pot of Flower to Test FillPolygon function

        //parameters of fill Polygon i.e points and no of points
        int x[] = {175,225,275,125};
        int y[] = {450,450,300,300};
        int numberofpoints = 4;

        graphics2D.setColor(new Color(137, 63, 9));
        // draw polygon by given set of points
        graphics2D.fillPolygon(x,y,numberofpoints);
    }

    /** Converts an x-coordinate from a 200-width screen to the actual width. */
    private int  adjustX(int x) {
        return Math.round(x * getWidth() / 200f);
    }

    /** Converts an y-coordinate from a 200-width screen to the actual width. */
    private int  adjustY(int y) {
        return Math.round(y * getHeight() / 200f);
    }

}
