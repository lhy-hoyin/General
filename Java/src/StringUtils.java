public class StringUtils {

    private StringUtils() { /* Does nothing */ }

    /**
     * Removes trailing instances of given sequence once.
     * Returns the original string if it does not end with the sequence.
     *
     * @param str      String to remove sequence from
     * @param sequence String of sequence to remove
     * @return String of result with trailing sequence removed
     */
    public static String removeTrailing(String str, String sequence) {
        return removeTrailing(str, sequence, false);
    }

    /**
     * Recursively removes trailing instances of given sequence.
     * Returns the original string if it does not end with the sequence.
     *
     * @param str       String to remove sequence from
     * @param sequence  String of sequence to remove
     * @param recursive Indicates if it should recursively remove trailing instances of sequence
     * @return String of result with trailing sequence removed
     */
    public static String removeTrailing(String str, String sequence, boolean recursive) {
        if (str == null || sequence == null) {
            return str;
        }

        final boolean endsWithSequence = str.endsWith(sequence);
        final int strLength = str.length();
        final int seqLength = sequence.length();
        final String result = endsWithSequence ? str.substring(0, strLength - seqLength) : str;
        return (recursive & endsWithSequence) ? removeTrailing(result, sequence, true) : result;
    }


}
