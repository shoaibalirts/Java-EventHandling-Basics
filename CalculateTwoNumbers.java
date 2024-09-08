// import javax.swing.event.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculateTwoNumbers implements ActionListener{
    int num1, num2;
    JFrame frame;
    JLabel label1, label2, labelAnswer;
    JTextField jtx1, jtx2, jtxAnswer;
    JButton btnPlus, btnMinus;

    public void initGUI(){
        frame=new JFrame();
        Container con = frame.getContentPane();
        label1=new JLabel("First Operand");
        label2=new JLabel("Second Operand");
        labelAnswer=new JLabel("Answer");
        jtx1 = new JTextField(20);
        jtx2 = new JTextField(20);
        jtxAnswer = new JTextField(20);
                
        // Listening to events on text fields
        jtx1.addActionListener(this);
        jtx2.addActionListener(this);
        

        // GUI layout
        con.setLayout(new FlowLayout());

        con.add(label1);
        con.add(jtx1);
        con.add(label2);
        con.add(jtx2);

        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        // Listening to events on plus and minus buttons
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);

        con.add(btnPlus);
        con.add(btnMinus);
        con.add(labelAnswer);
        con.add(jtxAnswer);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    } // end of initGUI

    // constructor
    public CalculateTwoNumbers() {
        initGUI();
    }
    
    public void actionPerformed(ActionEvent e){
        num1 = Integer.parseInt(jtx1.getText());
        num2 = Integer.parseInt(jtx2.getText());
       int output;
        if(e.getSource()==btnPlus){
            output = num1+num2;
            jtxAnswer.setText(output+"");  
        }else if(e.getSource()==btnMinus){
            output = num1-num2;
            jtxAnswer.setText(output+"");  
      
        }
    }
    public static void main(String[] args) {
        CalculateTwoNumbers a = new CalculateTwoNumbers();
    }


}
