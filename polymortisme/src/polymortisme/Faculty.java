package polymortisme;

public class Faculty extends Employee {
    public int JamKerja;
    public String Pangkat;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, Mydate dateHired, int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.JamKerja = officeHours;
        this.Pangkat = rank;
    }

    @Override
    public String toString() {
        return nama+" mempunyai pangkat "+Pangkat;
    }
}
