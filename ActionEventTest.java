import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ActionEventTest implements ActionListener{
    JFrame frame;
    JButton bHello;


    public void initGUI(){
        frame = new JFrame();
        // event generator
        bHello = new JButton("Hello");
        Container con = frame.getContentPane();
        con.add(bHello);
        frame.setSize(200,200);
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