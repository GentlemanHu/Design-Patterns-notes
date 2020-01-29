package Adapter;

import java.io.*;
import java.util.*;

/**
 * FileProperties
 */
public class FileProperties extends Properties implements FileIO {

      /**
      *
      */
      private static final long serialVersionUID = 1L;

      public void readFromFile(final String filename) throws IOException {

            load(new FileInputStream(filename));
      }

      public void writeToFile(final String filename) throws IOException {
            store(new FileOutputStream(filename), "written by FileProperties");

      }

      public void setValue(final String key, final String value) {
            setProperty(key, value);

      }

      public String getValue(final String key) {
            return getProperty(key);

      }

      public String getAll(final String filename) throws IOException {
            StringBuffer sBuffer = new StringBuffer();
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String var;
            while ((var = in.readLine()) != null) {
                  sBuffer.append(var);
                  sBuffer.append("\r\n");
            }
            int last = sBuffer.lastIndexOf("\n");
            if (last >= 0) {
                  sBuffer.delete(last, sBuffer.length());
            }
            in.close();
            return sBuffer.toString();
      }

}