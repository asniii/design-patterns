package geek_example.q1_design_hit_counter;

/***
 * Design a hit counter which counts the number of hits received in the past 5 minutes.
 *
 *
 * It should support the following two operations: hit and getHits.
 *
 * hit(timestamp) – Shows a hit at the given timestamp.
 *
 * getHits(timestamp) – Returns the number of hits received in the past 5 minutes (300 seconds) (from currentTimestamp).
 */
public class Solution {
    public static void main(String args[]){
        HitCounter counter = new HitCounter();

        counter.hit(1);
        counter.hit(2);
        counter.hit(3);
        counter.getHits(4);
        counter.hit(300);
        counter.getHits(200);
    }
}
