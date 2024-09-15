package org.fastcampus.community_feed.push.application.interfaces;

import org.fastcampus.community_feed.user.domain.User;

public interface MessageRepository {

    void sendLikeMessage(User sender, User targetUser);

}
