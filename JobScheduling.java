import java.util.Random;

public class JobScheduling {
    public static void main(String[] args) {
        int n = 4; // 작업의 개수 4, 8 , 16 대입
        int m = 2; // 기계의 개수 2 고정
        int[] t = new int[n]; // 수행 시간 (10초이내)
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            t[i] = random.nextInt(10) + 1;
            System.out.printf("%d ", t[i]);
        }
        System.out.println();
        System.out.println("가장 마지막에 완료한 작업 시간");
        System.out.println(schedule(n, m, t));
    }

    public static int schedule(int n, int m, int[] t) {
        int[] L = new int[m];
        // 초기화
        for (int j = 0; j < m; j++) {
            L[j] = 0; // L[j] = 기계에 배정된 마지막 작업의 종료 시간
        }

        // 제일 먼저 끝나는 기계를 찾기
        for (int i = 0; i < n; i++) {
            int min = 0;
            for (int j = 1; j < m; j++) {
                if (L[j] < L[min]) {
                    min = j;
                }
            }
            // 작업 i를 기계 M의 min에 배정
            L[min] = L[min] + t[i];
        }
        // 가장 마지막으로 종료되는 시간 찾기
        int max = L[0];
        for (int i = 1; i < m; i++) {
            if (L[i] > max) {
                max = L[i];
            }
        }
        return max;
    }
}
