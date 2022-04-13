package ac.cnu.realcodingapi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class UserGroup {
    @Id
    private Long id;

    private String name;

    public UserGroup(String groupName) {
        this.name = groupName;
    }
}
