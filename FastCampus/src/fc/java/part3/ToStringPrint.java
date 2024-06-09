package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {

    public static void main(String[] args) {

        PersonVO vo = new PersonVO("홍길둥",40, "010-223-3333");

        System.out.println(vo.toString());
        System.out.println(vo); //toString()만들어 놓으면 자동적으로 찾기때문에 생략가능.
                                //toString() 안만들어 놓으면 주소값이 나옴.





    }
}
