package nguyenvanphituoc.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication(scanBasePackages = {"nguyenvanphituoc"})
//@ComponentScan({ "configuration", "controller", "dao", "exception", "inf", "model", "service", "util" })
@ComponentScan(basePackages = "nguyenvanphituoc")
@PropertySource(value = { "classpath:application.properties" })
@EnableJpaRepositories("nguyenvanphituoc.dao")
@EntityScan("nguyenvanphituoc.model")
public class Application extends SpringBootServletInitializer {
	static String RESOURCES_DIR;
	public static void main(String[] args) {
		RESOURCES_DIR = "/resources/";
		SpringApplication.run(Application.class, args);
	}
	 @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
//	@Bean
//	CommandLineRunner init(StorageService storageService) {
//		return (args) -> {
//			storageService.deleteAll();
//			storageService.init(); 
//		};
//	}
//	@Override
//    public void onStartup(ServletContext container) {
//      XmlWebApplicationContext appContext = new XmlWebApplicationContext();
//      appContext.setConfigLocation("/WEB-INF/spring/springmvc-config.xml");
//
//      ServletRegistration.Dynamic dispatcher =
//        container.addServlet("dispatcher", new DispatcherServlet(appContext));
//      dispatcher.setLoadOnStartup(1);
//      dispatcher.addMapping("/");
//    }
}
