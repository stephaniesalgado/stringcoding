public class Balanced {

    public static void main(String[] args) {
        String str="{()}";
        int opened = 0;
        int closed = 0;

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch =='{' || ch =='(' || ch == '[') {
                opened++;

            } else if(ch == '}' || ch == ')' || ch == ']') {
                closed++;

            }

        }

        if(opened == closed) {
            System.out.println("The string is balanced.");

        }

        else {
            System.out.println("The string is NOT balanced.");

        }
        
    }

}
