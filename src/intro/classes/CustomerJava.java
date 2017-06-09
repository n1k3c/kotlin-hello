package intro.classes;

import org.jetbrains.annotations.NotNull;

/**
 * Created by nikola on 6/6/17.
 */
public class CustomerJava {

    private int id;

    private String name;

    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void prettyPrint() {
        System.out.printf("Id %id - Name: %s", id, name);
    }

    public @NotNull String neverNull() {
        return "A String";
    }

    public String sometimesNull() {
        return "A String";
    }
}
