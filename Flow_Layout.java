import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
public class Flow_Layout {
    JFrame jf;
    Flow_Layout(){
        jf=new JFrame();
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");
        JButton b5=new JButton("Button 5");
        JButton b6=new JButton("Button 6");
        JButton b7=new JButton("Button 7");
        JButton b8=new JButton("Button 8");
        jf.setLayout(new FlowLayout(FlowLayout.CENTER));
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
        new Flow_Layout();
    }
}
