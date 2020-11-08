package expt3;
import java.util.Scanner;
public class Test {
public static void testTwo(String y,Doctoralcandidate m,Doctoralcandidate n) throws Trydemo{
	if (y.equals("1")){//本来是m.equals  改成y.equals了。因为y是字符串类型，equals是判断字符串相等的方法。m是一个Doctoralcandidate的类，没法用equals
	System.out.println("您已缴费成功！");
	System.out.println(m.Name +"   男,26,学费：4500,工资：10000,应纳税额："+(0.03*(m.getPay()-m.getFee()-3000)));
	System.out.println("您已缴费成功！");
	System.out.println(n.Name +"   女,24,学费：4300,工资：8000,应纳税额："+(0.03*(n.getPay()-n.getFee()-3000)));}
	else{
	    System.out.println("error");}//throw只能跟try catch配合用，这里直接System输出error就可以给用户显示出错了。
	}
public static void main(String[] args) {
Doctoralcandidate a = new Doctoralcandidate("张思锐","男",26,4500,10000);
Doctoralcandidate b = new Doctoralcandidate("李丝丝","女",24,4300,8000);
try{
	System.out.println("李丝丝，女，24");
	System.out.println("应交纳学费："+b.getFee()+"缴费完成后请输入1");
	System.out.println("张思锐，男，26");
	System.out.println("应交纳学费："+a.getFee()+"缴费完成后请输入1");
	Scanner i= new Scanner(System.in);
	String x = i.nextLine();
	testTwo(x,a,b);
	System.out.println("------查询完毕------");
	System.out.println("张思锐,男,26,学费为：4500,工资为：10000,应纳税额："+(0.03*(a.getPay()-a.getFee()-3000)));
	System.out.println("李丝丝,女,24,学费为：4300,工资为：8000,应纳税额："+(0.03*(b.getPay()-b.getFee()-3000)));
}
catch(Exception e){
	System.out.println("程序出错啦！");
    e.printStackTrace();
    }
}
}
