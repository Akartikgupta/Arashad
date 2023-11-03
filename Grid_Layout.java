import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
public class Grid_Layout {
    JFrame jf;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    Grid_Layout(){
        jf=new JFrame();
        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        b5=new JButton("Button 5");
        b6=new JButton("Button 6");
        b7=new JButton("Button 7");
        b8=new JButton("Button 8");
        jf.setLayout(new GridLayout(2,4,20,20));
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(b7);
        jf.add(b8);
        jf.setSize(300, 300);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new Grid_Layout();
    }
    
}
