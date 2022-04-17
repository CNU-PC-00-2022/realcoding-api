package ac.cnu.realcodingapi.service;

import ac.cnu.realcodingapi.domain.UserGroup;
import ac.cnu.realcodingapi.domain.UserGroupDomainService;
import ac.cnu.realcodingapi.dto.UserGroupResponse;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserGroupService {

    private final UserGroupDomainService userGroupDomainService;

    public UserGroupService(UserGroupDomainService userGroupDomainService) {
        this.userGroupDomainService = userGroupDomainService;
    }

    public UserGroupResponse getUserGroup(Long id) {
        log.info("Excuted UserGroupService.");
        UserGroup userGroup = userGroupDomainService.getUserGroup(id);

        return UserGroupResponse.create(userGroup);
    }
}