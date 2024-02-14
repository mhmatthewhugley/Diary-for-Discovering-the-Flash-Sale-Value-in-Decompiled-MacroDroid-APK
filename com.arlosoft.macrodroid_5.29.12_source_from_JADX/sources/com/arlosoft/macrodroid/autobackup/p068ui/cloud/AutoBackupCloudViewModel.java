package com.arlosoft.macrodroid.autobackup.p068ui.cloud;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.autobackup.p068ui.cloud.C3839r;
import com.arlosoft.macrodroid.autobackup.worker.AutoBackupCloudWorker;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.firebase.C4688h;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.user.signin.C6353g;
import com.arlosoft.macrodroid.utils.C6388h1;
import com.firebase.p073ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.ListResult;
import com.google.firebase.storage.StorageException;
import com.google.firebase.storage.StorageReference;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15510r0;
import kotlinx.coroutines.C15552u0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13328m;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p410ue.C16712l;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.AutoBackupCloudViewModel */
/* compiled from: AutoBackupCloudViewModel.kt */
public final class AutoBackupCloudViewModel extends ViewModel implements LifecycleObserver {

    /* renamed from: A */
    private final C6388h1<Boolean> f9926A = new C6388h1<>();

    /* renamed from: B */
    private final C6388h1<C13328m<C3847t, String>> f9927B = new C6388h1<>();

    /* renamed from: C */
    private final C6388h1<C13328m<C3847t, String>> f9928C = new C6388h1<>();

    /* renamed from: D */
    private final FirebaseStorage f9929D;

    /* renamed from: E */
    private final MutableLiveData<C3839r> f9930E;

    /* renamed from: F */
    private final LiveData<C3839r> f9931F;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f9932a;

    /* renamed from: c */
    private final C6353g f9933c;

    /* renamed from: d */
    private final C5527g f9934d;

    /* renamed from: f */
    private final C4688h f9935f;

    /* renamed from: g */
    private final C4083b f9936g;

    /* renamed from: o */
    private final MutableLiveData<Boolean> f9937o;

    /* renamed from: p */
    private final LiveData<Boolean> f9938p;

    /* renamed from: s */
    private final C6388h1<C3846s> f9939s = new C6388h1<>();

    /* renamed from: z */
    private final C6388h1<Void> f9940z = new C6388h1<>();

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.AutoBackupCloudViewModel$a */
    /* compiled from: AutoBackupCloudViewModel.kt */
    public static final class C3802a implements C4688h.C4691c {

        /* renamed from: a */
        final /* synthetic */ AutoBackupCloudViewModel f9941a;

        C3802a(AutoBackupCloudViewModel autoBackupCloudViewModel) {
            this.f9941a = autoBackupCloudViewModel;
        }

