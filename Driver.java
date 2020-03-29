public class Driver
{
    public static void main(String[] args)
    {
        try
        {
            Tokenizer tokenizer = new Tokenizer();
            tokenizer.tokenizeFile("input.txt");
            tokenizer.writeTokens();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}