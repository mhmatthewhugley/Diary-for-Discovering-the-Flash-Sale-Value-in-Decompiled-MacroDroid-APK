package com.oneclickaway.opensource.placeautocomplete.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/utils/Commons;", "", "()V", "getPrettyTime", "", "milliSeconds", "", "isNetworkConnected", "", "mContext", "Landroid/content/Context;", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
/* compiled from: Commons.kt */
public final class Commons {
    public static final Commons INSTANCE = new Commons();

    private Commons() {
    }

    public final String getPrettyTime(long j) {
        float currentTimeMillis = (((float) (System.currentTimeMillis() - j)) / 1000.0f) / 60.0f;
        Calendar instance = Calendar.getInstance();
        instance.set(instance.get(1), instance.get(5), instance.get(5));
        Calendar instance2 = Calendar.getInstance();
        instance2.set(instance2.get(1), instance2.get(5), instance2.get(5), 0, 0, 0);
        C13706o.m87925b(instance, "currentDateInstance");
        long timeInMillis = instance.getTimeInMillis();
        C13706o.m87925b(instance2, "currentTimeCalender");
        float timeInMillis2 = (((float) (timeInMillis - instance2.getTimeInMillis())) / 1000.0f) / 60.0f;
        if (currentTimeMillis < timeInMillis2) {
            return "Today";
        }
        float f = currentTimeMillis - timeInMillis2;
        if (f < ((float) 1440)) {
            return "Yesterday";
        }
        return f < ((float) 10080) ? "Earlier this week" : "Previous Searches";
    }

    public final boolean isNetworkConnected(Context context) {
        C13706o.m87930g(context, "mContext");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            C13706o.m87939p();
        }
        return connectivityManager.getActiveNetworkInfo() != null;
    }
}
