public int longestOnes(int[] A, int B) {
          //Your code goes here
		int zero = 0;
		int start = 0;
		int res = 0;
		for(int end=0;end<A.length;end++){
			if(A[end]==0) zero++;
			if(zero>B){
				if(A[start]==0) zero--;
				start++;
			}
			res = Math.max(res,end-start+1);
		}
		return res;
    }
