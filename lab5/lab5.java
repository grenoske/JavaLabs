package JavaLabs.lab5;

public class lab5 {
    public static void main(String[] artgs) {
        int Zalikova = 429;
        int C3 = Zalikova % 3;      // 0 StringBuilder
        int C17 = Zalikova % 17;    // 4 В кожному реченні заданого 
                                    // тексту змінити місцями
                                    // перше та останнє слово,
                                    // не змінивши довжини речення.   
                                    

        System.out.println("C3:"+C3+" C17:"+C17);

        StringBuilder sb = new StringBuilder("We    are no love!"+
        "\tYou know the rules and so do I do?!"+
        " A full commitment's what I'm thinking of..."+
        " You wouldn't get this from any other guy."+
        " I just, wanna tell you how I'm feeling."+
        " Gotta make you understand."+
        " Never gonna give you up!!");


        lab5_Text t = new lab5_Text(sb);
        t.formatSentencesSwapFirstLastWord();

        System.out.println("---------------------Answer---------------------");
        System.out.println("----Input Text: ");
        System.out.println(sb);
        System.out.println("----Edited Text: ");
        System.out.println(t);
    }
    
}
