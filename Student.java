import java.util.List;

class Student {
String index;
String firstName;
String lastName;
List<Integer> grades;

//TODO constructor

public Student(String index, String firstName, String lastName, List<Integer> grades) {
this.index = index;
this.firstName = firstName;
this.lastName = lastName;
this.grades = grades;
}

//TODO seters & getters
public String getIndex() {
return index;
}

public String getFirstName() {
return firstName;
}

public String getLastName() {
return lastName;
}

public List<Integer> getGrades() {
return grades;
}
public double getAverage() {
//TODO
double oceni=0;
for(int i : grades)
{
oceni+=i;
}
oceni=oceni/grades.size();
return oceni;
}

public int ECTSCredits() {
//TODO
int crediti=0;
for (int i : grades){
if (i>5) crediti+=6;
}
return crediti;
}
}
