package c_project_to_java_project;

import java.util.Scanner;

public class players_main {
	
	
	public static void main(String[] args) {
		
		players_management manage = new players_management();
		Scanner sc =new Scanner(System.in);
		
		manage.hardcoded();
		while(true) {
			System.out.print("\nEnter your choice ->\n1) Add Player 2) Remove Player 3) Search Player 4) Update Player\n"
					+ "5) Display Player 6) Sort 7) Total players count 8) No Choice\n-> ");
			int choice=sc.nextInt();
			
			if(choice==1) {
				boolean b=manage.add();
				if(b)
					System.out.println("Player is succesfully added"); 
			}
			else if(choice==2) {
				boolean b=manage.remove();
				if(b)
					System.out.println("Player is succesfully remove");
				else
					System.out.println("Not available to remove");
			}
			else if(choice==3) {
				String s=manage.search();
				if(s!=null)
					System.out.println(s);
				else
					System.out.println("Player is not found");
			}
			else if(choice==4) {
				boolean b=manage.update();
				if(b)
					System.out.println("Player is succesfully updated");
				else
					System.out.println("Jersey number is not found to update");
			}
			else if(choice==5) {
				manage.display();	
			}
			else if(choice==6) {
				manage.sort();
			}
			else if(choice==7) {
				System.out.println("Total players stored -> "+manage.count);
			}
			else if(choice==8) {
				break;
			}
			else
				System.out.println("Please select valid choice");
		}
		sc.close();
		
		System.out.println("------------------------------------------------------------------------------------");
	}
}







































//required change
//1) search by name
//2) in sort use different array to sort that data that can real data not change
//3) add today birthday method
