// Count no of alphabets in a string

class Countstr{
    public static void main (String[] args) {
        String str="Niranjan";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
           if(Character.isLetter(str.charAt(i)))
           count++;
        }
        System.out.println(+ count);
    }    
}
