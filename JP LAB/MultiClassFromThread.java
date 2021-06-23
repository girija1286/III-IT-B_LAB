class A extends Thread
{

public void run()
{
for (int i=0;i<=5;i++)
{
System.out.println("MAngo");
}
}
}

class B extends Thread
{

public void run()
{
for (int i=0;i<=7;i++)
{
System.out.println("Smruthika");
}
}
}

class C extends Thread
{

public void run()
{
for (int i=0;i<=5;i++)
{
System.out.println("IT - IT");
}
}
}


class MultiClassFromThread
{
public static void main(String args[])
{
A a = new A();
B b  = new B();
C c = new C();
a.start();
b.start();
c.start();

System.out.println(" Hello");

}
}