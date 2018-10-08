package lab;

import java.util.Arrays;

public class Exam07 {
	
    static String[] convertArray(String path) {
        // 구현할 부분
    	return path.split("/");
    }

    public static void main(String[] args) {
        String[] a = { "c:/data/student/lecture.docx",
                       "c:/www/mainpage.html",
                       "c:/program files/java/javac.exe" };
        for (String s : a) {
            String[] temp = convertArray(s);
            System.out.println(Arrays.toString(temp));
        }
    }
}
