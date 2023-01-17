package com.its.springsecurity.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    ADMIN("ROLE_ADMIN","운영자"),
    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;
//    USER("ROLE_USER"),

//    ADMIN("ROLE_ADMIN"),
//    SOCIAL("ROLE_SOCIAL"); // OAuth
//

//    private final String value;

//    private final String key;
//    private final String title;
}
