package fc.java.part2;

public class OverloadingTest {
    public static void main(String[] args) {
        
        float  v = add(36.5f, 56.7f);
        System.out.println("v = " + v);
        
        int vv = add( 10, 50);
        System.out.println("vv = " + vv);
    }
       
    
    
    
    public static int add(int a, int b) {
           int sum = a + b;
           return sum;
        }
        
    public static float add(float a, float b) {
        float sum = a+b;
        return sum;
    }    


    
}
