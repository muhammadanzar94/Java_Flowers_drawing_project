import javax.swing.*;
import java.awt.*;

public class Rose extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // paint background

        Graphics2D graphics2D = (Graphics2D) g;

        //String with Functions and colors
        graphics2D.setColor(new Color(217, 47, 255));  // green
        graphics2D.setFont(new Font("Geneva",Font.CENTER_BASELINE,10));
        graphics2D.drawString("Rose\n A rose is a woody perennial\n" +
                " flowering plant of the genus Rosa, in the family\n ",50,20);

        // Draw the stem.
        graphics2D.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        graphics2D.setColor(new Color(0, 128, 0));  // green
        graphics2D.drawLine( adjustX(80),  adjustY(190),  adjustX(80),  adjustY(70));


        for (int angle = 0; angle <= 360; angle += 45) {
            graphics2D.rotate(Math.toRadians(angle), 200, 150);
            graphics2D.setColor(new Color(206, 30, 86));
            graphics2D.fillArc(100, 100, 100, 100, 0, 360);
        }

        for (int angle = 0; angle <= 360; angle += 45) {
            graphics2D.rotate(Math.toRadians(angle), 200, 150);
            graphics2D.setColor(new Color(57, 52, 52));
            graphics2D.drawArc(100, 100, 100, 100, 0, 360);
        }

        //Pot of Flower to Test FillPolygon function

        //parameters of fill Polygon i.e points and no of points
        int x[] = {175,225,275,125};
        int y[] = {450,450,300,300};
        int numberofpoints = 4;

        graphics2D.setColor(new Color(173, 92, 49));
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
