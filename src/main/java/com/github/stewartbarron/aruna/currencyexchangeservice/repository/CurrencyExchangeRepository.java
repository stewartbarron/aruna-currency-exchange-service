package com.github.stewartbarron.aruna.currencyexchangeservice.repository;

import com.github.stewartbarron.aruna.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo (String from, String to);
}
