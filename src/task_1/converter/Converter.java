package task_1.converter;

import java.io.*;
import java.nio.charset.Charset;

public class Converter {

    public void readTheDoc() {

        try (
                Reader reader = new InputStreamReader(new FileInputStream("somefile.txt"), Charset.forName("UTF-8"));
                Writer writer = new OutputStreamWriter(new FileOutputStream("somefile_new1.txt"), Charset.forName("KOI8-R"))
        ) {

            char[] cbuf = new char[20];
            int b = reader.read(cbuf);
            while (b != -1) {
                System.out.println(b);
                writer.write(cbuf, 0, b);
                b = reader.read(cbuf);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
