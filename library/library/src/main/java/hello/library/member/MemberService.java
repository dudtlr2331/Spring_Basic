package hello.library.member;

import org.springframework.stereotype.Service;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
