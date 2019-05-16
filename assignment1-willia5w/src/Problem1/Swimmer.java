package Problem1;

/**
 *
 *
 * Class Problem1.Swimmer contains information about a swimmer.
 * This class is used as a part of Problem 1.
 **/
public class Swimmer {
    private String firstName;
    private String lastName;
    private SwimTimes swimTimes;


    /**
     * Constructor that creates a new Problem1.Swimmer object with the
     * specified first name, last name and best backstroke time.
     *
     * @param firstName             - swimmer's first name
     * @param lastName              - swimmer's last name
     * @param swimTimes             - swimmer's swim times
     **/
    public Swimmer(String firstName, String lastName, SwimTimes swimTimes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.swimTimes = swimTimes;
    }

    /**
     * Returns the swimmer's first name
     * /@return - swimmer's first name
     **/
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Returns the swimmer's last name
     * /@return - swimmer's last name
     **/
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Returns the swimmer's swim times
     * /@return - swimmer's swim times
     **/
    public SwimTimes getSwimTimes() {
        return this.swimTimes;
    }
}