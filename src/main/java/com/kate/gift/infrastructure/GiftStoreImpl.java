package com.kate.gift.infrastructure;

import com.kate.gift.common.exception.InvalidParamException;
import com.kate.gift.domain.Gift;
import com.kate.gift.domain.GiftStore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class GiftStoreImpl implements GiftStore {

    private final GiftEntityRepository giftEntityRepository;

    @Override
    public GiftEntity store(GiftEntity gift) {
        if (gift == null) throw new InvalidParamException();
        return giftEntityRepository.save(gift);
    }

}
