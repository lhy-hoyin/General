/* Author: LHY
 * Purpose: Similar to a generic Pair, but holds 3 parameters instead
 */

public class Triple<T, U, V> {
    T first_;
    U second_;
    V third_;

    public Triple(T first, U second, V third) {
        first_ = first;
        second_ = second;
        third_ = third;
    }

    public T first() { return first_; }
    public U second() { return second_; }
    public V third() { return third_; }

    public void first(T newFirst) { first_ = newFirst; }
    public void second(U newSecond) { second_ = newSecond; }
    public void third(V newThird) { third_ = newThird; }

    @Override
    public String toString() {
        return "(" + first_ + "," + second_ + "," + third_ + ")";
    }
}
