public class primeNumberSeries
    {
        static boolean fun(int n)
        {
            if (n <= 1)
                return false;

            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;

            return true;
        }
        static void fun2(int n)
        {
            for (int i = 2; i <= n; i++)
            {
                if (fun(i))
                    System.out.print(i + " ");
            }
        }
        public static void main(String[] args)
        {
            int n = 10;
            fun2(n);
        }
    }


