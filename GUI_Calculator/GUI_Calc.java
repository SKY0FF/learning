package GUI_Calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Calc extends JFrame{
    private JTextField input = new JTextField("", 5);
    private JButton butt_0 = new JButton("0");
    private JButton butt_1 = new JButton("1");
    private JButton butt_2 = new JButton("2");
    private JButton butt_3 = new JButton("3");
    private JButton butt_4 = new JButton("4");
    private JButton butt_5 = new JButton("5");
    private JButton butt_6 = new JButton("6");
    private JButton butt_7 = new JButton("7");
    private JButton butt_8 = new JButton("8");
    private JButton butt_9 = new JButton("9");
    private JButton butt_per = new JButton("%");
    private JButton butt_div = new JButton("÷");
    private JButton butt_mul = new JButton("×");
    private JButton butt_min = new JButton("-");
    private JButton butt_plus = new JButton("+");
    private JButton butt_comma = new JButton(",");
    private JButton butt_eq = new JButton("=");

    public GUI_Calc(){
        super("Калькулятор");
        this.setBounds(900, 130, 300, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 4;
        container.add(input, constraints);

        constraints.gridy = 1;
        constraints.gridwidth = 1;
        container.add(butt_per, constraints);
        constraints.gridx = 1;
        container.add(butt_div, constraints);
        constraints.gridx = 2;
        container.add(butt_mul, constraints);
        constraints.gridx = 3;
        container.add(butt_min, constraints);

        constraints.gridy = 2;
        constraints.gridx = 0;
        container.add(butt_7, constraints);
        constraints.gridx = 1;
        container.add(butt_8, constraints);
        constraints.gridx = 2;
        container.add(butt_9, constraints);

        constraints.gridy = 3;
        constraints.gridx = 0;
        container.add(butt_4, constraints);
        constraints.gridx = 1;
        container.add(butt_5, constraints);
        constraints.gridx = 2;
        container.add(butt_6, constraints);
        constraints.gridx = 3;
        constraints.gridy = 2;
        constraints.gridheight = 2;
        container.add(butt_plus, constraints);

        constraints.gridheight = 1;
        constraints.gridy = 4;
        constraints.gridx = 0;
        container.add(butt_1, constraints);
        constraints.gridx = 1;
        container.add(butt_2, constraints);
        constraints.gridx = 2;
        container.add(butt_3, constraints);

        constraints.gridheight = 1;
        constraints.gridwidth = 2;
        constraints.gridy = 5;
        constraints.gridx = 0;
        container.add(butt_0, constraints);
        constraints.gridx = 2;
        constraints.gridwidth = 1;
        container.add(butt_comma, constraints);
        constraints.gridx = 3;
        constraints.gridheight = 2;
        container.add(butt_eq, constraints);
    }
}
