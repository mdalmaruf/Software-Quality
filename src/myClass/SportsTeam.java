package myClass;

import java.util.ArrayList;

public class SportsTeam {
	public static ArrayList<Player> players = new ArrayList<Player>(20);
	public static double total_perf = 0;

	public SportsTeam(ArrayList<Player> players) {
		this.players = players;
	}

	public void addPlayer(Player plr) {
		this.players.add(plr);
	}

	public static double getTeamPerformance() {
		if (players.size() < 5 || players.size() > 11) {
			return 0;
		} else {
			total_perf = 0;
			for (int i = 0; i < players.size(); i++) {
				if (players.get(i).performance < 0.0 || players.get(i).performance > 10.0) {
					return 0;
				}
				total_perf = total_perf + players.get(i).performance;
			}
		}

		return total_perf / (players.size());
	}

	public static void main(String[] args) {

		double average_perf;
		// TODO Auto-generated method stub
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		Player p5 = new Player();

		p1.setName("Player1");
		p1.setPerformance(10);

		p2.setName("Player2");
		p2.setPerformance(10);

		p3.setName("Player3");
		p3.setPerformance(10);

		p4.setName("Player4");
		p4.setPerformance(10);

		p5.setName("Player5");
		p5.setPerformance(10);

		SportsTeam s1 = new SportsTeam(players);
		s1.addPlayer(p1);
		s1.addPlayer(p2);
		s1.addPlayer(p3);
		s1.addPlayer(p4);
		s1.addPlayer(p5);

		average_perf = s1.getTeamPerformance();
		System.out.println(average_perf);

	}

}
