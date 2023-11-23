package com.kate.gift.infrastructure;

import com.kate.gift.domain.Gift;
import com.kate.gift.domain.GiftRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class GiftEntityRepository implements GiftRepository {

    private GiftJpaRepository giftJpaRepository;

    public GiftEntityRepository (GiftJpaRepository giftJpaRepository) {
        this.giftJpaRepository = giftJpaRepository;
    }

    @Override
    public GiftEntity save(GiftEntity entity) {
        return giftJpaRepository.save(entity);
    }

    @Override
    public Optional<Gift> findByGiftToken(String giftToken) {
        return giftJpaRepository
                .findByGiftToken(giftToken)
                .map(gift ->
                        Gift.builder()
                                .giftToken(gift.getGiftToken())
                                .buyerUserId(gift.getBuyerUserId())
                                .orderToken(gift.getOrderToken())
                                .status(gift.getStatus())
                                .pushType(gift.getPushType())
                                .giftReceiverName(gift.getGiftReceiverName())
                                .giftReceiverPhone(gift.getGiftReceiverPhone())
                                .giftMessage(gift.getGiftMessage())
                                .build()
                );
    }

    @Override
    public Optional<Gift> findByOrderToken(String orderToken) {
        return Optional.empty();
    }

}
