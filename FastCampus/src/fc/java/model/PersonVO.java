package fc.java.model;

public class PersonVO {

    private String name;


    private int age; // 정보 은닉


    private String phone;


    // 생성자 따로 안쓰면, 생략된 생성자 메소드가 있다 => 기본생성자(default Constructor). 객체를 생성 할 수 있게 해줌.
    // 생성자 메소드가 없을때만 디폴트 생성자가 만들어지는거고, 오버로딩된 생성자 메소드를 하나를 내가 만들게되면 디폴트 생성자는 자동으로 만들어주지 않음.
    // 그래서 오버로딩된 생성자 메소드도 쓰고, 기본생성자 메소드도 쓰고 싶으면 명시적으로 기본생성자 메소드도 직접 써줘야함.
    // 오버로딩된 생성자를 쓰면, 기본생성자는(디폴트생성자) 자동으로 만들어주지 않음.


    public PersonVO() {
        // 객체를 생성하는 코드는 내부에서 만들어진다. 이 PersonVO가 가지고 있는 멤버들을 메모리에다가 올리는 역할(값을 저장안했으면 초기화는 안함).

        // 객체 초기화 코드를 넣어놓으면, 객체 생성하면서 멤버를 메모리에 올리는 동시에 값을 넣는 초기화도 가능.(값 저장 가능)
        this.name = "홍길동";
        this.age = 50;
        this.phone = "010-111-1111";
    }


    //생성자 메소드 오버로딩. 매개변수 받음
    public PersonVO(String name, int age, String phone) {
        this.name=name;
        this.age=age;
        this.phone=phone;

    }














    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone=phone;
    }




    public String getName() {
        return name; // this.name
    }

    public int getAge() {
        return age; // this.age
    }

    public  String getPhone() {
        return phone; // this.phone
    }






    public String toString(){
        return name + "\t" + age + "\t" + phone;
    }


}