package chap02;
import java.util.Random;
import java.util.Scanner;
// 배열 요소의 최댓값을 나타냅니다(값을 난수로 생성).

public class MaxOfArrayRand {
    // 배열 a의 최댓값을 구하여 반환합니다.
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length ; i++) {
            max = (max < a[i]) ? a[i] : max;

        }
        return max;
    }

    public static void main(String args[]){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");

        int peopleCount = rand.nextInt(100);
        System.out.println(" 사람의 수 : " + peopleCount);

        int[] height = new int[peopleCount];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < height.length ; i++) {
            height[i] = 150 + rand.nextInt(40);
            System.out.println("height[" + i + "] : " + height[i]);

        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다. ");
    }

}
