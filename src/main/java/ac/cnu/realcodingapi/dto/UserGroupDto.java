package ac.cnu.realcodingapi.dto;

import ac.cnu.realcodingapi.domain.member.UserMember;
import ac.cnu.realcodingapi.domain.usergroup.UserGroup;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserGroupDto {
    UserGroup userGroup;
    List<UserMember> userMembers;

    public static UserGroupDto create(UserGroup userGroup, List<UserMember> userMembers) {
        return new UserGroupDto(userGroup, userMembers);
    }

}
