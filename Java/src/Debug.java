/* Author: LHY
 * Purpose: A collection of methods to help with debugging of code
 *          without using the debugger.
 * WARNING: IF YOU NEED TO SUBMIT THIS CLASS FILE IN THE FINAL COMPILATION,
 *          IS YOUR FINAL PRODUCT REALLY FINAL?
 */
package src;

public class Debug {

    public static boolean isDebug = true;

    static void enableDebug() { isDebug = true; }
    static void disableDebug() { isDebug = false; }

    static void println(Object s) { if (isDebug) System.out.println(s); }

    static void println(Object ... objects) {
        if (!isDebug) return;
        StringBuilder sb = new StringBuilder();
        for (Object obj : objects)
            sb.append(obj).append(" ");
        System.out.println(sb);
    }

}
