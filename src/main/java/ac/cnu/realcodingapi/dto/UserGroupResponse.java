package ac.cnu.realcodingapi.dto;

import ac.cnu.realcodingapi.domain.UserGroup;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
@Slf4j
@Getter
public class UserGroupResponse implements Serializable {
    String name;

    public UserGroupResponse() {

    }
    public UserGroupResponse(String name) {
        this.name = name;
    }

    public static UserGroupResponse create(UserGroup userGroup) {
        log.info("This is Response.");
        return new UserGroupResponse(userGroup.getName());
    }
}
