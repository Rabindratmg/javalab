import java.io.*;
public class ByteStrean {
    public static void main(String args[]) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("C:\\Users\\acer\\IdeaProjects\\FileSystem\\src\\File\\input.txt");
            out = new FileOutputStream("C:\\Users\\acer\\IdeaProjects\\FileSystem\\src\\File\\output.txt");
            int a;
            while((a= in.read())!=-1){
                out.write(a);
            }
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
        finally{
            in.close();
            out.close();
        }

    }

}
