package exchange.exchanetradingsystem.trading.infrastructure.out.persistence.test;

import exchange.exchanetradingsystem.trading.domain.test.Test;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TestRepository {
    private final JpaTestRepository jpaTestRepository;

    public Optional<Test> findAll() {
        return jpaTestRepository.findAll();
    }
}
