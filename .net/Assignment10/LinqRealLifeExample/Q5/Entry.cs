//Q5.Display all product name having letter ‘s’ in it’s name in ascending order

using System;
using System.Linq;
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
            var result = from i in itemsInStock where i.Name.Contains("s") orderby i.Name select i;
            foreach (var item in result)
            {
                Console.WriteLine(item);
            }
            Console.WriteLine();
            
            //using Lamda
            var res = itemsInStock.Where(i=>i.Name.Contains("s")).OrderBy(i=>i.Name).Select(i=>i);
            foreach (var item in res)
            {
                Console.WriteLine(item);
            }
        }
    }
}
