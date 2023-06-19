public class Calculator {
    private double number1;
    private int number2;

    private int number3;

    public Calculator(double number1, int number2, int number3){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public double getNumber1(){
        return this.number1;
    }

    public int getNumber2(){
        return this.number2;
    }

    public int getMultiply(){
        return (int) (this.number2 * this.number3);
    }

    public int getAdd(){
        return (int) (this.number2 + this.number3);
    }

    public int getSubtract(){
        return (int) (this.number3 - this.number2);
    }

    public double getDivide(){
        return (double) (this.number3 / this.number1);
    }



}
