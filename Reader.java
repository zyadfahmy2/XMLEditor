package com.example.xmleditor;

import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static String Read()
    {
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);
        fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("XML files","*.png")); // if we want to see pdf files only
        String s = "";
        if(selectedFile!=null)
        {
            // System.out.println("the name of the chosen file is: " + selectedFile.get);
//                File file = new File(selectedFile.getAbsolutePath());
//                Scanner sc = null; //sc must be initialized
//                try {
//                    sc = new Scanner(file);
//                } catch (FileNotFoundException ex) {
//                    ex.printStackTrace();
//                }
//                int counter = 0;
//                while(sc.hasNextLine())
//                {
//                    System.out.println(sc.nextLine());
//                    counter++;
//                }
//                System.out.println(counter);
            FileReader fr = null ;
            try {
                fr = new FileReader(selectedFile.getAbsolutePath());
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            int i = 0;
            int counter = 0;
            while(true)
            {
                try {
                    if (!((i=fr.read()) != -1))
                    {
                        counter--;
                        break; //it returns a byte that contains asci code that why we typecast
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                counter++;
                //System.out.print((char)i);

                s+=(char)i;
            }
            System.out.println(counter);


        }
        else
            System.out.println("File is not valid");
        return s;
    }
    }

