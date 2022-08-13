package coconutmt.studysms.util;

import java.util.Random;

public class RandomN {

    /*
        返回随机四位数字
     */
    public static String get(){
        //定义取值范围
        String str = "0123456789";
        //容量为4
        StringBuilder sb = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            //遍历4次，拿到某个字符并且拼接
            char ch = str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        return sb.toString();
    }
}
