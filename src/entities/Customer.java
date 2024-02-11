package entities;
public class Customer {
    private int id;
    private String firstname;
    private String lastname;
    private String birthdate;
    private String nationality_id;

    public Customer(){

    }
    public Customer(int id, String firstname, String lastname, String birthdate, String nationality_id) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.nationality_id = nationality_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getNationality_id() {
        return nationality_id;
    }

    public void setNationality_id(String nationality_id) {
        this.nationality_id = nationality_id;
    }
}


