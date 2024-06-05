package polymortisme;

public class Student extends Person {
    public static final String MABA = "Maba";
    public static final String MALA = "Mahasiswa tingkat 2";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    public String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return nama+" adalah seorang "+status;
    }
}
