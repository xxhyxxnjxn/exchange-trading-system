package exchange.exchanetradingsystem.trading.domain.test;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "test")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;
}
