package dagger.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.CallSuper;
import p404u8.C16667a;

public abstract class DaggerBroadcastReceiver extends BroadcastReceiver {
    @CallSuper
    public void onReceive(Context context, Intent intent) {
        C16667a.m99105c(this, context);
    }
}
