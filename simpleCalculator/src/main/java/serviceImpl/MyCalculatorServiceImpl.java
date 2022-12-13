package serviceImpl;


public class MyCalculatorServiceImpl implements MyCalculatorService{

    @Override
    public int add(int[] data) {
        int sum = 0;
        for(int num:data) {
            sum +=num;
        }
        return sum;
    }

    @Override
    public int subract(int num1, int num2) {

        return num1-num2;
    }

    @Override
    public int multiply(int[] data) {
        int prod = 0;
        for(int num:data) {
            prod = prod*num;
        }
        return prod;
    }


}

