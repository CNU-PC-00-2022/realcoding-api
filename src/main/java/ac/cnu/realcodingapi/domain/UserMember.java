package ac.cnu.realcodingapi.domain;

import ac.cnu.realcodingapi.dto.UserMemberDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@EqualsAndHashCode
@Entity
public class UserMember {
    @Id
    String studentId;
    String name;
    String role;

    public UserMember() {

    }

    public UserMember(UserMemberDto userMemberDto) {
        this.studentId = userMemberDto.getStudentId();
        this.name = userMemberDto.getName();
        this.role = userMemberDto.getRole();
    }
}
