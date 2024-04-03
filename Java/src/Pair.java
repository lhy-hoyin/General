/* Author: LHY
 * Purpose: A generic Pair to cater to different object types
 */

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T fst, U snd) {
        first = fst;
        second = snd;
    }

    public T first() { return first; }
    public U second() { return second; }
    public void first(T fst) { this.first = fst; }
    public void second(U snd) { this.second = snd; }

    public T left() { return first; }
    public U right() { return second; }
    public void left(T left) { first = left; }
    public void right(U right) { second = right; }

    public T x() { return first; }
    public U y() { return second; }
    public void x(T x) { first = x; }
    public void y(U y) { second = y; }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }
}
