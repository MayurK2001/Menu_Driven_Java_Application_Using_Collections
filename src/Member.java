import java.util.List;

public class Member {
    private final int memberId;
    private final String memberName;
    private final List<String> memberAddress;

    public Member(int memberId, String memberName, List<String> memberAddress) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
    }
    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public List<String> getMemberAddress() {
        return memberAddress;
    }

    @Override
    public String toString() {
        return "Member id = "+ getMemberId()+", member name = "+getMemberName()+", address = "+getMemberAddress();
    }
}
