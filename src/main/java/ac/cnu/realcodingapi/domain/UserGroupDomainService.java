package ac.cnu.realcodingapi.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class UserGroupDomainService {

    private final UserGroupRepository userGroupRepository;

    @Autowired
    public UserGroupDomainService(UserGroupRepository userGroupRepository) {
        this.userGroupRepository = userGroupRepository;
    }

    @Transactional(readOnly = true)
    public UserGroup getUserGroup(long id) {
        log.info("Domain Service 함수 시작");
        return userGroupRepository.findById(id)
                .orElseGet(() -> new UserGroup("no group"));
    }
}
