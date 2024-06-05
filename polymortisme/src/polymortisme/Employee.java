package polymortisme;

public class Employee extends Person {
    public String kantor;
    public double gaji;
    public Mydate TglKerja;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, Mydate dateHired) {
        super(name, address, phoneNumber, email);
        this.kantor = office;
        this.gaji = salary;
        this.TglKerja = dateHired;
    }

    @Override
    public String toString() {
        return nama+" mempunyai gaji "+gaji;
    }
}
