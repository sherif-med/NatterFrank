package sherif.spring.NatterFrank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sherif.spring.NatterFrank.Model.Application;
import sherif.spring.NatterFrank.Model.Person;
import sherif.spring.NatterFrank.Model.Repositry.ApplicationRepositry;
import sherif.spring.NatterFrank.Model.Repositry.PersonRepositry;

@SpringBootApplication
public class NatterFrankApplication implements CommandLineRunner {

	@Autowired
	PersonRepositry Pr;
	@Autowired
	ApplicationRepositry AR;

	public static void main(String[] args) {
		SpringApplication.run(NatterFrankApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Person P1 = new Person();
		Pr.save(P1);
		Application A1 = new Application();
		AR.save(A1);
	}

}

