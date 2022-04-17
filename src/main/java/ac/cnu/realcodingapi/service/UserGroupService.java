package ac.cnu.realcodingapi.service;

import ac.cnu.realcodingapi.domain.usergroup.UserGroupDomainService;
import ac.cnu.realcodingapi.dto.UserGroupAllResponse;
import ac.cnu.realcodingapi.dto.UserGroupDto;
import ac.cnu.realcodingapi.dto.UserGroupRequest;
import ac.cnu.realcodingapi.dto.UserGroupResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

@Service
public class UserGroupService {

    private final UserGroupDomainService userGroupDomainService;
    private final UserGroupRequestService userGroupRequestService;

    @Autowired
    public UserGroupService(UserGroupDomainService userGroupDomainService, UserGroupRequestService userGroupRequestService) {
        this.userGroupDomainService = userGroupDomainService;
        this.userGroupRequestService = userGroupRequestService;
    }

    public UserGroupResponse getUserGroup(Long id) {
        UserGroupDto userGroupDto = userGroupDomainService.getUserGroup(id);
        return UserGroupResponse.create(userGroupDto);
    }

    public UserGroupResponse getUserGroupFromServer(Long id) {
        return userGroupRequestService.getTeamMember(id);
    }

    public UserGroupAllResponse getAllUserGroupFromServer() {
        List<UserGroupResponse> userGroupResponseList = LongStream.rangeClosed(1, 17)
//                .parallel() // debugging 해보기
                .mapToObj(userGroupRequestService::getTeamMember)
                .collect(Collectors.toList());
        return new UserGroupAllResponse(userGroupResponseList);
    }

    @Transactional
    public UserGroupResponse saveUserGroup(UserGroupRequest userGroupRequest) {
        UserGroupDto userGroupDto = userGroupDomainService.saveUserGroup(userGroupRequest);

        return UserGroupResponse.create(userGroupDto);
    }
}
