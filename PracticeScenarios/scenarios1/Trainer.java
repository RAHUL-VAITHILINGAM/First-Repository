package practiceScenarios.scenarios1;


public class Trainer
{
public Trainer()
{
System.out.println("Trainer");
}
static String name = "rahul";
String dept = "Java",institute = "Payilagam";
private int salary = 10000;
public Trainer(String dep,String institute)
{
this.dept = dep;
this.institute = institute;
}
public int getSalary()
{
return this.salary;
}
public void training()
{
System.out.println("Training");
}
public static void main(String[] args)
{
Trainer trainerKumar = new Trainer("CSE","payilagam");
}
}
