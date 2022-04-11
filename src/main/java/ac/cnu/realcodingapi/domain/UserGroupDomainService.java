package ac.cnu.realcodingapi.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    public List<UserGroup> getUserGroups() {
        return userGroupRepository.findAll();
    }
}
