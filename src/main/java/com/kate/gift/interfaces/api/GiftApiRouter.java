package com.kate.gift.interfaces.api;

import com.kate.gift.application.GiftFacade;
import com.kate.gift.common.response.CommonResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/gifts")
public class GiftApiRouter {

    private final GiftFacade giftFacade;

    private final GiftDtoMapper giftDtoMapper;

    @PostMapping
    public CommonResponse registerOrder(@RequestBody @Valid GiftDto.RegisterHttpRequest request) {
        var command = giftDtoMapper.of(request);
        var giftInfo = giftFacade.registerOrder(command);
        return CommonResponse.success(new GiftDto.RegisterHttpResponse(giftInfo));
    }

}
