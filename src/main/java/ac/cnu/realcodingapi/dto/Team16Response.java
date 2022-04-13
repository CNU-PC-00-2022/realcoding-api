package ac.cnu.realcodingapi.dto;

import ac.cnu.realcodingapi.domain.Team16;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class Team16Response implements Serializable {
    String name;

    public Team16Response() {}

    public Team16Response(String name) {
        this.name = name;
    }

    public static Team16Response create(Team16 team16) {
        return new Team16Response(team16.getName());
    }
}
