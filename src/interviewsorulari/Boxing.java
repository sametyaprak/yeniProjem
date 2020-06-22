package interviewsorulari;

public class Boxing {
	
	public static void main(String[] args) {
		
		int startPlayer = (int)(Math.random()*2);
		
		int player1 = 0;
		int player2 = 1;
		int result = (int)(Math.random()*10);
		int win = (int)(Math.random()*10);		
		int turn =0;
		int punch=0;
		if (player1==startPlayer) {
			System.out.println("number one has started..!!");
			turn++;
			do { 					
				result = (int)(Math.random()*10)/10;
				win = (int)(Math.random()*10);
				turn++;
				System.out.println("number " + ((turn%2)+1) + " hits");
				punch++;
			}	while	(result<win);
		}else if (player2==startPlayer) {
			System.out.println("number two has started..!!");
			
			do { 	 				
				result = (int)(Math.random()*10)/10;
				win = (int)(Math.random()*10);
				turn++;
				System.out.println("number " + ((turn%2)+1) + " hits");
				punch++;
			}	while	(result<win);	
		}
		if (turn%2==0) {
			System.out.println((punch) + ". turn....number 1 wins...!!!!");
		} else {
		System.out.println(punch + ". turn....number 2 wins....!!!!");
		}
		
			}	
		} 
	
		

