//display all even number

namespace ConsoleApplication3
{
    internal class Linq_2
    {
        static void Main(string[] args)
        {
            QueryOverInts();
        }
        static void QueryOverInts()
        {
            int[] a = { 5, 8, 9, 2, 1 };

            var subset = from i in a where i%2==0 select i;

            // LINQ statement evaluated here!
            foreach (var i in subset)
                Console.WriteLine(i);
            Console.WriteLine();

            //using Lamda
            var subset2 = a.Where(r =>r%2==0).Select(c => c);
            foreach (var i in subset2)
                Console.WriteLine(i);

        }
    }
}
