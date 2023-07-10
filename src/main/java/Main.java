import parser.FileParser;
import parser.FileParserImpl;
import service.CharService;
import service.CharServiceImpl;
import java.util.List;

public class Main {

    private static String pathToFile;
    private static FileParser fileParser;
    private static CharService charService;

    static {
        pathToFile = "src/main/file2.txt";
        fileParser = new FileParserImpl();
        charService = new CharServiceImpl();
    }

    public static void main(String[] args) {
        String stringFromFile = fileParser.getStringFromFile(pathToFile);
        List<Character> uniqueCharFromWord = charService.getUniqueCharFromWord(stringFromFile);
        System.out.println(uniqueCharFromWord);
        charService.printUniqueCharFromList(uniqueCharFromWord);
    }
}
