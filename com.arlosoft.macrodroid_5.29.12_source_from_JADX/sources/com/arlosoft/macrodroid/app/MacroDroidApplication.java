package com.arlosoft.macrodroid.app;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.multidex.MultiDexApplication;
import androidx.preference.PreferenceManager;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17543R$xml;
import com.arlosoft.macrodroid.C4699g0;
import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.accessibility.C2305b;
import com.arlosoft.macrodroid.autobackup.worker.AutoBackupWorker;
import com.arlosoft.macrodroid.commercial.C3977a;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4040n;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.drawer.DrawerOverlayHandleService;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger;
import com.arlosoft.macrodroid.triggers.MacroDroidInitialisedTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.receivers.GPSEnabledTriggerReceiver;
import com.arlosoft.macrodroid.triggers.receivers.PebbleBatteryUpdateReceiver;
import com.arlosoft.macrodroid.triggers.services.NotificationService;
import com.arlosoft.macrodroid.triggers.services.NotificationServiceOreo;
import com.arlosoft.macrodroid.utils.C6380f1;
import com.arlosoft.macrodroid.utils.C6404m0;
import com.arlosoft.macrodroid.utils.C6455x0;
import com.getpebble.android.kit.PebbleKit;
import com.getpebble.android.kit.util.PebbleDictionary;
import com.google.android.play.core.missingsplits.MissingSplitsManagerFactory;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.messaging.FirebaseMessaging;
import dagger.android.C11986a;
import dagger.android.DispatchingAndroidInjector;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import org.apache.commons.p353io.FileUtils;
import p038md.C2035g;
import p081e1.C7264a;
import p086f1.C7287a;
import p150q2.C8164a;
import p160s0.C10121m0;
import p160s0.C8239e1;
import p166t0.C10238a;
import p166t0.C10241d;
import p178v3.C10319a;
import p190x3.C10378a;
import p195y2.C10405a;
import p248e7.C12168a;
import p270ga.C12318a;
import p292io.reactivex.subjects.C13240a;
import p297ja.C13332o;
import p297ja.C13339u;
import p322m6.C15698a;
import p370qa.C16269p;
import p404u8.C16668b;
import p440y9.C16971a;
import p455ag.C17105a;

/* compiled from: MacroDroidApplication.kt */
public final class MacroDroidApplication extends MultiDexApplication implements C16668b, LifecycleObserver {

    /* renamed from: I */
    public static final C3787a f9883I = new C3787a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: J */
    public static MacroDroidApplication f9884J;

    /* renamed from: K */
    public static C10121m0 f9885K;

    /* renamed from: L */
    private static boolean f9886L;

    /* renamed from: M */
    private static boolean f9887M;

    /* renamed from: A */
    private MacroDroidRoomDatabase f9888A;

    /* renamed from: B */
    private long f9889B;

    /* renamed from: C */
    private boolean f9890C;

    /* renamed from: D */
    private final HashMap<String, C7264a> f9891D = new HashMap<>();

    /* renamed from: E */
    private final C3794d f9892E = new C3794d();

    /* renamed from: F */
    private C10121m0 f9893F;

    /* renamed from: G */
    private final C13240a<Boolean> f9894G;

    /* renamed from: H */
    private long f9895H;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public PebbleBatteryUpdateReceiver f9896a;

    /* renamed from: c */
    public DispatchingAndroidInjector<Activity> f9897c;

    /* renamed from: d */
    public C5070a f9898d;

    /* renamed from: f */
    public C5527g f9899f;

    /* renamed from: g */
    public C10319a f9900g;

    /* renamed from: o */
    public C6455x0 f9901o;

    /* renamed from: p */
    public C4083b f9902p;

    /* renamed from: s */
    public C3977a f9903s;

    /* renamed from: z */
    public C2305b f9904z;

    /* renamed from: com.arlosoft.macrodroid.app.MacroDroidApplication$a */
    /* compiled from: MacroDroidApplication.kt */
    public static final class C3787a {
        private C3787a() {
        }

