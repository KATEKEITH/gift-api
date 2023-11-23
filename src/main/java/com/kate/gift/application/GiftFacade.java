package com.kate.gift.application;

import com.kate.gift.domain.GiftCommand;
import com.kate.gift.domain.GiftInfo;
import com.kate.gift.domain.GiftService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GiftFacade {

    private final GiftService giftService;

    public GiftInfo registerOrder(GiftCommand.Register command) {
        var giftInfo = giftService.registerOrder(command);
        log.info("registerOrder orderToken = {}", giftInfo);
        return giftInfo;
    }

}
