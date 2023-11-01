 // use the Lambda function to Find the factorial
 delegate int doJob(int a);
 internal class Program
 {
     static void Main(string[] args)
     {
         doJob fact = n =>
                         {
                             int fact = 1;
                             if (n == 0)
                                 return 1;
                             else
                             {
                                 for (int i = 1; i <= n; i++)
                                     fact=fact*i;
                                 return fact;
                             }
                         };
          Console.WriteLine("Factorial is  : "+fact(5));
      }
 }
