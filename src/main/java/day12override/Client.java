package day12override;

public class Client
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee();
        employee1.setId(2354);
        employee1.setName("suguna");
        employee1.setSalary(4000);

        Employee employee2 = new Employee();
        employee2.setId(6542);
        employee2.setName("ganga");
        employee2.setSalary(8000);

        display(employee1);
        display(employee2);
    }

    private static void display(Employee obj)
    {
        System.out.println(obj);
    }

//    private static void display(T obj)
//    {
//             System.out.println(obj);
//    }
}
