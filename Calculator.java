public class Calculator {
        private double result;
        public double add(double num1, double num2){
            return num1 + num2;
        }
        public double subtract(double num1, double num2){
            return num1 - num2;
        }
        public double multiply(double num1, double num2){
            return num1 * num2;
        }
        public double divide(double num1, double num2){
            try{
                result = num1 / num2;
            }
            catch (ArithmeticException e){
                System.out.println("Cant divide by 0 dumbass.");
            }
            return result;
        }
        public double percent(double num){
            return num / 100;
        }
        public double negate(double num){
            return num * -1;
        }

    }
    

