import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class test {
    @Test
    void faketr() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                email = faker.internet().emailAddress();
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
    }
}
