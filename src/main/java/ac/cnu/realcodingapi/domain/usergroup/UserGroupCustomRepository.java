package ac.cnu.realcodingapi.domain.usergroup;

import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserGroupCustomRepository {
    Optional<UserGroup> findByIdCustom(Long id);
}
