package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;
import java.util.UUID;

/**
 * Created by Joel Gayle on 12 Feb, 2020
 */
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId){
        return null;
    }
    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2) {
        return null;
    }
    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2){
    }
    @Override
    public void deleteById(UUID beerId) {
    }
}