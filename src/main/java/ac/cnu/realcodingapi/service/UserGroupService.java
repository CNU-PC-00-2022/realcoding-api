package ac.cnu.realcodingapi.service;

import ac.cnu.realcodingapi.domain_model.UserGroup;
import ac.cnu.realcodingapi.domain_model.UserGroupDomainService;
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
        log.info("id로 usergroup 가져오기");
        UserGroup userGroup = userGroupDomainService.getUserGroup(id);

        return UserGroupResponse.create(userGroup);
    }
}