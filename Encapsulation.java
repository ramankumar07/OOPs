class Student {
    String name;
    private float CGPA;

    public float getCGPA() {
        return CGPA;
    }

    public void setCGPA(float latestCGPA) {
        this.CGPA = latestCGPA; 
    }
    

}

public class Encapsulation {
    
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setCGPA(8.46f);
        System.out.println(s1.getCGPA());
    }

}
