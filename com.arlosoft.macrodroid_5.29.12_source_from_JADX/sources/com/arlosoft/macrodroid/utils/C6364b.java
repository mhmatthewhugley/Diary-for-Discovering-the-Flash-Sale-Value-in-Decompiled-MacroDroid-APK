package com.arlosoft.macrodroid.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.utils.b */
/* compiled from: AdbHelperUtil.kt */
public final class C6364b {

    /* renamed from: a */
    public static final C6364b f14956a = new C6364b();

    /* renamed from: com.arlosoft.macrodroid.utils.b$a */
    /* compiled from: AdbHelperUtil.kt */
    static final class C6365a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6365a(Activity activity, AppCompatDialog appCompatDialog, C13635d<? super C6365a> dVar) {
            super(3, dVar);
            this.$activity = activity;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6365a(this.$activity, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://macrodroidforum.com/index.php?threads/adb-hack-granting-extra-capabilities-via-the-adb-tool.48/"));
                    intent.addFlags(268435456);
                    this.$activity.startActivity(intent);
                } catch (Exception unused2) {
                }
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.utils.b$b */
    /* compiled from: AdbHelperUtil.kt */
    static final class C6366b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ C16254a<C13339u> $dismissCallback;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6366b(AppCompatDialog appCompatDialog, C16254a<C13339u> aVar, C13635d<? super C6366b> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
            this.$dismissCallback = aVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6366b(this.$dialog, this.$dismissCallback, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                C16254a<C13339u> aVar = this.$dismissCallback;
                if (aVar != null) {
                    aVar.invoke();
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private C6364b() {
    }

    /* renamed from: a */
    public static final void m24610a(Activity activity, List<String> list) {
        C13706o.m87929f(activity, "activity");
        m24611b(activity, list, (C16254a<C13339u>) null);
    }

    /* renamed from: b */
    public static final void m24611b(Activity activity, List<String> list, C16254a<C13339u> aVar) {
        Activity activity2 = activity;
        C13706o.m87929f(activity2, "activity");
        AppCompatDialog appCompatDialog = new AppCompatDialog(activity2, C17542R$style.Theme_App_Dialog_NoTitle);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_adb_hack_instructions);
        C4656c.m18115d(appCompatDialog, 0, 1, (Object) null);
        int i = C17532R$id.adbHackPC;
        C13696i0 i0Var = C13696i0.f61931a;
        String string = activity2.getString(C17541R$string.abd_hack_need_a_pc);
        C13706o.m87928e(string, "activity.getString(R.string.abd_hack_need_a_pc)");
        String format = String.format(string, Arrays.copyOf(new Object[]{"\n\nhttps://developer.android.com/studio/releases/platform-tools"}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        ((TextView) appCompatDialog.findViewById(i)).setText(format);
        Linkify.addLinks((TextView) appCompatDialog.findViewById(i), 15);
        int i2 = C17532R$id.adbToolDownload;
        String string2 = activity2.getString(C17541R$string.adb_hack_connect_to_device);
        C13706o.m87928e(string2, "activity.getString(R.str…b_hack_connect_to_device)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{"\n\nhttps://developer.android.com/studio/command-line/adb.html"}, 1));
        C13706o.m87928e(format2, "format(format, *args)");
        ((TextView) appCompatDialog.findViewById(i2)).setText(format2);
        Linkify.addLinks((TextView) appCompatDialog.findViewById(i2), 15);
        ((TextView) appCompatDialog.findViewById(C17532R$id.terminalCommands)).setText(list != null ? C13566b0.m87432g0(list, " ", "adb shell pm grant com.arlosoft.macrodroid ", (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 60, (Object) null) : null);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.forumButton);
        C13706o.m87928e(button, "dialog.forumButton");
        C4666m.m18147o(button, (C13640g) null, new C6365a(activity2, appCompatDialog, (C13635d<? super C6365a>) null), 1, (Object) null);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.adbHackOkButton);
        C13706o.m87928e(button2, "dialog.adbHackOkButton");
        C4666m.m18147o(button2, (C13640g) null, new C6366b(appCompatDialog, aVar, (C13635d<? super C6366b>) null), 1, (Object) null);
        appCompatDialog.show();
    }
}
