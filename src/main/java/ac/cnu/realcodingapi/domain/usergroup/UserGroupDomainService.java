package ac.cnu.realcodingapi.domain.usergroup;

import ac.cnu.realcodingapi.domain.member.UserMember;
import ac.cnu.realcodingapi.domain.member.UserMemberRepository;
import ac.cnu.realcodingapi.dto.UserGroupDto;
import ac.cnu.realcodingapi.dto.UserGroupRequest;
import ac.cnu.realcodingapi.dto.UserMemberDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserGroupDomainService {

    private final UserGroupRepository userGroupRepository;
    private final UserMemberRepository userMemberRepository;

    public UserGroupDomainService(UserGroupRepository userGroupRepository, UserMemberRepository userMemberRepository) {
        this.userGroupRepository = userGroupRepository;
        this.userMemberRepository = userMemberRepository;
    }


    @Transactional(readOnly = true)
    public UserGroupDto getUserGroup(long id) {
        UserGroup userGroup = userGroupRepository.findById(id)
                .orElseGet(() -> new UserGroup("no group"));
        List<UserMember> members = userMemberRepository.findAllByUserGroupId(id);
        return UserGroupDto.create(userGroup, members);
    }

    @Transactional
    public UserGroupDto saveUserGroup(UserGroupRequest userGroupRequest) {
        UserGroup userGroup = userGroupRepository.findById(userGroupRequest.getId())
                .orElseGet(() -> new UserGroup(userGroupRequest.getId(), userGroupRequest.getName()));
        Set<UserMember> userMemberList = UserMemberDto.toMemberEntities(userGroupRequest);
        userMemberRepository.deleteAllByUserGroupId(userGroupRequest.getId());
        return UserGroupDto.create(
                userGroupRepository.save(userGroup),
                userMemberRepository.saveAll(userMemberList));
    }
}
