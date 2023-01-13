package JavaLabs.lab5;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.ArrayList;

public class lab5_Text {
    int size = 50;
    private ArrayList<lab5_Sentences> sentences = new ArrayList<>();
    
    public lab5_Text(StringBuilder sb)
    {
        // використаємо брикітератор щоб розбити на речення 
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        iterator.setText(sb.toString());

        int start = iterator.first();
        for (int end = iterator.next(); end != BreakIterator.DONE;
        start = end, end = iterator.next())
        {
            // отримуємо речення, брикітератор дає кінець та початок
           sentences.add(new lab5_Sentences(sb.substring(start,end)));
        }
    }

    public lab5_Text formatSentencesSwapFirstLastWord()
    {
        for (int i = 0; i < sentences.size(); i++)
            this.sentences.get(i).SwapFirstLastWord();
        return this;
    }

    @Override
    public String toString() {
        String res = "";
        for(int i = 0; i < sentences.size(); i++)
            res = res + sentences.get(i).toString();
        return res;
    }
}