        /* renamed from: a */
        public void mo27347a(boolean z) {
            if (z) {
                this.f9941a.m14908u();
            } else {
                this.f9941a.mo27344t().postValue(C3846s.OTHER);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.AutoBackupCloudViewModel$b */
    /* compiled from: AutoBackupCloudViewModel.kt */
    static final class C3803b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ AutoBackupCloudViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3803b(AutoBackupCloudViewModel autoBackupCloudViewModel, C13635d<? super C3803b> dVar) {
            super(2, dVar);
            this.this$0 = autoBackupCloudViewModel;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3803b(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3803b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.label = 1;
                if (C15552u0.m94699a(5000, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.m14908u();
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.AutoBackupCloudViewModel$c */
    /* compiled from: AutoBackupCloudViewModel.kt */
    public static final class C3804c implements C4688h.C4691c {

        /* renamed from: a */
        final /* synthetic */ AutoBackupCloudViewModel f9942a;

        C3804c(AutoBackupCloudViewModel autoBackupCloudViewModel) {
            this.f9942a = autoBackupCloudViewModel;
        }

        /* renamed from: a */
        public void mo27347a(boolean z) {
            if (z) {
                this.f9942a.m14908u();
            } else {
                this.f9942a.mo27345v().postValue(null);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.AutoBackupCloudViewModel$d */
    /* compiled from: AutoBackupCloudViewModel.kt */
    static final class C3805d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ File $backupFile;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AutoBackupCloudViewModel this$0;

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.AutoBackupCloudViewModel$d$a */
        /* compiled from: AutoBackupCloudViewModel.kt */
        static final class C3806a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ File $backupFile;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3806a(File file, C13635d<? super C3806a> dVar) {
                super(2, dVar);
                this.$backupFile = file;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C3806a(this.$backupFile, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C3806a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
                kotlin.p312io.C13667b.m87853a(r2, r5);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
                throw r0;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object unused = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r0 = r4.label
                    if (r0 != 0) goto L_0x006c
                    p297ja.C13332o.m85685b(r5)
                    java.io.File r5 = r4.$backupFile
                    java.nio.charset.Charset r0 = kotlin.text.C15147d.f64349b
                    r1 = 8192(0x2000, float:1.14794E-41)
                    java.io.InputStreamReader r2 = new java.io.InputStreamReader
                    java.io.FileInputStream r3 = new java.io.FileInputStream
                    r3.<init>(r5)
                    r2.<init>(r3, r0)
                    boolean r5 = r2 instanceof java.io.BufferedReader
                    if (r5 == 0) goto L_0x0021
                    java.io.BufferedReader r2 = (java.io.BufferedReader) r2
                    goto L_0x0027
                L_0x0021:
                    java.io.BufferedReader r5 = new java.io.BufferedReader
                    r5.<init>(r2, r1)
                    r2 = r5
                L_0x0027:
                    r5 = 0
                    java.lang.String r0 = kotlin.p312io.C13675i.m87863f(r2)     // Catch:{ all -> 0x0065 }
                    kotlin.p312io.C13667b.m87853a(r2, r5)
                    com.arlosoft.macrodroid.macro.n r5 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                    r1 = 1
                    java.util.List r5 = r5.mo29686U(r0, r1)
                    if (r5 == 0) goto L_0x0056
                    boolean r0 = r5.isEmpty()
                    r0 = r0 ^ r1
                    if (r0 == 0) goto L_0x0056
                    com.arlosoft.macrodroid.macro.n r0 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                    r0.mo29691j0()
                    com.arlosoft.macrodroid.macro.n r0 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                    r0.mo29693m0(r5)
                    com.arlosoft.macrodroid.macro.n r5 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                    r5.mo29702s0()
                L_0x0056:
                    x8.c r5 = p161s1.C10180a.m40075a()
                    com.arlosoft.macrodroid.events.RefreshHomeScreenEvent r0 = new com.arlosoft.macrodroid.events.RefreshHomeScreenEvent
                    r0.<init>()
                    r5.mo80018i(r0)
                    ja.u r5 = p297ja.C13339u.f61331a
                    return r5
                L_0x0065:
                    r5 = move-exception
                    throw r5     // Catch:{ all -> 0x0067 }
                L_0x0067:
                    r0 = move-exception
                    kotlin.p312io.C13667b.m87853a(r2, r5)
                    throw r0
                L_0x006c:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.autobackup.p068ui.cloud.AutoBackupCloudViewModel.C3805d.C3806a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.AutoBackupCloudViewModel$d$b */
        /* compiled from: AutoBackupCloudViewModel.kt */
        static final class C3807b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;

            C3807b(C13635d<? super C3807b> dVar) {
                super(2, dVar);
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C3807b(dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C3807b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    Thread.sleep(1800);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3805d(AutoBackupCloudViewModel autoBackupCloudViewModel, File file, C13635d<? super C3805d> dVar) {
            super(2, dVar);
            this.this$0 = autoBackupCloudViewModel;
            this.$backupFile = file;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C3805d dVar2 = new C3805d(this.this$0, this.$backupFile, dVar);
            dVar2.L$0 = obj;
            return dVar2;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3805d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            C15510r0 r0Var;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15478k0 k0Var = (C15478k0) this.L$0;
                Macro.setMacroDroidEnabledState(false);
                MacroDroidService.f7040a.mo24642g(this.this$0.f9932a);
                C4934n.m18998M().mo29694n0();
                C15510r0 b = C15473j.m94490b(k0Var, C15186a1.m93730b(), (C15486m0) null, new C3806a(this.$backupFile, (C13635d<? super C3806a>) null), 2, (Object) null);
                C15510r0 b2 = C15473j.m94490b(k0Var, C15186a1.m93730b(), (C15486m0) null, new C3807b((C13635d<? super C3807b>) null), 2, (Object) null);
                this.L$0 = b2;
                this.label = 1;
                if (b.mo74869h(this) == c) {
                    return c;
                }
                r0Var = b2;
            } else if (i == 1) {
                r0Var = (C15510r0) this.L$0;
                C13332o.m85685b(obj);
            } else if (i == 2) {
                try {
                    C13332o.m85685b(obj);
                    C4878b.m18873l("Restored from cloud backup file");
                    this.this$0.mo27328A().postValue(C13654b.m87833a(true));
                } catch (Exception unused) {
                    C4878b.m18868g("Failed to restore from cloud backup");
                    this.this$0.mo27328A().postValue(C13654b.m87833a(false));
                } catch (Throwable th) {
                    Macro.setMacroDroidEnabledState(true);
                    MacroDroidService.f7040a.mo24641f(this.this$0.f9932a);
                    C4934n.m18998M().mo29694n0();
                    throw th;
                }
                Macro.setMacroDroidEnabledState(true);
                MacroDroidService.f7040a.mo24641f(this.this$0.f9932a);
                C4934n.m18998M().mo29694n0();
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.L$0 = null;
            this.label = 2;
            if (r0Var.mo74869h(this) == c) {
                return c;
            }
            C4878b.m18873l("Restored from cloud backup file");
            this.this$0.mo27328A().postValue(C13654b.m87833a(true));
            Macro.setMacroDroidEnabledState(true);
            MacroDroidService.f7040a.mo24641f(this.this$0.f9932a);
            C4934n.m18998M().mo29694n0();
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.AutoBackupCloudViewModel$e */
    /* compiled from: AutoBackupCloudViewModel.kt */
    public static final class C3808e implements C4688h.C4690b {

        /* renamed from: a */
        final /* synthetic */ AutoBackupCloudViewModel f9943a;

        /* renamed from: b */
        final /* synthetic */ C3847t f9944b;

        C3808e(AutoBackupCloudViewModel autoBackupCloudViewModel, C3847t tVar) {
            this.f9943a = autoBackupCloudViewModel;
            this.f9944b = tVar;
        }

        /* renamed from: a */
        public void mo27352a() {
            C4878b.m18868g("Failed to restore from cloud backup");
            this.f9943a.mo27328A().postValue(Boolean.FALSE);
        }

        /* renamed from: b */
        public void mo27353b(File file) {
            C13706o.m87929f(file, "file");
            this.f9943a.mo27343s(file, this.f9944b);
        }
    }

    public AutoBackupCloudViewModel(Context context, C6353g gVar, C5527g gVar2, C4688h hVar, C4083b bVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(gVar, "signInHelper");
        C13706o.m87929f(gVar2, "userProvider");
        C13706o.m87929f(hVar, "firestoreHelper");
        C13706o.m87929f(bVar, "premiumStatusHandler");
        this.f9932a = context;
        this.f9933c = gVar;
        this.f9934d = gVar2;
        this.f9935f = hVar;
        this.f9936g = bVar;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(C5163j2.m20310z(context)));
        this.f9937o = mutableLiveData;
        this.f9938p = mutableLiveData;
        FirebaseStorage f = FirebaseStorage.m77354f();
        C13706o.m87928e(f, "getInstance()");
        this.f9929D = f;
        MutableLiveData<C3839r> mutableLiveData2 = new MutableLiveData<>();
        this.f9930E = mutableLiveData2;
        this.f9931F = mutableLiveData2;
    }

    /* renamed from: L */
    private final void m14897L() {
        if (!this.f9936g.mo28009e().mo28008a()) {
            this.f9930E.postValue(C3839r.C3843d.f9989a);
        } else if (C5163j2.m19922A(this.f9932a) == null) {
            this.f9930E.postValue(C3839r.C3845f.f9991a);
        } else {
            m14908u();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m14905o(AutoBackupCloudViewModel autoBackupCloudViewModel, ListResult listResult) {
        C13706o.m87929f(autoBackupCloudViewModel, "this$0");
        C4878b.m18873l("All cloud backups deleted");
        List<StorageReference> b = listResult.mo63604b();
        C13706o.m87928e(b, "listResult.items");
        for (StorageReference f : b) {
            f.mo63631f().mo23705f(new C3834m(autoBackupCloudViewModel));
        }
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(autoBackupCloudViewModel), (C13640g) null, (C15486m0) null, new C3803b(autoBackupCloudViewModel, (C13635d<? super C3803b>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m14906p(AutoBackupCloudViewModel autoBackupCloudViewModel, Exception exc) {
        C13706o.m87929f(autoBackupCloudViewModel, "this$0");
        C13706o.m87929f(exc, "it");
        autoBackupCloudViewModel.f9940z.postValue(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m14907q(AutoBackupCloudViewModel autoBackupCloudViewModel, Exception exc) {
        C13706o.m87929f(autoBackupCloudViewModel, "this$0");
        C13706o.m87929f(exc, "it");
        autoBackupCloudViewModel.f9940z.postValue(null);
        C4878b.m18868g("Cloud backup delete all failed: " + exc);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m14908u() {
        m14909x(C5163j2.m19922A(this.f9932a));
    }

    /* renamed from: x */
    private final void m14909x(String str) {
        this.f9930E.postValue(new C3839r.C3841b(true, C13614t.m87748j(), false, (String) null, 8, (C13695i) null));
        String A = C5163j2.m19922A(this.f9932a);
        if (A == null) {
            this.f9930E.postValue(new C3839r.C3841b(false, C13614t.m87748j(), true, str));
            C4878b.m18879r("Cloud backup failed - User not logged in");
            return;
        }
        StorageReference l = this.f9929D.mo63597l();
        C13706o.m87928e(l, "storage.reference");
        StorageReference d = l.mo63628d("cloudBackup/" + A);
        C13706o.m87928e(d, "storageRef.child(\"cloudBackup/$uid\")");
        this.f9929D.mo63599o(5000);
        d.mo63640n().mo23708i(new C3838q(this, str)).mo23705f(new C3836o(this, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final void m14910y(AutoBackupCloudViewModel autoBackupCloudViewModel, String str, ListResult listResult) {
        C13706o.m87929f(autoBackupCloudViewModel, "this$0");
        List<StorageReference> b = listResult.mo63604b();
        C13706o.m87928e(b, "listResult.items");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(b, 10));
        for (StorageReference name : b) {
            String name2 = name.getName();
            C13706o.m87928e(name2, "it.name");
            arrayList.add(new C3847t(0, name2));
        }
        autoBackupCloudViewModel.f9930E.postValue(new C3839r.C3841b(false, C13566b0.m87444s0(arrayList), false, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m14911z(AutoBackupCloudViewModel autoBackupCloudViewModel, String str, Exception exc) {
        C13706o.m87929f(autoBackupCloudViewModel, "this$0");
        C13706o.m87929f(exc, "it");
        if (!(exc instanceof StorageException) || ((StorageException) exc).mo63610g() != 403) {
            autoBackupCloudViewModel.f9930E.postValue(new C3839r.C3841b(false, C13614t.m87748j(), true, str));
        } else {
            autoBackupCloudViewModel.f9930E.postValue(C3839r.C3845f.f9991a);
        }
    }

    /* renamed from: A */
    public final C6388h1<Boolean> mo27328A() {
        return this.f9926A;
    }

    /* renamed from: B */
    public final C6388h1<C13328m<C3847t, String>> mo27329B() {
        return this.f9928C;
    }

    /* renamed from: C */
    public final C6388h1<C13328m<C3847t, String>> mo27330C() {
        return this.f9927B;
    }

    /* renamed from: D */
    public final LiveData<C3839r> mo27331D() {
        return this.f9931F;
    }

    /* renamed from: E */
    public final void mo27332E(boolean z) {
        C5163j2.m20290w3(this.f9932a, z);
        this.f9937o.postValue(Boolean.valueOf(z));
    }

    /* renamed from: F */
    public final void mo27333F(C3847t tVar, String str) {
        C13706o.m87929f(tVar, "backupInfo");
        C13706o.m87929f(str, "filename");
        this.f9928C.postValue(new C13328m(tVar, str));
    }

    /* renamed from: G */
    public final void mo27334G(C3847t tVar, String str) {
        C13706o.m87929f(tVar, "backupInfo");
        C13706o.m87929f(str, "filename");
        this.f9927B.postValue(new C13328m(tVar, str));
    }

    /* renamed from: H */
    public final void mo27335H() {
        if (C5163j2.m20310z(this.f9932a)) {
            AutoBackupCloudWorker.f10017c.mo27429b(this.f9932a, 1);
        }
        Context context = this.f9932a;
        FirebaseUser g = FirebaseAuth.getInstance().mo22613g();
        C5163j2.m20298x3(context, g != null ? g.mo22654r2() : null);
        m14897L();
    }

    /* renamed from: I */
    public final void mo27336I() {
        m14897L();
    }

    /* renamed from: J */
    public final void mo27337J(C3847t tVar) {
        C13706o.m87929f(tVar, "backupInfo");
        this.f9930E.postValue(C3839r.C3844e.f9990a);
        this.f9935f.mo29137v(tVar.mo27378a(), new C3808e(this, tVar));
    }

    /* renamed from: K */
    public final void mo27338K() {
        AuthUI.m25697j().mo34055o(this.f9932a);
        C5163j2.m20298x3(this.f9932a, (String) null);
        AutoBackupCloudWorker.f10017c.mo27428a(this.f9932a);
        m14897L();
    }

    /* renamed from: m */
    public final void mo27339m() {
        if (C4934n.m18998M().mo29710z().size() == 0) {
            this.f9939s.postValue(C3846s.NO_MACROS);
            return;
        }
        this.f9930E.postValue(C3839r.C3840a.f9983a);
        FirebaseUser g = FirebaseAuth.getInstance().mo22613g();
        String r2 = g != null ? g.mo22654r2() : null;
        if (r2 == null) {
            this.f9939s.postValue(C3846s.OTHER);
        } else {
            this.f9935f.mo29133k(r2, 4000, new C3802a(this));
        }
    }

    /* renamed from: n */
    public final void mo27340n() {
        this.f9930E.postValue(C3839r.C3842c.f9988a);
        FirebaseUser g = FirebaseAuth.getInstance().mo22613g();
        String r2 = g != null ? g.mo22654r2() : null;
        if (r2 == null) {
            this.f9940z.postValue(null);
            C4878b.m18879r("Cloud backup delete all failed - User not logged in");
            return;
        }
        StorageReference l = this.f9929D.mo63597l();
        C13706o.m87928e(l, "storage.reference");
        StorageReference d = l.mo63628d("cloudBackup/" + r2);
        C13706o.m87928e(d, "storageRef.child(\"cloudBackup/$uid\")");
        d.mo63640n().mo23708i(new C3837p(this)).mo23705f(new C3835n(this));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        m14897L();
    }

    /* renamed from: r */
    public final void mo27342r(C3847t tVar) {
        C13706o.m87929f(tVar, "backupInfo");
        this.f9930E.postValue(C3839r.C3842c.f9988a);
        this.f9935f.mo29136r(tVar.mo27378a(), new C3804c(this));
    }

    /* renamed from: s */
    public final void mo27343s(File file, C3847t tVar) {
        C13706o.m87929f(file, "zipFile");
        C13706o.m87929f(tVar, "backupInfo");
        File parentFile = file.getParentFile();
        C16712l.m99244i(file, parentFile);
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), (C13640g) null, (C15486m0) null, new C3805d(this, new File(parentFile, C15182y.m93712U0(tVar.mo27378a(), 4) + ".mdr"), (C13635d<? super C3805d>) null), 3, (Object) null);
    }

    /* renamed from: t */
    public final C6388h1<C3846s> mo27344t() {
        return this.f9939s;
    }

    /* renamed from: v */
    public final C6388h1<Void> mo27345v() {
        return this.f9940z;
    }

    /* renamed from: w */
    public final LiveData<Boolean> mo27346w() {
        return this.f9938p;
    }
}
