package service;

import java.util.List;

public interface CharService {
    List<Character> getUniqueCharFromWord(String string);
    void printUniqueCharFromList(List<Character> characterList);
}
