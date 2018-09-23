package gz;

import javax.swing.*;
import java.awt.*;

public class eFrame extends JFrame {
    MyShape[] sharr=new MyShape[100];

    public void showUI(){
        this.setTitle("赵港滴画布");
        this.setSize(1000,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setLayout(new FlowLayout()); //流式布局

        eListener listener=new eListener(); //添加监听器

        String[] shapeArr={"直线"};
        for(int i=0;i<shapeArr.length;i++){
            JButton btn=new JButton(shapeArr[i]);
            this.add(btn);
            btn.addActionListener(listener);
        }
        this.addMouseListener(listener);
        this.setVisible(true);
        Graphics g=this.getGraphics();

        listener.setG(g); //监听器收到画布

        listener.setArr(sharr); //监听器收到数组
    }
    public void paint(Graphics g){
        super.paint(g);  //继承父类  使用父类中的方法

        System.out.println("OK");
        for(int i=0;i<sharr.length;i++){
            if(sharr[i]!=null){ //如果有图形
                sharr[i].draw(g); //每个图形对象都调用一次绘图方法
            }
        }
    }
    public static void main(String[] args){
        eFrame ef=new eFrame();
        ef.showUI();
    }
}

















