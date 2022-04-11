package ac.cnu.realcodingapi.dto;

import ac.cnu.realcodingapi.domain.UserGroup;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserGroupRequest {
    private String name;

    public UserGroup toUserGroup() {
        return new UserGroup(name);
    }
}