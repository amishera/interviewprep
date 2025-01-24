package jdk16;

public class RecordExample {
    public record EmpRecord(int id, String name){}

    public static void main(String[] args) {
        EmpRecord empRecord = new EmpRecord(10, "John");
        System.out.println(empRecord.id());
        System.out.println(empRecord.name());
    }
}
