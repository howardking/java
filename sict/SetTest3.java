package cn.sict;

import java.util.HashSet;

public class SetTest3
{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashSet set = new HashSet();
        
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");
        
        set.add(s1);
        set.add(s2);
        
        System.out.println(set);
    }

}

class Student
{
    String name;
    
    public Student(String name){
        this.name = name;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }
    
//    @Override
//    public String toString() {
//        // TODO Auto-generated method stub
//        return this.name;
//    }
//    
//    @Override
//    public int hashCode() {
//        // TODO Auto-generated method stub
//        return this.name.hashCode();
//    }
//    
//    @Override
//    public boolean equals(Object obj) {
//        // TODO Auto-generated method stub
//        if (this == obj){
//            return true;
//        }
//        
//        if (null != obj && obj instanceof Student){
//            Student s = (Student)obj;
//            if (name.equals(s.name)){
//                return true;
//            }
//        }
//        return false;
//    }
    
    
}