package committeeDeliveryMechanism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({ "sa.gov.sfd.committee","committeeDeliveryMechanism" })
public class CommitteeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommitteeApplication.class, args);
	}

}