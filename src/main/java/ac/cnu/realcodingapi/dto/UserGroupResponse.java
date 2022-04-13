package ac.cnu.realcodingapi.dto;

import ac.cnu.realcodingapi.domain.UserGroup;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserGroupResponse implements Serializable {
    Long id;
    String name;

    public UserGroupResponse(String name) {
        this.name = name;
    }

    public static UserGroupResponse create(UserGroup userGroup) {
        return new UserGroupResponse(userGroup.getId(), userGroup.getName());
    }
}