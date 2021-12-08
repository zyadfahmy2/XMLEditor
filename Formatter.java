package com.example.xmleditor;

import java.util.Stack;

public class Formatter {
    public static String format(String s)
    {
        // correct xml file

        // compress xml file
        int z = 0;
        Stack<String> stack = new Stack<>();
        String newString = "";  // must be initialized
        String nameInStack = "";
        for (int i = 0; i < s.length(); i++) // looping through the original string
        {
            newString+=s.charAt(i);
            if(s.charAt(i) == '<')
            {

                while(s.charAt(i) != '>')
                {

                    i++;
                    newString+=s.charAt(i);
                    if(s.charAt(i) == '/') continue;
                    nameInStack+= s.charAt(i);
                }
//                while(s.charAt(i) != '\n' || s.charAt(i) !='<')
//                {
//                    newString+=s.charAt(i);
//                }
                if(i < s.length()-1)
                    i++; // to make the pointer skip the character '>' and go to '\n'

                newString+=s.charAt(i);
                if(stack.isEmpty())
                {

                    stack.push(nameInStack);
                    z = stack.size()+1;
                }
                else if(stack.peek().equals(nameInStack)) // 3 cases if it is equal or it is not or the stack is empty
                {
                    z = stack.size();
                    stack.pop();
                }
                else
                {

                    stack.push(nameInStack);
                    z = stack.size();
                }
                if(!stack.isEmpty())
                {
                    if((s.charAt(i) == '\n') && !(s.substring((i+3), (i+3+stack.peek().length())).equals(stack.peek()))  )
                    {
                        //System.out.println((s.substring((i+3), (i+4+stack.peek().length()))));
                        System.out.println(stack.peek());
                        System.out.println(stack.size());

                        for (int j = 0; j < stack.size() ; j++)
                        {
                            newString+= "    ";
                        }
                    }
                    else if((s.substring((i+3), (i+3+stack.peek().length())).equals(stack.peek())) && stack.size() > 1 && s.charAt(i) =='\n')
                    {
                        System.out.println(" else if  " +stack.peek());
                        for (int j = 0; j < stack.size()-1 ; j++)
                        {
                            newString+= "    ";
                        }
                    }
                }

                nameInStack = "";





            }
        }
        return newString;
    }



}
