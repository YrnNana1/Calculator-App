public class Calculator {

        /**
         * Adds two numbers and returns the result.
         * @param num1 The first number.
         * @param num2 The second number.
         * @return The sum of num1 and num2.
         */
        public double add(double num1, double num2){
            return num1 + num2;
        }

        /**
         * Subtracts the first number from the second number and returns the result.
         * @param num1 The first number.
         * @param num2 The second number.
         * @return The result of subtracting num2 from num1.
         */
        public double subtract(double num1, double num2){
            return num1 - num2;
        }

        /**
         * Multiplies two numbers and returns the result.
         * @param num1 The first number.
         * @param num2 The second number.
         * @return The product of num1 and num2.
         */
        public double multiply(double num1, double num2){
            return num1 * num2;
        }

        /**
         * Calculates the percentage of a number.
         * @param num The number for which the percentage is calculated.
         * @return The percentage value of the given number.
         */
        public double percent(double num){
            return num / 100;
        }

        /**
         * Negates the number.
         * @param num The number to be negated.
         * @return The negated value of the given number.
         */
        public double negate(double num){
            return num * -1;
        }
        
    }
    

