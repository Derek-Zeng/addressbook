package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class GroupAdmin {
	public void Addgroup(String groupname,ArrayList<GroupInformation> db) {//增加组
		GroupInformation group=new GroupInformation(groupname, new ArrayList<PersonalInformation>());
		db.add(group);
		System.out.println("添加成功");
	}
	public void Printgroup(ArrayList<GroupInformation> db) {//输出所有组
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i)!=null) {
				System.out.println(db.get(i).getGroupName());
			}
		}
	}
	public void Searchgroup(String groupname,ArrayList<GroupInformation> db) {//查找组
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i)!=null) {
				if (db.get(i).getGroupName().equals(groupname)) {
					db.get(i).ListString();
					return;
				}
				else {
					System.out.println("查无此人");
					return;
				}
			}
		}
		return;
	}
	public void Updategroup(String groupname,ArrayList<GroupInformation> db) {//修改组
		Scanner in=new Scanner(System.in);
		boolean isFound=false;
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i)!=null) {
				GroupInformation group=db.get(i);
				if (group.getGroupName().equals(groupname)) {
					isFound=true;
					System.out.println(db.get(i).getGroupName());
					System.out.println("群组已找到，请输入新组名");
					db.get(i).setGroupName(in.next());
					System.out.println("修改成功,该群组的新组名是"+db.get(i).getGroupName());
					break;
				}
			}
		}
		if (!isFound) {
			System.out.println("查无此组");
		}
		return;
	}
	public void Removegroup(String groupname,ArrayList<GroupInformation> db) {//删除组
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i)!=null) {
				if (db.get(i).getGroupName().equals(groupname)) {
					db.remove(i);
					System.out.println("删除成功");
				}
			}
		}
		return;
	}	
}
