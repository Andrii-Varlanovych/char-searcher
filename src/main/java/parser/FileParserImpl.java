package parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileParserImpl implements FileParser {
    private StringBuilder stringBuilder;
    private BufferedReader bufferedReader;
    private String line;

    @Override
    public String getStringFromFile(String pathToFile) {
        stringBuilder = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader(pathToFile));
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append(" ");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Can't find file " + pathToFile, e);
        } catch (IOException e) {
            throw new RuntimeException("Can't read file " + pathToFile, e);
        }
        return stringBuilder.toString();
    }
}
