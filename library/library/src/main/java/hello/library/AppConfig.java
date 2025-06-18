package hello.library;

import hello.library.member.MemberRepository;
import hello.library.member.MemberService;
import hello.library.member.MemberServiceImpl;
import hello.library.member.MemoryMemberRepository;
import hello.library.rental.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public RentalPolicy rentalPolicy() {
        System.out.println("AppConfig.rentalPolicy");
        return new BasicRentalPolicy();
    }

    @Bean
    public MemberService memberService() {
        System.out.println("AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public RentalService rentalService() {
        System.out.println("AppConfig.rentalService");
        return new RentalServiceImpl(rentalPolicy(), memberRepository());
    }
}
