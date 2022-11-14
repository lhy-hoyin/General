/* Author: LHY
 * Created on: 4 Nov 2022
 */

public class ComparablePair
        <
                T extends Comparable<T>,
                U extends Comparable<U>
        >
        extends Pair<T,U>
        implements Comparable<ComparablePair<T,U>>

{
    public ComparablePair(T fst, U snd) { super(fst, snd); }

    @Override
    public int compareTo(ComparablePair<T, U> other) {
        if (!first().equals(other.first()))     return first().compareTo(other.first());
        else                                    return second().compareTo(other.second());
    }
}
