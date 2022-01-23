package com.everis;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

@Log4j2
@Configuration
public class filtergateway {
	@Bean
	@Order(-1)
	public GlobalFilter a() {
		return (exchange, chain) ->{
		log.info("primer filtro");
		return chain.filter(exchange).then(Mono.fromRunnable(() -> {
			log.info(" 3 filtro");
		}}};
		
		@Bean
		@Order(0)
		public GlobalFilter b() {
			return (exchange, chain) ->{
			log.info("primer filtro");
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				log.info(" 3 filtro");
			}}};
			
			@Bean
			@Order(1)
			public GlobalFilter c() {
				return (exchange, chain) ->{
				log.info("primer filtro");
				return chain.filter(exchange).then(Mono.fromRunnable(() -> {
					log.info(" 3 filtro");
				}}};
};
