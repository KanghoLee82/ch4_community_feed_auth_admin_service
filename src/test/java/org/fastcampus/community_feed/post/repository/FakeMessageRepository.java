package org.fastcampus.community_feed.post.repository;

import org.fastcampus.community_feed.push.application.interfaces.MessageRepository;
import org.fastcampus.community_feed.user.domain.User;

public class FakeMessageRepository implements MessageRepository {

    @Override
    public void sendLikeMessage(User sender, User targetUser) {
        // do nothing
    }

}
