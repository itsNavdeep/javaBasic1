public class problems {
    public static void main(String[] args) {
//        Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.

        String original="eabcdef";
        String result="";
        for(int i=0;i<original.length();i++)
        {
            if(original.charAt(i)=='e')
            {
                result+='i';
            }
            else{
                result+=original.charAt(i);
            }
        }
        System.out.println(result);
//        Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
        String email="apnaCollegeJava@gmail.com";
        String username="";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                username+=email.charAt(i);
            }
        }
        System.out.println(username);


    }
}
