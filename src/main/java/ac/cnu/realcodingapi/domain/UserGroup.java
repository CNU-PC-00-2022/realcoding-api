package ac.cnu.realcodingapi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserGroup {

    @Id
    Long id;

    String name;

    // 인자 없는 생성자
    public UserGroup() {
    }

    // 생성자 with GroupName
    public UserGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
