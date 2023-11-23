package com.kate.gift.domain;

import com.kate.gift.infrastructure.GiftEntity;

import java.util.Optional;

public interface GiftRepository {

    GiftEntity save(GiftEntity gift);

    Optional<Gift> findByGiftToken(String giftToken);

    Optional<Gift> findByOrderToken(String orderToken);

}
