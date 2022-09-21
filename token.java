package com.company;

import java.io.FileReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.*;

public class token {

    public static void main(String[] args) throws Exception {

        Reader reader = new FileReader("C:/Users/user/Desktop/output.txt");

        StreamTokenizer tokenizer = new StreamTokenizer(reader);

        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {

            System.out.println(tokenizer.sval);
        }
        reader.close();
//        File file = new File("C:/Users/user/Desktop/output.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//        String line;
//        int wordCount = 0;
//        int characterCount = 0;
//        int paraCount = 0;
//        int whiteSpaceCount = 0;
//        int sentenceCount = 0;
//
//        while ((line = bufferedReader.readLine()) != null) {
//            if (line.equals("")) {
//                paraCount += 1;
//            }
//            else {
//                characterCount += line.length();
//                String[] words = line.split("\\s+");
//                wordCount += words.length;
//                whiteSpaceCount += wordCount - 1;
//                String[] sentence = line.split("[!?.:]+");
//                sentenceCount += sentence.length;
//            }
//        }
//        if (sentenceCount >= 1) {
//            paraCount++;
//        }
//        System.out.println("word = "+ wordCount);
//        System.out.println("sentences = "+ sentenceCount);
//        System.out.println("characters = "+ characterCount);
//        System.out.println("paragraphs = "+ paraCount);
//        System.out.println("spaces = "+ whiteSpaceCount);
    }

}
