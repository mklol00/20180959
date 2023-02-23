public class Member {
    private int memberEnroll;
    private String memberEmail;
    private String memberName;
    private int memberAge;

    public Member(String memberEmail,String memberName,int memberAge){
        super();
        this.memberAge=memberAge;
        this.memberEmail=memberEmail;
        this.memberName=memberName;
    }



    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

}
