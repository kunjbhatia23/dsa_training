public class recursion{
    public static void print(String name, int count) {
        if(count==0){
            return;
        }
        print (name, --count);
        System.out.println(name);
    }
}