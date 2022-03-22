import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.GroupLayout.Alignment;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {
    public static void main(String[] args) throws Exception {
        String path="/Users/sesisoft/Desktop/txts";
        delete("text");
      /* try {
        File dir = new File("/Users/sesisoft/Desktop/txts");
        File files[] = dir.listFiles();
        List<String>texts=new ArrayList<>();
        boolean flag=false;
        for(File f:files){
            String fileName=f.getName();
            System.out.println(fileName);
            BufferedReader txtFile = new BufferedReader(new FileReader(path+"/"+fileName));  
            int rowNum=0;
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
            /*if(flag){
                XSSFWorkbook xssfWb =  new XSSFWorkbook(); 
                XSSFSheet xssfSheet = xssfWb.createSheet(fileName);
                XSSFRow xssfRow = xssfSheet.createRow(0);
                XSSFCell xssfCell = xssfRow.createCell((short) 0);
                xssfCell.setCellValue("jpan");
                xssfCell = xssfRow.createCell((short) 1);
                xssfCell.setCellValue("kr");
                for(String text3:texts){
                    rowNum=rowNum+=1;
                    xssfRow = xssfSheet.createRow(rowNum);
                    xssfCell = xssfRow.createCell((short) 0);
                    xssfCell.setCellValue(text3);
                    //xssfCell= xssfRow.createCell((short) 1);
                    //xssfCell.setCellValue("text3");
                }
                String localFile = path + "/"+fileName+"ex.xlsx";
                File file = new File(localFile);
                FileOutputStream fos = null;
                fos = new FileOutputStream(file);
                xssfWb.write(fos);

                if (xssfWb != null)	xssfWb.close();
                if (fos != null) fos.close();
                    flag=false;
                }
        }

       } catch (Exception e) {
           e.printStackTrace();
       }*/
    }
    private static String delete(String text) {
        String a="<abfgfdgfdfdfdgfdgdg1>";
        String a2="<f123>";
        a2=a.replaceAll("[^<>$,]", "");
        System.out.println(a2);
       return null;
    }
}
