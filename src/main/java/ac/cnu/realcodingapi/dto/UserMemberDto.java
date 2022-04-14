package ac.cnu.realcodingapi.dto;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class UserMemberDto implements Serializable {
    String name;
    String studentId;
    String role; // enum
}
