package ac.cnu.realcodingapi.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserGroupCustomRepository {
    Optional<UserGroup> findByIdCustom(Long id);
}
