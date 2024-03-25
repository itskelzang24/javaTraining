package bob.athangtraining.basicjava;

import java.util.Arrays;
class Question4 {
    public static void main(String[] args)
    {
        String str []= {"cat","flag","green","test","Athang"};
        //String str []= {"cat","dog","red","is","am"};
        String longestWords ="";
        int maxLength = 0;
        for (int i = 0; i < str.length; i++){
            String word = str[i];
            int len = 0;
            for (int j = 0; j<word.length();j++){
                len++;
            }
            if (len>maxLength){
                maxLength=len;
                longestWords = word;
            }
        }
        System.out.println(longestWords);
    }
}
