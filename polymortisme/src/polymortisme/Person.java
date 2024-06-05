package polymortisme;

public class Person {
    public String nama;
    public String alamat;
    public String Notelp;
    public String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.nama = name;
        this.alamat = address;
        this.Notelp = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return  nama+" asal dari "+alamat;
    }
}
