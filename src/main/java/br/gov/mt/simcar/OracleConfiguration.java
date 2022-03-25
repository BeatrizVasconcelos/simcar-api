package br.gov.mt.simcar;

import oracle.jdbc.pool.OracleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@Profile("oracle")
public class OracleConfiguration {
    @Bean
    public DataSource dataSource() throws SQLException {
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser("simcar");
        dataSource.setPassword("simcar234");
        dataSource.setURL("jdbc:oracle:thin:@//192.168.56.40:1521/orasimc");
        dataSource.setFastConnectionFailoverEnabled(true);
        dataSource.setImplicitCachingEnabled(true);
        return dataSource;
    }
}
