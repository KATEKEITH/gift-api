package com.kate.gift.infrastructure;

import com.kate.gift.infrastructure.GiftEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GiftJpaRepository extends JpaRepository<GiftEntity, Long> {

    Optional<GiftEntity> findByGiftToken(String giftToken);

    Optional<GiftEntity> findByOrderToken(String orderToken);

}
