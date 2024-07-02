public class Metro_fetching{

	public static void detail (boolean price ){
			if(price){
			System.out.println("Bhanashankari to BTM is 25rs");	
			}else{
			System.out.println("Display 50rs");	
			}
			
			
		}
		public static void balance_detail (int balance_detail ){
			System.out.println("balance_detail:"+balance_detail);
			int trainticket=25;
			int left_balance=balance_detail-trainticket;
			System.out.println("Remaining_balance_detail:"+left_balance);
			
		}













}