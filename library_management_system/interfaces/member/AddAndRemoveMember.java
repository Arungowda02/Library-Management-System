package interfaces.member;

import entities.Member;

public interface AddAndRemoveMember {
    void registerMember(Member member);
    void removeMember(Member member);
}
