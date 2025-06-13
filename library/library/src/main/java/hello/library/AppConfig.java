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

//@Configuration
public class AppConfig {

//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
//
//    @Bean
//    public RentalPolicy rentalPolicy() {
//        return new BasicRentalPolicy();
//    }
//
//    @Bean
//    public MemberService memberService() {
//        return new MemberServiceImpl(memberRepository());
//    }
//
//    @Bean
//    public RentalService rentalService() {
//        return new RentalServiceImpl(rentalPolicy(), memberRepository());
//    }
}
