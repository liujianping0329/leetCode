public class practive1031_Recursion_2 {
    public static void main(String[] args) {

        int day = 1;
        int peachnum = practive1031_Recursion_2.peach(day);
        if (peachnum != 1) {
            System.out.println(day + "天有" + peachnum + "桃子");
        }

    }

    public static int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("天數不在範圍內");
            return -1;
        }

    }
}

class person{
    String name;
    int age;


}
