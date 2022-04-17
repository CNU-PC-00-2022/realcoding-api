package ac.cnu.realcodingapi.controller;

import ac.cnu.realcodingapi.dto.UserGroupResponse;
import ac.cnu.realcodingapi.service.UserGroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserGroupController {

    private final UserGroupService userGroupService;

    public UserGroupController(UserGroupService userGroupService) {
        this.userGroupService = userGroupService;
    }

    @GetMapping("/api")
    public String index() {
        return "index";
    }

    // 과제1 Get 매핑 함수
    @GetMapping("/api/usergroup")
    public ResponseEntity<UserGroupResponse> getUserGroup(@RequestParam Long id) {
        log.info("Controller 함수 시작");
        return ResponseEntity.ok().body(userGroupService.getUserGroup(id));
    }

}
