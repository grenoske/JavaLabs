package JavaLabs.lab5;

public class lab5_Words {

    private char letters[];
    public lab5_Words(String chs)
    {
        letters = chs.toCharArray();
    }

    @Override
    public String toString() {
        String res = "";
        for(int i = 0; i < letters.length; i++)
            res = res + letters[i];
        return res;
    }
}