        public /* synthetic */ C3787a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C10121m0 mo27302a() {
            C10121m0 m0Var = MacroDroidApplication.f9885K;
            if (m0Var != null) {
                return m0Var;
            }
            C13706o.m87945v("appComponentInstance");
            return null;
        }

        /* renamed from: b */
        public final MacroDroidApplication mo27303b() {
            MacroDroidApplication d = mo27305d();
            C13706o.m87926c(d);
            return d;
        }

        /* renamed from: c */
        public final Locale mo27304c() {
            String E = C5163j2.m19954E(mo27303b());
            return E != null ? Locale.forLanguageTag(E) : Locale.getDefault();
        }

        /* renamed from: d */
        public final MacroDroidApplication mo27305d() {
            return MacroDroidApplication.f9884J;
        }

        /* renamed from: e */
        public final void mo27306e(C10121m0 m0Var) {
            C13706o.m87929f(m0Var, "<set-?>");
            MacroDroidApplication.f9885K = m0Var;
        }

        /* renamed from: f */
        public final void mo27307f(Locale locale) {
            C5163j2.m19942C3(mo27303b(), locale != null ? locale.toLanguageTag() : null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.app.MacroDroidApplication$b */
    /* compiled from: MacroDroidApplication.kt */
    public static final class C3788b extends Thread {

        /* renamed from: a */
        final /* synthetic */ MacroDroidApplication f9905a;

        C3788b(MacroDroidApplication macroDroidApplication) {
            this.f9905a = macroDroidApplication;
        }

        public void run() {
            try {
                if (C5163j2.m20304y1(this.f9905a) && C8164a.m33886a()) {
                    C4061t1.m15947B0(new String[]{"Dummy_command_to_avoid_delaying_root_access_request"});
                }
            } catch (Exception unused) {
            }
            FirebaseCrashlytics.m6487a().mo22937e(C5163j2.m20174i(this.f9905a));
            if (C4031k.m15911k()) {
                MacroDroidApplication macroDroidApplication = this.f9905a;
                UUID uuid = C4040n.f10591a;
                macroDroidApplication.f9896a = new PebbleBatteryUpdateReceiver(uuid);
                MacroDroidApplication macroDroidApplication2 = this.f9905a;
                PebbleKit.m26086g(macroDroidApplication2, macroDroidApplication2.f9896a);
                PebbleDictionary pebbleDictionary = new PebbleDictionary();
                pebbleDictionary.mo34298m(999, (byte) 6);
                PebbleKit.m26088i(this.f9905a, uuid, pebbleDictionary);
            }
            C5163j2.m20171h4(this.f9905a, 0);
            try {
                File file = new File(Environment.getExternalStorageDirectory().toString() + "/MacroDroid");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.app.MacroDroidApplication$c */
    /* compiled from: MacroDroidApplication.kt */
    public static final class C3789c extends Thread {

        /* renamed from: a */
        final /* synthetic */ MacroDroidApplication f9906a;

        C3789c(MacroDroidApplication macroDroidApplication) {
            this.f9906a = macroDroidApplication;
        }

        public void run() {
            AppCompatDelegate.setDefaultNightMode(Integer.parseInt(C5163j2.m19977H(this.f9906a)));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.app.MacroDroidApplication$d */
    /* compiled from: MacroDroidApplication.kt */
    static final class C3790d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ MacroDroidApplication this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3790d(MacroDroidApplication macroDroidApplication, C13635d<? super C3790d> dVar) {
            super(2, dVar);
            this.this$0 = macroDroidApplication;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3790d(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3790d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C3977a r = this.this$0.mo27294r();
                this.label = 1;
                if (r.mo27694a(this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    public MacroDroidApplication() {
        C13240a<Boolean> i0 = C13240a.m85593i0();
        C13706o.m87928e(i0, "create<Boolean>()");
        this.f9894G = i0;
    }

    /* renamed from: A */
    private final void m14823A() {
        if (this.f9888A == null) {
            this.f9888A = Room.databaseBuilder(this, MacroDroidRoomDatabase.class, "macroDroidDatabase").setJournalMode(RoomDatabase.JournalMode.AUTOMATIC).enableMultiInstanceInvalidation().build();
        }
    }

    /* renamed from: B */
    private final void m14824B() {
        try {
            if (!mo27298w().mo28009e().mo28008a()) {
                FirebaseMessaging.m76862n().mo63344H("FreeVersion");
            } else {
                FirebaseMessaging.m76862n().mo63344H("ProVersion");
            }
        } catch (Exception unused) {
        }
        long j = (long) 60;
        if (((((System.currentTimeMillis() - C5163j2.m20247r0(this)) / ((long) 1000)) / j) / j) / ((long) 24) > 30) {
            try {
                FirebaseMessaging.m76862n().mo63344H("OldUser");
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: C */
    private final void m14825C() {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if ((next2 instanceof MacroDroidInitialisedTrigger) && next2.mo31374R2()) {
                    next.setTriggerThatInvoked(next2);
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a3 A[SYNTHETIC, Splitter:B:38:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad A[SYNTHETIC, Splitter:B:44:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b3 A[SYNTHETIC, Splitter:B:48:0x00b3] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:41:0x00a8=Splitter:B:41:0x00a8, B:35:0x009e=Splitter:B:35:0x009e} */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m14826D(java.io.File r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x00a7, IOException -> 0x009d }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ ClassNotFoundException -> 0x00a7, IOException -> 0x009d }
            r3.<init>(r8)     // Catch:{ ClassNotFoundException -> 0x00a7, IOException -> 0x009d }
            r2.<init>(r3)     // Catch:{ ClassNotFoundException -> 0x00a7, IOException -> 0x009d }
            android.content.SharedPreferences r8 = androidx.preference.PreferenceManager.getDefaultSharedPreferences(r7)     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            r8.clear()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            java.lang.Object r1 = r2.readObject()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>"
            kotlin.jvm.internal.C13706o.m87927d(r1, r3)     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
        L_0x002a:
            boolean r3 = r1.hasNext()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            if (r3 == 0) goto L_0x0082
            java.lang.Object r3 = r1.next()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            boolean r5 = r3 instanceof java.lang.Boolean     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            if (r5 == 0) goto L_0x004e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            boolean r3 = r3.booleanValue()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            r8.putBoolean(r4, r3)     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            goto L_0x002a
        L_0x004e:
            boolean r5 = r3 instanceof java.lang.Float     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            if (r5 == 0) goto L_0x005c
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            float r3 = r3.floatValue()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            r8.putFloat(r4, r3)     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            goto L_0x002a
        L_0x005c:
            boolean r5 = r3 instanceof java.lang.Integer     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            if (r5 == 0) goto L_0x006a
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            int r3 = r3.intValue()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            r8.putInt(r4, r3)     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            goto L_0x002a
        L_0x006a:
            boolean r5 = r3 instanceof java.lang.Long     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            if (r5 == 0) goto L_0x0078
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            long r5 = r3.longValue()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            r8.putLong(r4, r5)     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            goto L_0x002a
        L_0x0078:
            boolean r5 = r3 instanceof java.lang.String     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            if (r5 == 0) goto L_0x002a
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            r8.putString(r4, r3)     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            goto L_0x002a
        L_0x0082:
            r8.apply()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            r0 = 1
            r7.mo27287n()     // Catch:{ ClassNotFoundException -> 0x0098, IOException -> 0x0095, all -> 0x0092 }
            r2.close()     // Catch:{ IOException -> 0x008d }
            goto L_0x00b0
        L_0x008d:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x00b0
        L_0x0092:
            r8 = move-exception
            r1 = r2
            goto L_0x00b1
        L_0x0095:
            r8 = move-exception
            r1 = r2
            goto L_0x009e
        L_0x0098:
            r8 = move-exception
            r1 = r2
            goto L_0x00a8
        L_0x009b:
            r8 = move-exception
            goto L_0x00b1
        L_0x009d:
            r8 = move-exception
        L_0x009e:
            r8.printStackTrace()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x00b0
            r1.close()     // Catch:{ IOException -> 0x008d }
            goto L_0x00b0
        L_0x00a7:
            r8 = move-exception
        L_0x00a8:
            r8.printStackTrace()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x00b0
            r1.close()     // Catch:{ IOException -> 0x008d }
        L_0x00b0:
            return r0
        L_0x00b1:
            if (r1 == 0) goto L_0x00bb
            r1.close()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00bb
        L_0x00b7:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00bb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.app.MacroDroidApplication.m14826D(java.io.File):boolean");
    }

    /* renamed from: E */
    private final void m14827E() {
        if (C5163j2.m20303y0(this) != 50905 && C5163j2.m19922A(C10378a.f23596a.mo41059a()) == null && !mo27301z().mo30790b().isGuest()) {
            FirebaseUser g = FirebaseAuth.getInstance().mo22613g();
            C5163j2.m20298x3(this, g != null ? g.mo22654r2() : null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final void m14828F(MacroDroidApplication macroDroidApplication, Boolean bool) {
        C13706o.m87929f(macroDroidApplication, "this$0");
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("MacroDroid service created: 5.29.12 (5290013)");
        sb.append(C5163j2.m20103Z(macroDroidApplication) ? " (Force hide icon enabled)" : "");
        C4878b.m18879r(sb.toString());
        C17105a.m100579a("Service init took " + (currentTimeMillis - macroDroidApplication.f9895H) + "ms", new Object[0]);
        C4878b.m18864c("Service init took " + (currentTimeMillis - macroDroidApplication.f9895H) + "ms");
        C4878b.m18864c("Memory limit: " + C2035g.m8420a(macroDroidApplication).getMemoryClass() + "MB");
        macroDroidApplication.m14839g(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final void m14829G(MacroDroidApplication macroDroidApplication, Throwable th) {
        C13706o.m87929f(macroDroidApplication, "this$0");
        long currentTimeMillis = System.currentTimeMillis();
        C17105a.m100579a("Service init error -> took " + (currentTimeMillis - macroDroidApplication.f9895H) + "ms", new Object[0]);
        C4878b.m18864c("Service init timeout ->  took " + (currentTimeMillis - macroDroidApplication.f9895H) + "ms");
        macroDroidApplication.m14839g(true);
    }

    /* renamed from: H */
    private final void m14830H() {
        File file = new File("/sdcard/Download/MDefault.mdr");
        if (file.exists()) {
            C4934n M = C4934n.m18998M();
            M.mo29693m0(C4934n.m18998M().mo29685T(file.getAbsolutePath(), false));
            M.mo29702s0();
            file.delete();
            FileUtils.deleteQuietly(file);
        }
        File file2 = new File("/sdcard/Download/MDefault.set");
        if (file2.exists()) {
            m14826D(file2);
            file2.delete();
            FileUtils.deleteQuietly(file2);
        }
    }

    /* renamed from: I */
    private final void m14831I() {
    }

    /* renamed from: J */
    private final void m14832J() {
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, (C13640g) null, (C15486m0) null, new C3790d(this, (C13635d<? super C3790d>) null), 3, (Object) null);
    }

    /* renamed from: K */
    private final void m14833K() {
        if (C5163j2.m20206m(this)) {
            AutoBackupWorker.f10020c.mo27431b();
        }
    }

    /* renamed from: g */
    private final void m14839g(boolean z) {
        System.currentTimeMillis();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        C12168a.m82811d(this).mo68451a("MacroDroid/RXP");
        C4373a.m17337i(this);
        new C3788b(this).start();
        PreferenceManager.setDefaultValues(this, C17543R$xml.preferences, false);
        C4064u.m16048t();
        C4934n.m18999N(getApplicationContext());
        m14825C();
        GPSEnabledTriggerReceiver.m24027a(this);
        m14832J();
        m14831I();
        C4878b.m18864c("Sha1 = " + C6380f1.f14971a.mo32421a(f9883I.mo27303b()));
        m14830H();
        m14824B();
        if (C5163j2.m20085W2(this) && (Build.VERSION.SDK_INT < 26 || z)) {
            stopService(new Intent(this, DrawerOverlayHandleService.class));
            startService(new Intent(this, DrawerOverlayHandleService.class));
        }
        m14833K();
        long currentTimeMillis = System.currentTimeMillis();
        C17105a.m100579a("Startup time took " + (currentTimeMillis - this.f9895H) + "ms", new Object[0]);
        C4878b.m18873l("MacroDroid process has started");
        C4878b.m18864c("Startup time took " + (currentTimeMillis - this.f9895H) + "ms");
        m14840h();
        this.f9894G.onNext(Boolean.TRUE);
        mo27288o().mo24662e();
    }

    /* renamed from: h */
    private final void m14840h() {
        try {
            String string = Settings.Secure.getString(getContentResolver(), "enabled_notification_listeners");
            C13706o.m87928e(string, "enabledAppList");
            C3787a aVar = f9883I;
            String packageName = aVar.mo27303b().getPackageName();
            C13706o.m87928e(packageName, "instance.packageName");
            if (!C15177w.m93663N(string, packageName, false, 2, (Object) null)) {
                String name = NotificationServiceOreo.class.getName();
                C13706o.m87928e(name, "NotificationServiceOreo::class.java.name");
                if (!C15177w.m93663N(string, name, false, 2, (Object) null)) {
                    return;
                }
            }
            C4878b.m18864c("Attempting to force start Notification Service");
            aVar.mo27303b().startService(new Intent(aVar.mo27303b(), Build.VERSION.SDK_INT >= 26 ? NotificationServiceOreo.class : NotificationService.class));
        } catch (Exception e) {
            C4878b.m18864c("Failed to force start notification service: " + e);
        }
    }

    /* renamed from: i */
    private final void m14841i() {
        if (!mo27298w().mo28009e().mo28008a()) {
            try {
                if (!mo27296t().mo40941a()) {
                    C5163j2.m20242q3(C10378a.f23596a.mo41059a(), true);
                } else if (C5163j2.m20254s(this)) {
                    mo27296t().mo40943c(this);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: j */
    private final void m14842j(boolean z) {
        if (NonAppActivity.f10331f.mo27789a() && z) {
            f9886L = true;
        } else if (!f9886L || z) {
            Object systemService = getSystemService("power");
            C13706o.m87927d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            boolean isInteractive = ((PowerManager) systemService).isInteractive();
            if (!z && !isInteractive) {
                f9887M = true;
            } else if (!z || !f9887M) {
                f9887M = false;
                f9886L = false;
                ArrayList arrayList = new ArrayList();
                for (Macro next : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                    while (it.hasNext()) {
                        Trigger next2 = it.next();
                        if (next2 instanceof ApplicationLaunchedTrigger) {
                            ApplicationLaunchedTrigger applicationLaunchedTrigger = (ApplicationLaunchedTrigger) next2;
                            Iterator<String> it2 = applicationLaunchedTrigger.mo30924H3().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next3 = it2.next();
                                if (applicationLaunchedTrigger.mo30922F3() == z && C13706o.m87924a(next3, "com.arlosoft.macrodroid") && next2.mo31374R2()) {
                                    next.setTriggerThatInvoked(next2);
                                    next.setTriggerContextInfo(new TriggerContextInfo(next.getTriggerThatInvoked(), "MacroDroid"));
                                    if (next.canInvoke(next.getTriggerContextInfo())) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Macro macro = (Macro) it3.next();
                        macro.invokeActions(macro.getTriggerContextInfo());
                    }
                }
            } else {
                f9887M = false;
            }
        } else {
            f9886L = false;
        }
    }

    /* renamed from: k */
    private final void m14843k() {
        C10121m0 c = C8239e1.m34134Y().mo40028b(new C10241d(this)).mo40029c();
        C13706o.m87928e(c, "builder()\n              …\n                .build()");
        this.f9893F = c;
        C10121m0 m0Var = null;
        if (c == null) {
            C13706o.m87945v("appComponent");
            c = null;
        }
        c.mo38313r(this);
        C3787a aVar = f9883I;
        C10121m0 m0Var2 = this.f9893F;
        if (m0Var2 == null) {
            C13706o.m87945v("appComponent");
        } else {
            m0Var = m0Var2;
        }
        aVar.mo27306e(m0Var);
    }

    /* renamed from: m */
    private final void m14844m() {
        PackageManager packageManager = getPackageManager();
        ComponentName componentName = new ComponentName("com.arlosoft.macrodroid", "com.arlosoft.macrodroid.triggers.services.quicksettings.MacroDroidOnOffTileService");
        if (C5163j2.m20152f1(this) == null) {
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    /* renamed from: u */
    public static final MacroDroidApplication m14845u() {
        return f9883I.mo27303b();
    }

    /* renamed from: c */
    public C11986a<Activity> mo27285c() {
        return mo27295s();
    }

    /* renamed from: l */
    public final C10238a mo27286l(Activity activity) {
        C13706o.m87929f(activity, "activity");
        return new C10238a(activity);
    }

    /* renamed from: n */
    public final void mo27287n() {
        Locale locale;
        int i = 0;
        C17105a.m100579a("++++ FORCE LANGUAGE: " + C5163j2.m20143e0(this), new Object[0]);
        String e0 = C5163j2.m20143e0(this);
        if (e0 == null) {
            e0 = Locale.getDefault().getLanguage();
        }
        if (e0 != null) {
            Configuration configuration = getResources().getConfiguration();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 121) {
                locale = Locale.forLanguageTag(e0);
                C13706o.m87928e(locale, "{\n                Locale…nguageCode)\n            }");
            } else {
                locale = C6404m0.m24660a(e0);
                C13706o.m87928e(locale, "{\n                Locale…nguageCode)\n            }");
            }
            configuration.locale = locale;
            if (i2 >= 24) {
                configuration.setLocale(locale);
            }
            f9883I.mo27307f(locale);
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
            C17105a.m100579a("++++ CELL ID: " + getString(C17541R$string.cell_id), new Object[0]);
            return;
        }
        String d0 = C5163j2.m20135d0(this);
        if (d0 != null) {
            Configuration configuration2 = getResources().getConfiguration();
            int i3 = -1;
            String[] stringArray = getResources().getStringArray(C17525R$array.languages);
            C13706o.m87928e(stringArray, "resources.getStringArray(R.array.languages)");
            int length = stringArray.length;
            while (true) {
                if (i >= length) {
                    break;
                } else if (C13706o.m87924a(stringArray[i], d0)) {
                    i3 = i;
                    break;
                } else {
                    i++;
                }
            }
            if (i3 >= 0) {
                Locale[] localeArr = C5163j2.f12949a;
                configuration2.locale = localeArr[i3];
                if (Build.VERSION.SDK_INT >= 24) {
                    configuration2.setLocale(localeArr[i3]);
                }
                f9883I.mo27307f(configuration2.locale);
                getResources().updateConfiguration(configuration2, getResources().getDisplayMetrics());
            }
        }
    }

    /* renamed from: o */
    public final C2305b mo27288o() {
        C2305b bVar = this.f9904z;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("accessibilityServiceMonitor");
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onAppBackgrounded() {
        C17105a.m100579a("++++ MacroDroid - BG", new Object[0]);
        this.f9890C = false;
        m14842j(false);
        this.f9889B = System.currentTimeMillis();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onAppForegrounded() {
        C17105a.m100579a("++++ MacroDroid - FG", new Object[0]);
        this.f9890C = true;
        if (f9884J == null) {
            f9884J = this;
        }
        m14842j(true);
        if (!TextUtils.isEmpty(C5163j2.m20152f1(this))) {
            int g1 = C5163j2.m20160g1(this);
            if (this.f9889B + ((long) (g1 * 1000)) < System.currentTimeMillis()) {
                C4699g0.f11814a.mo29141l();
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        if (!MissingSplitsManagerFactory.m71034a(this).mo59917a()) {
            if (f9884J == null) {
                f9884J = this;
            }
            C15698a.m94925a(this);
            m14823A();
            String f1 = C5163j2.m20152f1(this);
            if (!(f1 == null || f1.length() == 0) && C5163j2.m20222o(this)) {
                BiometricPromptCompat.Companion.init((Runnable) null);
            }
            if (C5163j2.m20013M0(this)) {
                C4878b.m18864c("Starting MacroDroid service");
                try {
                    MacroDroidService.f7040a.mo24641f(this);
                    C4878b.m18864c("After starting MacroDroid service");
                } catch (ForegroundServiceStartNotAllowedException e) {
                    FirebaseCrashlytics.m6487a().mo22936d(e);
                    C4878b.m18864c("Service start not allowed: " + e);
                }
            }
            C17105a.m100579a("++++ APPLICATION - onCreate", new Object[0]);
            this.f9895H = System.currentTimeMillis();
            if (C5163j2.m20247r0(this) == 0) {
                C5163j2.m20163g4(this, this.f9895H);
            }
            new C3789c(this).start();
            ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
            m14843k();
            mo27297v().mo32511i();
            C5163j2.m20178i3(this, C5163j2.m20182j(this) + 1);
            Macro.setMacroDroidEnabledState(C5163j2.m20013M0(this));
            m14844m();
            m14827E();
            mo27287n();
            if (C5163j2.m20013M0(this)) {
                this.f9892E.mo27319a().mo79676x(1).mo79674v(C12318a.m83030b()).mo79663j(C16971a.m100210a()).mo79671r(new C3791a(this), new C3792b(this));
            } else {
                m14839g(false);
            }
            m14841i();
            C10405a.f23647a.mo41100b(this);
        }
    }

    /* renamed from: p */
    public final C13240a<Boolean> mo27292p() {
        return this.f9894G;
    }

    /* renamed from: q */
    public C7264a mo27293q(String str) {
        C13706o.m87929f(str, "cacheName");
        C7264a aVar = this.f9891D.get(str);
        return aVar == null ? new C7287a(this, str) : aVar;
    }

    /* renamed from: r */
    public final C3977a mo27294r() {
        C3977a aVar = this.f9903s;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("commercialTools");
        return null;
    }

    /* renamed from: s */
    public final DispatchingAndroidInjector<Activity> mo27295s() {
        DispatchingAndroidInjector<Activity> dispatchingAndroidInjector = this.f9897c;
        if (dispatchingAndroidInjector != null) {
            return dispatchingAndroidInjector;
        }
        C13706o.m87945v("dispatchingAndroidInjector");
        return null;
    }

    /* renamed from: t */
    public final C10319a mo27296t() {
        C10319a aVar = this.f9900g;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("flashSaleManager");
        return null;
    }

    /* renamed from: v */
    public final C6455x0 mo27297v() {
        C6455x0 x0Var = this.f9901o;
        if (x0Var != null) {
            return x0Var;
        }
        C13706o.m87945v("notificationChannelUtil");
        return null;
    }

    /* renamed from: w */
    public final C4083b mo27298w() {
        C4083b bVar = this.f9902p;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: x */
    public final MacroDroidRoomDatabase mo27299x() {
        m14823A();
        MacroDroidRoomDatabase macroDroidRoomDatabase = this.f9888A;
        C13706o.m87926c(macroDroidRoomDatabase);
        return macroDroidRoomDatabase;
    }

    /* renamed from: y */
    public final C3794d mo27300y() {
        return this.f9892E;
    }

    /* renamed from: z */
    public final C5527g mo27301z() {
        C5527g gVar = this.f9899f;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("userProvider");
        return null;
    }
}
