import java.util.Scanner;

public class ArrayWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert at least three words, separated by comas and space");
        String input = sc.nextLine();
        String [] words = input.split(", ");
        while (true) {
            System.out.println("Chose the filter for your words:");
            System.out.println("1. Show the words with maximum symbols length");
            System.out.println("2. Show the words, which starts with the defined letter");
            System.out.println("3. Show the words, which ends with the defined letter");
            System.out.println("4. Show the words, which contains the defined letter");
            System.out.println("0. Exit the filter");
            String filter = sc.next();
            System.out.println("Filter = " + filter);
            if (filter.equals("0")){
                System.out.println("Goodbye");
                break;
            }
            if (filter.equals("1")) {
                String maxLength = "";
                System.out.println(words.length);
                for(String w: words){
                    System.out.println("word: " + w);
                    if(w.length() > maxLength.length()){
                        maxLength = w;
                    }
                }
                System.out.println("The longest word: " + maxLength);
            }
            if (filter.equals("2")){
                System.out.println("Insert the letter");
                Scanner scLetter = new Scanner(System.in);
                String firstLetter = scLetter.nextLine();
                System.out.println("letter: " + firstLetter);
                for (String f : words){
                    if (f.startsWith(firstLetter)){
                        System.out.println("word found: " + f);
                    }
                    else {
                        System.out.println("There is no such first letter in your words");
                    }
                }

            }
            if (filter.equals("3")){
                System.out.println("Insert the last letter");
                Scanner scLetter = new Scanner(System.in);
                String lastLetter = scLetter.nextLine();
                System.out.println("letter: " + lastLetter);
                for (String l : words){
                    if (l.endsWith(lastLetter)){
                        System.out.println("word found: " + l);
                    }
                    else {
                        System.out.println("There is no such last letter in your words");
                    }
                }

            }
            if (filter.equals("4")){
                System.out.println("Insert any letter");
                Scanner scLetter = new Scanner(System.in);
                String anyLetter = scLetter.nextLine();
                System.out.println("letter: " + anyLetter);
                for (String a : words){
                    if (a.contains(anyLetter)){
                        System.out.println("word found: " + a);
                    }
                    else {
                        System.out.println("There is no such last letter in your words");
                    }
                }
            }

            }
            } }



