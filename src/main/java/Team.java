import java.util.ArrayList;
import java.util.List;

public class Team {
  private String mName;
  private static List<Team> instances = new ArrayList<Team>();
  private int mId;
  private List<Member> myMembers;

  public Team(String name){
    mName = name;
    instances.add(this);
    mId = instances.size();
    myMembers = new ArrayList<Member>();
  }

  public String getName() {
    return mName;
  }

  public static List<Team> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId(){
    return mId;
  }

  public static Team find(int id) {
    return instances.get(id - 1);
  }

  public List<Member> getMembers() {
    return myMembers;
  }

  public void addMembers(Member member) {
    myMembers.add(member);
  }
}
