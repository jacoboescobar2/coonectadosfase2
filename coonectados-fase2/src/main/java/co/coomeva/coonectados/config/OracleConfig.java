package co.coomeva.coonectados.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * OracleConfig Esta clase representa la capa de acceso al DataSource de la conexion a la BD
 *
 * @author JhonCTorres
 * @since 07/09/2020
 * 
 *
 * Historia de modificaciones
 * Autor 		Fecha		 Modificación
 * JhonCTorres 07/09/2020 creación de la clase
 * -------------------------------------------------------------
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "bitacoraEntityManagerFactory", 
transactionManagerRef = "bitacoraTransactionManager", basePackages = {"co.coomeva.coonectados.bitacora.repositorios"})
public class OracleConfig {
	
	@Autowired
	private Environment env;
	
	@Primary
	@Bean(name = "bitacoraDatasource")
	public DriverManagerDataSource bitacoraDatasource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(env.getProperty("db2.datasource.url"));
		dataSource.setUsername(env.getProperty("db2.datasource.username"));
		dataSource.setPassword(env.getProperty("db2.datasource.password"));
		dataSource.setDriverClassName(env.getProperty("db2.datasource.driver-class-name"));
		
		return dataSource;
	}
	
	@Primary
	@Bean(name = "bitacoraEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource((javax.sql.DataSource) bitacoraDatasource());
		em.setPackagesToScan("co.coomeva.coonectados.bitacora.modelos");
		
		HibernateJpaVendorAdapter vendoAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendoAdapter);
		
		Map<String, Object> properties = new HashMap<>();
		properties.put("hibernate.show-sql", env.getProperty("db2.jpa.show-sql"));
		properties.put("hibernate.hbm2ddl.auto", env.getProperty("db2.jpa.hibernate.ddl-auto"));
		properties.put("hibernate.dialect", env.getProperty("db2.jpa.database-platform"));
		
		em.setJpaPropertyMap(properties);
		
		return em;		
	}
	
	@Primary
	@Bean(name = "bitacoraTransactionManager")
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		
		return transactionManager;
	}

}
