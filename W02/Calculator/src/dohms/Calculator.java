package dohms;

public class Calculator {
    private float result;

    public Calculator(){
        result = 0.0f;
    }

    public void add (float value){
        result += value;
    }

    public void subtract (float value){
        result -= value;
    }
    public void multiply(float value){
        result *= value;
    }

    public void divide(float value) {
        // Division by zero always equals zero
        if (value == 0){
            result = 0.0f;
        } else{
            result /= value;
        }
    }

    public void reset(){
        result = 0.0f;
    }

    public float getResult()
    {
        return result;
    }
}
