package ac.cnu.realcodingapi.domain;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Long>{
}
