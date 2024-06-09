package fc.java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {

        int count = 0;

        for(int i =1; i<=10; i++) {
            if(i%3 == 0) count++;
        }
        System.out.println(count);  // 3개




        count = 0;
        for(int i=1; i<=10; i++) {
            if (i % 3 != 0) continue; // 3의 배수가 아니면 아래 count++ 부분은 실행이 안되고 다음 반복문으로 넘어감.
            count++;
        }
        System.out.println(count);

    }
}
