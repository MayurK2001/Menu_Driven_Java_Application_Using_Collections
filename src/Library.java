import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Member> memberList = new ArrayList<>();
    public void addMember(Member member){
        memberList.add(member);
    }
    public List<Member> viewAllMembers(){
        return new ArrayList<>(memberList);
    }
    public List<Member> viewMembersByAddress(String address){
        ArrayList<Member> ans = new ArrayList<>();
        for(Member m: memberList){
            if(m.getMemberAddress().contains(address)) ans.add(m);
        }
        return ans;
    }
}
