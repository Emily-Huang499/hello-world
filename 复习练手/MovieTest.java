import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MovieTest {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:/数据分析/movieTest.json");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        HashMap<String,Integer> countMap = new HashMap<String,Integer>();

        String line  = "";
        while ((line = br.readLine())!= null){
            JSONObject jsonObject = JSON.parseObject(line);
            String movieId= jsonObject.getString("movie");
            if (countMap.containsKey(movieId)){
                int count = countMap.get(movieId);
                countMap.put(movieId,count+1);
            }else {
                countMap.put(movieId,1);
            }
        }
        br.close();

        FileOutputStream fos = new FileOutputStream("D:/数据分析/movie-result.txt");

        Set<Map.Entry<String, Integer>> entrySet = countMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet){
            fos.write((entry.getKey() + "---->" + entry.getValue() +"\r\n").getBytes());
        }
        fos.close();
    }
}
