package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {

        PersonVO vo = new PersonVO();
        System.out.println(vo.getName());  // 값을 넣은 적은 없지만 생성자 메소드와 동시에 값이 들어가는 초기화가 되서 바로 출력이 가능.



        PersonVO vo1 = new PersonVO(); // 다른 person vo1을 만들었는데
        System.out.println(vo.getName()); // 똑같은 값이 나오는데.. 초기화가 다른 값으로 됐으면 좋겠네?
        //생성자를 여러개 만들 수 있음. 생성자 메소드 오버로딩을 통해서 해결 가능.






    }
}
