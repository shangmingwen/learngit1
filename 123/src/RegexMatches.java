import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
 
public class RegexMatches
{
    public static void main( String args[] ){
 
    	Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户信息：");
        String s = sc.nextLine();

        String regex = "1[3857]\\d{9}";//定义手机好规则
        
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(regex);
        // 现在创建 matcher 对象
        Matcher m = r.matcher(s);
        if (m.find( )) {
           System.out.println("Found value: " + m.group(0) );
           
        } else {
           System.out.println("NO MATCH");
        }
        
   }
}

