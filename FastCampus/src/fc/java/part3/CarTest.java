package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("자동자번호:");
        int carNo = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차이름:");
        String carName = scan.nextLine();

        // System.out.println(carNo + "\t" + carName); 직접 출력
        // carInfoPrint(carNo, carName);  메소드로 출력하는 방법

        // fc.java.model.CarDTO car = new fc.java.model.CarDTO(); //다른패키지에 있으면 자세히 소속을 써줘야함. 매번쓰기 귀찮으면 import시켜주면됨
        CarDTO car = new CarDTO();
        car.carNo = carNo;
        car.carName = carName;

        carInfoPrint2(car); //carDTO를 매개변수로 넣어서 메소드호출해서 출력
    }


    public static void carInfoPrint(int carNo, String carName){ // 매개변수 개수만큼 일일이 적어넣어야하는 불편함.
                                                                // 해결법:DTO활용
        System.out.println(carNo + "\t" + carName);
    }


    public static void carInfoPrint2(CarDTO car) {
        System.out.println(car.carNo + "\t" + car.carName);
    }



}
