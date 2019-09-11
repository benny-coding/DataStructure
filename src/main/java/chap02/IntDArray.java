package chap02;

public class IntDArray {
    public static void main(String[] args) {
        int[][] x = new int[2][4];      // 2차원 배열을 선언

        x[0][1] = 37;           //x[0][1]에 37을 대입한다.
        x[0][3] = 54;           //x[0][3]에 54을 대입한다.
        x[1][2] = 65;           //x[1][2]에 65을 대입한다.

        for(int i = 0; i < 2; i++){  // 각 요소의 값을 출력
            for(int j = 0; j < 4; j++){
                System.out.println("x[" + i + "][" + j +"] = " + x[i][j]);
            }
        }
    }
}
