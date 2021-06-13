import javax.swing.*;
import java.awt.*;

/** A component that displays a flower. */
public class Driver {
    static void DrawRose(){
        JFrame frame = new JFrame("Rose");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel rose = new Rose();
        rose.setBackground(Color.white);

        frame.add(rose);
        frame.setVisible(true);
    }
    static void DrawSunflower(){
        JFrame frame = new JFrame("Sunflower");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel Sunflower = new Sunflower();
        Sunflower.setBackground(Color.white);

        frame.add(Sunflower);
        frame.setVisible(true);
    }
    static void DrawAdenium(){
        JFrame frame = new JFrame("Adenium");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel Adenium = new Adenium();
        Adenium.setBackground(Color.white);

        frame.add(Adenium);
        frame.setVisible(true);
    }
    static void DrawTulip(){
        JFrame frame = new JFrame("Tulip");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel Tulip = new Tulip();
        Tulip.setBackground(Color.white);

        frame.add(Tulip);
        frame.setVisible(true);
    }


// main function that calls a flower function
    public static void main(String[] args) {
        DrawTulip();
//        DrawAdenium();
//        DrawRose();
//        DrawSunflower();
    }

}
