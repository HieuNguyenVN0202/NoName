package Modpack;

public class Manager extends Employee implements Manage {
    public Manager(String name, double salary, String department) {
        super(name, salary, department);
    }
    @Override
    public String manager() {
        return "Manager role is manager";
    }
}
