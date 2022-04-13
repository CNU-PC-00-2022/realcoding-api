package ac.cnu.realcodingapi.dto;

import ac.cnu.realcodingapi.domain.UserGroup;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter
@Slf4j
public class UserGroupResponse implements Serializable {
    String name;

    public UserGroupResponse() {

    }
    public UserGroupResponse(String name) {
        log.info("Response 입니다.");
        this.name = name;
    }

    public static UserGroupResponse create(UserGroup userGroup) {
        return new UserGroupResponse(userGroup.getName());
    }
}
