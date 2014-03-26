package cn.annotation;


@AnnotationTest(value2=EnumTest.Welcome)
public class AnnotationUsage
{
    @AnnotationTest(value1="world", value2=EnumTest.World)
    public void method(){
        System.out.println("Usage of annotation");
    }
    
    public static void main(String[] args) {
        AnnotationUsage usage = new AnnotationUsage();
        usage.method();
    }
}
