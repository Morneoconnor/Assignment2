import java.util.*;
public class TeamCaptains
{
    private enum captianNames {Faf, Khune, Eben};

    public void TeamCaptianNames()
    {
        Set<captianNames> set = EnumSet.allOf(captianNames.class);
        Iterator<captianNames> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }



}
