package ac.cnu.realcodingapi.service;

import ac.cnu.realcodingapi.domain.UserGroup;
import ac.cnu.realcodingapi.domain.UserGroupDomainService;
import ac.cnu.realcodingapi.dto.UserGroupResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserGroupService {

    private final UserGroupDomainService userGroupDomainService;

    @Autowired
    public UserGroupService(UserGroupDomainService userGroupDomainService) {
        this.userGroupDomainService = userGroupDomainService;
    }

    public UserGroupResponse getUserGroup(Long id) {
        log.info("Service 함수 시작");
        UserGroup userGroup = userGroupDomainService.getUserGroup(id);
        return UserGroupResponse.create(userGroup);
    }

}
