package atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ATMConfig {
    @Bean
    public DataSourceFile dataSource() {
        return new DataSourceFile();
    }

    @Bean
    public Bank bank() {

        return new Bank("My bank", dataSource());
    }

    @Bean
    public ATM atm() {

        return new ATM(bank());
    }

}
