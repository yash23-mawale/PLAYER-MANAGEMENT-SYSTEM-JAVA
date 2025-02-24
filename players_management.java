package c_project_to_java_project;
import java.util.Scanner;

public class players_management {
	
	int count = 0;
	private players[] p_arr=new players[100];
	Scanner sc = new Scanner(System.in);
	
	public void hardcoded() {
		
		p_arr[0] =new players(18, "virat_kohli", 8500, 12, 250);
		p_arr[1] =new players(17, "AB de Villiers", 9577, 5, 228);
		p_arr[2] =new players(99, "Chris Gayle", 10480, 167, 301);
		p_arr[3] =new players(20, "Kane Williamson", 6550, 37, 161);
		p_arr[4] =new players(56, "Ben Stokes", 3150, 74, 105);
		count=5;
	}
	
	public void display() {
		
		for(int i=0;i<count;i++) {
			//In these call if we write as p_arr[i] then automatically toString method is call.
			System.out.println(p_arr[i]);
		}
	}
	
	public int index_find(int jn) {	
		for(int i=0;i<count;i++) {
			if(jn==p_arr[i].getJersy_num()) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean add() {
		
		while(true) {
		System.out.println("Enter Jersey Num -> ");
		int jn=sc.nextInt();
		int index=index_find(jn);
		
		if(index<0) {
			System.out.println("Jersey num is available, Please enter following details -> ");
			sc.nextLine();
			
			System.out.println("Enter Name -> ");
			String name=sc.nextLine();
			System.out.println("Enter Runs -> ");
			int runs=sc.nextInt();
			System.out.println("Enter Wickets -> ");
			int wickets=sc.nextInt();
			System.out.println("Enter Match Played -> ");
			int mp=sc.nextInt();
		
			p_arr[count]=new players(jn,name,runs,wickets,mp);
			count++;
			return true;
			}
		System.out.println("Not available please choose again !");
		}
		
	}
	
	public boolean remove() {
		
		System.out.println("Enter jersey num to check its available to remove or not -> ");
		int jn=sc.nextInt();
		
			int index=index_find(jn);
			
			if(index>=0) {
			for(int j=index;j<count-1;j++) {
					p_arr[j]=p_arr[j+1];
				}
				count--;
				return true;
			}
			else
				return false;
		}
	
	public boolean update() {
		System.out.println("Enter jersey num to check its available to update or not -> ");
		int jn=sc.nextInt();
		
			int index=index_find(jn);
			if(index>=0) {
			
				while(true) {
				System.out.println("Enter your choice->\n1) Update runs 2) Update wickets\n"
						+ "3) Update Match_Played 4) Data Update complete\n-> ");
				int choice=sc.nextInt();
				if(choice==1) {
				System.out.println("Enter Runs -> ");
				int runs=sc.nextInt();
				p_arr[index].setRuns(runs);
					}
				else if(choice==2) {
				System.out.println("Enter Wickets -> ");
				int wickets=sc.nextInt();
				p_arr[index].setWickets(wickets);
					}
				else if(choice==3) {
				System.out.println("Enter Match Played -> ");
				int mp=sc.nextInt();
				p_arr[index].setMatch_played(mp);
				}
				else if(choice==4)
					break;
				else
					System.out.println("Choose proper option !");
				}
				return true;
			}
			else
				return false;
	}
	
	
	public String search() {
		System.out.println("Enter jersey number to search : ");
		int jn = sc.nextInt();
		
		int index=index_find(jn);
		
		if(index>=0)
			return p_arr[index].toString();
		else
			return null;
	}
	
	public void sort() {
		
		System.out.println("Enter your choice ->\n1) Max runs 2) Min runs\n3) Max wickets 4) Min wickets\n-> ");
		int choice=sc.nextInt();
		players temp;
		if(choice==1) {
			for(int i=0;i<count-1;i++) {
					for(int j=0;j<count-1;j++) {
						if(p_arr[j].getRuns()<p_arr[j+1].getRuns()) {
							temp=p_arr[j];
							p_arr[j]=p_arr[j+1];
							p_arr[j+1]=temp;
						}
					}
			}
			display();
		}
		else if(choice==2) {
			for(int i=0;i<count-1;i++) {
					for(int j=0;j<count-1;j++) {
						if(p_arr[j].getRuns()>p_arr[j+1].getRuns()) {
							temp=p_arr[j];
							p_arr[j]=p_arr[j+1];
							p_arr[j+1]=temp;
						}
					}
			}
			display();
		}
		else if(choice==3) {
			for(int i=0;i<count-1;i++) {
					for(int j=0;j<count-1;j++) {
						if(p_arr[j].getWickets()<p_arr[j+1].getWickets()) {
							temp=p_arr[j];
							p_arr[j]=p_arr[j+1];
							p_arr[j+1]=temp;
						}
					}
			}
			display();
		}
		else if(choice==4) {
			for(int i=0;i<count-1;i++) {
					for(int j=0;j<count-1;j++) {
						if(p_arr[j].getWickets()>p_arr[j+1].getWickets()) {
							temp=p_arr[j];
							p_arr[j]=p_arr[j+1];
							p_arr[j+1]=temp;
						}
					}
			}
			display();
		}
		else
			System.out.println("Please enter the valid choice");
	}
}
	
	

























