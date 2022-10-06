class Solution{
  public:
    int MissingNumber(vector<int>& array, int n) {
        
        int arrCnt = 0;
 
        for(int i = 0; i< array.size(); i++){
            arrCnt += array[i];
        }
        
        int sum = n * (n+1)/2;
        int res = sum - arrCnt;
        return res;
    }
};
