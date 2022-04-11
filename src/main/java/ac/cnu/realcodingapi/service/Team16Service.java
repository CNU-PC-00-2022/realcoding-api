package ac.cnu.realcodingapi.service;

import ac.cnu.realcodingapi.domain.Team16;
import ac.cnu.realcodingapi.domain.Team16DomainService;
import ac.cnu.realcodingapi.dto.Team16Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Team16Service {
    private final Team16DomainService team16DomainService;

    public Team16Service(Team16DomainService team16DomainService) {
        this.team16DomainService = team16DomainService;
    }

    public Team16Response getTeam16() {
        log.info("여기는 service..");
        Team16 team16 = team16DomainService.getTeam16();
        return Team16Response.create(team16);
    }
}
