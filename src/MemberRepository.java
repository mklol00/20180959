import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private List<Member> members = new ArrayList<>();



//
//    public void add(Member memberName,Member memberEmail,Member memberAge) {
//        members.add(memberName);
//        members.add(memberEmail);
//        members.add(memberAge);
//        System.out.println(members);
//
//    }

    public void add(Member member) {
        members.add(member);

    }
}
