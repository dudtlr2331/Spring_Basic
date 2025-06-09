package hello.library.rental;

import hello.library.member.Member;

public class BasicRentalPolicy implements RentalPolicy {
    @Override
    public int getRentalPeriod(Member member) {
        return 7;
    }
}
