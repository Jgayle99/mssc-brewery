package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by Joel Gayle on 12 Feb, 2020
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
