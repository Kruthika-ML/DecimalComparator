public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.175,3.176);
        areEqualByThreeDecimalPlaces(3.0,3.0);
        areEqualByThreeDecimalPlaces(-3.123,3.123);
    }

    public static void areEqualByThreeDecimalPlaces(double int1, double int2){
        if(int1 == int2){
            System.out.println("The numbers are equal");
        }else {
            System.out.println("The numbers are Not equal");
        }
    }
}
