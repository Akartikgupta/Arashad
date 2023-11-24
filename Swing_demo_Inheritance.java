import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Swing_demo_Inheritance extends JFrame{
    JButton b1;
    JTextField jf;
    Swing_demo_Inheritance(){
        setSize(300,300);
        setVisible(true);
        b1=new JButton("Click");
        jf=new JTextField("Hello");
        b1.setBounds(10, 30, 95, 30);
        jf.setBounds(150,50,150,30);
        add(b1);
        add(jf);
        setLayout(null);
    }
    public static void main(String[] args) {
        new Swing_demo_Inheritance();
    }
}
