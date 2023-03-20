//Vikel Cunningham
package mypackage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

public class CalculatorFrame {

    CalculatorFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(250, 300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);

        JPanel numberPanel = new JPanel();
        numberPanel.setPreferredSize(new Dimension(250, 180));
        //numberPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        numberPanel.setLayout(new GridLayout(4,4, 10,10));
        

        JTextArea input = new JTextArea();
        input.setPreferredSize(new Dimension(0, 20));
        input.setAlignmentX(45);


        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton button_div = new JButton("/");
        JButton button_mul = new JButton("*");
        JButton button_min = new JButton("-");
        JButton button_add = new JButton("+");
        JButton button_dec = new JButton(".");
        JButton button_equ = new JButton("=");

        numberPanel.add(button7);
        numberPanel.add(button8);
        numberPanel.add(button9);
        numberPanel.add(button_div);

        numberPanel.add(button4);
        numberPanel.add(button5);
        numberPanel.add(button6);
        numberPanel.add(button_mul);

        numberPanel.add(button1);
        numberPanel.add(button2);
        numberPanel.add(button3);
        numberPanel.add(button_min);

        numberPanel.add(button0);
        numberPanel.add(button_dec);
        numberPanel.add(button_equ);
        numberPanel.add(button_add);

        frame.add(numberPanel, "Center");
        frame.add(input, "North");
        frame.pack();

        frame.setVisible(true);
    }

}
