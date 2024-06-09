package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {



    PersonVO vo = new PersonVO();
        System.out.println(vo.getName()+"\t"+vo.getAge());






    PersonVO vo1 = new PersonVO("나길동",60,"010-444-5555");
        System.out.println(vo1.getName()+"\t"+vo1.getAge());

    }
}
