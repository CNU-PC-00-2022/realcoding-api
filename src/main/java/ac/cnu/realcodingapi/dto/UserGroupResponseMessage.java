package ac.cnu.realcodingapi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserGroupResponseMessage {
    UPLOAD_USER_GROUP("유저그룹 저장 성공"),
    FIND_USER_GROUP("유저그룹 조회 성공"),
    FIND_USER_GROUPS("유저그룹 목록 조회 성공");

    private final String message;
}
