package com.huawei.facerecognition;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

public class HwFaceManagerFactory {
    private static final String TAG = "FaceRecognize";

    private HwFaceManagerFactory() {
    }

    public static synchronized FaceManager getFaceManager(Context context) {
        synchronized (HwFaceManagerFactory.class) {
            try {
                if (Build.VERSION.SDK_INT < 29) {
                    Log.e(TAG, "The current version does not support face recognition");
                    return null;
                }
                FaceManager faceManager = (FaceManager) Class.forName("com.huawei.facerecognition.FaceManagerFactory").getDeclaredMethod("getFaceManager", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                return faceManager;
            } catch (ClassNotFoundException unused) {
                Log.i(TAG, "Throw exception: ClassNotFoundException");
                return null;
            } catch (NoSuchMethodException unused2) {
                Log.i(TAG, "Throw exception: NoSuchMethodException");
                return null;
            } catch (IllegalAccessException unused3) {
                Log.i(TAG, "Throw exception: IllegalAccessException");
                return null;
            } catch (InvocationTargetException unused4) {
                Log.i(TAG, "Throw exception: InvocationTargetException");
                return null;
            }
        }
    }
}
