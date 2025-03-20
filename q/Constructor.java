public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Gunjan");
        // Student s2 = new Student();
        // Student s3 = new Student(123);
        s1.name = "Gunjan";
        s1.password = "abcd";
        s1.roll  = 456;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // copy
        s1.marks[2] = 100;
        s2.password = "xyz";

        for(int i =0; i<3 ; i++){
            System.out.println(s2.marks[i]);
        }
        
       
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];
  
    // Student(Student s1){ // copy constructor // shallow copy constructor
    //     marks = new int [3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constr
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){ //non - parameterized const....
        // this.name = name;
        marks = new int [3];
        System.out.println("constructor is called....");
    }

    Student(String name){ //parameterized const....
        marks = new int [3];
        this.name = name;
        System.out.println("constructor is called....");
    }
    Student(int roll) { //parameterized const....
        this.roll = roll;
    }

}
