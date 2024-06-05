package polymortisme;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Fauzan", "Tasikmalaya", "089323024823", "fauzan@gmail.com");
        System.out.println(person);
        Student student = new Student("Risna", "Subang", "089343285643", "Risna@gmail.com", Student.MABA);
        System.out.println(student);
        Employee employee = new Employee("Yayas", "Cimahi", "083938432453", "yayas@gmail.com", "JICA-305", 50000, new Mydate(2020, 5, 20));
        System.out.println(employee);
        Faculty faculty = new Faculty("Jidan", "Cianjur", "038934832472", "jidan@gmail.com", "JICA-406", 60000, new Mydate(2019, 8, 15), 10, "Professor");
        System.out.println(faculty);
        Staff staff = new Staff("Mufid", "Sukabumi", "089675458432", "mufid@gmail.com", "JICA-323", 45000, new Mydate(2018, 11, 30), "Manager");        System.out.println(staff);
    }
    
}
