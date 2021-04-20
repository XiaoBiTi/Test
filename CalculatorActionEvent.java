import javax.swing.*;
import java.util.Arrays;

public class CalculatorActionEvent {
    private double result = 0;
    private JButton button;
    private JLabel label;
    private JLabel label1;
    private String temp = "";
    public CalculatorActionEvent(){
        System.out.println("欢迎使用");
    }
    public void CalculatorActionEvent(JButton button,JLabel label,JLabel label1){
        this.button = button;
        this.label = label;
        this.label1 = label1;
    }

    public void ButtonAction() {
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "."};
        Arrays.sort(number);
		
		
        if (Arrays.binarySearch(number, button.getText()) > 0) {
            if (label1.getText() == "0") {
                label1.setText(button.getText());
            } else {
                label1.setText(label1.getText() + button.getText());
            }
        } else {
            if (temp.equals("") && button.getText() != "C" && button.getText() != "CE" && button.getText() != "=" && button.getText() != "Backspace") {
                temp = button.getText();
                label.setText(label1.getText() + button.getText());
                result = Double.parseDouble(label1.getText());
				System.out.println(label1.getText());
                label1.setText("0");
            } else {
				if(temp.equals("+")){
					result += Double.parseDouble(label1.getText());
				}else if(temp.equals("×")){
					result *= Double.parseDouble(label1.getText());
				}else if(temp.equals("-")){
					result -= Double.parseDouble(label1.getText());
				}else if(temp.equals("+/-")){
					result = -Double.parseDouble(label1.getText());
				}else if(temp.equals("÷")){
					result /= Double.parseDouble(label1.getText());
				}else if(temp.equals("x^0.5"))
				
				
				
                switch (temp.equals) {
                    case "+":
                        
                        break;
                    case "×":
                       
						System.out.println(0.0);
                        break;
					case "-":
                        
						
                        break;
                    case "+/-":
                        
						
                        break;
					case "÷":
                        
						
                        break;
                    case "x^0.5":
                        result = Math.pow(Double.parseDouble(label1.getText()),0.5);

                        break;
                    case "x^2":
						result = Math.pow(Double.parseDouble(label1.getText()),2);
						
                        break;
					case "1/x":
						result = 1/Double.parseDouble(label1.getText());
						
                        break;
					case "%":
						result %= Double.parseDouble(label1.getText());
						break;	
					default:
						if(button.getText().equals("=") && temp != ""){
							label.setText(label.getText() + label1.getText());
							label1.setText(String.valueOf(result));
							
							result = 0;
							temp = "=";
						}else{
					
							if(button.getText().equals("CE")){
								label.setText("");
								label1.setText("0");
								result = 0; 
								temp = "CE";
							}else if(button.getText().equals("C")){
								label1.setText("0");
								temp = "C";
							}else if(button.getText().equals("Backspace")){
								label1.setText(label1.getText().substring(0,label1.getText().length()-2));
								temp = "Backspace";
							}else{
								temp = button.getText();
								label.setText(String.valueOf(result));
								label1.setText("0");
							}
						}
					

                }
				
                
            }
        }

    }
}
