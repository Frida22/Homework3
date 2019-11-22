package Homrwork6.Task2;


import Homrwork6.Task2.interfaces.Save;
import Homrwork6.Task2.interfaces.SaveTo;

import java.io.FileWriter;
import java.io.IOException;

@SaveTo(PATH = "C:/Users/Njuta/ForProject/1.txt")
public class TestContainer {

    String text = "...";

    @Save
    public void save (String text, String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        try {
            fileWriter.write(text);
        } finally {
            fileWriter.close();
            System.out.println("file created");
        }
    }
}
