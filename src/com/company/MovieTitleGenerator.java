package com.company;

import java.util.Random;
import java.util.Scanner;
import java.net.URL;

public class MovieTitleGenerator {

    /*public static void main(String[] args) {
        // write your code here*/

        public static void main (String[]args) throws Exception
        {

            Random random = new Random();

            String[] adjectives = arrayFromUrl("https://cs.leanderisd.org/txt/adjectives.txt");
            String[] nouns = arrayFromUrl("https://cs.leanderisd.org/txt/nouns.txt");

            System.out.println("Myxyllplyk's Random Movie Title Generator\n");

            System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
            System.out.println("and " + nouns.length + " nouns (" + (adjectives.length * nouns.length) + " combinations).");

            //
            //String nounFirstItem = nouns[0];
            //String nounLastItem = nouns[nouns.length-1];

            int index = random.nextInt(adjectives.length);
            System.out.println(adjectives[index]);
            int indexn = random.nextInt(nouns.length);
            System.out.println(nouns[indexn]); //n

            String adjective = "Cool";
            String noun = "Dave";

            System.out.println("Your movie title is: " + adjective + " " + noun);

            System.out.println("Your movie title2 is: " +adjectives[index]+ " " + nouns[indexn]); //n

            //System.out.println(nounFirstItem);
        }

        /**
         *        @param url - the URL to read words from
         *	@return An array of words, initialized from the given URL
         */
        public static String[] arrayFromUrl( String url ) throws Exception
        {
            Scanner fin = new Scanner((new URL(url)).openStream());
            int count = fin.nextInt();

            String[] words = new String[count];

            for (int i = 0; i < words.length; i++) {
                words[i] = fin.next();
            }
            fin.close();

            return words;
        }
    }

//}
