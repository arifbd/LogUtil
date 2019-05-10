package arif.ennoblesoft.logutilexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import arif.ennoblesoft.logutil.LogUtil
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogUtil.verbose("Verbose Log with out TAG passed")
        LogUtil.verbose(TAG, "Verbose Log with TAG passed")
        try {
            5 / 0
        } catch (e: Exception) {
            LogUtil.verbose(TAG, "Verbose Log to print exception", e)
        }

        LogUtil.debug("Debug Log with out TAG passed")
        LogUtil.debug(TAG, "Debug Log with TAG passed")
        try {
            5 / 0
        } catch (e: Exception) {
            LogUtil.debug(TAG, "Debug Log to print exception", e)
        }

        LogUtil.info("Information Log with out TAG passed")
        LogUtil.info(TAG, "Information Log with TAG passed")
        try {
            5 / 0
        } catch (e: Exception) {
            LogUtil.info(TAG, "Information Log to print exception", e)
        }

        LogUtil.warn("Warning Log with out TAG passed")
        LogUtil.warn(TAG, "Warning Log with TAG passed")
        try {
            5 / 0
        } catch (e: Exception) {
            LogUtil.warn(TAG, "Warning Log to print exception", e)
        }

        LogUtil.error("Error Log with out TAG passed")
        LogUtil.error(TAG, "Error Log with TAG passed")
        try {
            5 / 0
        } catch (e: Exception) {
            LogUtil.error(TAG, "Error Log to print exception", e)
        }

        LogUtil.wtf("What a Terrible Failure Log with out TAG passed")
        LogUtil.wtf(TAG, "What a Terrible Failure Log with TAG passed")
        try {
            5 / 0
        } catch (e: Exception) {
            LogUtil.wtf(TAG, "What a Terrible Failure Log to print exception", e)
        }
    }

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }
}
