class Student{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
}
public class GetSet{
public static void main(String[] args) {
    Student s = new Student();
    s.setName("Kieza");
    System.out.println(s.getName());
}
}