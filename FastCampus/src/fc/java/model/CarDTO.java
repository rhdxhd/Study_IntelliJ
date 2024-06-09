package fc.java.model;

public class CarDTO {//하나의 바구니 역할 // public을 지우면 다른데서 이 클래스를 사용못함. 접근못함.

    public int carNo;
    public String carName;

    int carSn;  // public 없으면 밖에서 접근할 수 없음. 접근제한자를 앞에 쓰지않으면 자동으로 default가 생략되어 있음.
                // 같은 패키지 안에서만 서로 참조가 가능함.

}
