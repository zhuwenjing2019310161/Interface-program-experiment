# 接口程序实验
## 一、实验目的  
1、掌握Java中抽象类和抽象方法的定义；  
2、掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；  
3、了解异常的使用方法，并在程序中根据输入情况做异常处理；
## 二、实验内容  
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  
1、设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
2、设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）  
3、编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。
## 三、实验要求
1、在博士研究生类中实现各个接口定义的抽象方法；  
2、对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
3、国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static、final修饰定义。  
4、实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。  
5、根据输入情况，要在程序中做异常处理。
## 四、实验过程  
1、设计两个接口管理：学生管理接口和教师管理接口，分别为：Studentmanagement和TeacherManagment。Studentmanagement接口中包含setFee()和getFee()两个方法，用于获取学生交纳学费和查学费；TeacherManagment接口中包含setPay()和getPay()两个方法，同样用于教师查询和接收薪水。  
2、定义一个Doctoralcandidate类，用于实现接口，定义的成员变量有：Name、sex、age、Fee和Pay。  
3、定义一个Test类，用于实例化两名博士研究生并统计年收入和学费，再计算他们的年应缴纳税额输出。  
4、编写一个异常处理机制，当与输入情况不符时调用此机制进行异常处理。
## 五、实验方法  
方法一：  学生管理接口中学生交纳学费和查学费的方法。
```
public interface Studentmanagement {
public abstract void setFee(double fee);
public abstract double getFee(); 
}
```
方法二：  教师管理接口中教师查询薪水和接收薪水的方法。
```
public interface TeacherManagement {
public abstract void setPay(double pay);
public abstract double getPay();
}

```
方法三：  实现学生查询学费和交学费的方法。
```
public void setPay(double pay){
	this.pay=pay;
}
public double getPay(){
	return this.pay;}
```
方法四：  实现教师查询薪水和接收薪水的方法。
```
public void setFee(double fee){
	this.fee=fee;
}
public double getFee(){
	return this.fee;
}
```
方法五： 抛出异常处理的方法并用if进行判断是否缴费成功。
```
public static void testTwo(String y,Doctoralcandidate m,Doctoralcandidate n) throws Trydemo{
	if (y.equals("1")){
	System.out.println("您已缴费成功！");
	System.out.println(m.Name +"   男,26,学费：4500,工资：10000,应纳税额："+(0.03*(m.getPay()-m.getFee()-3000)));
	System.out.println("您已缴费成功！");
	System.out.println(n.Name +"   女,24,学费：4300,工资：8000,应纳税额："+(0.03*(n.getPay()-n.getFee()-3000)));}
	else{
	    System.out.println("error");}
	}
```
方法六：设计的异常处理机制，采用Scanner类实现运行时交互式输入，并打印出两名博士研究生的缴费信息。
```
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
```
方法七：设计异常处理类。
```
public class Trydemo extends Exception{
		String x = "输入有误，请重新输入！";
		String getException(){
			return x;}}
```
## 六、实验结果
![实验结果.png](https://i.loli.net/2020/11/08/EO9c1lb5viIq4YN.png)
## 七、实验感想
本次实验我能够掌握如何定义抽象类和抽象方法，并实现接口；比较困难的是异常处理机制这方面，一开始写的时候没有头绪，我便看了书上关于异常处理的内容并与同学交流，最终得出结果。
