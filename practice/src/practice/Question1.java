package practice;

public class Question1 {
	
	static float findMax(float arr[]) {
		float max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static float sum(float arr[]) {
		float sum = 0.0f;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float arr[] = {1.2f,0.5f,2.3f,1.8f};
		System.out.println("("+sum(arr)+","+findMax(arr)+")");
		
	}

}
