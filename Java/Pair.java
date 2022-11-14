/* Author: LHY
 * Purpose: A generic Pair to cater to different object types
 */

public class Pair<T,U> {
    private T first_;
    private U second_;

    public Pair(T fst, U snd) {
        first_ = fst;
        second_ = snd;
    }

    public T first() { return first_; }
    public T left() {return first_; }

    public U second() { return second_; }
    public U right() {return second_; }

    public void first(T first_) { this.first_ = first_; }
    public void left(T left) { first_ = left; }

    public void second(U second_) { this.second_ = second_; }
    public void right(U right) { second_ = right; }

    @Override
    public String toString() {
        return "(" + first_ + "," + second_ + ")";
    }
}
