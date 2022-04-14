package ac.cnu.realcodingapi.domain;

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
    Long id;
    String name;

    @OneToMany
    @JoinColumn(name = "userGroupId", referencedColumnName = "id")
    Set<UserMember> members = new HashSet<>();

    public UserGroup() {

    }

    public UserGroup(String groupName) {
        this.name = groupName;
    }

    public UserGroup (Long id, String name) {
        this.id = id;
        this.name = name;
        this.members = new HashSet<>();
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
