package chap03;
import java.util.Scanner;
// 이진 검색

class BinSearch {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
    static int binSearch(int a[], int n, int key){
        int pl = 0;         // pl은 처음 인덱스를 나타내며
        int pr = n -1;      // pr은 마지막 인덱스를 나타낸다.

        do {
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
            if(a[pc] == key){
                return pc;      // 검색 성공!
            } else if(a[pc] < key){
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt( );
        int[] x = new int[num];      // 요솟수가 num인 배열

        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0] : ");    // 첫 요소 입력
        x[0] = stdIn.nextInt();

        for(int i = 1; i < num; i++){
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);      // 바로 앞의 요소보다 작으면 다시 입력
        }
        System.out.print("검색할 값 : ");   // 키 값을 입력
        int searchKey = stdIn.nextInt();

        int idx = binSearch(x, num, searchKey); // 배열 x에서 키 값이 searchKey인 요소를 검색

        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(searchKey + "은(는) x[" + idx + "]에 있습니다.");
        }
    }
}