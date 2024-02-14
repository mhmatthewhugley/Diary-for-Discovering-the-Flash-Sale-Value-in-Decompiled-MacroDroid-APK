package com.github.javiersantos.piracychecker.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo71668d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "L;", "<anonymous parameter 1>", "Lja/u;", "onClick", "(Landroid/content/DialogInterface;L;)V", "kotlin/Int", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* compiled from: LibraryUtils.kt */
final class LibraryUtilsKt$buildUnlicensedDialog$$inlined$let$lambda$1 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f16361a;

    /* renamed from: c */
    final /* synthetic */ String f16362c;

    /* renamed from: d */
    final /* synthetic */ String f16363d;

    LibraryUtilsKt$buildUnlicensedDialog$$inlined$let$lambda$1(Context context, String str, String str2) {
        this.f16361a = context;
        this.f16362c = str;
        this.f16363d = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (!((Activity) this.f16361a).isFinishing()) {
            ((Activity) this.f16361a).finish();
        }
    }
}
