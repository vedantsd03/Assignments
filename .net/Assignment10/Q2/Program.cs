/*create the delegate int doJob(int a,intb) note here the method has the return type
and multiplay and add method as the anonymous method */
delegate int doJob(int a , int b);
internal class Program
{
    static void Main(string[] args)
    {
        doJob add, multi;
        add=delegate(int a,int b) { return a+b; };
        multi=delegate(int a,int b) { return a*b; };

        Console.WriteLine($"Addition is  : {add(2,4)}");
        Console.WriteLine($"Multiplaction is  : {multi(4,7)}");

    }
}
