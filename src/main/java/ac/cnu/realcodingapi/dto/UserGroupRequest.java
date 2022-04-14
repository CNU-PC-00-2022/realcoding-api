package ac.cnu.realcodingapi.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class UserGroupRequest {
    long id;
    String name;
    List<UserMemberDto> members;
}
