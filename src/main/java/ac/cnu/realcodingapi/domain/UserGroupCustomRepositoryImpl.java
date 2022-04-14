package ac.cnu.realcodingapi.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Optional;


public class UserGroupCustomRepositoryImpl implements UserGroupCustomRepository {
    EntityManager em;

    @Override
    public Optional<UserGroup> findByIdCustom(Long id) {
        return Optional.of(
                em.createQuery("select ug from UserGroup AS ug where ug.id=" + id, UserGroup.class)
                        .getSingleResult());
    }
}
