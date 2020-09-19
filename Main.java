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
		db.add(new GroupInformation("����", new ArrayList<PersonalInformation>()));
		db.add(new GroupInformation("ͬ��", new ArrayList<PersonalInformation>()));
		db.add(new GroupInformation("ͬѧ", new ArrayList<PersonalInformation>()));
//		db.get(1).getList().add(new PersonalInformation("����", "��", "����Ա", 1800000, "180@qq.com"));
		GroupAdmin adminG=new GroupAdmin();
		AddressAdmin adminA=new AddressAdmin();
		Menu menu=new Menu();
		while (true) {
			menu.menu1();
			switch (in.next()) {
			case "0"://�����
				menu.menu2();
				switch (in.next()) {
					case "1":
						System.out.println("������Ҫ��ӵ�����");//�����
						groupname=in.next();
						adminG.Addgroup(groupname, db);
						break;
					case "2"://���������
						adminG.Printgroup(db);
						break;
					case "3":
						System.out.println("����������");//������
						groupname=in.next();
						adminG.Searchgroup(groupname, db);
						break;	
					case "4":
						System.out.println("����������");//ɾ����
						groupname=in.next();
						adminG.Removegroup(groupname, db);
						break;
					case "5" ://�޸���
						System.out.println("����������");
						groupname=in.next();
						adminG.Updategroup(groupname, db);
					case "6":
						continue;
					default:
		  					System.out.println("����������������������");
		  					continue;
				}
				break;
			case "1"://��ϵ�˲���
				menu.menu3();
  				switch (in.next()) {
  				case "1"://�����ϵ��
  					System.out.println("��������ϵ������");
  					name=in.next();
  					System.out.println("��������ϵ���Ա�");
  					sex=in.next();
  					System.out.println("��������ϵ��ְҵ");
  					career=in.next();
  					System.out.println("��������ϵ�˵绰����");
  					phonenumber=in.next();
  					System.out.println("��������ϵ�˵�������");
  					email=in.next();
  					System.out.println("Ҫ��ӵ��ĸ�Ⱥ��");
  					groupname=in.next();
  					adminA.Add( name, sex, career, phonenumber, email, groupname, db);
  					break;
  				case "2" ://ɾ����ϵ��
  					System.out.println("��������ϵ������");
  					name=in.next();
  					adminA.NameRemove(name, db);
  					break;	
  				case "3" ://�޸���ϵ����Ϣ
						System.out.println("��������ϵ������");
						name=in.next();
						adminA.NameUpdateContact(name, db);
						break;
  				case "4" ://������ϵ��
  					System.out.println("Ҫ��ʲô��������ϵ��");
  					menu.menu4();
  					switch (in.next()) {
  						case "1"://������
  							System.out.println("��������ϵ������");
  							name=in.next();
  							adminA.NameSearch(name, db);
  							break;
  						case "2"://���Ա�
  							System.out.println("��������ϵ���Ա�");
  							sex=in.next();
  							adminA.SexSearch(sex, db);
  							break;  							
  						case "3"://��ְҵ
  							System.out.println("��������ϵ��ְҵ");
  							career=in.next();
  							adminA.CareerSearch(career, db);
  							break;
  						case "4"://���ֻ�����
  							System.out.println("��������ϵ���ֻ�����");
  							phonenumber=in.next();
  							adminA.PhoneNumberSearch(phonenumber, db);
  							break;
  						case "5"://�õ�������
  							System.out.println("��������ϵ�˵�������");
  							email=in.next();
  							adminA.EmailSearch(email, db);
  							break;
  						case "6":
  							continue;
  					default:
  						System.out.println("����������������������");
  						continue;
  					}
  					break;
  				 case "5":
  					 adminA.PrintAddress(db);
  					 break;
				 case "6":
					 continue;
				 default:
  					System.out.println("����������������������");
  					continue;
				}
  				break;
			 case "2":
				continue;
			 default:
					System.out.println("����������������������");
					continue;			 
			}
		}
	}
}
