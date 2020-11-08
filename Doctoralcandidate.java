package expt3;
public class Doctoralcandidate implements Studentmanagement,TeacherManagement{
String Name;
String sex;
int age;
double fee;
double pay;
public Doctoralcandidate(String name,String sex,int age,double fee,double pay){
this.age =age;
this.Name=name;
this.fee=fee;
this.pay=pay;
this.sex=sex;
}
public void setPay(double pay){
	this.pay=pay;
}
public double getPay(){
	return this.pay;
}//老师的薪水
public void setFee(double fee){
	this.fee=fee;
}
public double getFee(){
	return this.fee;
}//学生的学费
}
