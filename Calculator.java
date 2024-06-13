import javax.swing.*;
import java.awt.*;

public class CalculatorLayout {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for the calculator layout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create a text field for the display
        JTextField display = new JTextField(20);
        display.setEditable(false);
        panel.add(display, BorderLayout.NORTH);

        // Create a panel for the number buttons
        JPanel numberPanel = new JPanel();
        numberPanel.setLayout(new GridLayout(4, 3));
        String[] numbers = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "="};
        for (String number : numbers) {
            JButton button = new JButton(number);
            numberPanel.add(button);
        }
        panel.add(numberPanel, BorderLayout.CENTER);

        // Create a panel for the operator buttons
        JPanel operatorPanel = new JPanel();
        operatorPanel.setLayout(new GridLayout(4, 1));
        String[] operators = {"+", "-", "*", "/"};
        for (String operator : operators) {
            JButton button = new JButton(operator);
            operatorPanel.add(button);
        }
        panel.add(operatorPanel, BorderLayout.EAST);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Set the size of the frame
        frame.setSize(200, 250);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
