package com.kate.gift.domain;

import com.kate.gift.infrastructure.GiftEntity;

public interface GiftStore {

    GiftEntity store(GiftEntity entity);

}
