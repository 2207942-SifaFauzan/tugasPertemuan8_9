package polymortisme;

public class Staff extends Employee {
    private String gelar;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, Mydate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.gelar = title;
    }

    @Override
    public String toString() {
        return nama+" memiliki gelar "+gelar;
    }
}
