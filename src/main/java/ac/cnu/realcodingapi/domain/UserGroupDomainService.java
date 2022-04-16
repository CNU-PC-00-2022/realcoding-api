package ac.cnu.realcodingapi.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserGroupDomainService {

    private final UserGroupRepository userGroupRepository;

    public UserGroupDomainService(UserGroupRepository userGroupRepository) {
        this.userGroupRepository = userGroupRepository;
    }

    @Transactional(readOnly = true)
    public UserGroup getUserGroup(long id) {
        return userGroupRepository.findById(id)
                .orElseGet(() -> new UserGroup("no group"));
    }
}