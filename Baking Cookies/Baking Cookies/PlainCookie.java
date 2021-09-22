public class PlainCookie implements Observer 
{
    @Override
    public void update(Cookie n) {
        System.out.println("PlainCoookie :: " + n.getCookieContent());
    }
}