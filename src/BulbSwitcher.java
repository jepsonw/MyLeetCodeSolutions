/**
 * Created by kaijiezhou on 12/29/15.
 */
public class BulbSwitcher {
    public int bulbSwitch(int n) {
        /*
        * The non-Squre number will always be on because there always be two numbers that can make it on and then off,
         * e.g. 12=2*6, then, 2 will turn it on and 6 will turn it off.
         * Yet for squre number like 16, there is a time that only on but not off.
         * e.g. 16=2*8=4*4, 2 will turn it on and 8 will turn it off. but 4 can turn it on and no other number can turn it off
         * So the number of lighting bulb is the number of squre number that less than n
         * */
        return (int)Math.sqrt(n);
    }
}
