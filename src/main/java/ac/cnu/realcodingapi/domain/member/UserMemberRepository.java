package ac.cnu.realcodingapi.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserMemberRepository extends JpaRepository<UserMember, String> {
    void deleteAllByUserGroupId(long groupId);
    List<UserMember> findAllByUserGroupId(long groupId);
}
