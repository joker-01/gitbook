import java.io.File;

public class FileRename {
    public static boolean Rename(String oldname,String newname){
        /*旧文件名*/
        File file1 = new File(oldname);

        /*新文件名*/
        File file2 = new File(newname);

        /*重命名*/
        return file1.renameTo(file2);

    }

    public static void main(String [] args){

        System.out.println("Rename file:"+Rename("C:\\123.txt" ,"C:\\456.txt"));
        System.out.println("Rename directory:"+Rename("C:\\hello" , "C:\\world"));
    }
}