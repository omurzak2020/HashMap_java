package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("человек", new String[]{"сапианс", "индивит", "личность", "существо"});
        dictionary.put("телефон",new String[]{"сотка","аппарат","смартфон"});
        dictionary.put("демон" , new String[]{"нечесть","черт","сатана"});
        dictionary.put("красивый" , new String[]{"милый","симпотичный","нящный","привлекательный"});

        for (Map.Entry<String ,String[]> item: dictionary.entrySet()) {
            System.out.printf(item.getKey()+ "-"+ Arrays.toString(item.getValue())+"\n");
        }

        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.printf("\n Tape a word");
        String word = scanner.next();
        if (dictionary.get(word) != null){
            String [] ssynonyms =dictionary.get(word);
         Random random = new Random();
         int index = random.nextInt(ssynonyms.length);
            System.out.printf(ssynonyms[index]);
        }else {
            System.out.printf("There is no such word");
        }
    }
}}
