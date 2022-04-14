package ac.cnu.realcodingapi.service;

import ac.cnu.realcodingapi.domain.UserGroup;
import ac.cnu.realcodingapi.domain.UserGroupDomainService;
import ac.cnu.realcodingapi.dto.UserGroupRequest;
import ac.cnu.realcodingapi.dto.UserGroupResponse;
import org.springframework.stereotype.Service;

@Service
public class UserGroupService {

    private final UserGroupDomainService userGroupDomainService;

    public UserGroupService(UserGroupDomainService userGroupDomainService) {
        this.userGroupDomainService = userGroupDomainService;
    }

    public UserGroupResponse getUserGroup(Long id) {
        UserGroup userGroup = userGroupDomainService.getUserGroup(id);

        return UserGroupResponse.create(userGroup);
    }

    public UserGroupResponse saveUserGroup(UserGroupRequest userGroupRequest) {
        return UserGroupResponse.create(userGroupDomainService.saveUserGroup(userGroupRequest));
    }
}
