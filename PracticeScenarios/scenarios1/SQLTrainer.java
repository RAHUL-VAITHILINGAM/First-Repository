package practiceScenarios.scenarios1;

public class SQLTrainer extends Trainer
{
public SQLTrainer(String dep,String institute)
{
System.out.println("Department : "+dep);
System.out.println("Institute : "+institute);
}
public static void main(String[] args)
{
SQLTrainer ram = new SQLTrainer("SQL","Payilagam");
System.out.println(ram.dept);
System.out.println(ram.institute);
ram.training();
System.out.println(ram.getSalary());
System.out.println(Trainer.name);
}
}
