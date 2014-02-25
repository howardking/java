package cn.sict2;

public class Generic2<T>
{
    private T[] fooArray;

    /**
     * @return the fooArray
     */
    public T[] getFooArray() {
        return fooArray;
    }

    /**
     * @param fooArray the fooArray to set
     */
    public void setFooArray(T[] fooArray) {
        this.fooArray = fooArray;
    }
    
    public static void main(String[] args) {
        Generic2<String> foo = new Generic2<String>();
        
        String[] str1 = {"hello", "world", "wolcome"};
        String[] str2 = null;
        
        foo.setFooArray(str1);
        str2 = foo.getFooArray();
        
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
            
        }
    }
}
