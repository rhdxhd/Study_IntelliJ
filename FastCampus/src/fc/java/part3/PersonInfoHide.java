package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {


        PersonVO vo = new PersonVO();
        // vo.name="홍길동"; private 이라 접근 안됨
        // vo.age=50;  private 이라 접근 안됨.  이런 경우는 자기자신은 접근이 가능한 this을 활용해야 함.
        // vo.phone="123-123-1234"; private 이라 접근 안됨


    }
}
