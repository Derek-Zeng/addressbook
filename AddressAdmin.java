package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressAdmin{
	Menu menu=new Menu();
	public void Add(String name,String sex,String career,String phonenumber,String email,String groupname,ArrayList<GroupInformation> db) {
		boolean isFound=false;
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i)!=null) {
				GroupInformation group=db.get(i);
				if (group.getGroupName().equals(groupname)) {
					isFound=true;
					db.get(i).getList().add(new PersonalInformation(name, sex,career, phonenumber, email));
					System.out.println("��ӳɹ�");
					break;
				}
			}
		}
		if (!isFound) {
			System.out.println("���޴���");
		}
		return;
	}
	public void PrintAddress(ArrayList<GroupInformation> db) {
		System.out.println("������£�");
		for (int i = 0; i < db.size(); i++) {
			for (int j = 0; j < db.get(i).getList().size(); j++) {
				if (db.get(i).getList().get(j)!=null) {
					System.out.println(db.get(i).getList().get(j).toString());
				}
			}
		}
		return;
	}
	public void NameSearch( String name,ArrayList<GroupInformation> db) {
		System.out.println("������£�");
		for (int i = 0; i < db.size(); i++) {
			for (int j = 0; j < db.get(i).getList().size(); j++) {
				if (db.get(i).getList().get(j)!=null) {
					if (db.get(i).getList().get(j).getName().equals(name)) {
						System.out.println(db.get(i).getList().get(j).toString());
					}                                                
					else {
						System.out.println("���޴���");
					}
				}
			}
		}
		return;
	}
	public void SexSearch( String sex,ArrayList<GroupInformation> db) {
		System.out.println("������£�");
		for (int i = 0; i < db.size(); i++) {
			for (int j = 0; j < db.get(i).getList().size(); j++) {
				if (db.get(i).getList().get(j)!=null) {
					if (db.get(i).getList().get(j).getSex().equals(sex)) {
						System.out.println(db.get(i).getList().get(j).toString());
					}
					else {
						System.out.println("���޴���");
					}
				}
			}
		}
		return;
	}
	public void CareerSearch( String career,ArrayList<GroupInformation> db) {
		System.out.println("������£�");
		for (int i = 0; i < db.size(); i++) {
			for (int j = 0; j < db.get(i).getList().size(); j++) {
				if (db.get(i).getList().get(j)!=null) {
					if (db.get(i).getList().get(j).getCareer().equals(career)) {
						System.out.println(db.get(i).getList().get(j).toString());
					}
					else {
						System.out.println("���޴���");
					}
				}
			}
		}
		return;
	}
	public void PhoneNumberSearch( String phonenumber,ArrayList<GroupInformation> db) {
		System.out.println("������£�");
		for (int i = 0; i < db.size(); i++) {
			for (int j = 0; j < db.get(i).getList().size(); j++) {
				if (db.get(i).getList().get(j)!=null) {
					if (db.get(i).getList().get(j).getPhoneNumber().equals(phonenumber)) {
						System.out.println(db.get(i).getList().get(j).toString());
					}
					else {
						System.out.println("���޴���");
					}
				}
			}
		}
		return;
	}
	public void EmailSearch( String Email,ArrayList<GroupInformation> db) {
		System.out.println("������£�");
		for (int i = 0; i < db.size(); i++) {
			for (int j = 0; j < db.get(i).getList().size(); j++) {
				if (db.get(i).getList().get(j)!=null) {
					if (db.get(i).getList().get(j).getEmail().equals(Email)) {
						System.out.println(db.get(i).getList().get(j).toString());
					}
					else {
						System.out.println("���޴���");
					}
				}
			}
		}
		return;
	}
	public void NameRemove( String name,ArrayList<GroupInformation> db) {
		for (int i = 0; i < db.size(); i++) {
			for (int j = 0; j < db.get(i).getList().size(); j++) {
				if (db.get(i).getList().get(j)!=null) {
					if (db.get(i).getList().get(j).getName().equals(name)) {
						db.get(i).getList().remove(j);
						System.out.println("ɾ���ɹ�");
					}
					else {
						System.out.println("���޴���");
					}
				}
			}
		}
		return;
	}
	public void NameUpdateContact(String name,ArrayList<GroupInformation> db) {
		Scanner in=new Scanner(System.in);
		for (int i = 0; i < db.size(); i++) {
			for (int j = 0; j < db.get(i).getList().size(); j++) {
				if (db.get(i).getList().get(j)!=null) {
					if (db.get(i).getList().get(j).getName().equals(name)) {
						System.out.println(db.get(i).getList().get(j).toString());
						db.get(i).getList().get(j);
						System.out.println("��ϵ�����ҵ�������Ҫ�޸ĸ���ϵ�˵�ʲô��Ϣ��");
						menu.menu5();
						switch (in.nextInt()) {
						case 1:
							System.out.println("����������Ϣ��");
							db.get(i).getList().get(j).setName(in.next());
							break;
						case 2:
							System.out.println("����������Ϣ��");
							db.get(i).getList().get(j).setSex(in.next());
							break;
						case 3:
							System.out.println("����������Ϣ��");
							db.get(i).getList().get(j).setCareer(in.next());
							break;
						case 4:
							System.out.println("����������Ϣ��");
							db.get(i).getList().get(j).setPhoneNumber(in.next());
							break;
						case 5:
							System.out.println("����������Ϣ��");
							db.get(i).getList().get(j).setEmail(in.next());
							break;
						default:
							System.out.println("�������������������������");
							continue;
						}
						System.out.println("�޸ĳɹ�������ϵ�˵�����Ϣ�ǣ�");
						System.out.println(db.get(i).getList().get(j).toString());
						break;
					}
					else {
						System.out.println("���޴���");
						return;
					}
				}
			}
		}
		return;
	}
}
	
