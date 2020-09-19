package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			String name;
			String sex;
			String career;
			String phonenumber;
			String email;
			String groupname;
		Scanner in=new Scanner(System.in);
		ArrayList<GroupInformation> db= new ArrayList<GroupInformation>();
		db.add(new GroupInformation("家人", new ArrayList<PersonalInformation>()));
		db.add(new GroupInformation("同事", new ArrayList<PersonalInformation>()));
		db.add(new GroupInformation("同学", new ArrayList<PersonalInformation>()));
//		db.get(1).getList().add(new PersonalInformation("曾朴", "男", "程序员", 1800000, "180@qq.com"));
		GroupAdmin adminG=new GroupAdmin();
		AddressAdmin adminA=new AddressAdmin();
		Menu menu=new Menu();
		while (true) {
			menu.menu1();
			switch (in.next()) {
			case "0"://组操作
				menu.menu2();
				switch (in.next()) {
					case "1":
						System.out.println("请输入要添加的组名");//添加组
						groupname=in.next();
						adminG.Addgroup(groupname, db);
						break;
					case "2"://输出所有组
						adminG.Printgroup(db);
						break;
					case "3":
						System.out.println("请输入组名");//查找组
						groupname=in.next();
						adminG.Searchgroup(groupname, db);
						break;	
					case "4":
						System.out.println("请输入组名");//删除组
						groupname=in.next();
						adminG.Removegroup(groupname, db);
						break;
					case "5" ://修改组
						System.out.println("请输入组名");
						groupname=in.next();
						adminG.Updategroup(groupname, db);
					case "6":
						continue;
					default:
		  					System.out.println("您的输入有误，请重新输入");
		  					continue;
				}
				break;
			case "1"://联系人操作
				menu.menu3();
  				switch (in.next()) {
  				case "1"://添加联系人
  					System.out.println("请输入联系人姓名");
  					name=in.next();
  					System.out.println("请输入联系人性别");
  					sex=in.next();
  					System.out.println("请输入联系人职业");
  					career=in.next();
  					System.out.println("请输入联系人电话号码");
  					phonenumber=in.next();
  					System.out.println("请输入联系人电子邮箱");
  					email=in.next();
  					System.out.println("要添加到哪个群组");
  					groupname=in.next();
  					adminA.Add( name, sex, career, phonenumber, email, groupname, db);
  					break;
  				case "2" ://删除联系人
  					System.out.println("请输入联系人姓名");
  					name=in.next();
  					adminA.NameRemove(name, db);
  					break;	
  				case "3" ://修改联系人信息
						System.out.println("请输入联系人姓名");
						name=in.next();
						adminA.NameUpdateContact(name, db);
						break;
  				case "4" ://查找联系人
  					System.out.println("要以什么来查找联系人");
  					menu.menu4();
  					switch (in.next()) {
  						case "1"://用姓名
  							System.out.println("请输入联系人姓名");
  							name=in.next();
  							adminA.NameSearch(name, db);
  							break;
  						case "2"://用性别
  							System.out.println("请输入联系人性别");
  							sex=in.next();
  							adminA.SexSearch(sex, db);
  							break;  							
  						case "3"://用职业
  							System.out.println("请输入联系人职业");
  							career=in.next();
  							adminA.CareerSearch(career, db);
  							break;
  						case "4"://用手机号码
  							System.out.println("请输入联系人手机号码");
  							phonenumber=in.next();
  							adminA.PhoneNumberSearch(phonenumber, db);
  							break;
  						case "5"://用电子邮箱
  							System.out.println("请输入联系人电子邮箱");
  							email=in.next();
  							adminA.EmailSearch(email, db);
  							break;
  						case "6":
  							continue;
  					default:
  						System.out.println("您的输入有误，请重新输入");
  						continue;
  					}
  					break;
  				 case "5":
  					 adminA.PrintAddress(db);
  					 break;
				 case "6":
					 continue;
				 default:
  					System.out.println("您的输入有误，请重新输入");
  					continue;
				}
  				break;
			 case "2":
				continue;
			 default:
					System.out.println("您的输入有误，请重新输入");
					continue;			 
			}
		}
	}
}
