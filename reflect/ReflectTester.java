package cn.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTester
{
     public Object copy(Object object) throws Exception {
         Class<?> classType = object.getClass();
//         System.out.println(classType.getName());
         Constructor cons = classType.getConstructor(new Class[]{});
         Object objectCopy = cons.newInstance(new Object[]{});
//         System.out.println(obj);
         Field[] fields = classType.getDeclaredFields();
         
         for (Field field : fields){
//             System.out.println(field.getName());
             String name = field.getName();
             String firstLetter = name.substring(0, 1).toUpperCase();//将属性的首字母转换成大写
             String getMethodName = "get" + firstLetter + name.substring(1);
             String setMethodName = "set" + firstLetter + name.substring(1);
//             System.out.println(getMethodName + "," + setMethodName);
             Method getMethod = classType.getMethod(getMethodName, new Class[]{});
             Method setMethod = classType.getMethod(setMethodName, new Class[]{field.getType()});
             Object value = getMethod.invoke(object, new Object[]{});
             setMethod.invoke(objectCopy, new Object[]{value}); 
         }
         
         return objectCopy;
     }
     
     public static void main(String[] args) throws Exception{
        Customer customer = new Customer("Tom", 20);
        customer.setId(1L);
        ReflectTester test = new ReflectTester();
        Customer customer2 = (Customer)test.copy(customer);
        System.out.println(customer2.getId() + "," + customer2.getName() + "," + customer2.getAge());
    }
}

class Customer
{ 
    private Long id;
    private String name;
    private int age;
    
    public Customer(){
        
    }
    
    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    
}
