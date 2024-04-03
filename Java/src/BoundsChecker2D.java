/* Author: LHY
 * Created on: 27 Oct 2022
 * Purpose: Quickly check if given index is within bounds of a 2D array
 *          without having to worry about the edge cases when checking manually
 */
package src;

public class BoundsChecker2D {
    int topCorner, bottomLeft, topRight;

    BoundsChecker2D(int numOfRows, int numOfColumns) {
        this(0, numOfRows-1, numOfColumns-1);
    }

    BoundsChecker2D(int topCorner, int bottomLeft, int topRight) {
        this.topCorner = topCorner;
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    boolean isWithinBounds(int rowIdx, int columnIdx) {
        return  (topCorner <= rowIdx) && (rowIdx <= bottomLeft) &&
                (topCorner <= columnIdx) && (columnIdx <= topRight);
    }
}
