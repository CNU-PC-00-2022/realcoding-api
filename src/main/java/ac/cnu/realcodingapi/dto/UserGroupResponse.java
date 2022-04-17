package ac.cnu.realcodingapi.dto;

import ac.cnu.realcodingapi.domain.UserGroup;
import lombok.Getter;

import java.io.Serializable;

@Getter
// UserGroup 반환 시 객체를 감싸서 반환해주는 역할 수행
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
