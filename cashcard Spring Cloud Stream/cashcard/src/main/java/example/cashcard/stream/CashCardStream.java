package example.cashcard.stream;

import example.cashcard.domain.Transaction;
import example.cashcard.service.DataSourceService;
import java.util.function.Supplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CashCardStream {

    @Bean
    public Supplier<Transaction> approvalRequest(DataSourceService dataSource) {
        // add this function call
        return () -> {
            return dataSource.getData();
        };
    }

    @Bean
    public DataSourceService dataSourceService() {
        return new DataSourceService();
    }
}