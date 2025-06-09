package hello.library;

import hello.library.member.*;
import hello.library.rental.Rental;
import hello.library.rental.RentalService;
import hello.library.rental.RentalServiceImpl;
import hello.library.rental.VipRentalPolicy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryApp {
    public static void main(String[] args) {
//        MemberService memberService = new MemberServiceImpl();
//        RentalService rentalService = new RentalServiceImpl();

//        MemberService memberService = new MemberServiceImpl();
//        RentalService rentalService = new RentalServiceImpl(new VipRentalPolicy(), new MemoryMemberRepository());

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        RentalService rentalService = appConfig.rentalService();

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);
        RentalService rentalService = ac.getBean(RentalService.class);

        Member member = new Member(1L, "Alice", Grade.VIP);
        memberService.join(member);

        Rental rental = rentalService.rentBook(1L, "Effective Java");
        System.out.println("rental = " + rental.toString());
    }
}
