package ac.cnu.realcodingapi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team16 {
    @Id
    Long id;

    String name;

    public Team16() {
        this.id = 16L;
        this.name = "Team 16";
    }

    public Team16(String groupName) {
        this.id = 16L;
        this.name = groupName;
    }

    public String getName() {
        return this.name;
    }
}
