package com.kate.gift.domain;

import com.kate.gift.infrastructure.GiftEntity;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GiftInfo {

    private final String orderToken;

    private final String giftToken;

    private final GiftEntity.PushType pushType;

    private final String giftReceiverName;

    private final String giftReceiverPhone;

    private final String giftMessage;

    public GiftInfo(GiftEntity entity) {
        this.orderToken = entity.getOrderToken();
        this.giftToken = entity.getGiftToken();
        this.pushType = entity.getPushType();
        this.giftReceiverName = entity.getGiftReceiverName();
        this.giftReceiverPhone = entity.getGiftReceiverName();
        this.giftMessage = entity.getGiftMessage();
    }

}
