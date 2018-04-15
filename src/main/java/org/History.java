package org.plaltar;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class History {

    String fileName = "history.txt";

    FileWriter fileWriter = new FileWriter(fileName);

    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);



}
