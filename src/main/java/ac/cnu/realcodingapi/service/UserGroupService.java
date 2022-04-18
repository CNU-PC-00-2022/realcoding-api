package ac.cnu.realcodingapi.service;

import ac.cnu.realcodingapi.domain.UserGroup;
import ac.cnu.realcodingapi.domain.UserGroupDomainService;
import ac.cnu.realcodingapi.dto.UserGroupResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserGroupService {

    private final UserGroupDomainService userGroupDomainService;

    public UserGroupService(UserGroupDomainService userGroupDomainService) {
        this.userGroupDomainService = userGroupDomainService;
    }

    public UserGroupResponse getUserGroup(Long id) {
        UserGroup userGroup = userGroupDomainService.getUserGroup(id);
        log.info("서비스 입니다");
        return UserGroupResponse.create(userGroup);
    }
}