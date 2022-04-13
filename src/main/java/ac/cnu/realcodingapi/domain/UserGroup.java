package ac.cnu.realcodingapi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor
public class UserGroup {
    @Id @GeneratedValue
    Long id;
    String name;

    public UserGroup(String groupName) {
        this.name = groupName;
    }
}
