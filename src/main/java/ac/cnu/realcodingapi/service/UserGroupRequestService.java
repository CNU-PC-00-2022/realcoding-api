package ac.cnu.realcodingapi.service;

import ac.cnu.realcodingapi.config.ExternInfoConfig;
import ac.cnu.realcodingapi.dto.UserGroupResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserGroupRequestService {
    private final RestTemplate restTemplate;
    private final ExternInfoConfig externInfoConfig;

    public UserGroupResponse getTeamMember(Long id){
        String url = externInfoConfig.getUrl() + "?id=" + id;
        try {
            ResponseEntity<UserGroupResponse> response
                    = restTemplate.getForEntity(url, UserGroupResponse.class);
            if (!response.getStatusCode().is2xxSuccessful()) {
                return new UserGroupResponse(id, "no group", new ArrayList<>());
            }
            return response.getBody();
        } catch (Exception e) {
            log.error("external api request error: {}", url, e);
        }
        return new UserGroupResponse(id, "no group", new ArrayList<>());
    }
}
