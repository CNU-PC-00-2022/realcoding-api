package ac.cnu.realcodingapi.domain;

import ac.cnu.realcodingapi.dto.UserGroupRequest;
import ac.cnu.realcodingapi.dto.UserMemberDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;

@Service
public class UserGroupDomainService {

    private final UserGroupRepository userGroupRepository;

    public UserGroupDomainService(UserGroupRepository userGroupRepository) {
        this.userGroupRepository = userGroupRepository;
    }

    @Transactional(readOnly = true)
    public UserGroup getUserGroup(long id) {
        return userGroupRepository.findById(id)
                .orElseGet(() -> new UserGroup("no group"));
    }

    @Transactional
    public UserGroup saveUserGroup(UserGroupRequest userGroupRequest) {
        UserGroup userGroup = userGroupRepository.findById(userGroupRequest.getId())
                .orElseGet(() -> new UserGroup(userGroupRequest.getId(), userGroupRequest.getName()));
        userGroup.getMembers().addAll(userGroupRequest.getMembers()
                .stream()
                .map(UserMember::new)
                // .map(member -> new UserMember(member))
                .collect(Collectors.toList()));

        return userGroupRepository.save(userGroup);
    }
}
