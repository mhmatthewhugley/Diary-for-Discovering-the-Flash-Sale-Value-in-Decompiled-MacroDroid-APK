package com.arlosoft.macrodroid.firebase;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.location.LocationRequestCompat;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.ListResult;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p148q0.C8151a;
import p297ja.C13339u;
import p370qa.C16265l;
import p410ue.C16712l;
import p455ag.C17105a;

/* renamed from: com.arlosoft.macrodroid.firebase.h */
/* compiled from: FirestoreHelper.kt */
public final class C4688h {

    /* renamed from: c */
    public static final C4689a f11798c = new C4689a((C13695i) null);

    /* renamed from: a */
    private final Context f11799a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final FirebaseStorage f11800b;

    /* renamed from: com.arlosoft.macrodroid.firebase.h$a */
    /* compiled from: FirestoreHelper.kt */
    public static final class C4689a {
        private C4689a() {
        }

        public /* synthetic */ C4689a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.firebase.h$b */
    /* compiled from: FirestoreHelper.kt */
    public interface C4690b {
        /* renamed from: a */
        void mo27352a();

        /* renamed from: b */
        void mo27353b(File file);
    }

    /* renamed from: com.arlosoft.macrodroid.firebase.h$c */
    /* compiled from: FirestoreHelper.kt */
    public interface C4691c {
        /* renamed from: a */
        void mo27347a(boolean z);
    }

