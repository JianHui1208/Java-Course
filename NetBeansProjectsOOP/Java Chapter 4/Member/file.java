package Member;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class file {
    String Name;
    String Keyword;

    public file() {
    }

    public file(String newName, String newKeyword) {
        setName(newName);
        setKeyword(newKeyword);
    }

    public String setName(String newName) {
        Name = newName;
        return Name;
    }

    public String setKeyword(String newKeyword) {
        Keyword = newKeyword;
        return Keyword;
    }

    public void save() {
        try {
            String setName = setName(Name);
            String setKeyword = setKeyword(Keyword);
            File file = new File(setName + ".txt");
            PrintWriter output = new PrintWriter(file);
            output.println(setName);
            output.println(setKeyword);
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File no found");
        }
    }

    public String show() {
        String MSG = "";
        try {
            String name = setName(Name);
            File file = new File(name + ".txt");
            Scanner data = new Scanner(file);
            String UserName = "";
            String Member = "";
            while (data.hasNext()) {
                UserName = data.nextLine();
                Member = data.nextLine();
            }
            // System.out.println("Name: " + UserName);
            // if (Member.length() == 3) {
            // System.out.println("You are a Member.");
            // } else {
            // System.out.println("You are not a Member.");
            // }
            MSG = "Name: " + UserName + "\n" + "Member: " + Member;
        } catch (FileNotFoundException e) {
            System.out.println("File no found");
        }
        return MSG;
    }
}
