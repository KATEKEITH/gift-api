package com.kate.gift.infrastructure.order;

import com.kate.gift.common.response.CommonResponse;
import com.kate.gift.domain.gift.order.OrderApiCommand;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitOrderApi {

    @POST("api/v1/gift-orders/init")
    Call<CommonResponse<RetrofitOrderApiResponse.Register>> registerOrder(@Body OrderApiCommand.Register request);

}
