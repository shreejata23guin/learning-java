package methodExamples;

public class MethodWithReturn {
    static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        int result= add(5,7);
        System.out.println("Sum:"+result);
    }
}
