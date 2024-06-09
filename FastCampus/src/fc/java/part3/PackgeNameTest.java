package fc.java.part3;


// import java.lang.*; // 자동 생성 및 생략되어있음. default package


import java.util.*;  // 스캐너 포함 유틸리티 기능 쓰고싶을때 임포트하면 됨.
import java.util.Scanner;


import fc.java.model.CarDAO;




public class PackgeNameTest {
    public static void main(String[] args) {

        String str="홍길동";
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World");

        fc.java.model.CarDTO car = new fc.java.model.CarDTO(); //맨위에 임포트 시켜놓으면 이렇게 길게 주소를 안써도 됨.
        //part3라는 같은 디렉토리에 carDTO가 없으므로, 주소를 자세히 써줘야함.


        CarDAO dao = new CarDAO();  // 위에 임포트 시켜서 간단히 씀.

    }
}
