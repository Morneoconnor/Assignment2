import java.util.List;

public interface ITeams {
    List<String> DisplaySportsTeams();
    List<String> SetFavouriteTeam(String favTeam, List<String> teams);
    String GetFavTeam(int favTeam);
}
