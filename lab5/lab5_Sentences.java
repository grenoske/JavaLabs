package JavaLabs.lab5;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.ArrayList;

public class lab5_Sentences
{
    private ArrayList<lab5_Words> words = new ArrayList<>();
    private ArrayList<lab5_Symbols> symbols = new ArrayList<>();

    public lab5_Sentences(String str)
    {
        BreakIterator iterator = BreakIterator.getWordInstance(Locale.US);
        iterator.setText(str.toString());

        String symbols_temp = "";
        int start = iterator.first();
        for (int end = iterator.next(); end != BreakIterator.DONE;
        start = end, end = iterator.next()) 
        {
            // отримуємо слово, брикітератор дає кінець та початок
            String temp = str.substring(start,end);
            char ch = temp.charAt(0);
            if (ch == '.' || ch == ',' || ch == '-' || ch == '!' ||
                ch == '?' || ch == ' ' || ch == '\n'|| ch == '\t')
            {
                //Замінити послідовність табуляцій та пробілів одним пробілом
                if (temp.charAt(0) == ' ' || temp.charAt(0) == '\t')
                    temp = " ";

                symbols_temp =  symbols_temp + temp;
            }
            else
            {
                if(symbols_temp != "")
                    symbols.add(new lab5_Symbols(symbols_temp));
                symbols_temp = "";
                words.add(new lab5_Words(temp));
            }

        }
        symbols.add(new lab5_Symbols(symbols_temp)); //символ у кінці речення
    }

    public lab5_Sentences SwapFirstLastWord()
    {
        lab5_Words wordTemp;
        wordTemp = words.get(0);
        words.set(0, words.get(words.size()-1));
        words.set(words.size()-1, wordTemp);
        return this;
    }

    @Override
    public String toString() {
        String res = "";
        for(int i = 0; i < words.size(); i++)
            res = res + words.get(i).toString() + symbols.get(i).toString();
        return res;
    }

}