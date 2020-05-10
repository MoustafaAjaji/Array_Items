package se.lexicon;

import java.util.Arrays;

public class CallM {
        public static int indexOf(int[] a, int b){

            boolean flag=true;

            for(int i=0;i<5;i++) {
                if (a[i]==b) {
                    System.out.println(a[i]);
                    flag =false;
                    return i;
                }
                else flag=true;
            }
            return -1;
        }

    public static int[] add(int[] source, int toAdd){

        int[] anarray = Arrays.copyOf(source,source.length+1);
        anarray[anarray.length-1]=toAdd;
        return anarray;
    }
}
