package org.tech;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import techno.GsonSample;
import static  org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.text.SimpleDateFormat;
public class MainTest {
    @Test
  void test()throws Exception{
      Gson gson = new Gson();
      GsonSample me = new GsonSample("1","Emp","IT",
           "test",new String[]{"a","b","c"});
      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
      Model mo = new Model(5,"In",
              sdf.parse("17-11-2011"),"acer", Arrays.asList(me));
      String reality=gson.toJson(mo);
     String expected="{\"modelNo\":5,\"modelName\":\"In\",\"PurchasedOn\":\"Nov 17, 2011, 12:00:00 AM\",\"brandName\":\"acer\"," +
             "\"ownedBy\":[{\"id\":\"1\",\"name\":\"Emp\",\"branch\":\"IT\",\"designation\":\"test\",\"languages_known\":[\"a\",\"b\",\"c\"]}]}";
     assertEquals(expected,reality);
     System.out.println("Test Case successfully passed");
    }
   }



