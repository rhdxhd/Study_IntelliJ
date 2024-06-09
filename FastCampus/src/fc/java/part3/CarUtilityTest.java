package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // car정보를 출력하는 동작을 가지고 있는 유틸리티 클래스를 설계하시오
        int carNo = 1;
        String carName = "BMW";

        CarDTO car = new CarDTO();
        car.carNo = carNo;
        car.carName = carName;
        carPrint(car); //아래 메소드를 만들어서 호출함.


        CarUtility carUtil = new CarUtility();
        carUtil.carPrint2(car);  //유틸리티 클래스를 따로 만들어서 메소드를 불러옴

    }








    public static void carPrint(CarDTO car) { //fc.java.CarDTO car

        System.out.println(car.carNo + "\t" + car.carName);

    }




}
