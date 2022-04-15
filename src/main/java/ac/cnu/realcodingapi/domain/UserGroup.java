package ac.cnu.realcodingapi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
