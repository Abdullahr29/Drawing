import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private Circle circle;
    private Rect rect;
    private Frame f;

    // The constructor
    public Drawing(){
        circle =  new Circle(new Point(200, 200), new Color(0x992266),50);
        rect = new Rect(new Point(50,50), new Color(0x128947), 20, 30);
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    public void paint(Graphics g){
        circle.draw(g);
        rect.draw(g);
    }


}
