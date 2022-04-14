package ac.cnu.realcodingapi.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Entity
@ToString(exclude = "members")
public class UserGroup {
    @Id
    Long id;
    String name;

    @OneToMany
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
}
