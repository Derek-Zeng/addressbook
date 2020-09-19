package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class GroupAdmin {
	public void Addgroup(String groupname,ArrayList<GroupInformation> db) {//������
		GroupInformation group=new GroupInformation(groupname, new ArrayList<PersonalInformation>());
		db.add(group);
		System.out.println("��ӳɹ�");
	}
	public void Printgroup(ArrayList<GroupInformation> db) {//���������
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i)!=null) {
				System.out.println(db.get(i).getGroupName());
			}
		}
	}
	public void Searchgroup(String groupname,ArrayList<GroupInformation> db) {//������
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i)!=null) {
				if (db.get(i).getGroupName().equals(groupname)) {
					db.get(i).ListString();
					return;
				}
				else {
					System.out.println("���޴���");
					return;
				}
			}
		}
		return;
	}
	public void Updategroup(String groupname,ArrayList<GroupInformation> db) {//�޸���
		Scanner in=new Scanner(System.in);
		boolean isFound=false;
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i)!=null) {
				GroupInformation group=db.get(i);
				if (group.getGroupName().equals(groupname)) {
					isFound=true;
					System.out.println(db.get(i).getGroupName());
					System.out.println("Ⱥ�����ҵ���������������");
					db.get(i).setGroupName(in.next());
					System.out.println("�޸ĳɹ�,��Ⱥ�����������"+db.get(i).getGroupName());
					break;
				}
			}
		}
		if (!isFound) {
			System.out.println("���޴���");
		}
		return;
	}
	public void Removegroup(String groupname,ArrayList<GroupInformation> db) {//ɾ����
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i)!=null) {
				if (db.get(i).getGroupName().equals(groupname)) {
					db.remove(i);
					System.out.println("ɾ���ɹ�");
				}
			}
		}
		return;
	}	
}
