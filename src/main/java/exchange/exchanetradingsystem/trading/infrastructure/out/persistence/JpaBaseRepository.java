package exchange.exchanetradingsystem.trading.infrastructure.out.persistence;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.Optional;

@NoRepositoryBean
public interface JpaBaseRepository<T, ID> extends Repository<T, ID> {
    Optional<T> findAll();
    Optional<T> findById(ID id);
    <S extends T> T save(T entity);
    boolean deleteById(ID id);
}
