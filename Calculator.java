import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Calculator extends JFrame {
    private JButton Num0;
    private JButton Num1;
    private JButton Num2;
    private JButton Num3;
    private JButton Num4;
    private JButton Num5;
    private JButton Num6;
    private JButton Num7;
    private JButton Num8;
    private JButton Num9;
    private JButton Add;
    private JButton Sub;
    private JButton Mult;
    private JButton Div;
    private JButton Answer;
    private JButton Clear;
    private double TEMP;
    private double SolveTEMP;
    private JTextField jtfResult;

    Boolean addBool = false;
    Boolean subBool = false;
    Boolean divBool = false;
    Boolean mulBool = false;

    String display = "";

    public Calculator() {

        JPanel pane1 = new JPanel();
        pane1.setLayout(new GridLayout(4, 3));
        pane1.add(Num1 = new JButton("1"));
        pane1.add(Num2 = new JButton("2"));
        pane1.add(Num3 = new JButton("3"));
        pane1.add(Num4 = new JButton("4"));
        pane1.add(Num5 = new JButton("5"));
        pane1.add(Num6 = new JButton("6"));
        pane1.add(Num7 = new JButton("7"));
        pane1.add(Num8 = new JButton("8"));
        pane1.add(Num9 = new JButton("9"));
        pane1.add(Num0 = new JButton("0"));
        pane1.add(Clear = new JButton("C"));

        JPanel pane2 = new JPanel();
        pane2.setLayout(new FlowLayout());
        pane2.add(jtfResult = new JTextField(20));
        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
        jtfResult.setEditable(false);

        JPanel pane3 = new JPanel();
        pane3.setLayout(new GridLayout(5, 1));
        pane3.add(Add = new JButton("+"));
        pane3.add(Sub = new JButton("-"));
        pane3.add(Mult = new JButton("*"));
        pane3.add(Div = new JButton("/"));
        pane3.add(Answer = new JButton("="));

        JPanel pane = new JPanel();
        pane.setLayout(new GridLayout());
        pane.add(pane2, BorderLayout.NORTH);
        pane.add(pane1, BorderLayout.SOUTH);
        pane.add(pane3, BorderLayout.EAST);

        add(pane);

        Num1.addActionListener(new ListenToOne());
        Num2.addActionListener(new ListenToTwo());
        Num3.addActionListener(new ListenToThree());
        Num4.addActionListener(new ListenToFour());
        Num5.addActionListener(new ListenToFive());
        Num6.addActionListener(new ListenToSix());
        Num7.addActionListener(new ListenToSeven());
        Num8.addActionListener(new ListenToEight());
        Num9.addActionListener(new ListenToNine());
        Num0.addActionListener(new ListenToZero());

        Add.addActionListener(new ListenToAdd());
        Sub.addActionListener(new ListenToSubtract());
        Mult.addActionListener(new ListenToMultiply());
        Div.addActionListener(new ListenToDivide());
        Answer.addActionListener(new ListenToSolve());
        Clear.addActionListener(new ListenToClear());
    }

    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText("");
            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;

            TEMP = 0;
            SolveTEMP = 0;
        }
    }

    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "0");
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            addBool = true;
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            subBool = true;
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            mulBool = true;
        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            divBool = true;
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SolveTEMP = Double.parseDouble(jtfResult.getText());
            if (addBool == true)
                SolveTEMP = SolveTEMP + TEMP;
            else if ( subBool == true)
                SolveTEMP = SolveTEMP - TEMP;
            else if ( mulBool == true)
                SolveTEMP = SolveTEMP * TEMP;
            else if ( divBool == true)
                SolveTEMP = SolveTEMP / TEMP;
            jtfResult.setText(  Double.toString(SolveTEMP));

            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Gui windown will exit when x is pressed
        calc.setVisible(true); //GUI window will show
    }

}
