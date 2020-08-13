/**
 * Simple hello world file.  In this case we use the fileResource method from the edu.duke package.
 *
 * From there it will allow the user to select a file and read in the contents line by line
 *
 */

import edu.duke.*;

public class Main {

    public static void main(String[] args) {
        FileResource res = new FileResource();
        for (String line : res.lines()) {
            System.out.println(line);
        }
    }
}
