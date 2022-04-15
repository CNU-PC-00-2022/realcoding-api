package ac.cnu.realcodingapi.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {
    // JPA를 통해 자동으로 DB 쿼리 수행
}
