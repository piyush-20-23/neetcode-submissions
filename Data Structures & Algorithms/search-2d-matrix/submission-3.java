class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // approach 1 - fill in a 1d array with matrix values
        // int m = matrix.length;
        // int n = matrix[0].length;

        // int[] arr = new int[n * m];

        // for(int i = 0; i < m; i ++){
        //     for(int j = 0; j < n; j ++){
        //         arr[j + n*i] = matrix[i][j];
        //     }
        // }

        // System.out.println(Arrays.toString(arr));

        // // binary search 
        // int l = 0;
        // int h = arr.length - 1;

        // while(l <= h){
        //     int mid = l + (h - l)/2;

        //     if(arr[mid] == target){
        //         return true;
        //     }
        //     else if (arr[mid] > target){
        //         h = mid - 1;
        //     }
        //     else{
        //         l = mid + 1;
        //     }
        // }

        // return false;


        // Approach 2 - Use binary search directly on matrix
        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0;
        int h = m * n - 1;

        while(l <= h){
            int mid = l + (h - l)/2;

            int x = mid / n;
            int y = mid % n;

            //System.out.println(mid + " " + x + " " + y);

            if(x >= m || y >= n) return false;

            if(matrix[x][y] == target){
                return true;
            }
            else if(matrix[x][y] > target){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }

        return false;
    }
}
