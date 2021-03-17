import java.util.Scanner;
public class TrafficDes {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int choice;
			String colour;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Choice");
			 System.out.println("1.Red");
			 System.out.println("2.Green");
			 System.out.println("3.Yellow");
			 choice= sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 colour="Stop";
				 System.out.println("Please Stop");
				 break;
			 case 2:
				 colour="Green";
				 System.out.println("Please Go");
				 break;
			 case 3:
				 colour="Yellow";
				 System.out.println("Please Be Ready");
				 break;
			 }
			
	     
		}
}

