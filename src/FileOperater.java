import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileOperater
{
    public void writeData(ArrayList<ArrayList<Integer>> size_10, ArrayList<ArrayList<Long>> time_10) throws IOException
    {
        FileOutputStream fout1 = new FileOutputStream("Size_Data.txt", true);
        ObjectOutputStream oout1 = new ObjectOutputStream(fout1);
        oout1.writeObject(size_10);
        oout1.close();
        fout1.close();
        FileOutputStream fout2 = new FileOutputStream("Time_Data2.txt", true);
        ObjectOutputStream oout2 = new ObjectOutputStream(fout2);
        oout2.writeObject(time_10);
        oout2.close();
        fout2.close();
    }
}
