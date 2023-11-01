//Q1.display all number<=5

namespace ConsoleApplication3
{
    internal class Class3
    {
        static void Main(string[] args)
        {
            QueryOverInts();
        }
        static void QueryOverInts()
        {
            int[] a = { 5, 8, 9, 2, 1 };

            var subset = from i in a where i <=5 select i;

            // LINQ statement evaluated here!
            foreach (var i in subset)
                Console.WriteLine("{0} < 10", i);
            Console.WriteLine();

            //using Lamda
            var subset2 = a.Where(r => r<=5).Select(c => c);
            foreach (var i in subset2)
                Console.WriteLine(i);

        }
    }
}
