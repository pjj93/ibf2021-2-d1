package ibf2021.d1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Filepath {
    public static void main(String[] args) {
        
        // create a new directory ref: https://mkyong.com/java/how-to-create-directory-in-java/
        /* 
        String dir = "/Users/user/Documents/Code/Java/day3/db";
        try {
            Path path = Paths.get(dir);
            Files.createDirectories(path);
            System.out.println("Directory is created!");
        } catch (IOException e) {
            System.out.println("Failed to create directory! " + e.getMessage());
        }
        */

        // get working directory - Paths ref: https://mkyong.com/java/how-to-get-the-current-working-directory-in-java/
        /*
        String userDirectory = Paths.get("")
                .toAbsolutePath()
                .toString();
        System.out.println(userDirectory);
        */


        // check if specified directory inside working directory exists,
        // if does not exist, create directory
        // String wkgDir = Paths.get("").toAbsolutePath().toString();
        // if (args.length == 0)
        // {
        //     createDir("db");
        // }
        // else if (args.length == 1)
        // {
        //     createDir(args[0]);
        // }
        // else
        // {
        //     System.out.println("Invalid folder specified");
        // }

        // String newDir = wkgDir + "/db";
        // Path path = Paths.get(newDir);
        // // System.out.println(Files.exists(path));
        // if (!Files.exists(path))
        //     try {
        //         Files.createDirectories(path);
        //         System.out.println("Directory is created!");
        //     } catch (IOException e) {
        //         System.out.println("Failed to create directory! " + e.getMessage());
        //     }
        // else
        //     System.out.println("The directory path " + wkgDir + " already exists!");
    }

    // public static void createDir(String foldername)
    // {
    //     String wkgDir = Paths.get("").toAbsolutePath().toString();
    //     String newDir = wkgDir + "/" + foldername;
    //     Path path = Paths.get(newDir);
    //     // System.out.println(Files.exists(path));
    //     if (!Files.exists(path))
    //         try {
    //             Files.createDirectories(path);
    //             System.out.println("Directory is created!");
    //         } catch (IOException e) {
    //             System.out.println("Failed to create directory! " + e.getMessage());
    //         }
    //     else
    //         System.out.println("The directory path " + wkgDir + " already exists!");
    // }
}