
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factorial
{
    public class Class1
    {
        public int fact(int x)
        {
            int num= 1;
            for(int i = 1; i<=x; i++)
            {
                num*=i;
            }
            return num;
        }
    }
}
