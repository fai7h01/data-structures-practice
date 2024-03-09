public class BigOSingleLoop {
    public static void main(String[] args) {

        int numberOfOperations = 0;
        int n = 1000; //size of data
        int m = 500;
        long startTime;
        long endTime;
        System.out.println("Input size n is = " + n);

        //Task 1: Single Loop...................O(n)
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations+=1;
        }
        endTime = System.currentTimeMillis();

        //Task 1: End.............................
        System.out.println("Number of operations in single loop: " + numberOfOperations + " in " + (endTime-startTime) + " milliseconds O(n)");

        numberOfOperations = 0;
        //Task 2: Nested Loops..................
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numberOfOperations += 1;
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations with nested loops: " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds O(n*n)");
        // Task 2: End.......................
//----------------------------------------------------------------------------------------
        // Task 3: Triple Nested Loops................
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations += 1;
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with triple nested loops: " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds O(n*n*n)");
        // Task 3: End................
//---------------------------------------------------------------------------------------------
        // Task 4: N and M Nested loops....................
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numberOfOperations+=1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println( "Nested Loop (n* m) Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds O(n*m)");
        // Task 4: End...........................
//---------------------------------------------------------------------------------------------
        // Task 4.1: N and M Consecutive Loops...........
        numberOfOperations = 0;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations+=1;
        }
        for (int i = 0; i < m; i++) {
            numberOfOperations+=1;
        }
        endTime = System.currentTimeMillis();
        System.out.println( "Consecutive Loops Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds O(n+m)");
        // Task 4.1:  End.........
//---------------------------------------------------------------------------------------------
        // Task 5: Logarithmic Complexity
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 1; i < n; i*=2) {
            numberOfOperations+=1;
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations (logarithmic complexity): " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds O(logn)");
        // Task 5: End.................
    }
}
