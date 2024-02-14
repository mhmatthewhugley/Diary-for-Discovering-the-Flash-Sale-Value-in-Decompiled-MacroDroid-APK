package com.tencent.soter.core.model;

import android.util.Log;

public class SLogger {
    private static ISoterLogger mLoggerImp = new DefaultSoterLogger();

    private static class DefaultSoterLogger implements ISoterLogger {
        private DefaultSoterLogger() {
        }

        /* renamed from: d */
        public void mo66839d(String str, String str2, Object... objArr) {
            try {
                String.format(str2, objArr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: e */
        public void mo66840e(String str, String str2, Object... objArr) {
            try {
                Log.e(str, String.format(str2, objArr));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: i */
        public void mo66841i(String str, String str2, Object... objArr) {
            try {
                Log.i(str, String.format(str2, objArr));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void printErrStackTrace(String str, Throwable th, String str2) {
            th.printStackTrace();
        }

        /* renamed from: v */
        public void mo66843v(String str, String str2, Object... objArr) {
            try {
                String.format(str2, objArr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: w */
        public void mo66844w(String str, String str2, Object... objArr) {
            try {
                Log.w(str, String.format(str2, objArr));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static void m81939d(String str, String str2, Object... objArr) {
        mLoggerImp.mo66839d(str, str2, objArr);
    }

    /* renamed from: e */
    public static void m81940e(String str, String str2, Object... objArr) {
        mLoggerImp.mo66840e(str, str2, objArr);
    }

    /* renamed from: i */
    public static void m81941i(String str, String str2, Object... objArr) {
        mLoggerImp.mo66841i(str, str2, objArr);
    }

    public static void printErrStackTrace(String str, Throwable th, String str2) {
        mLoggerImp.printErrStackTrace(str, th, str2);
    }

    public static void setLogImp(ISoterLogger iSoterLogger) {
        if (iSoterLogger != null) {
            mLoggerImp = iSoterLogger;
            return;
        }
        throw new RuntimeException("logInstance can not be null");
    }

    /* renamed from: v */
    public static void m81942v(String str, String str2, Object... objArr) {
        mLoggerImp.mo66843v(str, str2, objArr);
    }

    /* renamed from: w */
    public static void m81943w(String str, String str2, Object... objArr) {
        mLoggerImp.mo66844w(str, str2, objArr);
    }
}
