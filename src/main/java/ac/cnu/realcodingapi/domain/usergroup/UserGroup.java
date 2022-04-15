package ac.cnu.realcodingapi.domain.usergroup;

import ac.cnu.realcodingapi.domain.member.UserMember;
import lombok.Getter;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
public class UserGroup {
    @Id
    private Long id;
    private String name;
    private String ip;


    public UserGroup() {

    }

    public UserGroup(String groupName) {
        this.name = groupName;
    }

    public UserGroup (Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserGroup userGroup = (UserGroup) o;

        return id != null && id.equals(userGroup.id);
    }
}
