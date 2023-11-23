package com.kate.gift.infrastructure.order;

import com.kate.gift.common.response.CommonResponse;
import com.kate.gift.domain.gift.order.OrderApiCaller;
import com.kate.gift.domain.gift.order.OrderApiCommand;
import com.kate.gift.infrastructure.retrofit.RetrofitUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class OrderApiCallerImpl implements OrderApiCaller {

    private final RetrofitUtils retrofitUtils;

    private final RetrofitOrderApi retrofitOrderApi;

    @Override
    public String registerGiftOrder(OrderApiCommand.Register request) {
        var call = retrofitOrderApi.registerOrder(request);
        return retrofitUtils.responseSync(call)
                .map(CommonResponse::getData)
                .map(RetrofitOrderApiResponse.Register::getOrderToken)
                .orElseThrow(RuntimeException::new);
    }

}

