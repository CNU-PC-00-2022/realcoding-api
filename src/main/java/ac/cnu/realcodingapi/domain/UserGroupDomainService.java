package ac.cnu.realcodingapi.domain;

import ac.cnu.realcodingapi.repository.UserGroupRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Slf4j
public class UserGroupDomainService {
    private final UserGroupRepository userGroupRepository;

    public UserGroupDomainService(UserGroupRepository userGroupRepository) {
        this.userGroupRepository = userGroupRepository;
    }

    @Transactional(readOnly = true)
    public UserGroup getUserGroup(Long id) {
        log.info("3. UserGroupDomainService");
        return userGroupRepository.findById(id)
                .orElseGet(() -> new UserGroup("no group"));
    }
}
