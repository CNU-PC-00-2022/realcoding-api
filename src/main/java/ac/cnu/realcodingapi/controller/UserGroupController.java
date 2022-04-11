package ac.cnu.realcodingapi.controller;

import ac.cnu.realcodingapi.dto.UserGroupResponse;
import ac.cnu.realcodingapi.service.UserGroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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

    @GetMapping("/api/usergroup")
    public ResponseEntity<UserGroupResponse> getUserGroup(@RequestParam Long id) {
        return ResponseEntity.ok().body(userGroupService.getUserGroup(id));
    }
}
