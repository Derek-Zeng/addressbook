package addressbook;

import java.util.ArrayList;

public class GroupInformation {
	private String GroupName;
	private ArrayList<PersonalInformation>list=new ArrayList<PersonalInformation>();
	public GroupInformation( String groupName,ArrayList<PersonalInformation> list) {
		this.GroupName = groupName;
		this.list = list;
	}
	public String getGroupName() {
		return GroupName;
	}
	public void setGroupName(String groupName) {
		GroupName = groupName;
	}
	public ArrayList<PersonalInformation> getList() {
		return list;
	}
	public void setList(ArrayList<PersonalInformation> list) {
		this.list = list;
	}
	public void ListString() {
		System.out.println("组名："+GroupName+"\n"+"成员"); 
		for (PersonalInformation s : this.list){
			System.out.println(s.toString());
		};
	}
}
