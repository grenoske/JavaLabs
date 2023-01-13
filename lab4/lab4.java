package JavaLabs.lab4;

import java.util.ArrayList;

public class lab4 {
    public static void main(String[] artgs)
    {
        int Zalikova = 429;
        int C11 = Zalikova % 11;        // 0	Визначити клас студент,
                                        //який складається
                                        //як мінімум з 5-и полів.                                

        System.out.println("C11:"+C11);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(04, Zalikova, 123, 60, "Shevchenko"));
        students.add(new Student(03, 322, 123, 80, "Svitaevski"));
        students.add(new Student(03, 311, 123, 90, "Klymenko"));
        students.add(new Student(02, 213, 123, 75, "Safini"));
        students.add(new Student(01, 125, 123, 60, "Prokopiy"));

        System.out.println("-------------------getNomerZalikovSort-----------");
        students.sort((obj1,obj2) -> obj1.getNomerZalikovoi()-obj2.getNomerZalikovoi());// za zrostannyam
        for(int i = 0; i < students.size(); i++)
            students.get(i).show();

        System.out.println("-----------------------------------------------------getMarkZalikovSort-----------");
        students.sort((obj1,obj2) -> obj2.getMark()-obj1.getMark());// za spadannyam
        for(int i = 0; i < students.size(); i++)
            students.get(i).show(); 




        Student students2[] = new Student[] {new Student(04, Zalikova, 123, 60, "Shevchenko"),
                                            new Student(03, 322, 123, 80, "Svitaevski"),
                                            new Student(03, 311, 123, 90, "Klymenko"), 
                                            new Student(02, 213, 123, 75, "Safini"), 
                                            new Student(01, 125, 123, 60, "Prokopiy")};
        
        
        System.out.println("-------------------getNomerZalikovSort-----------");
        Bublesort_getNomerZalikovoi(students2);
        for(int i = 0; i < students2.length; i++)
            students2[i].show();
        
        
        System.out.println("-----------------------------------------------------getMarkZalikovSort-----------");
        Bublesort_getMark(students2);
        for(int i = 0; i < students2.length; i++)
            students2[i].show();
        System.out.println("----------------------");
        
    }


    
    public static void Bublesort_getNomerZalikovoi(Student[] students)
    {
        for(int i = 0; i < students.length -1; i++)
            for(int j = 0; j < students.length - i - 1; j++)
                if(students[j].getNomerZalikovoi() > students[j+1].getNomerZalikovoi())
                {
                    Student temp = new Student(students[j]);
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
    }

    public static void Bublesort_getMark(Student[] students)
    {
        for(int i = 0; i < students.length -1; i++)
            for(int j = 0; j < students.length - i - 1; j++)
                if(students[j].getMark() < students[j+1].getMark())
                {
                    Student temp = new Student(students[j]);
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
    }


}
