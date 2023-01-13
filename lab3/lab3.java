package JavaLabs.lab3;

import java.text.BreakIterator;
import java.util.Locale;


public class lab3 {
    public static void main(String[] artgs)
    {
        int Zalikova = 429;
        int C3 = Zalikova % 3;      // 0 StringBuilder
        int C17 = Zalikova % 17;    // 4 В кожному реченні заданого 
                                    // тексту змінити місцями
                                    // перше та останнє слово,
                                    // не змінивши довжини речення.   
                                    

        System.out.println("C3:"+C3+" C17:"+C17);

        StringBuilder sb = new StringBuilder("We are no love!"+
        " You know the rules and so do I do?!"+
        " A full commitment's what I'm thinking of..."+
        " You wouldn't get this from any other guy."+
        " I just wanna tell you how I'm feeling."+
        " Gotta make you understand."+
        " Never gonna give you up!!");
        StringBuilder result = new StringBuilder();
    
        // використаємо брикітератор щоб розбити на речення 
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        iterator.setText(sb.toString());

        int start = iterator.first();
        for (int end = iterator.next(); end != BreakIterator.DONE;
        start = end, end = iterator.next()) {
            // отримуємо речення, брикітератор дає кінець та початок
            StringBuilder sentece = new StringBuilder(sb.substring(start,end));
            
            // від початку до пробілу беремо строку(перше слово)
            String first = sentece.substring(0, sentece.indexOf(" "));
            sentece.insert(0, '>');//помітка для першого 

            int k = 2;
            String last = "-1";
            // беремо кожний раз з кінця символ поки не пробіл
            while ( sentece.charAt(sentece.length() - k) != ' ')
                k++;
            last = sentece.substring(sentece.length() - k);

            // видалимо з речення перше та останнє слово - отримаємо середину
            String middle = sentece.toString().replace('>'+first, "").replace(last,"");

            // видалимо зайвий пробіл спереду у останнього слова
            last = last.replace(" ", "");

            // виріжемо символи на кінці
            int lenghOfW = last.length()-1;
            while (last.charAt(lenghOfW) == '.' || last.charAt(lenghOfW) == '!' || last.charAt(lenghOfW) == '?')
                lenghOfW--;
            String symbolAtTheEnd = last.substring(lenghOfW+1, last.length());
            last = last.replace(symbolAtTheEnd, "");

            // зберемо речення помінявши місцями перше та останнє слово, додамо необхідні пробіли + символи на кінці
            StringBuilder temp2 = new StringBuilder(last + middle + " " + first + symbolAtTheEnd + " ");
            // додамо редаговане речення до результуючого тексту
            result.append(temp2);  
        }
        result = result.deleteCharAt(result.length()-1); //зайвий пробіл на кінці - видалити
        System.out.println("---------------------Answer---------------------");
        System.out.println("----Input Text: ");
        System.out.println(sb);
        System.out.println("----Edited Text: ");
        System.out.println(result);

        if(result.length() == sb.length())
            System.out.println("---length of sentences are the same---");
        else{ System.out.println("---Wrong length---"); }
    }

}
