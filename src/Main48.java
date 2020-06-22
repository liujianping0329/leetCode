public class Main48 {
    public static final String filePath = "C:\\temp\\";

    public static final String fileName = "yahooTest.html";

    public static void main(String[] args) {
        GetDataFromFile gd = new GetDataFromFile();
        String buf = gd.getFileData(filePath + fileName);
        int start; // 検索する文字列の開始インデックス。ここから
        int end; // 検索する文字列の終了インデックス。ここまで
        int ptr = 0; // 次のループで検索する文字列の開始インデックス。
        int endPtr;// 検索終了インデックス。
        endPtr = buf.lastIndexOf("a href=");
        StringBuilder sb=new StringBuilder(buf);
        while(ptr < endPtr) {
            start = sb.indexOf("a href=");
            sb.delete(0,start);
            ptr+=start;
            end = sb.indexOf("\"");
            while(!sb.substring(end-4,end).equals(".jpg")){
                sb.delete(0,end+1);
                ptr+=(end+1);
                end = sb.indexOf("\"");
                if(end<4&&end>=0){
                    end=4;
                }else if(end<0){
                    System.out.println("end");
                    return;
                }
            }
            System.out.println(sb.substring(0,end));
        }
        }
}
