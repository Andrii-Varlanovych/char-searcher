import parser.FileParser;
import parser.FileParserImpl;
import service.CharService;
import service.CharServiceImpl;
import java.util.List;

public class Main {

    private static final String pathToFile;
    private static final FileParser fileParser;
    private static final CharService charService;

    static {
        pathToFile = "src/main/file.txt";
        fileParser = new FileParserImpl();
        charService = new CharServiceImpl();
    }

    public static void main(String[] args) {
        String stringFromFile = fileParser.getStringFromFile(pathToFile);
        List<Character> uniqueCharFromWord = charService.getUniqueCharFromWord(stringFromFile);
        charService.printUniqueCharFromList(uniqueCharFromWord);
    }
}
