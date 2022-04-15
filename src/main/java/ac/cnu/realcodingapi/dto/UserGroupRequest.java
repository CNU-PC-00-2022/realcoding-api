package ac.cnu.realcodingapi.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class UserGroupRequest {
    private long id;
    private String name;
    private List<UserMemberDto> members;

}
