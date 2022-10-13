package methodReference;

public class Test {
	public static void main(String[] args) {
		School sch=new School();
		Notable nt=sch::noteLecture;
		nt.note("Lecturer");
		
		Notable nt1=sch::noteObservation;
		nt1.note("note");
		
		Notable nt2=sch::noteOnlineClasses;
		nt1.note("online");
		
		School mySchool=new School();
		mySchool.noteLecture("Lecturer");
		mySchool.noteLecture("Note");
        mySchool.noteLecture("Online");
	}
}