package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcod extends MutableContextWrapper {
    @Nullable

    /* renamed from: a */
    private Activity f29150a;

    /* renamed from: b */
    private Context f29151b;

    /* renamed from: c */
    private Context f29152c;

    public zzcod(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Nullable
    /* renamed from: a */
    public final Activity mo44178a() {
        return this.f29150a;
    }

    /* renamed from: b */
    public final Context mo44179b() {
        return this.f29152c;
    }

    public final Object getSystemService(String str) {
        return this.f29152c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f29151b = applicationContext;
        this.f29150a = context instanceof Activity ? (Activity) context : null;
        this.f29152c = context;
        super.setBaseContext(applicationContext);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f29150a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f29151b.startActivity(intent);
    }
}
