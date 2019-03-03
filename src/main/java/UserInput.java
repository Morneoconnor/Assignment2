import java.util.*;

public class UserInput implements IUserInput
{
    Scanner input = new Scanner(System.in);

    public void InputOutPutMehtod()
    {
        ITeams teams = new Teams();
        ITeamCaptains captains = new TeamCaptains();

        System.out.println("Select your favourite South African sports  enter the number 0 - 2");
        List<String> teamList = teams.DisplaySportsTeams();

        System.out.println(teamList);
        int selectedVal = input.nextInt();

        String favTeam = teams.GetFavTeam(selectedVal);
        List<String>sortedList = teams.SetFavouriteTeam(favTeam, teamList);

        System.out.println("Your facourite team will now display at the top of the list");
        System.out.println(sortedList);

        System.out.println("See the names who captian the south african national sides");
        captains.GetCaptianNames();
        input.next();

    }



}
