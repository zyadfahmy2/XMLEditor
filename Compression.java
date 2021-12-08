package com.example.xmleditor;

public class Compression {


    public static String compressFile(String file) {
        String cFile ="";
        int i = 0;
        int j = 0;
        char compressedFile[] = new char[file.length()];

        while (i < file.length()) {

            if (file.charAt(i) == '>' && i <file.length()) {

              //  System.out.println(file.charAt(i));
                if(i < file.length() - 1)
                    compressedFile[j++] = file.charAt(i++);
                //System.out.println(file.charAt(i));
                while ((file.charAt(i) == ' ' || file.charAt(i) == '\n') && i < file.length()-1 ) {
                    i++;


                }

                if (file.charAt(i) == '<'&& i <file.length()) {
                    compressedFile[j++] = '\n';


                } else {

                    while (file.charAt(i) != '\n' && i < file.length()-1 ) {

                        compressedFile[j++] = file.charAt(i++);
                    }
                    if(i < file.length()-1 && file.charAt(i-1) == '>')
                        compressedFile[j++] = file.charAt(i++);


                    while (file.charAt(i)!='<' && i < file.length()-1){
                        i++;
                    }

                }
            } else {
                compressedFile[j++] = file.charAt(i++);
            }
        }
        for (int c = 0; c < j-1 ; ++c) {

            cFile+=compressedFile[c];
        }
        //System.out.println(i);
        return cFile;
    }
}