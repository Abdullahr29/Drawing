import java.awt.*;

public class Rect {
    private Point pos;
    private Color col;
    private int height;
    private int width;

    public Rect(Point initPos, Color col, int h, int w){
        pos = initPos;
        this.col = col;
        height = h;
        width = w;
    }

    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x, pos.y, width, height);
    }

}
