// use the Lambda function to Find the Sum and Product
delegate int doJob(int a , int b);
internal class Program
{
    static void Main(string[] args)
    {

        doJob add = (n, m) => n+m;
        Console.WriteLine("Addition : "+add(4,5));

        doJob multi= (n, m) => n*m;
        Console.WriteLine("Multiplaction : "+multi(5,5));
    }
}
