public class Calculator {

    private double first;
    private double second;

    public Calculator(double first, double second){
        this.first = first;
        this.second = second;
    }

    public double add(){
        return this.first + this.second;
    }

    public double subtract(){
        return this.first - this.second;
    }

    public double multiply(){
        return this.first * this.second;
    }

    public double divide(){
        return this.first / this.second;
    }
}
