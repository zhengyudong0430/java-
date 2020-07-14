

import java.util.*;

public class Replacement {
    public static String replaceSpace(String iniString, int length) {
        // write code here
     char []a = iniString.toCharArray();
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i<length;i++) {
      if(a[i]==' ') {
          sb.append("%20");
      }else {
          sb.append(a[i]);
      }
      }
      return sb.toString();
    }

}