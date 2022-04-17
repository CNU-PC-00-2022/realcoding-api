package ac.cnu.realcodingapi.service;

import ac.cnu.realcodingapi.config.ExternInfoConfig;
import ac.cnu.realcodingapi.dto.UserGroupResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class UserGroupRequestService {
    private final RestTemplate restTemplate;
    private final ExternInfoConfig externInfoConfig;

    public UserGroupResponse getTeamMember(Long id){
        String url = externInfoConfig.getUrl() + "?id=" + id;
        ResponseEntity<UserGroupResponse> response = restTemplate.getForEntity(url, UserGroupResponse.class);
//        if (!response.getStatusCode().is2xxSuccessful()) {
//        }
        return response.getBody();
    }
}
