package co.coomeva.coonectados.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "mpLiquidacionNuevaEntityManagerFactory", 
transactionManagerRef = "mpLiquidacionNuevaTransactionManager", basePackages = {
		"co.coomeva.coonectados.afilmed.repositorios" })
public class SqlServerConfig {

	@Autowired
	private Environment env;

	@Bean(name = "mpLiquidacionNuevaDatasource")
	public DriverManagerDataSource mpLiquidacionNuevaDatasource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));

		return dataSource;
	}

	@Bean(name = "mpLiquidacionNuevaEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource((javax.sql.DataSource) mpLiquidacionNuevaDatasource());
		em.setPackagesToScan("co.coomeva.coonectados.afilmed.modelos");

		HibernateJpaVendorAdapter vendoAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendoAdapter);

		Map<String, Object> properties = new HashMap<>();
		properties.put("hibernate.show-sql", env.getProperty("spring.jpa.show-sql"));
		properties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
		properties.put("hibernate.dialect", env.getProperty("spring.jpa.database-platform"));

		em.setJpaPropertyMap(properties);

		return em;
	}

	@Bean(name = "mpLiquidacionNuevaTransactionManager")
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());

		return transactionManager;
	}

}
