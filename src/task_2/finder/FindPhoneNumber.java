package task_2.finder;

import java.io.*;

public class FindPhoneNumber {

    private FindPhoneNumber() {
    }

    public static void fileAnalizer(){
        try (
                Reader reader = new BufferedReader(new FileReader("text.txt"));
                Writer writer = new BufferedWriter(new FileWriter("text_new.txt"))
                ){
            String stroka =((BufferedReader) reader).readLine();
            boolean i = false;
                while (stroka !=null){
                    String test = stroka.replaceAll("[1-9]{11}","[ ЗДЕСЬ БЫЛ НОМЕР ТЕЛЕФОНА ]");
                    if (!i){
                        writer.write(test);
                        i=true;
                    }else {
                        writer.write("\n" + test);
                    }
                    //System.out.println(test);
                    stroka = ((BufferedReader) reader).readLine();
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
