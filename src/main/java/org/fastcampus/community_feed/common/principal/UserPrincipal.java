package org.fastcampus.community_feed.common.principal;

import lombok.Getter;
import org.fastcampus.community_feed.auth.domain.UserRole;

@Getter
public class UserPrincipal {
    private final Long userId;
    private final UserRole role;

    public UserPrincipal(Long userId, String role) {
        this.userId = userId;
        this.role = UserRole.valueOf(role);
    }
}
