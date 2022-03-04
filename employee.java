public class employee {
    int empid;
    string empname;
    int salary;
    int depto;

    void display() {
        system.out.println(empid);
        system.out.println(empname);
        system.out.println(empsalary);
        system.out.println(deptono);
    }

    public static void main(string[])

    {
    employee emp1=new employee()  //first employee
    emp1.empid=101;
    emp1.empname="suguna";
    emp1.salary=2000;
    emp1.deptno=10;
    emp1.display();

     employee emp2=new employee();//second employee
     emp2.empid=105;
     emp2.empname=ganga;
     emp2.salary=4000;
     emp2.deptno=15;
     emp2.display();
    }

}