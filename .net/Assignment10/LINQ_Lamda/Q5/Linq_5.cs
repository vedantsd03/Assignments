//String[] str={“hello”,”hi”,”go”,”bye”}
//Q1.display all string starting with letter h

using System;

namespace ConsoleApplication3
{
    internal class Linq_5
    {
        static void Main(string[] args)
        {
            QueryOverInts();
        }
        static void QueryOverInts()
        {
            String[] str = {"hello","hi","go","bye"};

            var subset = from i in str where i.StartsWith("h") select i;

            // LINQ statement evaluated here!
            foreach (var i in subset)
                Console.WriteLine(i);
            Console.WriteLine();

            //using Lamda
            var subset2 = str.Where(r =>r.StartsWith("h")).Select(c => c);
            foreach (var i in subset2)
                Console.WriteLine(i);

        }
    }
}
