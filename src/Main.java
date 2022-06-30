import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Permission;

public class Main {
    public static void main(String[] args) throws  Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int num = Integer.parseInt(br.readLine().trim());
                Inner.Private o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

                //Write your code here
                Inner inner = new Inner();
                o = inner.new Private();
                System.out.println(num + " is " + o.powerof2(num));

                System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
        }//end of main
        static class Inner{
            private class Private{
                private String powerof2(int num){
                    System.out.println(num & num - 1);
                    return ((num & num - 1) == 0)?"power of 2":"not a power of 2";
                }
            }
        }//end of Inner
}
