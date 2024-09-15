package org.fastcampus.community_feed.push.repository.jpa;

import org.fastcampus.community_feed.push.repository.entity.FcmTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaFcmTokenRepository extends JpaRepository<FcmTokenEntity, Long> {

}
