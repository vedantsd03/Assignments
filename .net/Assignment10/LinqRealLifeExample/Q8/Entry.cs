//Q9.show max min and average value of numerinstock.

namespace ConsoleApplication3
{

    class ProductInfo
    {
        public string Name { get; set; }
        public string Description { get; set; }
        public int NumberInStock { get; set; }
        public override string ToString()
        {
            return string.Format("Name={0}, Description={1}, Number in Stock={2}",
            Name, Description, NumberInStock);
        }
    }

    class Entry
    {
        static void Main(string[] args)
        {
            Console.WriteLine("***** Fun with Query Expressions *****\n");
            // This array will be the basis of our testing...
            ProductInfo[] itemsInStock = new[]
            {
                new ProductInfo{ Name = "Mac's Coffee", Description = "Coffee with TEETH",
                                         NumberInStock = 24},
                new ProductInfo { Name = "Milk Maid Milk",Description = "Milk cow's love",
                                            NumberInStock = 100},
                new ProductInfo{ Name = "Pure Silk Tofu",  Description = "Bland as Possible",
                                            NumberInStock = 120},
                new ProductInfo{ Name = "Cruchy Pops",  Description = "Cheezy, peppery goodness",
                                        NumberInStock = 2},
                new ProductInfo{ Name = "RipOff Water",   Description = "From the tap to your wallet",
                                        NumberInStock = 100},
                new ProductInfo{ Name = "Classic Valpo Pizza", Description = "Everyone loves pizza!",
                                        NumberInStock = 73}
            };

            //using LINQ

            var resultmax = (from i in itemsInStock select i.NumberInStock).Max();
            Console.WriteLine(resultmax);
            var resultmin = (from i in itemsInStock select i.NumberInStock).Min();
            Console.WriteLine(resultmin);
            var resultavg = (from i in itemsInStock select i.NumberInStock).Average();
            Console.WriteLine(resultavg);


            Console.WriteLine();

            //using Lamda
            var resmax = (itemsInStock.Select(i => i.NumberInStock)).Max();
            Console.WriteLine(resmax);
            var resmin = (itemsInStock.Select(i => i.NumberInStock)).Min();
            Console.WriteLine(resmin);
            var resavg = (itemsInStock.Select(i => i.NumberInStock)).Average();
            Console.WriteLine(resavg);


        }
    }
}
