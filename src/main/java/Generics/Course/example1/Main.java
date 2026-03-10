package Generics.Course.example1;

interface Player{

    String name();
}

record BaseballPlayer(String name,String position) implements Player{}

record FootballPlayer(String name,String position) implements Player{}

record VolleyballPlayer(String name,String position) implements Player{}

public class Main {
    static void main() {
//        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Philies");
//        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
//        scoreResult(phillies1,3,astros1,5);

//        BaseballPlayer harper = new BaseballPlayer("B Harper","Right Fielder");
//        BaseballPlayer marsh = new BaseballPlayer("B Marsh","Right Fielder");

//        phillies.addTeamMember(harper);
//        phillies.addTeamMember(marsh);
//        phillies.listTeamMembers();



//        SportsTeam phillies = new SportsTeam("Philadelphia Philies");
//        SportsTeam astros = new SportsTeam("Houston Astros");
//        scoreResult(phillies,3,astros,5);
//
//        SportsTeam afc = new SportsTeam("Adelaide Crows");
//        FootballPlayer text = new FootballPlayer("Tex Walker","Center half forward");
//        afc.addTeamMember(text);
//
//
//        BaseballPlayer gurthie = new BaseballPlayer("D Guthrie","Center Fielder"); // Ne bi smijo ići u nogometni tim
//        afc.addTeamMember(gurthie);
//        afc.listTeamMembers();

//
//       Team<BaseballPlayer> phillies = new Team<>("Philadelphia Philies");
//       Team<BaseballPlayer> astros = new Team<>("Houston Astros");
//       scoreResult(phillies,3,astros,5);
//
//        Team<FootballPlayer> afc = new Team<>("Adelaide Crows");
        //BaseballPlayer gurthie = new BaseballPlayer("D Guthrie","Center Fielder"); // Ne bi smijo ići u nogometni tim
         //afc.addTeamMember(gurthie); // kompajelr ne dopušta da dodamo BaseballPlayera

//
//        Team<String> adelien = new Team<>("Adeline Storm"); // String ne implementira Player
//        adelien.addTeamMember("N Roberts");
//        adelien.listTeamMembers();
//
//        Team<VolleyballPlayer> adelien = new Team<>("Adeline Storm"); // String ne implementira Player
//        VolleyballPlayer vb = new VolleyballPlayer("B Black","Opposite");
//        adelien.addTeamMember(vb);
//        adelien.listTeamMembers();
//


    }
    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score){

        String meesage = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,meesage,team2);
    }
    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score){

        String meesage = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,meesage,team2);
    }
    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score){

        String meesage = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,meesage,team2);
    }
}
