package p097gd;

import android.util.Log;

/* renamed from: gd.c */
/* compiled from: InfoAndroidLogger */
final class C7353c extends C7351a {
    C7353c() {
    }

    /* renamed from: a */
    public void mo37328a(Throwable th, String str, String str2, Object... objArr) {
        Log.e(str, mo37327c(str2, objArr), th);
    }

    /* renamed from: b */
    public void mo37329b(Throwable th, String str, String str2, Object... objArr) {
        Log.w(str, mo37327c(str2, objArr), th);
    }

    /* renamed from: d */
    public void mo37330d(String str, String str2, Object... objArr) {
    }

    /* renamed from: e */
    public void mo37331e(String str, String str2, Object... objArr) {
        Log.e(str, mo37327c(str2, objArr));
    }

    /* renamed from: i */
    public void mo37332i(String str, String str2, Object... objArr) {
        Log.i(str, mo37327c(str2, objArr));
    }

    /* renamed from: w */
    public void mo37333w(String str, String str2, Object... objArr) {
        Log.w(str, mo37327c(str2, objArr));
    }
}
