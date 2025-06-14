package exchange.exchanetradingsystem.trading.presentation.in.web;

import exchange.exchanetradingsystem.trading.domain.test.Test;
import exchange.exchanetradingsystem.trading.infrastructure.out.persistence.test.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestRepository repository;

    @GetMapping
    public Optional<Test> test(){
        return repository.findAll();
    }
}
