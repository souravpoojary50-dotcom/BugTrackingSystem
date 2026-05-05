import java.io.*;
import java.util.*;

public class FileHandler {
    // File handling utility class
    private static final String FILE_NAME = "bugs.txt";
    
    public static void saveBugs(List<Bug> bugs) throws IOException {
        // TODO: Implement save functionality
        BufferedWriter bw=new BufferedWriter(new FileWriter(FILE_NAME));
        for(Bug b:bugs){
            bw.write(b.toFileString());
            bw.newLine();
        }
        bw.close();
    }
    public static List<Bug> loadBugs() throws IOException {     
        List<Bug> bugs=new ArrayList<>();
        File file=new File(FILE_NAME);
        if(!file.exists()){
            return bugs;
        }
        BufferedReader br=new BufferedReader(new FileReader(FILE_NAME));
        String line;
        while((line=br.readLine())!=null){
            bugs.add(Bug.fromFileString(line));
        }
        br.close();
        return bugs;
    }
}
