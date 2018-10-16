package ch3;

public class EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rsum=0, tsum=0;
		int[][] num = {{2,3,13},{4,5,14},{6,7,15},{8,9,16},{10,11,17}};
		
		for(int[] i:num){
			for(int j:i){
				rsum+=j;
				System.out.print(j+"\t");
			}
			System.out.print("행의합:" + rsum);
			System.out.println();
			tsum += rsum;
			rsum=0;
		}
		System.out.print("배열의 합 : "+tsum);
	}

}
