package hello.library.rental;

import hello.library.member.Member;
import org.springframework.stereotype.Component;

public class BasicRentalPolicy implements RentalPolicy {
    @Override
    public int getRentalPeriod(Member member) {
        return 7;
    }
}
