/**
 * Created by 没想法的岁月 on 2018/4/2.
 */
public class Practice {
    public static void main(String[] args) {
        String fileName = "abc.java;hello.class;hello.txt";

        //获取以hello 开头的文件名的后缀
        test1(fileName);

        //把单词的首字母大写
        test2(fileName);

    }

    private static void test2(String fileName) {
        String[] split = fileName.split(";");
        for (String name: split
             ) {
            //截取到的第一个字母
            String sb = name.substring(0, 1).toUpperCase();
            //截取后面的字符
            String last = name.substring(1);
            System.out.println(sb+last);
        }

    }

    private static void test1(String fileName) {
        //1、获取每个文件名称
        String[] split = fileName.split(";");
        for (int i = 0; i < split.length; i++) {
            if (split[i].startsWith("hello")) {
//                System.out.println(split[i].substring("hello".length(),split[i].length()));
                int index = split[i].lastIndexOf(".");
                String newName = split[i].substring(index);
                System.out.println(newName);
            }
        }
    }

}
