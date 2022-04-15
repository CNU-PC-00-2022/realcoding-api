package ac.cnu.realcodingapi.dto;

import ac.cnu.realcodingapi.domain.member.UserMember;
import ac.cnu.realcodingapi.domain.usergroup.UserGroup;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public class UserGroupResponse implements Serializable {
    private Long team;
    private String name;
    private List<UserMemberDto> members = new ArrayList<>();

    public static UserGroupResponse create(UserGroupDto userGroupDto) {
        List<UserMemberDto> members = userGroupDto.getUserMembers().stream()
                .map(UserMemberDto::create)
                .collect(Collectors.toList());

        return new UserGroupResponse(userGroupDto.getUserGroup().getId(), userGroupDto.getUserGroup().getName(), members);
    }
}
