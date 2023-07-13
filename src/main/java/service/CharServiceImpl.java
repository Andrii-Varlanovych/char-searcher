package service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CharServiceImpl implements CharService {
    private List<Character> characterList = new ArrayList<>();

    @Override
    public List<Character> getUniqueCharFromWord(String string) {
        for (String word : string.split(" ")) {
            Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
            for (int i = 0; i < word.length(); i++) {
                char charAt = word.charAt(i);
                characterIntegerMap.put(charAt, characterIntegerMap.getOrDefault(charAt, 0) + 1);
            }
            for (Character character : characterIntegerMap.keySet()) {
                if (characterIntegerMap.get(character) == 1) {
                    characterList.add(character);
                    break;
                }
            }
        }
        return characterList;
    }

    @Override
    public void printUniqueCharFromList(List<Character> characterList) {
        if (characterList.size() == 0) {
            System.out.println("Please check input file, probably it's empty");
            return;
        }
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        for (Character character : characterList) {
            characterIntegerMap.put(character, characterIntegerMap.getOrDefault(character, 0) + 1);
        }
        for (Character character : characterIntegerMap.keySet()) {
            if (characterIntegerMap.get(character) == 1) {
                System.out.println("First unique symbol : " + character);
                return;
            }
        }
        System.out.println("There is no unique symbol in input file");
    }
}
