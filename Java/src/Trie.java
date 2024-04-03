/* Author: LHY
 * Purpose: Basically a Trie implementation
 * (What is a Trie? see https://en.wikipedia.org/wiki/Trie)
 */
//
//public class Trie<T> {
//
//    @SuppressWarnings("unchecked")
//    class Node<T> {
//        Node<T>[] characters = new Node[27];
//        T value;
//        int count = 0;
//    }
//
//    Node<T> root;
//
//    public Trie() { root = new Node<>(); }
//
//    Node<T> retrieve(String key) {
//        Node<T> curr = root;
//        final int maxIdx = key.length();
//        for (int i = 0 ; i < maxIdx; i++) {
//            int charIdx = Util.alphabetIndex(key.charAt(i));
//            curr = curr.characters[charIdx];
//
//            if (curr == null)
//                return null;
//        }
//        return curr;
//    }
//
//    void insert(String key, T value) {
//        Node<T> curr = root;
//        final int maxIdx = key.length();
//        for (int i = 0 ; i < maxIdx; i++) {
//            int charIdx = Util.alphabetIndex(key.charAt(i));
//            Node<T> next = curr.characters[charIdx];
//
//            if (next == null) {
//                curr.characters[charIdx] = new Node<>();
//                curr.characters[charIdx].count++;
//                next = curr.characters[charIdx];
//            }
//
//            curr = next;
//        }
//        curr.value = value;
//    }
//
//   T remove(String key, Node<T> curr, int i) {
//        if (i == key.length()-1) {
//            T value = curr.value;
//            curr.value = null;
//            curr.count--;
//            return value;
//        }
//
//        int alphabetIndex = Util.alphabetIndex(key.charAt(i));
//        T value = remove(key, curr.characters[alphabetIndex], i+ 1);
//        if (curr.characters[alphabetIndex].count == 0)
//            curr.characters[alphabetIndex] = null;
//        return value;
//    }
//
//    T retrieveValue(String key) {
//        Node<T> result = retrieve(key);
//        if (result == null)
//            return null;
//        else return result.value;
//    }
//
//    T removeKey(String key) {
//        if (retrieve(key) == null)
//            return null;
//        else return remove(key, root, 0);
//    }
//
//}
