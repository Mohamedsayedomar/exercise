import java.util.Stack;

public  class stackassignment{
    static void main(String[] args) {
        Stack<String> MyStack=new Stack<>();
        MyStack.push("Python");
        MyStack.push("Java");
        MyStack.push("C++");
        MyStack.push("Javascript");
        MyStack.push("GO");
        System.out.println("waxaa ku jira: " + MyStack);
        System.out.println();

        System.out.println("The top element is: " + MyStack.peek());
        System.out.println();

        System.out.println("pop an element from the stack : " + MyStack.pop());
        System.out.println();

        System.out.println("Stack IsEmpty : " + MyStack.isEmpty() );

        //----String Reverse----//
        System.out.println("\n--- String Reverse1---");

        String original="Hello Word";

        Stack<Character> CharStack=new Stack<>();
        System.out.println();


        for (int i=0; i<original.length(); i++){
            CharStack.push(original.charAt(i));
        }

        String reverse="";
        while (!CharStack.isEmpty()){
            reverse +=CharStack.pop();
        }
        System.out.println("Original: " + original);
        System.out.println();
        System.out.println("REverse :" + reverse );

        System.out.println("\n----Balance Brakets----");

        String blanced="({[()]})";
        String unblanced="({[})";

        System.out.println(blanced + ":" + isBlanced(blanced));
        System.out.println(unblanced + ":" + isBlanced(unblanced));

    }
    public static boolean isBlanced(String str){
        Stack<Character> brakets=new Stack<>();
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if (ch=='(' || ch=='[' || ch=='{'){
                brakets.push(ch);
            }
            else if (ch==')' || ch==']' || ch=='}'){
                if (brakets.isEmpty()){
                    return false;
                }
                char top=brakets.pop();
                if (ch==')' && top!='(' ||
                        ch=='}'&& top!='{' ||
                        ch==']' && top!='['){
                    return false;
                }
            }


        }
        return brakets.isEmpty();
    }



}