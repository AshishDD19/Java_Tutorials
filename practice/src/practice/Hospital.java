package practice;

public class Hospital {
	private int pid;
	private String name;
	private int age;
	private char gender;
	private	String bloodGroup;
	private int  diabetes;

	
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	 
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public void setDiabetes(int diabetes) {
		this.diabetes =  diabetes;
	}
		
		

	
	
	public String checkDiabetes() {
		if(diabetes <= 99) {
			return "Low";
		}
		else if(diabetes > 99 && diabetes < 126 ) {
			return "Normal";
		}
		else if(diabetes >= 126){
			return "High";
		}
		else {
			return "Invaid data";
		}
	}
	
	public String getDiagnosis() {
		
		return  "Patient Report: \n "+"PID: "+pid+"\n Name: "+name+ "\n Age: "+ age +"\n Gender: "+ gender+ "\n Blood Group: "+bloodGroup+ "\n Diabetes: " + checkDiabetes()+"("+diabetes+")\n"   ;
	
	}

}


