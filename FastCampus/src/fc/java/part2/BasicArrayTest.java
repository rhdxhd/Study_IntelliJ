package fc.java.part2;

public class BasicArrayTest {

    public static void main(String[] args) {

        float[] f = {24.5f, 45.6f, 77.65f};


        Book[] b = new Book[3]; // 1.객체배열 : 배열하나하나에 (실수형 같은 기본데이터가 아닌) 객체가 들어감.

        b[0] = new Book(); // 2.각자의 객체 만듬. 책1권
        b[0].price=30000;
        b[0].title="자바";


        b[1] = new Book(); // 2.각자의 객체 만듬. 책2권
        b[1].title="자바1";

        b[2] = new Book(); // 2.각자의 객체 만듬. 책3권
        System.out.println(b[0].title +" "+ b[1].title + " " + b[2].title);



        for(int i=0;i<b.length;i++){
            System.out.println(b[i].title);
        }






    }



}