    /* renamed from: com.arlosoft.macrodroid.firebase.h$d */
    /* compiled from: FirestoreHelper.kt */
    static final class C4692d extends C13708q implements C16265l<String, C13339u> {
        final /* synthetic */ File $backupDir;
        final /* synthetic */ long $maxRetryTime;
        final /* synthetic */ C4691c $onCompleteListener;
        final /* synthetic */ StorageReference $storageRef;
        final /* synthetic */ long $timeStamp;
        final /* synthetic */ String $uid;
        final /* synthetic */ C4688h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4692d(File file, long j, C4688h hVar, long j2, StorageReference storageReference, String str, C4691c cVar) {
            super(1);
            this.$backupDir = file;
            this.$timeStamp = j;
            this.this$0 = hVar;
            this.$maxRetryTime = j2;
            this.$storageRef = storageReference;
            this.$uid = str;
            this.$onCompleteListener = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final void m18203g(C4688h hVar, String str, StorageReference storageReference, String str2, C4691c cVar, String str3) {
            C13706o.m87929f(hVar, "this$0");
            C13706o.m87929f(str, "$basefilename");
            C13706o.m87929f(storageReference, "$storageRef");
            C13706o.m87929f(str2, "$uid");
            File q = hVar.mo29135q(str);
            if (q != null) {
                StorageReference d = storageReference.mo63628d("cloudBackup/" + str2 + '/' + (C13672g.m87855a(q) + ".zip"));
                C13706o.m87928e(d, "storageRef.child(\"cloudB…up/$uid/$outputFileName\")");
                StringBuilder sb = new StringBuilder();
                sb.append("Attempting to upload macro file to: ");
                sb.append(d);
                C17105a.m100579a(sb.toString(), new Object[0]);
                C4878b.m18864c("Attempting to upload macro file to: " + d);
                File file = new File(str + ".zip");
                C16712l.m99242g(q, file);
                d.mo63641q(Uri.fromFile(file)).mo23705f(new C4695j(cVar, hVar)).mo23708i(new C4697l(q, cVar, hVar));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final void m18204h(C4691c cVar, C4688h hVar, Exception exc) {
            C13706o.m87929f(hVar, "this$0");
            C13706o.m87929f(exc, "it");
            C4878b.m18868g("Failed to upload to cloud backup: " + exc);
            if (cVar != null) {
                cVar.mo27347a(false);
            }
            hVar.m18183p();
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m18205j(File file, C4691c cVar, C4688h hVar, UploadTask.TaskSnapshot taskSnapshot) {
            C13706o.m87929f(file, "$file");
            C13706o.m87929f(hVar, "this$0");
            C4878b.m18873l("File uploaded to cloud backup: " + file.getName());
            if (cVar != null) {
                cVar.mo27347a(true);
            }
            hVar.m18183p();
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m18206k(C4691c cVar, Exception exc) {
            C13706o.m87929f(exc, "it");
            C4878b.m18882u("Faled to uploaded to cloud backup: " + exc + '}');
            if (cVar != null) {
                cVar.mo27347a(false);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13339u.f61331a;
        }

        public final void invoke(String str) {
            C13706o.m87929f(str, "identifier");
            this.this$0.f11800b.mo63600p(this.$maxRetryTime);
            FirebaseInstallations.m76612p().getId().mo23708i(new C4696k(this.this$0, this.$backupDir.getAbsolutePath() + '/' + this.$timeStamp + "___" + str, this.$storageRef, this.$uid, this.$onCompleteListener)).mo23705f(new C4694i(this.$onCompleteListener));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.firebase.h$e */
    /* compiled from: Comparisons.kt */
    public static final class C4693e<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ C4688h f11801a;

        public C4693e(C4688h hVar) {
            this.f11801a = hVar;
        }

        public final int compare(T t, T t2) {
            C4688h hVar = this.f11801a;
            String name = ((StorageReference) t2).getName();
            C13706o.m87928e(name, "it.name");
            Long valueOf = Long.valueOf(hVar.m18169B(name));
            C4688h hVar2 = this.f11801a;
            String name2 = ((StorageReference) t).getName();
            C13706o.m87928e(name2, "it.name");
            return C15612b.m94865a(valueOf, Long.valueOf(hVar2.m18169B(name2)));
        }
    }

    public C4688h(Context context) {
        C13706o.m87929f(context, "context");
        this.f11799a = context;
        FirebaseStorage f = FirebaseStorage.m77354f();
        C13706o.m87928e(f, "getInstance()");
        this.f11800b = f;
    }

    /* renamed from: A */
    private final String m18168A(String str) {
        try {
            String substring = str.substring(C15177w.m93687f0(str, "___", 0, false, 6, (Object) null) + 3, C15177w.m93687f0(str, ".", 0, false, 6, (Object) null));
            C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("getDeviceIdFromName failed (" + str + "): " + e));
            return "?";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final long m18169B(String str) {
        try {
            String substring = str.substring(0, C15177w.m93682a0(str, "___", 0, false, 6, (Object) null));
            C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return Long.parseLong(substring);
        } catch (NumberFormatException unused) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
    }

    /* renamed from: m */
    private final void m18180m() {
        String A = C5163j2.m19922A(this.f11799a);
        if (A == null) {
            C4878b.m18879r("Cloud backup delete all failed - User not logged in");
            return;
        }
        StorageReference l = this.f11800b.mo63597l();
        C13706o.m87928e(l, "storage.reference");
        StorageReference d = l.mo63628d("cloudBackup/" + A);
        C13706o.m87928e(d, "storageRef.child(\"cloudBackup/$uid\")");
        d.mo63640n().mo23708i(new C4687g(this)).mo23705f(C4684d.f11793a);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m18181n(C4688h hVar, ListResult listResult) {
        C13706o.m87929f(hVar, "this$0");
        C4878b.m18873l("All cloud backups deleted");
        List<StorageReference> b = listResult.mo63604b();
        C13706o.m87928e(b, "listResult.items");
        hVar.m18186u(b);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m18182o(Exception exc) {
        C13706o.m87929f(exc, "it");
        C4878b.m18868g("Cloud backup delete all failed: " + exc);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m18183p() {
        File[] listFiles = new File(this.f11799a.getFilesDir().getAbsolutePath(), "MacroDroid/CloudBackup").listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m18184s(C4691c cVar, Exception exc) {
        C13706o.m87929f(exc, "it");
        if (cVar != null) {
            cVar.mo27347a(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m18185t(C4691c cVar, Void voidR) {
        if (cVar != null) {
            cVar.mo27347a(true);
        }
    }

    /* renamed from: u */
    private final void m18186u(List<? extends StorageReference> list) {
        List y0 = C13566b0.m87450y0(list, new C4693e(this));
        for (StorageReference f : C13566b0.m87416Q(y0, 20)) {
            f.mo63631f();
        }
        List z0 = C13566b0.m87451z0(y0, 20);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : z0) {
            String name = ((StorageReference) next).getName();
            C13706o.m87928e(name, "it.name");
            String A = m18168A(name);
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(next);
        }
        for (List Q : linkedHashMap.values()) {
            for (StorageReference f2 : C13566b0.m87416Q(Q, 5)) {
                f2.mo63631f();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m18187w(C4690b bVar, File file, FileDownloadTask.TaskSnapshot taskSnapshot) {
        C13706o.m87929f(bVar, "$fileDownloadListener");
        C13706o.m87928e(file, "localFile");
        bVar.mo27353b(file);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m18188x(C4690b bVar, Exception exc) {
        C13706o.m87929f(bVar, "$fileDownloadListener");
        C13706o.m87929f(exc, "it");
        bVar.mo27352a();
    }

    /* renamed from: y */
    private final void m18189y(C16265l<? super String, C13339u> lVar) {
        FirebaseMessaging.m76862n().mo63351q().mo23702c(new C4681a(lVar, Build.MANUFACTURER, Build.MODEL));
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m18190z(C16265l lVar, String str, String str2, Task task) {
        C13706o.m87929f(lVar, "$identifierReady");
        C13706o.m87929f(task, "task");
        String str3 = "?";
        if (task.mo23719t()) {
            try {
                str3 = (String) task.mo23715p();
            } catch (Exception e) {
                C4878b.m18868g("Failed to get firebase instance id: " + e);
            }
        }
        lVar.invoke(str + "___" + str2 + "___" + str3);
    }

    /* renamed from: k */
    public final void mo29133k(String str, long j, C4691c cVar) {
        C13706o.m87929f(str, "uid");
        StorageReference l = this.f11800b.mo63597l();
        C13706o.m87928e(l, "storage.reference");
        File file = new File(this.f11799a.getFilesDir().getAbsolutePath(), "MacroDroid/CloudBackup");
        if (!file.exists()) {
            file.mkdirs();
        }
        m18189y(new C4692d(file, System.currentTimeMillis(), this, j, l, str, cVar));
    }

    /* renamed from: l */
    public final void mo29134l() {
        String A = C5163j2.m19922A(this.f11799a);
        if (A == null) {
            C4878b.m18879r("Cloud backup failed - User not logged in");
            return;
        }
        mo29133k(A, WorkRequest.MIN_BACKOFF_MILLIS, (C4691c) null);
        m18180m();
    }

    /* renamed from: q */
    public final File mo29135q(String str) {
        C13706o.m87929f(str, "basefilename");
        String str2 = str + ".mdr";
        if (C4934n.m18999N(this.f11799a.getApplicationContext()).mo29710z().size() <= 0) {
            return null;
        }
        try {
            C4934n.m18999N(this.f11799a.getApplicationContext()).mo29706v0(str2, true, true, false);
            return new File(str2);
        } catch (Exception e) {
            C4878b.m18868g("Autobackup failed: " + e);
            FirebaseCrashlytics.m6487a().mo22936d(e);
            return null;
        }
    }

    /* renamed from: r */
    public final void mo29136r(String str, C4691c cVar) {
        C13706o.m87929f(str, "name");
        String A = C5163j2.m19922A(this.f11799a);
        if (A != null) {
            StorageReference l = this.f11800b.mo63597l();
            C13706o.m87928e(l, "storage.reference");
            StorageReference d = l.mo63628d("cloudBackup/" + A + '/' + str);
            C13706o.m87928e(d, "storageRef.child(\"cloudBackup/$uid/$name\")");
            d.mo63631f().mo23705f(new C4683c(cVar)).mo23708i(new C4686f(cVar));
        } else if (cVar != null) {
            cVar.mo27347a(false);
        }
    }

    /* renamed from: v */
    public final void mo29137v(String str, C4690b bVar) {
        C13706o.m87929f(str, "name");
        C13706o.m87929f(bVar, "fileDownloadListener");
        String A = C5163j2.m19922A(this.f11799a);
        if (A == null) {
            bVar.mo27352a();
            return;
        }
        File createTempFile = File.createTempFile("cloud_backup", "zip");
        this.f11800b.mo63599o(5000);
        StorageReference l = this.f11800b.mo63597l();
        C13706o.m87928e(l, "storage.reference");
        StorageReference d = l.mo63628d("cloudBackup/" + A + '/' + str);
        C13706o.m87928e(d, "storageRef.child(\"cloudBackup/$uid/$name\")");
        d.mo63636j(createTempFile).mo23708i(new C4685e(bVar, createTempFile)).mo23705f(new C4682b(bVar));
    }
}
