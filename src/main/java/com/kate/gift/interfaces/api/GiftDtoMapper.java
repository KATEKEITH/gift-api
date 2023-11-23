package com.kate.gift.interfaces.api;

import com.kate.gift.domain.GiftCommand;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface GiftDtoMapper {

    GiftCommand.Register of(GiftDto.RegisterHttpRequest request);

}
