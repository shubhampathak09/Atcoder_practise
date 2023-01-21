package Algorithms;

import java.util.Stack;

public class PostFix {

    public static long evaluate(String expr){
        if(expr.length()==0)
            return 0;  //base case
        Stack<Long>stack=new Stack<>();
        for(String ex : expr.split(" ")){
            switch (ex){
                case "+": stack.push(stack.pop() + stack.pop());
                        break;
                case "-": stack.push(-1*stack.pop() + stack.pop());
                        break;
                case "*": stack.push(stack.pop()*stack.pop());
                        break;
                case "/":
                        Long b=stack.pop();
                        Long a=stack.pop();
                        stack.push(a/b);
                break;
                default:stack.push(Long.parseLong(ex));  //niche
            }
        }
        return stack.peek();
    }


    public static void main(String[] args){

        System.out.println(evaluate("5 3 +"));  //8
        System.out.println(evaluate("2 3 -"));  //-1
        System.out.println(evaluate("2 3 9 4 / + *"));  //10
    }
}
