package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
            char c ='A';
            System.out.println("c = " + c);

            int a = 'A'; // int 타입 = char 타입 형태이지만, char타입은 컴퓨터 내부적으로 자동으로 수치자료로 인식함. A의 아스키 코드값 65가 들어감
            System.out.println("a = " + a);


            int b = 'B' + 1;  //연산 가능. B는 수치형으로 바껴서 연산 가능.
            System.out.println("b = " + b);

            System.out.println("b = " +(char)b);  //67을 강제로 -> 캐릭터형으로 바꾼다. 대문자 C가 나옴



            char han ='가';
            System.out.println("han = " + han);
            int han1='가'; //유니코드 44032
            System.out.println("han1 = " + han1);



            char upper='A'; //65
            char lower=(char)(upper+32); // char는 2바이트 = int는 4바이트 임. upper+32=97 정수형이라서 정수형은 4바이트로 해석됨.
            // 4바이트가 2바이트로 들어갈수없으니까 강제로 2바이트로 형변환해야 하므로 (char)를 붙여줌.
            System.out.println("lower = " + lower);


            char lower1='u'; //117
            int upper1=lower1-32; //85=U

            System.out.println("upper1 = " + upper1); //85
            System.out.println("upper1 = " +(char)upper1); //U







        int data = '1' + '2';
        System.out.println("data = " + data); //99.   문자의 아스키 코드끼리 더해져서 99가 나옴.


        char i = '1';
        char j = '2';
        int sum = (i-48) + (j-48);  // (i-'0') + (j-'0') 이렇게 써도됨
        System.out.println("sum = " + sum); //3



    }
}
