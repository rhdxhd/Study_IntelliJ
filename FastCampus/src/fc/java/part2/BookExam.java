package fc.java.part2;

public class BookExam {
    public static void main(String[] args) {

    int a;
    a=10;


    Book b; // Book이라는 자료형은 같은 src안에 있으므로 자동으로 찾음. 같은 src라서 Book앞에 세부 주소 안쓰고 Book만써도 자동으로 찾음.
    b=new Book();  //b에는 바로 값을 넣을 수 없고, 객체를 생성해서 그 객체를 통째로 b에 넣어야함. b에는 다양한 각기 다른 자료형들의 묶음이라서..
        // 한줄로쓰면 Book b = new Book();
    b.author="박매일";    // b안에 각기 다른 자료형들중에 특정 자료형을 쓸려면 b.으로 지정해서 쓰면됨
    b.price=30000;

    // 객체뒤에는 .을 찍을 수 있음. int a에서 int는 객체가 아니라서 a.은 안됨. 배열은 객체라서 배열변수뒤에는 .을 찍을 수 있음.
    // int[] a = new int[5] -> 여기에서 a는 배열객체라서 a.length를 쓸 수 있음.

    }



}
