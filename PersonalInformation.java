package addressbook;

public class PersonalInformation {
		private String Name;
		private String Sex;
		private String Career;
		private String PhoneNumber;
		private String Email;
		public PersonalInformation(String name, String sex, String career, String phoneNumber, String email) {
			super();
			Name = name;
			Sex= sex;
			Career = career;
			PhoneNumber = phoneNumber;
			Email = email;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getSex() {
			return Sex;
		}
		public void setSex(String sex) {
			this.Sex = sex;
		}
		public String getCareer() {
			return Career;
		}
		public void setCareer(String career) {
			Career = career;
		}
		public String getPhoneNumber() {
			return PhoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			PhoneNumber = phoneNumber;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		@Override
		public String toString() {
			return "������"+Name+"\t"+"�Ա�"+Sex+"		"+"ְҵ��"+Career+"\t"+"�ֻ����룺"+PhoneNumber+"\t"+"�������䣺"+Email+"\t";
		}
}
