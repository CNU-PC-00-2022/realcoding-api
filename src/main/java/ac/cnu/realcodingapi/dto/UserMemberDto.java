package ac.cnu.realcodingapi.dto;

import ac.cnu.realcodingapi.domain.member.UserMember;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserMemberDto implements Serializable {
    private String name;
    private String studentId;
    private long groupId;
    private String role; // TODO: enum 으로 변경

    public static UserMember toEntity(UserMemberDto m, long userGroupId) {
        return new UserMember(m.getStudentId(), m.getName(), userGroupId, m.getRole());
    }

    public static UserMemberDto create(UserMember m) {
        return new UserMemberDto(m.getName(), m.getStudentId(), m.getUserGroupId(), m.getRole());
    }

    public static Set<UserMember> toMemberEntities(UserGroupRequest userGroupRequest) {
        final long teamId = userGroupRequest.getId();
        return userGroupRequest.getMembers()
                .stream()
                .map(userMember -> UserMemberDto.toEntity(userMember, teamId))
//                .peek(p -> {
//                    log.info(p.toString());
//                })
                .collect(Collectors.toSet());
    }
}
