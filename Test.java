package expt3;
import java.util.Scanner;
public class Test {
public static void testTwo(String y,Doctoralcandidate m,Doctoralcandidate n) throws Trydemo{
	if (y.equals("1")){//������m.equals  �ĳ�y.equals�ˡ���Ϊy���ַ������ͣ�equals���ж��ַ�����ȵķ�����m��һ��Doctoralcandidate���࣬û����equals
	System.out.println("���ѽɷѳɹ���");
	System.out.println(m.Name +"   ��,26,ѧ�ѣ�4500,���ʣ�10000,Ӧ��˰�"+(0.03*(m.getPay()-m.getFee()-3000)));
	System.out.println("���ѽɷѳɹ���");
	System.out.println(n.Name +"   Ů,24,ѧ�ѣ�4300,���ʣ�8000,Ӧ��˰�"+(0.03*(n.getPay()-n.getFee()-3000)));}
	else{
	    System.out.println("error");}//throwֻ�ܸ�try catch����ã�����ֱ��System���error�Ϳ��Ը��û���ʾ�����ˡ�
	}
public static void main(String[] args) {
Doctoralcandidate a = new Doctoralcandidate("��˼��","��",26,4500,10000);
Doctoralcandidate b = new Doctoralcandidate("��˿˿","Ů",24,4300,8000);
try{
	System.out.println("��˿˿��Ů��24");
	System.out.println("Ӧ����ѧ�ѣ�"+b.getFee()+"�ɷ���ɺ�������1");
	System.out.println("��˼���У�26");
	System.out.println("Ӧ����ѧ�ѣ�"+a.getFee()+"�ɷ���ɺ�������1");
	Scanner i= new Scanner(System.in);
	String x = i.nextLine();
	testTwo(x,a,b);
	System.out.println("------��ѯ���------");
	System.out.println("��˼��,��,26,ѧ��Ϊ��4500,����Ϊ��10000,Ӧ��˰�"+(0.03*(a.getPay()-a.getFee()-3000)));
	System.out.println("��˿˿,Ů,24,ѧ��Ϊ��4300,����Ϊ��8000,Ӧ��˰�"+(0.03*(b.getPay()-b.getFee()-3000)));
}
catch(Exception e){
	System.out.println("�����������");
    e.printStackTrace();
    }
}
}
