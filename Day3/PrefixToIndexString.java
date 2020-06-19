import java.util.*;
class PrefixToIndexString{
    static boolean isOperator(char ch){
        switch(ch){
            case '+':
            case '-':
            case '/':
            case '*':
            return true;
        }
        return false;
    }
    static void  preToInf(String str){
        int n = str.length() -1;
        Stack<String> s = new Stack<>();
        for(int i=n;i>=0;i--){
            if(isOperator(str.charAt(i))){
                s.push("("+s.pop()+str.charAt(i)+""+s.pop()+")");
                System.out.println("peek:"+s.peek());
            }
            else{
                s.push(str.charAt(i)+"");
            }
        }
        System.out.println("final:"+s.peek());
    }
    public static void main(String[] args) {
        String str = "*-A/BC-/AKL";
        preToInf(str);
    }
}