
import java.io.*;

public class LibraryFileEditor {

    public static final String fileName = "C:\\qajavnc1\\Labs\\Files_and_Exceptions\\files\\members.txt";

    public static void main(String[] args) {

        try {
            inputMember();
            showMembers();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e ){
            System.err.println("Problem with file handling");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage()+" is an invalid age");
        } catch (UnderAgeException e) {
            System.err.println(e.getMessage()+"Bad Age");
        }


    }   // end of main()

    public static void inputMember () throws IOException , UnderAgeException{
        String name, strAge;
        int age;


           name=getInput("Name:");
           strAge=getInput("Age:");
           age=Integer.parseInt(strAge);

         if (age < 16) {
            throw new UnderAgeException(age);
        }

    }	// end of inputMember ()



    public static String getInput(String question) throws IOException {

        String keyboardinput = null;

        System.out.println(question);

        InputStreamReader inp=new InputStreamReader(System.in);

        BufferedReader buff=new BufferedReader(inp);

        keyboardinput=buff.readLine();

        return keyboardinput;

    }	// end of getInput()


    public static void showMembers() throws IOException {
               BufferedReader bfr=null;
               String data;
         try {
            FileInputStream finp = new FileInputStream(fileName);
            InputStreamReader inp = new InputStreamReader(finp);
            bfr = new BufferedReader(inp);

            data = bfr.readLine();

            while (data != null) {
                System.out.println(data);
                data = bfr.readLine();
            }

         } finally {
             System.out.println("We are in finally");
             if (bfr != null) {
                bfr.close();
             }
         }

        // QA To Do Step 12:
        // Introduce a finally {}
        // We have not ensured that the BufferedReader is closed
        // Place bfr.close() in a finally clause


        // Wrap all the rest of the method in a try {} block
        // COMPILE
        // It fails because 'bfr' is declared in and is local to the try!
        // Ensure that the BufferedReader is declared (just declared) prior to the
        // 'try', you will also be asked to ensure that the
        // reference is initialised (to null) prior to the 'try' block.
        // COMPILE
        // Put a System.out.println("We're in finally"); as 1st statement
        // in the finally and ensure it appears whether the file
        // is found or not.
        // You will find it does, but your code will crash in the finally
        // You can sort that one out yourself!!
        // If you get this all working go to the very bottom of the file
        // to find some very optional extra tasks
        // End of step 12

    }	// end of showMembers()

}		// end of class

    class UnderAgeException extends Exception {
    private int age;

    public UnderAgeException (int a) {
        age=a;
    }

    public int getAge() {
        return age;
    }
}

// QA To Do Very Optional steps
// 1)   Make the UnderAgeException an inner class
//      Just cut it out and drop it above the close brace } of the main class
//	Did you get it working? the compilation error is slightly misleading
//      Think about what does an instance of an inner class need?

// 2)	Put the whole of main in a while loop
//      so that they can potentially enter lots of members
//      keeping prompting them "Type 'quit' to exit" and keep
//      looping until they type in 'quit'. But allow them to type
//      quit in upper case, lower case, mixed case etc
//      String reply = getInput("Type 'quit' if you want to exit");
//	  would be a good 1st line of main before the while(....)

