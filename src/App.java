import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       try {
        BufferedReader txtFile = new BufferedReader(new FileReader("/Users/sesisoft/Desktop/txts/storydata_5064000.txt"));  
        List<String>texts=new ArrayList<>();
        while (true) {
            String text=txtFile.readLine();
            if(text==null){
                break;
            }
            if(text.contains(">")){
                texts.add(delete(text));
            }
        }
        System.out.println("abc");
        System.out.println(texts.toString());

        File file = new File("/Users/sesisoft/Desktop/txts/1.xls");
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
    private static String delete(String text) {
        boolean flag=false;
        char[] chars=text.toCharArray();
        int len=chars.length;
        for(int i=0;i<len;i++){
            char c=chars[i];
            if(c=='<'){
                flag=true;
            }else if(c=='>'){
                chars[i]='#';
                flag=false;
            }else if((int)c>=97&&(int)c<=112){
                chars[i]='#';
            }
           
            
            if(flag){
                chars[i]='#';
            }
        }
        return String.valueOf(chars).replace("#", "").replace("\\", "").replace("\"", "").replace("rt", "");
    }
}
