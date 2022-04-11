package ac.cnu.realcodingapi.controller;

import ac.cnu.realcodingapi.dto.CommonResponse;
import ac.cnu.realcodingapi.dto.UserGroupRequest;
import ac.cnu.realcodingapi.dto.UserGroupResponse;
import ac.cnu.realcodingapi.service.UserGroupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static ac.cnu.realcodingapi.dto.UserGroupResponseMessage.*;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserGroupController {
    private final UserGroupService userGroupService;

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("/usergroup")
    public CommonResponse<UserGroupResponse> saveNewUserGroup(@RequestBody UserGroupRequest request) {
        UserGroupResponse response = userGroupService.saveUserGroup(request);
        return CommonResponse.from(response, UPLOAD_USER_GROUP.getMessage());
    }

    @GetMapping("/usergroup/{usergroupId}")
    public CommonResponse<UserGroupResponse> getUserGroup(@PathVariable Long usergroupId) {
        UserGroupResponse response = userGroupService.getUserGroup(usergroupId);
        return CommonResponse.from(response, FIND_USER_GROUP.getMessage());
    }

    @GetMapping("/usergroup")
    public CommonResponse<List<UserGroupResponse>> getUserGroups() {
        List<UserGroupResponse> userGroups = userGroupService.getUserGroups();
        return CommonResponse.from(userGroups, FIND_USER_GROUPS.getMessage());
    }
}
