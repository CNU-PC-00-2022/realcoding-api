package ac.cnu.realcodingapi.controller;

import ac.cnu.realcodingapi.dto.Team16Response;
import ac.cnu.realcodingapi.service.Team16Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Team16Controller {
    private final Team16Service team16Service;

    public Team16Controller(Team16Service team16Service) {
        this.team16Service = team16Service;
    }

    @GetMapping("/api")
    public String index() { return "index"; }

    @GetMapping("/api/group")
    public ResponseEntity<Team16Response> getUserGroup() {
        log.info("여기는 controller...");
        return ResponseEntity.ok().body(team16Service.getTeam16());
    }
}
