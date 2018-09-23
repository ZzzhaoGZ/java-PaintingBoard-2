package gz;

import java.awt.*;

public class MyShape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String name;

    public void shape(int x1,int y1,int x2,int y2,String name){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        this.name=name;
    }
    public void draw(Graphics g){//画图方法
        g.drawLine(x1,y1,x2,y2);
    }
}
