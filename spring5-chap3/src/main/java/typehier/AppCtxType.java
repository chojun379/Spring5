package typehier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtxType {

	@Bean
	public ConsolePrinter printer() {
		return new ConsolePrinter();
	}
	
}
