package ac.cnu.realcodingapi.service;

import ac.cnu.realcodingapi.domain.usergroup.UserGroup;
import ac.cnu.realcodingapi.domain.usergroup.UserGroupDomainService;
import ac.cnu.realcodingapi.dto.UserGroupDto;
import ac.cnu.realcodingapi.dto.UserGroupRequest;
import ac.cnu.realcodingapi.dto.UserGroupResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserGroupService {

    private final UserGroupDomainService userGroupDomainService;

    @Autowired
    public UserGroupService(UserGroupDomainService userGroupDomainService) {
        this.userGroupDomainService = userGroupDomainService;
    }

    public UserGroupResponse getUserGroup(Long id) {
        UserGroupDto userGroupDto = userGroupDomainService.getUserGroup(id);

        return UserGroupResponse.create(userGroupDto);
    }

    @Transactional
    public UserGroupResponse saveUserGroup(UserGroupRequest userGroupRequest) {
        UserGroupDto userGroupDto = userGroupDomainService.saveUserGroup(userGroupRequest);

        return UserGroupResponse.create(userGroupDto);
    }
}
