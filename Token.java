public class Token
{
    private String token;

    public String getValue()
    {
        return token;
    }
    public void setValue(String token)
    {
        this.token = token;
    }
    public Token()
    {
        
    }
    public Token(String s)
    {
        this.token = s;
    }
    @Override
    public String toString()
    {
        return String.format(token);
    }
}