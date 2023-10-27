//Accept number of rows from user and then for each rows how many column required. Display jagged Array

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class JaggedArray
    {
        static int[][] CeateArray()
        {
            Console.WriteLine("Enter the value for Column : ");
            int[][] arr = new int[int.Parse(Console.ReadLine())][];
            for(int i= 0; i<arr.Length;i++)
            {
                Console.Beep();
                Console.Write($"Enter the value for Rows of {i} Column : ");
                 arr[i] = new int[int.Parse(Console.ReadLine())];
            }
            Console.WriteLine("*****Now Give the Values*****");

            for (int i = 0; i<arr.Length; i++)
            {
                for (int j = 0; j<arr[i].Length; j++)
                {
                    Console.WriteLine($"Enter the Value for arr[{i}][{j}] : ");
                    arr[i][j]=int.Parse(Console.ReadLine());
                }
                Console.WriteLine();
            }
            return arr;
        }

        static void DispArray(int[][] arr)
        {
            for(int i= 0;i<arr.Length;i++)
            {
                for(int j= 0; j<arr[i].Length; j++)
                {
                    Console.Write(arr[i][j]+" ");
                }
                Console.WriteLine();
            }
        }
        public static void Main(string[] args)
        {
            int [][] arr=JaggedArray.CeateArray();
            Console.WriteLine("Displaying Array : \n\n");
            JaggedArray.DispArray(arr);
        }
    }
}
