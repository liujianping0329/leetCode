
import java.io.*;
import java.util.*;

public class Main46 {


    public static void main(String[] args) {
        List<String> lines=readFile("D://article.txt");
        List<String> words = getWords(lines);
        Map<String,Integer> count=new HashMap<>();
        for (String word : words) {
            if(count.get(word)==null){
                count.put(word,1);
            }else{
                count.put(word,count.get(word)+1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(count.entrySet());

        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Integer> stringIntegerEntry : list) {
            System.out.println(stringIntegerEntry.getKey()+" "+
                    stringIntegerEntry.getValue());
        }
    }

    private static List<String> getWords(List<String> lines) {
        List<String> words=new ArrayList<>();
        for (String line : lines) {
            String[] sentences=null;
            if(line.contains(".")){
                sentences = line.split("\\.");
            }else{
                sentences=new String[]{line};
            }

            for (String sentence : sentences) {
                String[] parts=null;
                if(sentence.contains(",")){
                    parts = sentence.split(",");
                }else{
                    parts=new String[]{sentence};
                }

                for (String part : parts) {
                    if(part.contains(" ")){
                        words.addAll(Arrays.asList(part.split(" ")));
                    }else{
                        words.add(part);
                    }
                }
            }
        }
        return words;
    }

    private static List<String> readFile(String path) {
        List<String> ans=new ArrayList<>();
        try {
            FileReader fileReader=new FileReader(path);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line="";
            while((line=bufferedReader.readLine())!=null){
                if(!line.trim().equals("")){
                    ans.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return ans;
    }


}
