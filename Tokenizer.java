import java.io.*;
import java.util.*;
public class Tokenizer
{
    private ArrayList<Token> tokens;
    private int keywords;

    public Tokenizer()
    {
        tokens = new ArrayList<Token>();
    }
    public void tokenizeFile(String filePath) throws IOException
    {
        String line = "";
        FileReader file = new FileReader(filePath);
        BufferedReader read = new BufferedReader(file);
        tokens.clear();
        keywords = 0;
        while((line = read.readLine()) != null)
        {
            String[] tokenArray = line.split("\\s+");
            for(int i = 0; i < tokenArray.length; i++)
            {
                Token newToken = new Token(tokenArray[i]);
                this.tokens.add(newToken);
                keywords++;
            }
        }
        read.close();
    }
    public Token[] getTokenizer()
    {
        Token[] tokenList = new Token[tokens.size()];
        for(int i = 0; i < tokens.size(); i++)
        {
            tokenList[i] = tokens.get(i);
        }
        return tokenList;
    }
    public void writeTokens() throws IOException
    {
        PrintWriter writer = null;
        try
        {
            Token[] list = getTokenizer();
            writer = new PrintWriter("output.txt");
            for(int i = 0; i < keywords; i++)
            {
                writer.println(list[i]);
            }
            writer.close();
        }
        catch (IOException e)
        {
            System.err.println("Caught IOException: " + e + e.getMessage());
        } finally{
            if (writer != null)
            {
                writer.close();
            }
        }
    }
    public int getKeywordCount()
    {
        return keywords;
    }
    // @Override
    // public String toStirng()
    // {
    //     return String.format(token);
    // }
}