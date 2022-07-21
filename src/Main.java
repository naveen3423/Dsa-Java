import Claculator.Calculator;

public class Main extends Calculator{
    public static void main(String args[]){

        Main cal = new Main();
        try {
            cal.divide(10, 0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
