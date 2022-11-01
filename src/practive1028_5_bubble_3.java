public class practive1028_5_bubble_3 {
    public static void main(String[] args) {
        String a = "Chinese President Xi Jinping called for accelerating the building of a world-class military while touting the fight against COVID-19 as he kicked off a Communist Party congress by focusing on security and reiterating policy priorities. Xi, 69, is widely expected to win a third leadership term at the conclusion of the weeklong congress, which began Oct. 16, cementing his place as China’s most powerful ruler since Mao Zedong.Roughly 2,300 delegates from around the country gathered in the vast Great Hall of the People on the west side of Tiananmen Square amid tight security and under blue skies after several smoggy days in the Chinese capital. Xi described the five years since the last party congress as “extremely uncommon and abnormal,” during a speech that lasted less than two hours — far shorter than his nearly 31/2-hour address at the 2017 congress, because he did not read out the entire work report, which he did five years ago.We must strengthen our sense of hardship, adhere to the bottom-line thinking, be prepared for danger in times of peace, prepare for a rainy day, and be ready to withstand major tests of high winds and high waves,” he said.The full work report used the terms “security” or “safety” 89 times, up from 55 times in 2017, according to a Reuters count, while the use of the word “reform” declined to 48 from 68 mentions five years ago. (Reuters)";

        int[] charnum = new int[26];
        String str = a;
        str = a.trim();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int ascii = (int)c;
                if(ascii >= 65 && ascii <= 90) {
                    int index = ascii - (int)'A';
                    charnum[index] = charnum[index] + 1;
                }
        }
        for (int i = 0; i < charnum.length; i++) {
            if (charnum[i] != 0) {
                System.out.println("字母" + (char)(i + 'A') + "出现:" + charnum[i] + "次");
            }
        }
    }
}





