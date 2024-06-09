package fc.java.model;

public class MovieVO {

    private String title;
    private int day;
    private float time;

    //디폴트 생성자
    public MovieVO() {
    }

    //생성자 오버로딩
    public MovieVO(String title, int day, float time) {
        this.title = title;
        this.day = day;
        this.time = time;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", day=" + day +
                ", time=" + time +
                '}';
    }




}
