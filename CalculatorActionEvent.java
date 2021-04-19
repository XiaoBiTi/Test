import javax.swing.*;
import java.util.Arrays;

public class CalculatorActionEvent {
    private boolean first = true;
    private long result = 0;
    private JButton button;
    private JLabel label;
    private JLabel label1;
    private String temp;
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
            if (first) {
                temp = button.getText();
                label.setText(label1.getText() + button.getText());
                result = Long.parseLong(label1.getText());
                label1.setText("0");
                first = false;
            } else {
                switch (temp) {
                    case "+":
                        result += Long.parseLong(label1.getText());
                        break;
                    case "×":
                        result *= Long.parseLong(label1.getText());
                        break;
                    case "":
                        break;

                }
                temp = button.getText();
                label.setText(String.valueOf(result));
                label1.setText("0");
            }
        }

    }
}
