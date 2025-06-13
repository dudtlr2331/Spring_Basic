package hello.library.rental;

import hello.library.member.Grade;
import hello.library.member.Member;
import org.springframework.stereotype.Component;

@Component
public class VipRentalPolicy implements RentalPolicy {
    @Override
    public int getRentalPeriod(Member member) {
        if (member.getGrade() == Grade.VIP) {
            return 14;
        } else {
            return 7;
        }
    }
}
