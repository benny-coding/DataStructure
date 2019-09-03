package chap03;

public class SeqSearchFor {
    // 배열 a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형 검색
    static int seqSearch(int[] a, int n, int key){
        // # case1
        for (int i = 0; i < n; i++) {
            if(a[i] == key) {
                return i; // 검색 성공
            }
        }

        // # case2
        for(int i : a){
            if(i == key){
                return i;
            }
        }

        return -1; // 검색 실패
    }

    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5,6,7,8,9,10};
        int n = 10;
        int key = 5;

        for (int i = 0; i < n; i++) {
            if(a[i] == key) {
                System.out.println("성공 : " + i);; // 검색 성공
            }else if(i == n-1){
                System.out.println("없음");
            }

        }

        // # case2
        for(int i : a){
            if(i == key){
                System.out.println("성공 : " + i);; // 검색 성공
            }else if(i == n-1){
                System.out.println("없음");
            }
        }
    }
}
