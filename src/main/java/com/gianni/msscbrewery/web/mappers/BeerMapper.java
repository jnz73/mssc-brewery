package com.gianni.msscbrewery.web.mappers;

import com.gianni.msscbrewery.domain.Beer;
import com.gianni.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
