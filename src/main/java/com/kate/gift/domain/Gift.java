package com.kate.gift.domain;

import com.kate.gift.infrastructure.GiftEntity;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Gift {

    private String giftToken;

    private Long buyerUserId;

    private String orderToken;

    private GiftEntity.Status status;

    private GiftEntity.PushType pushType;

    private String giftReceiverName;

    private String giftReceiverPhone;

    private String giftMessage;

}
