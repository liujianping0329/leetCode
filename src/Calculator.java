public class Calculator{
    public Calculator(){}
    /*
  This is an Abacus that is used to slide beads around and do math.
  It was created by Laura in 2019.
  */
    public int add(int a,int b){
        return a+b;
    }

    public int substrat(int a,int b){
        return a-b;
    }

    public int mutiply(int a,int b){
        return a*b;
    }

    public int divide(int a,int b){
        return a/b;
    }

    public int modulo(int a,int b){
        return a%b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.substrat(45,11));

    }

}