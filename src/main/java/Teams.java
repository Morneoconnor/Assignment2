import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Teams {

   public List<String> SportsTeams()
   {
       List<String> teams = new ArrayList<String>();
       teams.add(0,"Proteas");
       teams.add(1,"Bafana");
       teams.add(2,"Springboks");

       return teams;
   }
   public List<String> SetFavouriteTeam(String favTeam, List<String> teams)
   {
       List<String> favTeamList = new ArrayList<String>();
       favTeamList = teams;

       if(favTeam.contains("Bafana"))
       {
           String firstTeam = favTeamList.get(0);
           favTeamList.set(0, favTeam);
           favTeamList.set(1, firstTeam);

       }
       else if(favTeam.contains("Springboks"))
       {
           String firstTeam = favTeamList.get(0);
           favTeamList.set(0, favTeam);
           favTeamList.set(2, firstTeam);

       }
       return favTeamList;

   }
   public String GetFavTeam(int favTeam)
   {
       HashMap<Integer , String> teamEmblem = new HashMap<Integer , String>();
       teamEmblem.put(0,"Proteas");
       teamEmblem.put(1,"Bafana");
       teamEmblem.put(2,"Springboks");

       return teamEmblem.get(favTeam);
   }




}
