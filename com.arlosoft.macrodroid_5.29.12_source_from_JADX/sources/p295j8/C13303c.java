package p295j8;

import android.app.Activity;
import android.app.Service;
import android.app.backup.BackupAgent;
import android.content.Context;
import androidx.annotation.NonNull;
import p276h8.C12406a;

/* renamed from: j8.c */
/* compiled from: ContextUtil */
public final class C13303c {
    /* renamed from: a */
    public static Context m85635a(@NonNull Context context) {
        C12406a.m83260d(context, "context");
        if (context instanceof Activity) {
            new Exception();
        } else if (context instanceof Service) {
            new Exception();
        } else if (context instanceof BackupAgent) {
            new Exception();
        }
        String name = context.getClass().getName();
        if (!name.equals("android.test.IsolatedContext") && !name.equals("android.test.RenamingDelegatingContext")) {
            try {
                Context applicationContext = context.getApplicationContext();
                return applicationContext == null ? context : applicationContext;
            } catch (UnsupportedOperationException unused) {
            }
        }
        return context;
    }
}
