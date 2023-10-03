import java.util.*;

public class Main {
    static class Pair<F,S>{
        private F first;
        private S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }
        
        public F getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }                 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n + 1][n + 1];
        ArrayList<Pair<Integer, Integer>> arr = new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n; j++){
                a[i][j] = sc.nextInt();
                if(a[i][j] != 0 && i < j){
                    Pair<Integer, Integer> p = new Pair<>(i, j);
                    arr.add(p);
                }
            }
        }
        for(Pair<Integer, Integer> x : arr){
            System.out.println("(" + x.first + "," + x.second + ")");
        }
    }
}
