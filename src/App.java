import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {
    public static void main(String[] args) throws Exception {
        String path="/Users/sesisoft/Desktop/txts";
       try {
        File dir = new File("/Users/sesisoft/Desktop/txts");
        File files[] = dir.listFiles();
        List<String>texts=new ArrayList<>();
        boolean flag=false;
        for(File f:files){
            String fileName=f.getName();
            System.out.println(fileName);
            BufferedReader txtFile = new BufferedReader(new FileReader(path+"/"+fileName));  
            while (true) {
                String text=txtFile.readLine();
                if(text==null){
                    break;
                }
                if(text.contains(">")){
                    String text2=delete(text);
                    System.out.println(fileName+": "+text2);
                    texts.add(text2);
                    flag=true;
                }
            }
            if(flag){
                XSSFWorkbook xssfWb =  new XSSFWorkbook(); 
                XSSFSheet xssfSheet = xssfWb.createSheet(fileName);
                for(String text3:texts){
                    
                }
                flag=false;
            }
        }
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
        return String.valueOf(chars).replaceAll("[#,\",rt]", "").replace("\\", "");
    }
}
