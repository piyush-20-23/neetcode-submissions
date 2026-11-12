class Solution {
    public boolean isValidSudoku(char[][] board) {

        int n = board.length;
        
        boolean[] count;

        // row check 
        
        for(int i = 0; i < n; i ++){
            count = new boolean[n + 1];
            for(int j = 0; j < n; j ++){
                if(board[i][j] > '0' && board[i][j] <= '9'){
                    if(count[board[i][j] - '0']){
                        return false;
                    }
                    count[board[i][j] - '0'] = true;
                }
            }
        }
        
        // column check 
        
        for(int i = 0; i < n; i ++){
            count = new boolean[n + 1];
            for(int j = 0; j < n; j ++){
                if(board[j][i] > '0' && board[j][i] <= '9'){
                    if(count[board[j][i] - '0']){
                        return false;
                    }
                    count[board[j][i] - '0'] = true;
                }
            }
        }

        // grid check 
        for(int i = 0; i < n; i += 3){
            for(int j = 0; j < n; j += 3){
                count = new boolean[n + 1];
                //System.out.println("Refresh count");
                for(int k = i; k < i + 3; k ++){
                    for(int l = j; l < j + 3; l ++){
                        if(board[k][l] > '0' && board[k][l] <= '9'){
                            if(count[board[k][l] - '0']){
                                return false;
                            }
                            count[board[k][l] - '0'] = true;
                        }

                        //System.out.println(k + " " + l);
                    }
                }

            }
        }

        return true;


    }
}
