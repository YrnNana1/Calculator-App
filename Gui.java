import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Gui extends JPanel {

        private Window window;
        private Calculator calculator;

        private Button one;
        private Button two;
        private Button three;
        private Button four;
        private Button five;
        private Button six;
        private Button seven;
        private Button eight;
        private Button nine;
        private Button zero;
        private Button equals;
        private Button add;
        private Button subtract;
        private Button multiply;
        private Button divide;
        private Button negative;
        private Button percent;
        private Button clear;
        private Button decimal;
        
        
        //private static final double DISPLAY_FACTOR = 1.5;
        private static final int MARGIN = 12;
        private static final int TEXT_HEIGHT = 25;

        private TextField displayField;

        public Gui(){

                window = new JFrame("Calculator"); // Initialize JFrame
                //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                window.setSize(400,500);

                displayField = new TextField();
                displayField.setBounds(MARGIN, MARGIN, window.getWidth() - 2 * MARGIN, TEXT_HEIGHT);
                window.add(displayField);

                one = new Button("1");
                two = new Button("2");
                three = new Button("3");
                four = new Button("4");
                five = new Button("5");
                six = new Button("6");
                seven = new Button("7");
                eight = new Button("8");
                nine = new Button("9");
                zero = new Button("0");
                equals = new Button("=");
                add = new Button("+");
                subtract = new Button("-");
                multiply = new Button("x");
                divide = new Button("/");
                negative = new Button("+/-");
                percent = new Button("%");
                clear = new Button("C");
                decimal = new Button(".");

                int buttonWidth = (int) (window.getWidth() / 4.0) - MARGIN;
                int buttonHeight = (int) (window.getHeight() / 6.0) - MARGIN;
                

                int rowHeight = window.getHeight() / 6;
                int colWidth = window.getWidth() / 4;

                one.setBounds(MARGIN, 2 * rowHeight, buttonWidth, buttonHeight);
                two.setBounds(colWidth + MARGIN, 2 * rowHeight, buttonWidth, buttonHeight);
                three.setBounds(2 * colWidth + MARGIN, 2 * rowHeight, buttonWidth, buttonHeight);
                four.setBounds(MARGIN, 3 * rowHeight, buttonWidth, buttonHeight);
                five.setBounds(colWidth + MARGIN, 3 * rowHeight, buttonWidth, buttonHeight);
                six.setBounds(2 * colWidth + MARGIN, 3 * rowHeight, buttonWidth, buttonHeight);
                seven.setBounds(MARGIN, 4 * rowHeight, buttonWidth, buttonHeight);
                eight.setBounds(colWidth + MARGIN, 4 * rowHeight, buttonWidth, buttonHeight);
                nine.setBounds(2 * colWidth + MARGIN, 4 * rowHeight, buttonWidth, buttonHeight);
                zero.setBounds(colWidth + MARGIN, 5 * rowHeight, buttonWidth, buttonHeight);
                equals.setBounds(2 * colWidth + MARGIN, 5 * rowHeight, buttonWidth, buttonHeight);

                add.setBounds(3 * colWidth + MARGIN, 3 * rowHeight, buttonWidth, buttonHeight);
                subtract.setBounds(3 * colWidth + MARGIN, 4 * rowHeight, buttonWidth, buttonHeight);
                multiply.setBounds(3 * colWidth + MARGIN, 2 * rowHeight, buttonWidth, buttonHeight);
                divide.setBounds(3 * colWidth + MARGIN, rowHeight, buttonWidth, buttonHeight);

                equals.setBounds(3 * colWidth + MARGIN, 5 * rowHeight, buttonWidth, buttonHeight);
                clear.setBounds(MARGIN, rowHeight, buttonWidth, buttonHeight);
                negative.setBounds(colWidth + MARGIN, rowHeight, buttonWidth, buttonHeight);
                percent.setBounds(2 * colWidth + MARGIN, rowHeight, buttonWidth, buttonHeight);
                decimal.setBounds(2 * colWidth + MARGIN, 5 * rowHeight, buttonWidth, buttonHeight);

                window.setLayout(null);
                window.setVisible(true);

                window.add(one);
                one.addActionListener(e -> clickedOne());

                window.add(two);
                two.addActionListener(e -> clickedTwo());

                window.add(three);
                three.addActionListener(e -> clickedThree());

                window.add(four);
                four.addActionListener(e -> clickedFour());

                window.add(five);
                five.addActionListener(e -> clickedFive());

                window.add(six);
                six.addActionListener(e -> clickedSix());

                window.add(seven);
                seven.addActionListener(e -> clickedSeven());

                window.add(eight);
                eight.addActionListener(e -> clickedEight());

                window.add(nine);
                nine.addActionListener(e -> clickedNine());

                window.add(zero);
                zero.addActionListener(e -> clickedZero());

                window.add(equals);
                equals.addActionListener(e -> clickedEquals());

                window.add(add);
                add.addActionListener(e -> clickedAdd());

                window.add(subtract);
                subtract.addActionListener(e -> clickedSubtract());

                window.add(multiply);
                multiply.addActionListener(e -> clickedMultiply());

                window.add(divide);
                divide.addActionListener(e -> clickedDivide());

                window.add(negative);
                negative.addActionListener(e -> clickedNegative());

                window.add(percent);
                percent.addActionListener(e -> clickedPercent());

                window.add(clear);
                clear.addActionListener(e -> clickedClear());

                window.add(decimal);
                decimal.addActionListener(e -> clickedDecimal());



        }

        public void clickedOne(){
                String currentText = displayField.getText();
                displayField.setText(currentText + "1");

        }
        
        public void clickedTwo(){
                String currentText = displayField.getText();
                displayField.setText(currentText + "2");
        }

        public void clickedThree(){
                String currentText = displayField.getText();
                displayField.setText(currentText + "3");
        }

        public void clickedFour(){
                String currentText = displayField.getText();
                displayField.setText(currentText + "4");
        }

        public void clickedFive(){
                String currentText = displayField.getText();
                displayField.setText(currentText + "5");
        }

        public void clickedSix(){
                String currentText = displayField.getText();
                displayField.setText(currentText + "6");
        }

        public void clickedSeven(){
                String currentText = displayField.getText();
                displayField.setText(currentText + "7");
        }

        public void clickedEight(){
                String currentText = displayField.getText();
                displayField.setText(currentText + "8");
        }

        public void clickedNine(){
                String currentText = displayField.getText();
                displayField.setText(currentText + "9");
        }

        public void clickedZero(){
                String currentText = displayField.getText();
                displayField.setText(currentText + "0");
        }

        public void clickedAdd(){
                String currentText = displayField.getText().trim();
                
                if (!currentText.contains("+")) {
                    displayField.setText(currentText + "+");
                }
        }

        public void clickedSubtract(){
                String currentText = displayField.getText().trim();
                
                if (!currentText.contains("-")) {
                    displayField.setText(currentText + "-");
                }
        }

        public void clickedMultiply(){
                String currentText = displayField.getText().trim();
                
                if (!currentText.contains("*")) {
                    displayField.setText(currentText + "*");
                }
        }

        public void clickedDivide(){
                String currentText = displayField.getText().trim();
                
                if (!currentText.contains("/")) {
                    displayField.setText(currentText + "/");
                }
        }

        public void clickedNegative() {
                String currentText = displayField.getText().trim();
                
                if (!currentText.isEmpty()) {
                    try {
                        double number = Double.parseDouble(currentText);
                        number = -number;
                        displayField.setText(String.valueOf(number));
                    } catch (NumberFormatException e) {
                        displayField.setText("Invalid Input");
                    }
                }
            }

            public void clickedDecimal() {
                String currentText = displayField.getText().trim();
                
                if (!currentText.contains(".")) {
                    displayField.setText(currentText + ".");
                }
            }

        public void clickedPercent() {
                // Assuming there's a displayField named "displayField" to show the numbers/input
                String currentText = displayField.getText(); // Get the current text from the display
                if (!currentText.isEmpty()) {
                    try {
                        // Replace comma (,) with dot (.) for handling different decimal separators
                        currentText = currentText.replace(',', '.');
                        
                        double number = Double.parseDouble(currentText); // Convert the text to a number
                        double percent = number / 100.0; // Convert the number to a decimal percent
                        displayField.setText(String.valueOf(percent)); // Display the percent in the display field
                    } catch (NumberFormatException e) {
                        // Handle the case where the text cannot be converted to a number
                        displayField.setText("Invalid Input");
                    }
                }
            }
        
        public void clickedClear(){
                displayField.setText("");
        }

        public void clickedEquals(){
                calculate();
        }

        private void calculate() {
                String expression = displayField.getText().trim();
                String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");
            
                if (tokens.length == 3) {
                    try {
                        double num1 = Double.parseDouble(tokens[0]);
                        double num2 = Double.parseDouble(tokens[2]);
                        String operand = tokens[1];
            
                        double result = 0;
            
                        switch (operand) {
                            case "+":
                                result = num1 + num2;
                                break;
                            case "-":
                                result = num1 - num2;
                                break;
                            case "*":
                                result = num1 * num2;
                                break;
                            case "/":
                                if (num2 != 0) {
                                    result = num1 / num2;
                                } else {
                                    displayField.setText("Cannot divide by zero");
                                    return;
                                }
                                break;
                            default:
                                displayField.setText("Invalid Operation");
                                return;
                        }
            
                        // Print the result before setting it to the display field
                        System.out.println("Result: " + result);
            
                        displayField.setText(String.valueOf(result));
            
                    } catch (NumberFormatException e) {
                        displayField.setText("Invalid Input");
                    }
                } else {
                    displayField.setText("Invalid Expression");
                }
            }

            public static void main(String[] args) {

                Gui gui = new Gui();
                gui.window.setVisible(true);
        }

}
