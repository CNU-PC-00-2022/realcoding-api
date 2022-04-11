package ac.cnu.realcodingapi.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserGroupDomainService {

    private final UserGroupRepository userGroupRepository;

    @Transactional
    public UserGroup saveUserGroup(UserGroup userGroup) {
        return userGroupRepository.save(userGroup);
    }

    public UserGroup getUserGroup(long id) {
        return userGroupRepository.findById(id)
                .orElseGet(() -> new UserGroup("no group"));
    }
}
