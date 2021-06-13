//This class will draw
//Sunflower using fillOval and rotate functions

import javax.swing.*;
import java.awt.*;
public class Sunflower extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // paint background


        Graphics2D graphics2D = (Graphics2D) g;

        //String with Functions and colors
        graphics2D.setColor(new Color(22, 71, 58));  // green
        graphics2D.setFont(new Font("Monaco",Font.CENTER_BASELINE,10));
        graphics2D.drawString("Sunflower"+
                " ornamentals for their spectacular size and flower heads and\n" +
                " for their edible seeds.",10,20);


        // Draw the stem.
        graphics2D.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        graphics2D.setColor(new Color(0, 128, 0));  // green
        graphics2D.drawLine( adjustX(80),  adjustY(190),  adjustX(80),  adjustY(70));


        //Drawing Petals by rotating ovals
        for (int angle = 0; angle <= 360; angle += 45) {
            graphics2D.rotate(Math.toRadians(angle), 200, 150);
            graphics2D.setColor(new Color(248, 255, 0, 255));  // yellow
            graphics2D.fillArc(130,100,200,90, 0, 360);
        }


        // Drawing black center.
        graphics2D.setColor(new Color(0, 0, 0));  // black
        graphics2D.fillOval( adjustX(55),  adjustY(40),  adjustX(50),  adjustY(50));


        //Pot of Flower to Test FillPolygon function

        //parameters of fill Polygon i.e points and no of points
        int x[] = {175,225,275,125};
        int y[] = {450,450,300,300};
        int numberofpoints = 4;

        graphics2D.setColor(new Color(226, 136, 70));
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