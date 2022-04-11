package ac.cnu.realcodingapi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserGroup {
    @Id
    Long id;

    String name;


    public UserGroup() {

    }

    public UserGroup(String groupName) {
        this.name = groupName;
    }


    public String getName() {
        return this.name;
    }
}