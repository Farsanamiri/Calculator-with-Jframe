import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    private String operator = "";
    private double firstnumber = 0.0;
    private double secondnumber = 0.0;
    JFrame frame;
    JTextField textField;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btnp;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btnmult;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btndiv;
    JButton btn0;
    JButton btnpo;
    JButton btnequals;
    JButton btnmin;
    JButton btnclear;
    JButton btndel;


    public void createframe(){
        frame = new JFrame("Calculator");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(false);
        //frame.getContentPane().setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }


    public void createbtn(){
        /*text field*/
        textField = new JTextField();
        textField.setBounds(100, 20, 280, 40); // Adjusted size and position
        frame.add(textField);

        /*Create btn and set the size a location and event of it*/
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btnp = new JButton("+");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btnmult = new JButton("*");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btndiv = new JButton("/");
        btnpo = new JButton(".");
        btn0 = new JButton("0");
        btnequals = new JButton("=");
        btnmin = new JButton("-");
        btnclear = new JButton("C");
        btndel = new JButton("Delete");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btnp.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btnmult.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btndiv.addActionListener(this);
        btnpo.addActionListener(this);
        btn0.addActionListener(this);
        btnequals.addActionListener(this);
        btnmin.addActionListener(this);
        btnclear.addActionListener(this);
        btndel.addActionListener(this);


        btn1.setBounds(50,120,50,50);
        btn2.setBounds(170,120,50,50);
        btn3.setBounds(280,120,50,50);
        btnp.setBounds(390,120,50,50);
        btn4.setBounds(50,180,50,50);
        btn5.setBounds(170,180,50,50);
        btn6.setBounds(280,180,50,50);
        btnmult.setBounds(390,180,50,50);
        btn7.setBounds(50,240,50,50);
        btn8.setBounds(170,240,50,50);
        btn9.setBounds(280,240,50,50);
        btndiv.setBounds(390,240,50,50);
        btnpo.setBounds(50,300,50,50);
        btn0.setBounds(170,300,50,50);
        btnequals.setBounds(280,300,50,50);
        btnmin.setBounds(390,300,50,50);
        btnclear.setBounds(50,360,200,50);
        btndel.setBounds(250,360,200,50);



        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btnp);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btnmult);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btndiv);
        frame.add(btn0);
        frame.add(btnequals);
        frame.add(btnmin);
        frame.add(btnpo);
        frame.add(btnclear);
        frame.add(btndel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1)
        {
            textField.setText(textField.getText().concat("1"));
        }
        else if (e.getSource() == btn2)
        {
         textField.setText(textField.getText().concat("2"));
        }
        else if (e.getSource() == btn3)
        {
            textField.setText(textField.getText().concat("3"));
        }
        else if (e.getSource() == btn4)
        {
            textField.setText(textField.getText().concat("4"));
        }
        else if (e.getSource() == btn5)
        {
            textField.setText(textField.getText().concat("5"));
        }
        else if (e.getSource() == btn6)
        {
            textField.setText(textField.getText().concat("6"));
        }
        else if (e.getSource() == btn7)
        {
            textField.setText(textField.getText().concat("7"));
        }
        else if (e.getSource() == btn8)
        {
            textField.setText(textField.getText().concat("8"));
        }
        else if (e.getSource() == btn9)
        {
            textField.setText(textField.getText().concat("9"));
        }
        else if (e.getSource() == btn0)
        {
            textField.setText(textField.getText().concat("0"));
        }
        else if (e.getSource() == btnpo)
        {
            textField.setText(textField.getText().concat("."));
        }
        else if (e.getSource() == btnp)
        {
            operator = "+";
            firstnumber = Double.parseDouble(textField.getText());
            textField.setText("");
        }
        else if (e.getSource() == btnmin)
        {
            operator = "-";
            firstnumber = Double.parseDouble(textField.getText());
            textField.setText("");
        }
        else if (e.getSource() == btnmult)
        {
            operator = "*";
            firstnumber = Double.parseDouble(textField.getText());
            textField.setText("");
        }
        else if (e.getSource() == btndiv)
        {
            operator = "/";
            firstnumber = Double.parseDouble(textField.getText());
            textField.setText("");
        }
        else if (e.getSource() == btnequals)
        {
            secondnumber = Double.parseDouble(textField.getText());
            textField.setText("");
            double result = 0.0;
            switch (operator){
                case "+":
                    result = firstnumber + secondnumber;
                    break;
                case "-":
                    result = firstnumber - secondnumber;
                    break;
                case "*":
                    result = firstnumber * secondnumber;
                    break;
                case "/":
                    result = firstnumber / secondnumber;
                    break;
            }
            textField.setText(String.valueOf(result));
        }
        else if (e.getSource() == btndel)
        {
            String content = textField.getText();
            textField.setText("");
            for (int i = 0; i < content.length()-1; i++)
            {
                textField.setText(textField.getText()+content.charAt(i));
            }
        }
        else if (e.getSource() == btnclear)
        {
            textField.setText("");
            operator = "";
        }
    }
}
