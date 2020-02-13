package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Joel Gayle on 12 Feb, 2020
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId){
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Beer One")
                .beerStyle("Pale Ale")
                .build();
    }
}
