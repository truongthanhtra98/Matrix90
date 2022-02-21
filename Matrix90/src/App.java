
class Matrix90 {

    static int N = 5;

    // Rotate the matrix 90 degree
    static void rotate90Matrix(int a[][]) {

        // 1 ck
        for (int i = 0; i < N / 2; i++) {
            for (int j = i; j < N - i - 1; j++) {

                // Swap elements

                int temp = a[i][j];
                a[i][j] = a[N - 1 - j][i];
                a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
                a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
                a[j][N - 1 - i] = temp;
            }
        }
    }

    // Print matrix
    static void printMatrix(int arr[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(arr[i][j] + " ");
                //enter
                System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 6, 7, 8, 9, 10 },
                { 2, 3, 4, 5, 6 },
                { 11, 12, 13, 14, 15 },
                { 20, 21, 22, 23, 24 },
                { 30, 31, 32, 33, 34, 35 } };
        rotate90Matrix(arr);
        System.out.println("Result :");
        printMatrix(arr);
    }
}
