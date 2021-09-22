public class RedVelvetCookie implements Observer 
{
    @Override
    public void update(Cookie n) {
        System.out.println("RedVelvetCookie:: " + n.getCookieContent());
    }
}