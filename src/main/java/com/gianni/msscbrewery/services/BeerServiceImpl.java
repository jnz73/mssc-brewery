package com.gianni.msscbrewery.services;

import com.gianni.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Peroni")
                .beerStyle("ipa")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //TODO add real implementation
        log.debug("Updating a Beer...");
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting a Beer...");
    }
}
