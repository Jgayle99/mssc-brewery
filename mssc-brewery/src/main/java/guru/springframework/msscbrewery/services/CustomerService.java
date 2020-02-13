package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by Joel Gayle on 12 Feb, 2020
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
