package ac.cnu.realcodingapi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserGroup {
    @Id
    Long id;

    String name;


    public UserGroup() {
        this.id = 7L;
        this.name = "GroupName : Team 7";
    }

    public UserGroup(String groupName) {
        this.id = 7L;
        this.name = groupName;
    }


    public String getName() {
        return this.name;
    }
}
