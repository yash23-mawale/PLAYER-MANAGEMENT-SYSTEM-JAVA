package c_project_to_java_project;

public class players {

	private int jersey_num;
	private String name;
	private int runs;
	private int wickets;
	private int match_played;
	
	public players() {
		 
	}
	public players(int jersey_num, String name, int runs, int wickets, int match_played) {
		super();
		this.jersey_num = jersey_num;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.match_played = match_played;
	}
	public int getJersy_num() {
		return jersey_num;
	}
	public void setJersy_num(int jersy_num) {
		this.jersey_num = jersy_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getMatch_played() {
		return match_played;
	}
	public void setMatch_played(int match_played) {
		this.match_played = match_played;
	}

	@Override
	public String toString() {
		return " [jersey_num=" + jersey_num + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets
				+ ", match_played=" + match_played + "]";
	}
	
}
