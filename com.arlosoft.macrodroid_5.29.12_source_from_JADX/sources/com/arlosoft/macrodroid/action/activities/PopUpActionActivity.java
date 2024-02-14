package com.arlosoft.macrodroid.action.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationManagerCompat;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.action.ToastAction;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.NonAppActivityWithPreventClash;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.utils.C6362a0;
import java.io.FileNotFoundException;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p257f0.C12208n;
import p257f0.C12209o;
import p277h9.C12408a;
import p319lc.C15626c;

/* compiled from: PopUpActionActivity.kt */
public final class PopUpActionActivity extends NonAppActivityWithPreventClash {

    /* renamed from: A */
    public static final C2827a f7839A = new C2827a((C13695i) null);

    /* renamed from: z */
    public Map<Integer, View> f7840z = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.action.activities.PopUpActionActivity$a */
    /* compiled from: PopUpActionActivity.kt */
    public static final class C2827a {
        private C2827a() {
        }

        public /* synthetic */ C2827a(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m13977c(Context context, String str, int i, long j, boolean z, boolean z2, String str2, String str3, String str4, String str5, int i2, int i3, int i4, int i5) {
            Context context2 = context;
            String str6 = str;
            int i6 = i;
            C13706o.m87929f(context, "$context");
            C13706o.m87929f(str, "$messageText");
            try {
                Intent intent = new Intent(context, PopUpActionActivity.class);
                intent.addFlags(268435456);
                intent.addFlags(65536);
                long j2 = j;
                intent.putExtra("macro_guid", j);
                intent.putExtra("message_text", str);
                boolean z3 = z;
                intent.putExtra("display_icon", z);
                boolean z4 = z2;
                intent.putExtra("tint_icon", z2);
                String str7 = str2;
                intent.putExtra("image_uri", str2);
                String str8 = str3;
                intent.putExtra("image_package_name", str3);
                intent.putExtra("image_name", str4);
                intent.putExtra("image_resource_name", str5);
                intent.putExtra(TypedValues.Transition.S_DURATION, i);
                intent.putExtra("position", i2);
                intent.putExtra("position_horizontal", i3);
                intent.putExtra("text_color", i4);
                intent.putExtra("background_color", i5);
                context.startActivity(intent);
            } catch (Exception e) {
                C4878b.m18868g("Failed to display pop up message, reverting to basic text only message: " + e);
                C15626c.m94876a(context.getApplicationContext(), str, i).show();
            }
        }

        /* renamed from: b */
        public final void mo26176b(Context context, long j, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5) {
            Context context2 = context;
            C13706o.m87929f(context2, "context");
            String str6 = str;
            C13706o.m87929f(str6, "messageText");
            Handler handler = new Handler();
            C12209o oVar = r1;
            C12209o oVar2 = new C12209o(context2, str6, i, j, z, z2, str2, str3, str4, str5, i2, i3, i4, i5);
            handler.postDelayed(oVar, NonAppActivityWithPreventClash.f10334p.mo27790a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m13972P1(PopUpActionActivity popUpActionActivity) {
        C13706o.m87929f(popUpActionActivity, "this$0");
        popUpActionActivity.finish();
    }

    /* renamed from: Q1 */
    private final void m13973Q1(Toast toast, int i, int i2) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C17529R$dimen.toast_margin);
        int i3 = 1;
        int i4 = i != 0 ? i != 1 ? i != 2 ? 0 : 48 : 16 : 80;
        if (i2 != 0) {
            i3 = i2 != 1 ? i2 != 2 ? 0 : 5 : 3;
        }
        toast.setGravity(i4 | i3, 0, dimensionPixelOffset);
    }

    /* renamed from: R1 */
    private final void m13974R1(long j, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        String str6 = str2;
        String str7 = str3;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        Toast toast = null;
        if (str6 != null) {
            try {
                drawable = Drawable.createFromStream(getContentResolver().openInputStream(Uri.parse(str2)), str6);
            } catch (FileNotFoundException unused) {
            }
        } else if (str7 == null || !C13706o.m87924a(str7, "UserIcon")) {
            drawable = C4061t1.m15960I(this, str7, str5);
        } else {
            Bitmap f = C6362a0.m24600f(str4);
            if (f != null) {
                drawable = new BitmapDrawable(getResources(), f);
            }
            drawable = null;
        }
        if (drawable == null) {
            drawable = getResources().getDrawable(C17530R$drawable.launcher_no_border);
        }
        if (!NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            C4878b.m18869h("Pop up message failed because notifications are disabled for MacroDroid.", j);
            return;
        }
        Spanned fromHtml = Html.fromHtml(str);
        C13706o.m87928e(fromHtml, "fromHtml(messageText)");
        C12408a.C12409a.m83286b().mo68758c(i4).mo68759d(z2).mo68757a();
        if (i6 == 0) {
            toast = C12408a.m83284r(getApplicationContext(), fromHtml, drawable, i5, 1, z, true);
            m13973Q1(toast, i7, i8);
            toast.show();
        } else if (i6 != 2) {
            for (int i9 = 0; i9 < 2; i9++) {
                toast = C12408a.m83284r(getApplicationContext(), fromHtml, drawable, i5, 0, z, true);
                m13973Q1(toast, i7, i8);
                toast.show();
            }
        } else {
            toast = C12408a.m83284r(getApplicationContext(), fromHtml, drawable, i5, 0, z, true);
            m13973Q1(toast, i7, i8);
            toast.show();
        }
        if (toast != null) {
            ToastAction.f7648d = new SoftReference<>(toast);
        }
    }

    /* renamed from: S1 */
    public static final void m13975S1(Context context, long j, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5) {
        f7839A.mo26176b(context, j, str, z, z2, str2, str3, str4, str5, i, i2, i3, i4, i5);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("macro_guid", 0);
        String stringExtra = getIntent().getStringExtra("message_text");
        if (stringExtra == null) {
            stringExtra = "";
        }
        m13974R1(longExtra, stringExtra, getIntent().getBooleanExtra("display_icon", false), getIntent().getBooleanExtra("tint_icon", false), getIntent().getStringExtra("image_uri"), getIntent().getStringExtra("image_package_name"), getIntent().getStringExtra("image_name"), getIntent().getStringExtra("image_resource_name"), getIntent().getIntExtra(TypedValues.Transition.S_DURATION, 0), getIntent().getIntExtra("position", 0), getIntent().getIntExtra("position_horizontal", 0), getIntent().getIntExtra("text_color", 0), getIntent().getIntExtra("background_color", 0));
        new Handler().postDelayed(new C12208n(this), 100);
    }
}
