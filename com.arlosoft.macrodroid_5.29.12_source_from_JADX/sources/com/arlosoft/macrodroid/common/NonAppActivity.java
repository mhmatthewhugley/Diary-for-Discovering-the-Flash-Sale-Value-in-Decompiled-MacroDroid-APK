package com.arlosoft.macrodroid.common;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.arlosoft.macrodroid.utils.C6361a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13695i;

/* compiled from: NonAppActivity.kt */
public class NonAppActivity extends AppCompatActivity {

    /* renamed from: f */
    public static final C3987a f10331f = new C3987a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static boolean f10332g;

    /* renamed from: d */
    public Map<Integer, View> f10333d = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.common.NonAppActivity$a */
    /* compiled from: NonAppActivity.kt */
    public static final class C3987a {
        private C3987a() {
        }

        public /* synthetic */ C3987a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo27789a() {
            return NonAppActivity.f10332g;
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(C6361a.m24594a(context, this));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f10332g = true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        f10332g = false;
    }
}
