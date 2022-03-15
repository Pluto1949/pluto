
import java.util.*;
import java.io.*;

public class demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = " ";
        int x = 0;
        int y = 0;
        s = br.readLine();
        x = Integer.parseInt(s);//把s传给x
        if (x <= 0)
            y = 0;
        else if (x > 0 && x < 5)
            y = 2 * x + 1;
        else if (x >= 5)
            y = x * x - 1;
        System.out.println(y);
    }
}


/*public class Course {
    public static void main(String[] args) {

        Double x = 0.0;
        Double y = 0.0;
        x = Double.parseDouble(args[0]);
        if (x <= 0)
            y = 0.0;
        else if (x > 0 && x < 5)
            y = 2 * x + 1;
        else if (x >= 5)
            y = x * x - 1;
        System.out.println(x);
    }
}*/

/*public class Course {
    public static void main(String[] args) {
        int y = 0;
        int x = 0;
        Scanner reader = new Scanner(System.in);
        x = reader.nextInt();
        if (x <= 0)
            y = 0;
        else if (x > 0 && x < 5)
            y = 2 * x + 1;
        else if (x >= 5)
            y = x * x - 1;
        System.out.println(y);

    }
}*/

/*public class Course {
    public static void main(String[] args) {
        int y = 0;
        int x = 0;
        String s="";
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            s=br.readLine();
            x=Integer.parseInt(s);
            if (x <= 0)
                y = 0;
            else if (x > 0 && x < 5）
                y = 2 * x + 1;
            else if (x >= 5)
                y = x * x - 1;
            System.out.println(y);
        }catch(IOException e){}
    }
}*/
