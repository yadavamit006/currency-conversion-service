package com.sample.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange",url = "http://localhost:8000")
@FeignClient(name = "currency-exchange")//we give name application name
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retreiveCurrencyExchange(@PathVariable String from,@PathVariable String to);

}
