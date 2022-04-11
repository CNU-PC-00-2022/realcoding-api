package ac.cnu.realcodingapi.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserGroupDomainService {

    private final UserGroupRepository userGroupRepository;

    @Transactional
    public UserGroup saveUserGroup(UserGroup userGroup) {
        log.info("UserGroupDomainService layer 시작");
        return userGroupRepository.save(userGroup);
    }

    public UserGroup getUserGroup(long id) {
        log.info("UserGroupDomainService layer 시작");
        return userGroupRepository.findById(id)
                .orElseGet(() -> new UserGroup("no group"));
    }

    public List<UserGroup> getUserGroups() {
        log.info("UserGroupDomainService layer 시작");
        return userGroupRepository.findAll();
    }
}
