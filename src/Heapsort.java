import java.util.ArrayList;

public class Heapsort
{
    public long counter = 0;
    public void heapify(ArrayList<Integer> arr, int root, int length)
    {
        int left = root * 2;
        int right = root * 2 + 1;
        int largest;
        if (left <= length && arr.get(left) > arr.get(root))
            largest = left;
        else
            largest = root;

        if (right <= length && arr.get(right) > arr.get(largest))
            largest = right;

        if (largest != root)
        {
            int temp = arr.get(root);
            counter++;
            arr.set(root, arr.get(largest));
            arr.set(largest, temp);
            heapify(arr, largest, length);
        }
    }

    public void buildHeap(ArrayList<Integer> arr, int length)
    {
        for(int i = length / 2; i > 0; i--)
        {
            this.heapify(arr, i, length);
        }
    }

    public long heapsort(ArrayList<Integer> arr)
    {
        arr.add(0, 0);
        this.buildHeap(arr, arr.size() - 1);
        for(int i = arr.size() - 1; i > 1; i--)
        {
            int temp = arr.get(1);
            arr.set(1, arr.get(i));
            arr.set(i, temp);
            heapify(arr, 1, i - 1);
        }
        arr.remove(0);
        long temp = counter;
        counter = 0;
     //   System.out.println("*****" + temp + "*****");
        return temp;
    }

   /* public static void main(String arg[])
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 100; i++)
        {
            arr.add(i);
        }
        Collections.shuffle(arr);
        for (int i = 0; i < 100; i++)
        {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("");
        new Heapsort().heapsort(arr);
        for (int i = 0; i < 100; i++)
        {
            System.out.print(arr.get(i) + " ");
        }
    } */
}
