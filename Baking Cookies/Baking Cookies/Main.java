public class Main 
{
    public static void main(String[] args) 
    {
        ChocolateCookie s1 = new ChocolateCookie();
        RedVelvetCookie s2 = new RedVelvetCookie();
        PlainCookie s3 = new PlainCookie();
         
        BakingCookie p = new BakingCookie();
         
        p.attach(s1);
        p.attach(s2);
         
        p.notifyUpdate(new Cookie("Cookies are Baking"));   
         
        p.detach(s1);
        p.attach(s3);
         
        p.notifyUpdate(new Cookie("Cookies are ready to eat")); 
    }
}