package co.za.playsafe.endpoints;

//import co.za.playsafe.config.EndpointProfileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.net.InetAddress;
import java.net.UnknownHostException;

@EnableAutoConfiguration
@EnableSwagger2
@SpringBootApplication
@ComponentScan("co.za.playsafe")
public class EndpointsApplication  {

//	private static final Logger log = LoggerFactory.getLogger(EndpointsApplication.class);

	private final Environment env;

	public static String abbotEnvironment;

	public EndpointsApplication(Environment env) {
		this.env = env;
	}

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication.run(EndpointsApplication.class, args);

//		SpringApplication app = new SpringApplication(EndpointsApplication.class);

//		EndpointProfileUtil.addDefaultProfile(app);
//		Environment env = app.run(args).getEnvironment();
//		abbotEnvironment=env.getActiveProfiles()[0];
//		String protocol = "http";
//		if (env.getProperty("server.ssl.key-store") != null) {
//			protocol = "https";
//		}

//		log.info("Endpoints Application is running! Access URLs",
//				env.getProperty("spring.application.name"),
//				protocol,
//				env.getProperty("server.port"),
//				protocol,
//				InetAddress.getLocalHost().getHostAddress(),
//				env.getProperty("server.port"),
//				env.getActiveProfiles());

	}

}

