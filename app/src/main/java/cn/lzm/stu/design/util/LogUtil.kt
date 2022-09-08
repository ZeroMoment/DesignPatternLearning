package cn.lzm.stu.design.util

import android.util.Log

/**
 * @des:
 * @author: lizhiming
 * @date: 2022/8/31 18:22
 */
class LogUtil {

    companion object {
        private const val LOG_TAG = "lzm"

        fun eLog(logMsg : String) {
            Log.e(LOG_TAG, logMsg)
        }

    }

}