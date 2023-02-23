import java.util.Scanner;

public class FitnessCenterMemberManagingProgram {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        MemberRepository memberRepository = new MemberRepository();


        while (true) {
            System.out.println("원하시는 번호를 입력해주세요.");
            System.out.println("1. 회원 등록");
            int memberEnroll = scanner.nextInt();


            System.out.println("이메일을 입력해주세요.");
            String memberEmail = scanner.next();

            System.out.println("이름을 입력해주세요.");
            String memberName = scanner.next();

            System.out.println("나이를 입력해주세요.");
            int memberAge = scanner.nextInt();

            System.out.println("회원 등록이 성공적으로 완료되었습니다.");



            System.out.println("이름: " + memberName + " , 이메일: " + memberEmail + " , 나이: " + memberAge );



        }
    }
}

