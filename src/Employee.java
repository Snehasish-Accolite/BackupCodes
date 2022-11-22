import java.util.*;
public class Employee {
    String name;
    String designation;
    String number;
    double salary;
    Employee(String name,String designation,String number,double salary)
    {
        this.name=name;
        this.designation=designation;
        this.number=number;
        this.salary=salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(designation, employee.designation) && Objects.equals(number, employee.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, designation, number);
    }

    public static void main(String args[])
    {

        Employee e1=new Employee("Aman","Sales","9434654577",10000);
        Employee e2=new Employee("Stuti","IT","9453214577",15000);
        Employee e3=new Employee("Ritu","Sales","9434654586",20000);
        Employee e4=new Employee("Sneha","IT","9434777577",50000);
        Employee e5=new Employee("Naman","Sales","9434654555",90000);
        Employee e6=new Employee("Priyank","Sales","9434654577",12000);
        Employee e7=new Employee("Arjun","Sales","9434654577",17000);
        Employee e8=new Employee("Ram","HR","9434654577",19000);
        Employee e9=new Employee("Ritu","Sales","9434654586",20000);
        Employee e10=new Employee("Naman","Sales","9434654555",90000);



        List<Employee> listemp=new ArrayList();
        listemp.add(e1);
        listemp.add(e2);
        listemp.add(e3);
        listemp.add(e4);
        listemp.add(e5);
        listemp.add(e6);
        listemp.add(e7);
        listemp.add(e8);
        listemp.add(e9);
        listemp.add(e10);

        Set<Employee> s= new HashSet<Employee>();
        s.addAll(listemp);
        listemp.clear();
        listemp= new ArrayList<Employee>();
        listemp.addAll(s);
        for(Employee e:listemp)
        {
            System.out.println(e.name+"  "+e.designation+"  "+e.number+"  "+e.salary);

        }


    }
}