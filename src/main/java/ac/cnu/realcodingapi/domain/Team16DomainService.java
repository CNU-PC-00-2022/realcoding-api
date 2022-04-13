package ac.cnu.realcodingapi.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class Team16DomainService {
    private final Team16Repository team16Repository;

    public Team16DomainService(Team16Repository team16Repository) {
        this.team16Repository = team16Repository;
    }

    @Transactional(readOnly = true)
    public Team16 getTeam16() {
        log.info("여기는 domain service...");
        return team16Repository.findById(16L)
                .orElseGet(() -> new Team16("Group 16"));
    }
}
