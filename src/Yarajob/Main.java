package Yarajob;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    private Object[] listOfObject;

    public static void main(String args[]) {


        String input;
        Scanner scanner = new Scanner(System.in);
        List<Object> listOfObject = new ArrayList<>();

        System.out.println("Job Menu");
        System.out.println("1. Add a new accountant Information");
        System.out.println("2. Add a new phone programmer Information");
        System.out.println("3. Add a new web programmer Information");
        System.out.println("4. Quit");
        do {
            System.out.print("Please enter either 1 to 3: ");
            input = (scanner.nextLine());
            if (input.equals("1")) {
                Accountant accountant = new Accountant();
                System.out.println("Please enter your name: ");
                accountant.setName(scanner.nextLine());
                System.out.println("Please enter your numberID: ");
                accountant.setNumberId(Long.parseLong(scanner.nextLine()));
                System.out.println("Please enter your workExperiences: ");
                accountant.setWorkExperiences(Integer.parseInt(scanner.nextLine()));
                System.out.println("Please enter your lastDegree: ");
                accountant.setLastDegree(scanner.nextLine());
                listOfObject.add(accountant);
            } else if (input.equals("2")) {
                WebProgrammer webProgrammer = new WebProgrammer();
                System.out.println("Please enter your name: ");
                webProgrammer.setName(scanner.nextLine());
                System.out.println("Please enter your numberID: ");
                webProgrammer.setNumberId(Long.parseLong(scanner.nextLine()));
                System.out.println("Please enter your workExperiences: ");
                webProgrammer.setWorkExperiences(Integer.parseInt(scanner.nextLine()));
                System.out.println("Please enter your job position: ");
                webProgrammer.setJobPosition(scanner.nextLine());
                System.out.println("Please enter your languageProgramming ");
                webProgrammer.setLanguageProgramming(scanner.nextLine());
                listOfObject.add(webProgrammer);
            } else if (input.equals("3")) {
                PhoneProgrammer phoneProgrammer = new PhoneProgrammer();
                System.out.println("Please enter your name: ");
                phoneProgrammer.setName(scanner.nextLine());
                System.out.println("Please enter your numberID: ");
                phoneProgrammer.setNumberId(Long.parseLong(scanner.nextLine()));
                System.out.println("Please enter your workExperiences: ");
                phoneProgrammer.setWorkExperiences(Integer.parseInt(scanner.nextLine()));
                System.out.println("Please enter your job position: ");
                phoneProgrammer.setJobPosition(scanner.nextLine());
                System.out.println("Please enter number of your released applications : ");
                phoneProgrammer.setNumberReleasedApp(Integer.parseInt(scanner.nextLine()));
                listOfObject.add(phoneProgrammer);
            }
        } while (!input.equals("4"));



        Writer writer=null;
        for(Object obj : listOfObject) {
            try {
                writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("List.txt"), "utf-8"));
                writer.write(listOfObject.toString());

            } catch (IOException ex) {
                // Report
            } finally {
                try {
                    writer.close();
                } catch (Exception ex) {
                }
            }
        }


        String line = null;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader("List.txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            "List.txt" + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + "List.txt" + "'");

        }

    }

}
