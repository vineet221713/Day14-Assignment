package Day12.Assigment.Qustion1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qustion1 {
    public static void main(String[] args) {

        String str="Java is a high-level, class-based, object-oriented programming language that is designed to have\n" +
                "\n" +
                "as few implementation dependencies as possible. It is a general-purpose programming language\n" +
                "intended to let programmers write once, run anywhere (WORA),\n" +
                "meaning that compiled Java code can run on all platforms that support Java without the need to\n" +
                "recompile. Java applications are typically compiled to bytecode that can run on any Java virtual\n" +
                "machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to\n" +
                "C and C++, but has fewer low-level facilities than either of them. The Java runtime provides\n" +
                "dynamic capabilities (such as reflection and runtime code modification) that are typically not\n" +
                "available in traditional compiled languages. As of 2019, Java was one of the most popular\n" +
                "programming languages in use according to GitHub, particularly for client–server web applications,\n" +
                "with a reported 9 million developers.";
        Pattern p=Pattern.compile("Java");
        Matcher m=p.matcher(str);
        int count=0;
        while(m.find()){
            count++;
            System.out.println(m.start()+"--------"+m.end()+"---------"+m.group());
        }
        System.out.println("The no of occurrences: "+count);


    }

}
