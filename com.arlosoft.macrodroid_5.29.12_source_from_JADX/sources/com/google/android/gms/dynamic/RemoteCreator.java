package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class RemoteCreator<T> {

    /* renamed from: a */
    private final String f4021a;

    /* renamed from: b */
    private Object f4022b;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(@NonNull String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(@NonNull String str, @NonNull Throwable th) {
            super(str, th);
        }
    }

    @KeepForSdk
    protected RemoteCreator(@NonNull String str) {
        this.f4021a = str;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public abstract T mo20096a(@NonNull IBinder iBinder);

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public final T mo22049b(@NonNull Context context) throws RemoteCreatorException {
        if (this.f4022b == null) {
            Preconditions.m4488k(context);
            Context e = GooglePlayServicesUtilLight.m3564e(context);
            if (e != null) {
                try {
                    this.f4022b = mo20096a((IBinder) e.getClassLoader().loadClass(this.f4021a).newInstance());
                } catch (ClassNotFoundException e2) {
                    throw new RemoteCreatorException("Could not load creator class.", e2);
                } catch (InstantiationException e3) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e3);
                } catch (IllegalAccessException e4) {
                    throw new RemoteCreatorException("Could not access creator.", e4);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.f4022b;
    }
}
