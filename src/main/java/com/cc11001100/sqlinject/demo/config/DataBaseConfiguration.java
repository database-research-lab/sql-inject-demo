package com.cc11001100.sqlinject.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

/**
 * @author CC11001100
 * @date 2017/10/7 3:18
 * @email CC11001100@qq.com
 */
@Configuration
public class DataBaseConfiguration {

    @Qualifier("mysql")
    @Bean
    @ConfigurationProperties(prefix = "c3p0")
    public DataSource dataSource(){
        // 我靠Druid会filter sql注入的...
//        return new DruidDataSource();
        return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(@Qualifier("mysql") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
