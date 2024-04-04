import java.util.Arrays;

public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
       
        int k = 0;
        for (int i = 0; i < m; i++) {
            if (X[i] != 0) {
                X[k++] = X[i];
            }
        }
        
      
        int i = 0, j = 0;
        while (i < k && j < n) {
            if (X[i] < Y[j]) {
                X[i++] = X[i];
            } else {
                X[i++] = Y[j++];
            }
        }
        
        
        while (j < n) {
            X[i++] = Y[j++];
        }
        
       
        Arrays.sort(X, 0, k);
    }
    
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        mergeArrays(X, Y);
        
       
        System.out.println(Arrays.toString(X));
    }
}
