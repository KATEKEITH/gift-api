package com.kate.gift.domain;

import com.kate.gift.infrastructure.GiftEntity;

public interface GiftReader {

    GiftEntity getGiftBy(String giftToken);

    GiftEntity getGiftByOrderToken(String orderToken);

}
