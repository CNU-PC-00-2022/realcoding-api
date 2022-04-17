package ac.cnu.realcodingapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserGroupAllResponse {
    List<UserGroupResponse> list;
}
