package hello.library.rental;

import hello.library.member.Member;
import hello.library.member.MemberRepository;
import hello.library.member.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class RentalServiceImpl implements RentalService {
//    private final RentalPolicy rentalPolicy = new BasicRentalPolicy();
//    private final MemberRepository memberRepository = new MemoryMemberRepository();

    private final RentalPolicy rentalPolicy;
    private final MemberRepository memberRepository;

    @Autowired
    public RentalServiceImpl(RentalPolicy rentalPolicy, MemberRepository memberRepository) {
        this.rentalPolicy = rentalPolicy;
        this.memberRepository = memberRepository;
    }

    @Override
    public Rental rentBook(Long memberId, String bookTitle) {
        Member member = memberRepository.findById(memberId);
        int rentalDays = rentalPolicy.getRentalPeriod(member);
        LocalDate today = LocalDate.now();

        return new Rental(memberId, bookTitle, today, today.plusDays(rentalDays));
    }
}
