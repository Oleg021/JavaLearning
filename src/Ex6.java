public class Ex6 {

    public static void main(String[] args) {
        double[] arr = new double[2];
        arr[0] = 1;
        arr[1] = 2;
        inc(arr);
    }

    public static void inc(double[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i]= (double)(a[i]*1.1);
            System.out.println(a[i]);
        }

    }
}
