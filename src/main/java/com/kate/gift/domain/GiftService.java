package com.kate.gift.domain;

import com.kate.gift.domain.gift.order.OrderApiCaller;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class GiftService {

//    private final GiftReader giftReader;

    private final GiftStore giftStore;

    private final OrderApiCaller orderApiCaller;

    private final GiftToOrderMapper giftToOrderMapper;

    /**
     * 선물하기 주문을 등록한다
     * 해당 주문을 주문 서비스에 등록하기 위해 API 를 호출하고
     * 등록된 주문의 식별키와 선물 관련 정보를 반영하여 Gift 도메인을 저장한다
     *
     * @param request
     * @return
     */
    @Transactional
    public GiftInfo registerOrder(GiftCommand.Register request) {
        log.info("GiftServiceImpl request = {}", request);

        var orderCommand = giftToOrderMapper.of(request);

        log.info("GiftServiceImpl orderCommand = {}", orderCommand);

        var orderToken = orderApiCaller.registerGiftOrder(orderCommand);

        log.info("GiftServiceImpl orderToken = {}", orderToken);

        var initGift = request.toEntity(orderToken);

        var gift = giftStore.store(initGift);

        return new GiftInfo(gift);
    }

}
