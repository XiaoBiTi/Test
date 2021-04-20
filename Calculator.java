import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[]  args){
        createAndShowGUI();
    }

    /**
     * åˆ›å»ºå¹¶å±•ç¤ºGUI
     */
    public static void createAndShowGUI(){


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;

        JFrame frame = new JFrame("¼ÆËãÆ÷");
        frame.setBounds((width-320)/2,(height-450)/2,320,450);
        frame.setResizable(false);
        frame.setLayout(null);

        JLabel label = new JLabel("",JLabel.RIGHT);
        label.setFont(new Font(null,0,20));
        label.setForeground(Color.LIGHT_GRAY);
        label.setBounds(0,10,300,20);

        JLabel label1 = new JLabel("0",JLabel.RIGHT);
        label1.setFont(new Font(null,0,50));
        label1.setBounds(0,40,300,50);

        JButton button = new JButton("%");
        button.setFont(new Font(null,0,16));
        button.setBackground(Color.WHITE);
        button.setBounds(1,100,73,50);

        JButton button1 = new JButton("CE");
        button1.setFont(new Font(null,0,16));
        button1.setBackground(Color.WHITE);
        button1.setBounds(76,100,73,50);

        JButton button2 = new JButton("C");
        button2.setFont(new Font(null,0,16));
        button2.setBackground(Color.WHITE);
        button2.setBounds(153,100,73,50);

        JButton button3 = new JButton("Backspace");
        button3.setFont(new Font(null,1,16));
        button3.setBackground(Color.WHITE);
        button3.setBounds(230,100,73,50);

        JButton button4 = new JButton("1/x");
        button4.setFont(new Font(null,0,16));
        button4.setBackground(Color.WHITE);
        button4.setBounds(1,152,73,50);

        JButton button5 = new JButton("x^2");
        button5.setFont(new Font(null,0,16));
        button5.setBackground(Color.WHITE);
        button5.setBounds(76,152,73,50);

        JButton button6 = new JButton("x^0.5");
        button6.setFont(new Font(null,0,16));
        button6.setBackground(Color.WHITE);
        button6.setBounds(153,152,73,50);

        JButton button7 = new JButton("¡Â");
        button7.setFont(new Font(null,0,16));
        button7.setBackground(Color.WHITE);
        button7.setBounds(230,152,73,50);

        JButton button8 = new JButton("7");
        button8.setFont(new Font(null,1,16));
        button8.setBackground(Color.WHITE);
        button8.setBounds(1,204,73,50);

        JButton button9 = new JButton("8");
        button9.setFont(new Font(null,1,16));
        button9.setBackground(Color.WHITE);
        button9.setBounds(76,204,73,50);

        JButton button10 = new JButton("9");
        button10.setFont(new Font(null,1,16));
        button10.setBackground(Color.WHITE);
        button10.setBounds(153,204,73,50);

        JButton button11 = new JButton("¡Á");
        button11.setFont(new Font(null,0,16));
        button11.setBackground(Color.WHITE);
        button11.setBounds(230,204,73,50);

        JButton button12 = new JButton("4");
        button12.setFont(new Font(null,1,16));
        button12.setBackground(Color.WHITE);
        button12.setBounds(1,256,73,50);

        JButton button13 = new JButton("5");
        button13.setFont(new Font(null,1,16));
        button13.setBackground(Color.WHITE);
        button13.setBounds(76,256,73,50);

        JButton button14 = new JButton("6");
        button14.setFont(new Font(null,1,16));
        button14.setBackground(Color.WHITE);
        button14.setBounds(153,256,73,50);

        JButton button15 = new JButton("-");
        button15.setFont(new Font(null,0,16));
        button15.setBackground(Color.WHITE);
        button15.setBounds(230,256,73,50);

        JButton button16 = new JButton("1");
        button16.setFont(new Font(null,1,16));
        button16.setBackground(Color.WHITE);
        button16.setBounds(1,308,73,50);

        JButton button17 = new JButton("2");
        button17.setFont(new Font(null,1,16));
        button17.setBackground(Color.WHITE);
        button17.setBounds(76,308,73,50);

        JButton button18 = new JButton("3");
        button18.setFont(new Font(null,1,16));
        button18.setBackground(Color.WHITE);
        button18.setBounds(153,308,73,50);

        JButton button19 = new JButton("+");
        button19.setFont(new Font(null,0,16));
        button19.setBackground(Color.WHITE);
        button19.setBounds(230,308,73,50);

        JButton button20 = new JButton("+/-");
        button20.setFont(new Font(null,0,16));
        button20.setBackground(Color.WHITE);
        button20.setBounds(1,360,73,50);

        JButton button21 = new JButton("0");
        button21.setFont(new Font(null,1,16));
        button21.setBackground(Color.WHITE);
        button21.setBounds(76,360,73,50);

        JButton button22 = new JButton(".");
        button22.setFont(new Font(null,1,16));
        button22.setBackground(Color.WHITE);
        button22.setBounds(153,360,73,50);

        JButton button23 = new JButton("=");
        button23.setFont(new Font(null,0,16));
        button23.setBackground(Color.WHITE);
        button23.setBounds(230,360,73,50);

        frame.add(label);
        frame.add(label1);
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(button11);
        frame.add(button12);
        frame.add(button13);
        frame.add(button14);
        frame.add(button15);
        frame.add(button16);
        frame.add(button17);
        frame.add(button18);
        frame.add(button19);
        frame.add(button20);
        frame.add(button21);
        frame.add(button22);
        frame.add(button23);
        frame.setVisible(true);

        CalculatorActionEvent calculatorActionEvent = new CalculatorActionEvent();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button1,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button2,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button3,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
        
		button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button4,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });

		button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button5,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button6,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button7,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button8,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button9,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button10,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button11,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button12,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button13,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button14,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button15,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button16,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button17,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button18,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button19,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button20,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button21,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button22,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
		button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorActionEvent.CalculatorActionEvent(button23,label,label1);
                calculatorActionEvent.ButtonAction();
            }
        });
		
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}