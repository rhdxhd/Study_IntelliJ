package fc.java.part2;

public class ApiOverloading {

    public static void main(String[] args) {

        System.out.println(10.5f);
        System.out.println('A');
        System.out.println("APPLE");

        int max = maxValue(7, 9);
        System.out.println("max = " + max);

    }



public static  int maxValue(int a, int b) {
        return (a>b) ? a : b;
}


}
