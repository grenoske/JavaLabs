package JavaLabs.lab4;

import java.nio.file.attribute.GroupPrincipal;

public class Student {
    //атрибути
    private int group;
    private int nomerZalikovoi;
    private int specification;
    private int mark;
    private String name;
    
    //гетери
    public int getNomerZalikovoi(){return nomerZalikovoi;}
    public int getMark(){return mark;}


    public Student(int group, int nomerZalikovoi, int specification, int mark, String name)
    {
        this.group = group;
        this.nomerZalikovoi = nomerZalikovoi;
        this.specification = specification;
        this.mark = mark;
        this.name = name;
    }

    public Student(Student student) {
        this.group = student.group;
        this.nomerZalikovoi = student.nomerZalikovoi;
        this.specification = student.specification;
        this.mark = student.mark;
        this.name = student.name;
    }

    public void show()
    {
        System.out.println("Student: Group:" + group +
            " NomerZalikovoi:" + nomerZalikovoi + " Specification:" +
                specification + " Mark:" + mark + " Name:" + name);
    }

    @Override
    public String toString() {
        return ("Student: Group:" + group +
            " NomerZalikovoi:" + nomerZalikovoi + " Specification:" +
            specification + " Mark:" + mark + " Name:" + name);
    }

  
}
