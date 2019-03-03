import java.util.*;
public class TeamCaptains implements ITeamCaptains
{
    private enum captianNames {Faf, Khune, Eben};

    public void GetCaptianNames()
    {
        Set<captianNames> set = EnumSet.allOf(captianNames.class);
        Iterator<captianNames> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }



}
