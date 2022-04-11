package ac.cnu.realcodingapi.service;

import ac.cnu.realcodingapi.domain.UserGroup;
import ac.cnu.realcodingapi.domain.UserGroupDomainService;
import ac.cnu.realcodingapi.dto.UserGroupRequest;
import ac.cnu.realcodingapi.dto.UserGroupResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserGroupService {
    private final UserGroupDomainService userGroupDomainService;

    public UserGroupResponse saveUserGroup(UserGroupRequest request) {
        UserGroup userGroup = userGroupDomainService.saveUserGroup(request.toUserGroup());
        return UserGroupResponse.create(userGroup);
    }
}
