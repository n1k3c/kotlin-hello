package intro.interop;

import java.util.List;

import intro.classes.CustomerJava;

/**
 * Created by nikola on 6/9/17.
 */
public interface CustomerRepository {

    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}
