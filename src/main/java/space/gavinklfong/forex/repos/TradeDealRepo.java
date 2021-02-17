package space.gavinklfong.forex.repos;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import space.gavinklfong.forex.models.TradeDeal;

public interface TradeDealRepo extends CrudRepository<TradeDeal, Long> {

	Collection<TradeDeal> findByCustomerId(Long customerId);
}
