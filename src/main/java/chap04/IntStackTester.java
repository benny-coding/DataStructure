package chap04;
import java.util.Scanner;
// int형 스택의 사용 예

public class IntStackTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);      // 최대 64개를 푸시할 수 있는 스택

        while(true){
            System.out.println("현재 데이터 수 : " + s.size() + " / " +
                    s.capacity());
        }
    }
}
