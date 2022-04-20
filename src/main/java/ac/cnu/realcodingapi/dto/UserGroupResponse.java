package ac.cnu.realcodingapi.dto;

import ac.cnu.realcodingapi.domain.UserGroup;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class UserGroupResponse implements Serializable {
    String name;

    public UserGroupResponse() {

    }
    public UserGroupResponse(String name) {
        this.name = name;
    }

    public static UserGroupResponse create(UserGroup userGroup) {
        return new UserGroupResponse(userGroup.getName());
    }
}