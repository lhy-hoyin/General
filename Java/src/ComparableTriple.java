/* Author: LHY
 * Created on: 4 Nov 2022
 */
package src;

public class ComparableTriple
        <
                T extends Comparable<T>,
                U extends Comparable<U>,
                V extends Comparable<V>
        >
        extends Triple<T,U,V>
        implements Comparable<ComparableTriple<T,U,V>>
{
    public ComparableTriple(T first, U second, V third) { super(first, second, third); }

    @Override
    public int compareTo(ComparableTriple<T,U,V> other) {
        if (!first().equals(other.first()))     return first().compareTo(other.first());
        if (!second().equals(other.second()))   return second().compareTo(other.second());
        else                                    return third().compareTo(other.third());
    }

}
