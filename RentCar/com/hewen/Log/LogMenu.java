package com.hewen.Log;

import RentProcess.rentOperator;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LogMenu {

    ArrayList<Person> arrayListPerson;

    public LogMenu() throws IOException, ClassNotFoundException {
        File file=new File("D:\\UserList.txt");
        if(file.exists())
        {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\UserList.txt"));
            arrayListPerson = (ArrayList) objectInputStream.readObject();
            objectInputStream.close();
        }else {
            file.createNewFile();
            arrayListPerson=new ArrayList<Person>();
            arrayListPerson.add(new Administrator("Administrator", "00000001"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\UserList.txt"));
            objectOutputStream.writeObject(arrayListPerson);
            objectOutputStream.close();
        }
    }
    static boolean determineIdentity(Person person){//身份确认
        if(person.getIdentity().equals("管理员"))
            return true;
        return false;
    }
    public int personFit(Person person){//用户匹配
        for (Object o :arrayListPerson) {
            Person p=(Person) o;
            if(person.getUsername().equals(p.getUsername())&&person.getPassword().equals(p.getPassword()))
                return arrayListPerson.indexOf(o);
        }
        return -1;
    }
    public void inferiorMenu_Administrator(Administrator administrator) throws IOException, ClassNotFoundException {
        //查看、添加、修改和删除车辆信息，查看营业额
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        while (flag) {
            System.out.println();
            System.out.println("1.查看2.添加3.修改4.删除5.查看营业额6.退出");
            switch (scanner.nextInt()) {
                case 1:
                    administrator.Administrator_ViewVehicle();
                    break;
                case 2:
                    administrator.Administrator_AddVehicle();
                    break;
                case 3:
                    administrator.Administrator_ModifyVehicle();
                    break;
                case 4:
                    administrator.Administrator_DelVehicle();
                    break;
                case 5:
                    administrator.Administrator_CheckTrade();
                    break;
                case 6:
                    flag=false;
                    break;
            }
        }
    }
    public void inferiorMenu_VipUser(VipUser vipUser) throws IOException, ClassNotFoundException {
        //查看车辆、租车、换车，模拟付款等
        rentOperator rentOperator = new rentOperator(vipUser);
        rentOperator.leaseOutFlow();
    }
    public void process() throws IOException, ClassNotFoundException {//登录界面
        boolean flag=true;
        while (flag) {
            System.out.println("welcome");
            System.out.println("1.登录 2.注册 3.忘记密码 4.退出");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    System.out.println("用户名");
                    String username = scanner.next();
                    System.out.println("密码");
                    String password = scanner.next();
                    //判断用户是否存在于集合中的方法
                    Person person = new Person(username, password);
                    int index=personFit(person);
                    if (index==-1) {
                        System.out.println("用户名或密码输入错误，请重试");
                        break;
                    }
                    //判断是管理员还是VIP用户 方法
                    // 进入二级菜单
                    person= (Person) arrayListPerson.get(index);
                    if(determineIdentity(person)) {
                        System.out.println("欢迎管理员");
                        Administrator administrator=(Administrator)person;
                        inferiorMenu_Administrator(administrator);
                    }
                    else {
                        System.out.println("欢迎VIP用户:" + person.getUsername());
                        VipUser vipUser=(VipUser)person;
                        inferiorMenu_VipUser(vipUser);
                        arrayListPerson.set(index,vipUser);
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\UserList.txt"));
                        objectOutputStream.writeObject(arrayListPerson);
                        objectOutputStream.close();
                    }
                    break;
                case  2:
                    System.out.println("用户名");
                    username = scanner.next();
                    boolean jol=false;
                    for (int j = 1; j < arrayListPerson.size(); j++) {
                        VipUser vipUser = (VipUser) arrayListPerson.get(j);
                        if(username.equals(vipUser.getUsername())) {
                            System.out.println("用户名重复，请重新注册");
                            jol=true;
                            break;
                        }
                    }
                    if(jol)
                        break;
                    System.out.println("密码");
                    password=scanner.next();
                    VipUser vipUser = new VipUser(username, password);
                    arrayListPerson.add(vipUser);
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\UserList.txt"));
                    objectOutputStream.writeObject(arrayListPerson);
                    objectOutputStream.close();
                    System.out.println("注册成功");
                    break;
                case 3:
                    int anIndex=-1;
                    System.out.println("输入用户名:");
                    username = scanner.next();
                    for (int j = 1; j < arrayListPerson.size(); j++) {
                        vipUser = (VipUser) arrayListPerson.get(j);
                        if(username.equals(vipUser.getUsername())) {
                            anIndex=j;
                            System.out.println("输入新密码:");
                            String newpassword = scanner.next();
                            vipUser.setPassword(newpassword);
                            arrayListPerson.set(anIndex,vipUser);
                            objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\UserList.txt"));
                            objectOutputStream.writeObject(arrayListPerson);
                            objectOutputStream.close();
                            System.out.println("更改密码成功");
                            break;
                        }
                    }
                    if(anIndex==-1)
                        System.out.println("用户不存在,请重试");
                    break;
                case 4:
                    flag=false;
                    break;
            }
        }
    }
}
