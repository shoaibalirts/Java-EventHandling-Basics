import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class ActionEventTest implements ActionListener{
    JFrame frame;
    JButton bHello;
    JTextField nameInput;
    JLabel nameLabel;
    public void initGUI(){
        frame = new JFrame();
        // event generator
        bHello = new JButton("Hello");

        nameInput = new JTextField();
        nameLabel = new JLabel("Name");
        Container con = frame.getContentPane();
        Panel p = new Panel();
        p.setLayout(new GridLayout(1,2,2,2));
        p.add(nameLabel);
        p.add(nameInput);
        con.setLayout(new BorderLayout());
        con.add(p, BorderLayout.NORTH);
        con.add(bHello, BorderLayout.SOUTH);

        frame.setSize(500,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // event registration
        bHello.addActionListener(this);

    } // end of initGUI

    
    // constructor
    ActionEventTest(){
        initGUI();
    }
    // ActionListener is an abstrat class which has functions e.g. ActionPerformed
    // we have to give definition to ActionPerformed, otherwise ActionEventTest 
    // will also become an abstract class
    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(null,"Hello is pressed");
    }

    public static void main(String[] args) {
        ActionEventTest a = new ActionEventTest();
    }
}