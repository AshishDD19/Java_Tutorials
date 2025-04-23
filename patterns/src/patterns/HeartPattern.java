package patterns;
class HeartPattern
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++){
			for(int j=0;j<=6;j++){
				if((i == 1 && j%3 == 0) || (i == 0 && j%3 != 0) || (i-j == 2) || (i+j == 8)){
					System.out.print("*"+" ");
				}
				else if(i==2 && j==2){
					System.out.print("R"+" ");
				}
				else if(i==2 && j==3){
					System.out.print("C"+" ");
				}
				else if(i==2 && j==4){
					System.out.print("B"+" ");
				}
				else{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		for(int i=5;i>=0;i--){
			for(int j=0;j<=6;j++){
				if((i == 1 && j%3 == 0) || (i == 0 && j%3 != 0) || (i-j == 2) || (i+j == 8)){
					System.out.print("*"+" ");
				}
				else if(i==2 && j==2){
					System.out.print("R"+" ");
				}
				else if(i==2 && j==3){
					System.out.print("C"+" ");
				}
				else if(i==2 && j==4){
					System.out.print("B"+" ");
				}
				else{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
