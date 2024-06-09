package fc.java.part2;

public class TwoDimArrayInit {

    public static void main(String[] args) {


        int[][] a = { {1,2,3,4}, {5,6,7,8} };

        for( int i=0; i< a.length; i++) {
            for( int j=0;j<a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println(); // 줄바꿈
        }



        int[][] b = new int[5][]; //행 개수만 지정
        b[0] = new int[1];
        b[1] = new int[2];
        b[2] = new int[3];
        b[3] = new int[4];
        b[4] = new int[5]; // 여기까지 행과 열의 공간을 만듬. 아래는 이 공간에 별을 넣어봄.
        for(int i=0;i<b.length;i++) {
            for(int j=0; j<b[i].length; j++) {
                b[i][j]='★'; // 별의 아스키코드 값이 들어감. 문자는 수치형 자료임. b가 int[][]형이라서..
                System.out.print((char)b[i][j]+"\t");

            }
            System.out.println(); //줄바꿈

        }




    }

}
