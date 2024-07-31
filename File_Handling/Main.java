package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) {
        
        // ------------ Reader --------------

        // try(InputStreamReader isr = new InputStreamReader(System.in)) {
        //     System.out.print("Enter some letters : ");
        //     int letters = isr.read();

        //     while (isr.ready()) {
        //         System.out.println((char) letters);
        //         letters = isr.read();
        //     }

        //     isr.close();
        //     // System.out.println();
        // }

        // catch(IOException e) {
        //     System.out.println(e.getMessage());
        // }


        // try(FileReader fr = new FileReader("E://DSA using Java//Notes.txt")) {
        //     int letters = fr.read(); 
        //     // read() returns an interger
        //     while (fr.ready()) {
        //         // System.out.println(letters); // it will print the Unicode value
        //         System.out.println((char) letters);
        //         letters = fr.read();
        //     }
        //     fr.close();
        // }

        // catch(IOException e) {
        //     System.out.println(e.getMessage());
        // }


        // byte to char stream and then reading char stream
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        //     System.out.println("You typed : " + br.readLine());

        // } catch (IOException e) {
        //     System.out.println(e.getMessage());   
        // }


        // try(BufferedReader br = new BufferedReader(new FileReader("E://DSA using Java//Notes.txt"))) {

        //     while (br.ready()) {
        //         System.out.println(br.readLine());;
        //     }
            
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }



        // -------------- Writer -------------------

        // try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
        //     osw.write("Hello World");
        //     osw.write(10); // for new line
        //     osw.write(97);
        //     osw.write('A');
        //     osw.write('\n');
        //     char[] ch = "Hello World".toCharArray();
        //     osw.write(ch); 
        // }

        // catch(IOException e) {
        //     System.out.println(e.getMessage());
        // }


        // try(FileWriter fw = new FileWriter("E://DSA using Java//Notes1.txt", true)) {
        //     fw.write("Hello, My name is Abdul Moid");
        //     fw.write(10); // for new line
        //     fw.write(97);
        //     // fw.write('A');
        //     // fw.write('\n');
        //     // char[] ch = "Hello World".toCharArray();
        //     // fw.write(ch); 
        // }

        // catch(IOException e) {
        //     System.out.println(e.getMessage());
        // }


        // try(BufferedWriter bw = new BufferedWriter(new FileWriter("E://DSA using Java//Notes2.txt", true))) {
        //     bw.write("Hello, My name is Abdul Moid");
        //     bw.write(10); // for new line
        //     // fw.write('A');
        //     // fw.write('\n');
        //     // char[] ch = "Hello World".toCharArray();
        //     // fw.write(ch); 
        // }

        // catch(IOException e) {
        //     System.out.println(e.getMessage());
        // }


        // creating a file
        // try {
        //     File fileObject = new File("E://DSA using Java//File_Handling//new-file.txt");
        //     fileObject.createNewFile();
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());   
        // }


        // write in the file
        // try {
        //     FileWriter fw = new FileWriter("E://DSA using Java//File_Handling//new-file.txt");
        //     fw.write("Hello Moid khan");
        //     fw.close();
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());   
        // }

        // reading from file

        // try(BufferedReader br = new BufferedReader(new FileReader("E://DSA using Java//File_Handling//new-file.txt"))) {
        //     while (br.ready()) {
        //         System.out.println(br.readLine());
        //     }
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }


        // deleting a file

        try {
            File fileObject = new File("E://DSA using Java//File_Handling//random-file.txt");
            fileObject.createNewFile();
            if(fileObject.delete()) {
                System.out.println(fileObject.getName());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());   
        }



    }
}
