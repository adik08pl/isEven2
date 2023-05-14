public class Main {
    public static void main(String[] args) {
        System.out.println("private static boolean isEvenNum(int number) {");
        System.out.println("if(number==1)");
        System.out.println("return true;");
        for(int i=0;i<2147483647;i++){
            System.out.println("else if(number=="+i+"){");
            if(i%2==0){
                System.out.println("return true;");
            }
            else{
                System.out.println("return false;");
            }
            System.out.println("}");
        }
        System.out.println("}");
    }
}