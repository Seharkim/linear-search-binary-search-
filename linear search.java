/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
class linstring
{

    String array[] = new String[10];
    String a = new String();
    public void linsearch(String string[], String search)
    {
        string = array;
        search = a;

        int i;
        int flag = 0;
        for(i = 0; i<10; i++)
        {
            if (search.equals(string[i]))
            {
                flag = 1;
                break;
            }

        }
        if (flag ==1)
        {
            System.out.println("Word found at position " +(i+1));
        }
        else
        {
            System.out.println("Word not found.");
        }
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        linstring obj = new linstring();
        System.out.println("Enter any 10 words.");

        String enter [] = new String[10];
        int i;
        for (i = 0; i<10; i++)
        {

            enter[i] = br.readLine();

        }
        System.out.println("Enter word to be searched.");
        String search1 = br.readLine();
        obj.linsearch(enter, search1);
    }
}