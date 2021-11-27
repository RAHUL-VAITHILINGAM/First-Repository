package practiceScenarios.scenarios3;

public abstract class SmartPhone
{
public SmartPhone()
{
System.out.println("Smartphone under development");
}

public abstract int call(int seconds);
public abstract void sendMessage();
public abstract void recieveCall();
void browse()
{
System.out.println("Smartphone Browsing");
}
}


