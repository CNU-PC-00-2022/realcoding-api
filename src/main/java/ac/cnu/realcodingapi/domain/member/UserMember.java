package ac.cnu.realcodingapi.domain.member;

import ac.cnu.realcodingapi.dto.UserMemberDto;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
@AllArgsConstructor
public class UserMember {
    @Id
    String studentId;
    String name;
    long userGroupId;
    String role;

    public UserMember() {

    }

//    public UserMember(UserMemberDto userMemberDto) {
//        this.studentId = userMemberDto.getStudentId();
//        this.userGroupId = userMemberDto.getGroupId();
//        this.name = userMemberDto.getName();
//        this.role = userMemberDto.getRole();
//    }
}
