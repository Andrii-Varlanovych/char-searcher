This is a testing task based on Java code.

This program takes arbitrary text as input and finds 
the first character in each word of the text that is NOT repeated in that word.
Next, from the obtained set of characters, the program selects the first unique character 
(i.e., the one that does not appear again in the set) and returns it.

To find the first unique character in arbitrary text, place it in a file named file.txt and run the program. 
If the input text contains such a character, its value will be displayed on the screen. 
If the input text is empty or does not have a unique character, an appropriate message will be displayed.

I hope my approach to solving this task, which is based on parsing the input text and using a LinkedHashMap 
for finding the unique element, is close to optimal.