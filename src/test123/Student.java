
package test123;
public class Student implements Comparable{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", name=" + name ;
    }

    @Override
    public int compareTo(Object o) {
        Student s1=(Student)o;
        int i=this.id;
        int j=s1.id;
    Integer iobj=i;
    Integer jobj=j;
    return iobj.compareTo(jobj);
    
    }
    
}
