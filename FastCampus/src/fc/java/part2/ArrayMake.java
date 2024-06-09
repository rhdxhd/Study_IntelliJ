package fc.java.part2;

public class ArrayMake {

    public static void main(String[] args) {


    //Q. [정수 5개]를 저장 할 [배열을 생성]하시요

    int[] a= new int[5];
    a[0]=10;
    System.out.println(a[0]);


    for(int i=0; i < a.length; i++){
        a[i]=10;
        System.out.println(a[i]);
    }



    float[] f = new float[5]; //길이가 고정

    Book b1, b2, b3; // 불연속적인 기억공간에 책 3권 만듬

    BookTest[] b = new BookTest[3];  // 책3권을 만듬. 책을 여러권을 한꺼번에 담는 방법



    }
}
