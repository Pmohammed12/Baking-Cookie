public class ChocolateCookie implements Observer 
{
    @Override
    public void update(Cookie n) {
        System.out.println("ChocolateCookie " + n.getCookieContent());
    }
}