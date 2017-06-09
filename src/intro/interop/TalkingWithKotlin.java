package intro.interop;

import java.io.IOException;

import intro.classes.Customer;
import intro.classes.CustomerKotlin;
import intro.classes.CustomerKotlinKt;
import intro.classes.Status;

/**
 * Created by nikola on 6/9/17.
 */
public class TalkingWithKotlin {

    public void loadStats(CustomerKotlin customerKotlin) {

        try {
            customerKotlin.loadStatistics("filename");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Hadi", "mail@mail.com");

        customerKotlin.setEmail("mail@mail.com");

        String field = customerKotlin.someProperty;

        customerKotlin.changeStatus(Status.Current);
        customerKotlin.changeStatus();

        customerKotlin.preferential();

        UtilityClass.prefix("some", "value");

        int copyrightYear = UtilityClass.CopyrightYear;

        CustomerKotlinKt.extenstion(customerKotlin);

    }

}
