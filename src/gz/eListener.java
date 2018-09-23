package gz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class eListener implements MouseListener, ActionListener {
    private int x1,x2,y1,y2;
    String shapeType="";
    Graphics g;
    MyShape[] sharr;
    int count=0;

    public void setG(Graphics g){
        //传画布
        this.g=g;
    }
    public void setArr(MyShape[] arr){
        //传数组
        sharr=arr;
    }
    @Override
    public void mouseClicked(MouseEvent e){
        // TODO Auto-generated method stub
    }
    @Override
    public void mousePressed(MouseEvent e){
        x1=e.getX();
        y1=e.getY();
    }
    @Override
    public void mouseReleased(MouseEvent e){
        x2=e.getX();
        y2=e.getY();
        if("直线".equals(shapeType)){
            //g.drawLine(x1, y1, x2, y2);

            //创建图形对象
            MyShape sh=new MyShape();
            sh.shape(x1,y1,x2,y2,shapeType);
            sh.draw(g);
            if(count<99)
                sharr[count++]=sh;
        }
    }
    @Override
    public void mouseEntered(MouseEvent e){

    }
    @Override
    public void mouseExited(MouseEvent e){

    }
    @Override
    public void actionPerformed(ActionEvent e){
        //获取动作的事件动作命令
        String action=e.getActionCommand();
        shapeType=action;
    }
}
