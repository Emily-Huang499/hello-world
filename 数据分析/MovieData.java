import net.sf.json.JSON;
import net.sf.json.JSONObject;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MovieData {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:/数据分析/movieTest.json");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        HashMap<String , Integer> countMap = new HashMap<String, Integer>();

        String line = "";
        while (br.readLine()!= null){
            JSONObject jsonObject = JSONObject.fromObject(line);
            String movieId = jsonObject.getString("movie");
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
            System.out.println(entry.getKey() + "---->" + entry.getValue() +"\r\n");
        }
    }
}
