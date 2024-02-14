package com.arlosoft.macrodroid.common;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.AsyncTask;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.utils.C6363a1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p037m.C2009f;
import p148q0.C8151a;

/* renamed from: com.arlosoft.macrodroid.common.q */
/* compiled from: GetAppListTask */
public class C4049q extends AsyncTask<Void, Void, List<C4013g>> {

    /* renamed from: a */
    private C4050a f10601a;

    /* renamed from: b */
    private WeakReference<Activity> f10602b;

    /* renamed from: c */
    private boolean f10603c;

    /* renamed from: d */
    private transient C2009f f10604d;

    /* renamed from: e */
    private boolean f10605e;

    /* renamed from: f */
    private boolean f10606f;
    @ColorInt

    /* renamed from: g */
    private final int f10607g;

    /* renamed from: com.arlosoft.macrodroid.common.q$a */
    /* compiled from: GetAppListTask */
    public interface C4050a {
        /* renamed from: B0 */
        void mo24816B0(List<C4013g> list, boolean z);
    }

    public C4049q(C4050a aVar, Activity activity, boolean z, boolean z2, @ColorInt int i) {
        this(aVar, activity, z, z2, i, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List<C4013g> doInBackground(Void... voidArr) {
        Activity activity = (Activity) this.f10602b.get();
        if (activity != null) {
            return C4061t1.m15962J(activity.getApplicationContext(), this.f10605e);
        }
        return new ArrayList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void onPostExecute(List<C4013g> list) {
        C2009f fVar = this.f10604d;
        if (fVar != null) {
            try {
                fVar.dismiss();
                this.f10604d = null;
            } catch (IllegalArgumentException unused) {
            }
        }
        Activity activity = (Activity) this.f10602b.get();
        if (activity != null) {
            if (list == null || list.size() == 0) {
                C8151a.m33873n(new RuntimeException("Get Package List failed from background thread"));
                list = C4061t1.m15962J(activity.getApplicationContext(), this.f10605e);
            }
            if (list == null || list.size() <= 0) {
                C8151a.m33873n(new RuntimeException("Get Package List returned empty even when run from activity_home_screen thread"));
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setTitle((int) C17541R$string.error);
                builder.setMessage((CharSequence) "Could not obtain list of installed applications");
                builder.setNegativeButton(17039370, (DialogInterface.OnClickListener) C4046p.f10598a);
                builder.show();
                return;
            }
            boolean z = this.f10603c;
            if (z) {
                this.f10601a.mo24816B0(list, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        Activity activity;
        if (this.f10603c && (activity = (Activity) this.f10602b.get()) != null) {
            C2009f b = new C2009f.C2014d(activity).mo24100t(C17541R$string.please_wait).mo24085e(C17541R$string.getting_list_of_apps).mo24098r(true, 0).mo24084c(false).mo24103w(this.f10607g).mo24083b();
            this.f10604d = b;
            if (this.f10606f) {
                b.getWindow().setType(C6363a1.m24607a());
            }
            this.f10604d.show();
        }
    }

    public C4049q(C4050a aVar, Activity activity, boolean z, boolean z2, @ColorInt int i, boolean z3) {
        this.f10601a = aVar;
        this.f10602b = new WeakReference<>(activity);
        this.f10603c = z;
        this.f10605e = z2;
        this.f10607g = i;
        this.f10606f = z3;
    }
}
