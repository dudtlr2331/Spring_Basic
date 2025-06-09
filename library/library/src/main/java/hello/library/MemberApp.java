package hello.library;

import hello.library.member.*;

public class MemberApp {
    public static void main(String[] args) {
//        MemberRepository memberRepository = new MemoryMemberRepository();
//        MemberService memberService = new MemberServiceImpl(memberRepository);
//        MemberService memberService = new MemberServiceImpl();

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "Alice", Grade.VIP);
        memberService.join(member);

        Member member1 = memberService.findMember(member.getId());
        System.out.println("member1 = " + member1.toString());
    }
}
