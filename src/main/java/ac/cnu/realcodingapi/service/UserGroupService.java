package ac.cnu.realcodingapi.service;

import ac.cnu.realcodingapi.domain.UserGroup;
import ac.cnu.realcodingapi.domain.UserGroupDomainService;
import ac.cnu.realcodingapi.dto.UserGroupRequest;
import ac.cnu.realcodingapi.dto.UserGroupResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserGroupService {
    private final UserGroupDomainService userGroupDomainService;

    public UserGroupResponse saveUserGroup(UserGroupRequest request) {
        log.info("UserGroupService layer 시작");
        UserGroup userGroup = userGroupDomainService.saveUserGroup(request.toUserGroup());
        return UserGroupResponse.create(userGroup);
    }

    public UserGroupResponse getUserGroup(Long id) {
        log.info("UserGroupService layer 시작");
        UserGroup userGroup = userGroupDomainService.getUserGroup(id);
        return UserGroupResponse.create(userGroup);
    }

    public List<UserGroupResponse> getUserGroups() {
        log.info("UserGroupService layer 시작");
        return userGroupDomainService.getUserGroups().stream()
                .map(UserGroupResponse::create)
                .collect(Collectors.toList());
    }
}
