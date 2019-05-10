package arif.ennoblesoft.logutil;

import android.annotation.SuppressLint;
import android.util.Log;

@SuppressLint("LongLogTag")
public class LogUtil {
    private static final String TAG = LogUtil.class.getSimpleName();
    private static final String VERBOSE = " ★彡 \uD835\uDCE5\uD835\uDCD4\uD835\uDCE1\uD835\uDCD1\uD835\uDCDE\uD835\uDCE2\uD835\uDCD4 彡★";
    private static final String DEBUG = " ★彡 \uD835\uDCD3\uD835\uDCD4\uD835\uDCD1\uD835\uDCE4\uD835\uDCD6 彡★";
    private static final String INFO = " ★彡 \uD835\uDCD8\uD835\uDCDD\uD835\uDCD5\uD835\uDCDE 彡★";
    private static final String WARN = " ★彡 \uD835\uDCE6\uD835\uDCD0\uD835\uDCE1\uD835\uDCDD 彡★";
    private static final String ERROR = " ★彡 \uD835\uDCD4\uD835\uDCE1\uD835\uDCE1\uD835\uDCDE\uD835\uDCE1 彡★";
    private static final String WTF = " ★彡 \uD835\uDCE6\uD835\uDCE3\uD835\uDCD5 彡★";

    //<editor-fold desc="verbose log section">
    public static void verbose(String message) {
        Log.v(TAG + VERBOSE, message);
    }

    public static void verbose(String TAG, String message) {
        Log.v(TAG + VERBOSE, message);
    }

    public static void verbose(String TAG, String message, Throwable tr) {
        Log.v(TAG + VERBOSE, message, tr);
    }
    //</editor-fold>

    //<editor-fold desc="debug log section">
    public static void debug(String message) {
        Log.d(TAG + DEBUG, message);
    }

    public static void debug(String TAG, String message) {
        Log.d(TAG + DEBUG, message);
    }

    public static void debug(String TAG, String message, Throwable tr) {
        Log.d(TAG + DEBUG, message, tr);
    }
    //</editor-fold>

    //<editor-fold desc="info log section">
    public static void info(String message) {
        Log.i(TAG + INFO, message);
    }

    public static void info(String TAG, String message) {
        Log.i(TAG + INFO, message);
    }

    public static void info(String TAG, String message, Throwable tr) {
        Log.i(TAG + INFO, message, tr);
    }
    //</editor-fold>

    //<editor-fold desc="warn log section">
    public static void warn(String message) {
        Log.w(TAG + WARN, message);
    }

    public static void warn(String TAG, String message) {
        Log.w(TAG + WARN, message);
    }

    public static void warn(String TAG, String message, Throwable tr) {
        Log.w(TAG + WARN, message, tr);
    }
    //</editor-fold>

    //<editor-fold desc="error log section">
    public static void error(String message) {
        Log.e(TAG + ERROR, message);
    }

    public static void error(String TAG, String message) {
        Log.e(TAG + ERROR, message);
    }

    public static void error(String TAG, String message, Throwable tr) {
        Log.e(TAG + ERROR, message, tr);
    }
    //</editor-fold>

    //<editor-fold desc="wtf log section">
    public static void wtf(String message) {
        Log.wtf(TAG + WTF, message);
    }

    public static void wtf(String TAG, String message) {
        Log.wtf(TAG + WTF, message);
    }

    public static void wtf(String TAG, String message, Throwable tr) {
        Log.wtf(TAG + WTF, message, tr);
    }
    //</editor-fold>
}
