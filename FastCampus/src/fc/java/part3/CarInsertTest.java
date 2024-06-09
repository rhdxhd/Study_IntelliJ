package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        //자동차정보를 키보드로 입력받아 DB에 저장하세요.



        Scanner scan = new Scanner(System.in);

        System.out.print("자동자번호:");
        int carNo = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차이름:");
        String carName = scan.nextLine();




        CarDTO car = new CarDTO();
        car.carNo = carNo;
        car.carName = carName;


        // main 아래 따로 메소드를 만드는게 아니라 이렇게 DAO를 활용해서 메소드를 쓸 수 있음.
        CarDAO dao = new CarDAO();
        dao.carInsert(car);

    }
}
