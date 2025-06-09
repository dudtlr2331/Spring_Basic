package hello.library.rental;

import hello.library.member.Member;

public interface RentalPolicy {
    int getRentalPeriod(Member member);
}
