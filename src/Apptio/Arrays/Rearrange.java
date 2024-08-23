package Apptio.Arrays;

public class Rearrange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] rearrangedArr = rearrange(arr);

        for (int val : rearrangedArr) {
            System.out.print(val + " ");
        }
    }

    static int[] rearrange(int[] A) {
        int N = A.length;
        int temp[] = A.clone();
        int low = 0, high = N - 1;
        boolean flag = true;

        // Store result in temp[]
        for (int i = 0; i < N; i++) {
            if (flag)
                A[i] = temp[high--];
            else
                A[i] = temp[low++];

            flag = !flag;
        }
        return A;
    }
}


