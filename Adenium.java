import java.awt.*;
import javax.swing.*;

/** A component that displays a flower. */
public class Adenium extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;

        //String with Functions and colors
        graphics2D.setColor(new Color(245, 157, 99));  // green
        graphics2D.setFont(new Font("Brush Script MT",Font.BOLD,10));
        graphics2D.drawString("Adenium\n  Adeniums are succulent, tropical plants.\n " +
                "and they develop a caudex or a swollen trunk.",50,20);


        // Draw the stem.
        graphics2D.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        graphics2D.setColor(new Color(0, 128, 0));  // green color for stem
        graphics2D.drawLine( adjustX(100),  adjustY(190),  adjustX(100),  adjustY(70));

        // Draw the center.
        graphics2D.setColor(new Color(194, 7, 245));  // orange
        graphics2D.fillOval( adjustX(75),  adjustY(45),  adjustX(50),  adjustY(50));

        //petals with proper positioning
        int petalHeight =  adjustY(20);
        int petalWidth =  adjustX(20);
        graphics2D.setColor(new Color(255, 255, 255));  //white
        graphics2D.fillOval( adjustX(90),  adjustY(35), petalWidth, petalHeight);
        graphics2D.fillOval( adjustX(90),  adjustY(85), petalWidth, petalHeight);
        graphics2D.fillOval( adjustX(64),  adjustY(60), petalWidth, petalHeight);
        graphics2D.fillOval( adjustX(115),  adjustY(60), petalWidth, petalHeight);
        graphics2D.fillOval( adjustX(108),  adjustY(78), petalWidth, petalHeight);
        graphics2D.fillOval( adjustX(108),  adjustY(42), petalWidth, petalHeight);
        graphics2D.fillOval( adjustX(72),  adjustY(78), petalWidth, petalHeight);
        graphics2D.fillOval( adjustX(72),  adjustY(42), petalWidth, petalHeight);



        //Pot of Flower to Test FillPolygon function

        //parameters of fill Polygon i.e points and no of points
        int x[] = {200,250,300,150};
        int y[] = {450,450,300,300};
        int numberofpoints = 4;

        graphics2D.setColor(new Color(153, 84, 38));
        // draw polygon by given set of points
        graphics2D.fillPolygon(x,y,numberofpoints);
    }

    // convert x value from 200 wide screen to actual width
    private int  adjustX(int x) {
        return Math.round(x * getWidth() / 200f);
    }
    // convert y value from 200 wide screen to actual width
    private int  adjustY(int y) {
        return Math.round(y * getHeight() / 200f);
    }

}