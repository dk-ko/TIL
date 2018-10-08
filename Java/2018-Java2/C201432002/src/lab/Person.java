package lab;

public class Person {
    String name;
    String no;
    int year;
    double grade;

    public Person(String name, String no,int year, double grade) {
        this.name = name;
        this.no = no;
        this.year = year;
        this.grade = grade;
    }

    // 구현할 부분
    @Override
    public boolean equals(Object obj){
    	if((obj instanceof Person) == false) return false;
    	Person p = (Person)obj;
    	return (this.name == null ? p.name == null : this.name.equals(p.name))
    			&& (this.no == null ? p.no == null : this.no.equals(p.no))
    			&& this.year == p.year
    			&& this.grade == p.grade;
    }
}