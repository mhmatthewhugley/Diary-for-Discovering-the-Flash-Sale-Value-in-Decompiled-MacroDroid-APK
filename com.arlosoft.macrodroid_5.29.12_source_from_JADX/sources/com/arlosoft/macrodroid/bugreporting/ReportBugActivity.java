package com.arlosoft.macrodroid.bugreporting;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.bugreporting.model.BugReport;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4043o;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.database.room.C4402h;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.database.room.SystemLogEntry;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.logging.systemlog.C4900q;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.C4917c;
import com.arlosoft.macrodroid.macro.C4921g;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.sparkpostutil.EmailListener;
import com.arlosoft.macrodroid.utils.sparkpostutil.SparkPostEmailUtil;
import com.arlosoft.macrodroid.utils.sparkpostutil.SparkPostFile;
import com.arlosoft.macrodroid.utils.sparkpostutil.SparkPostRecipient;
import com.arlosoft.macrodroid.utils.sparkpostutil.SparkPostSender;
import com.google.api.client.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15147d;
import kotlin.text.C15159j;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import org.apache.commons.cli.HelpFormatter;
import p150q2.C8164a;
import p155r1.C8192h;
import p172u1.C10283c;
import p297ja.C13339u;
import p319lc.C15626c;
import p344o6.C15804b;
import p370qa.C16269p;

/* compiled from: ReportBugActivity.kt */
public final class ReportBugActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: G */
    public static final C3884a f10073G = new C3884a((C13695i) null);

    /* renamed from: A */
    public C4915a f10074A;

    /* renamed from: B */
    public C4900q f10075B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f10076C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public BugReport f10077D;

    /* renamed from: E */
    private final SimpleDateFormat f10078E = new SimpleDateFormat("dd-MM-yy HH:mm:ss", Locale.getDefault());

    /* renamed from: F */
    public Map<Integer, View> f10079F = new LinkedHashMap();
    @BindView(2131363060)
    public ViewGroup loadingView;

    /* renamed from: s */
    public MacroDroidRoomDatabase f10080s;
    @BindView(2131364299)
    public ViewPager viewPager;

    /* renamed from: z */
    public C4083b f10081z;

    /* renamed from: com.arlosoft.macrodroid.bugreporting.ReportBugActivity$a */
    /* compiled from: ReportBugActivity.kt */
    public static final class C3884a {
        private C3884a() {
        }

        public /* synthetic */ C3884a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.bugreporting.ReportBugActivity$b */
    /* compiled from: ReportBugActivity.kt */
    public final class C3885b extends FragmentPagerAdapter {

        /* renamed from: a */
        private final BugReport f10082a;

        /* renamed from: b */
        final /* synthetic */ ReportBugActivity f10083b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3885b(ReportBugActivity reportBugActivity, FragmentManager fragmentManager, BugReport bugReport) {
            super(fragmentManager);
            C13706o.m87929f(fragmentManager, "fm");
            C13706o.m87929f(bugReport, "bugReport");
            this.f10083b = reportBugActivity;
            this.f10082a = bugReport;
        }

        public int getCount() {
            return this.f10083b.f10076C ? 3 : 2;
        }

        public Fragment getItem(int i) {
            Fragment fragment;
            Fragment fragment2;
            if (i == 0) {
                if (this.f10083b.f10076C) {
                    fragment = SelectMacrosFragment.m15160Z();
                } else {
                    fragment = BugDetailsFragment.f10066d.mo27483a();
                }
                C13706o.m87928e(fragment, "if (hasMacros) {\n       …tance()\n                }");
                return fragment;
            } else if (i == 1) {
                if (this.f10083b.f10076C) {
                    fragment2 = BugDetailsFragment.f10066d.mo27483a();
                } else {
                    fragment2 = SubmitBugFragment.m15162U();
                }
                C13706o.m87928e(fragment2, "if (hasMacros) {\n       …tance()\n                }");
                return fragment2;
            } else if (i != 2) {
                throw new IllegalArgumentException("Invalid page");
            } else if (this.f10083b.f10076C) {
                SubmitBugFragment U = SubmitBugFragment.m15162U();
                C13706o.m87928e(U, "{\n                    if… page\")\n                }");
                return U;
            } else {
                throw new IllegalArgumentException("Invalid page");
            }
        }

        public CharSequence getPageTitle(int i) {
            return "";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.bugreporting.ReportBugActivity$c */
    /* compiled from: ReportBugActivity.kt */
    public /* synthetic */ class C3886c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10084a;

        static {
            int[] iArr = new int[C4402h.values().length];
            iArr[C4402h.TRIGGER.ordinal()] = 1;
            iArr[C4402h.ACTION.ordinal()] = 2;
            f10084a = iArr;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.bugreporting.ReportBugActivity$d */
    /* compiled from: ReportBugActivity.kt */
    static final class C3887d extends C13656d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ReportBugActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3887d(ReportBugActivity reportBugActivity, C13635d<? super C3887d> dVar) {
            super(dVar);
            this.this$0 = reportBugActivity;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m15137W1(this);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.bugreporting.ReportBugActivity$e */
    /* compiled from: ReportBugActivity.kt */
    static final class C3888e extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ String $emailBody;
        final /* synthetic */ List<Macro> $macroList;
        final /* synthetic */ ArrayList<Uri> $screenshotUris;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ ReportBugActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3888e(ReportBugActivity reportBugActivity, String str, List<? extends Macro> list, ArrayList<Uri> arrayList, C13635d<? super C3888e> dVar) {
            super(2, dVar);
            this.this$0 = reportBugActivity;
            this.$emailBody = str;
            this.$macroList = list;
            this.$screenshotUris = arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m15154r(ReportBugActivity reportBugActivity, String str, C8192h hVar) {
            if (hVar.mo38260d()) {
                C15626c.makeText(reportBugActivity.getApplicationContext(), C17541R$string.bug_submitted_ok, 0).show();
                if (!reportBugActivity.mo27315N1()) {
                    reportBugActivity.finish();
                    return;
                }
                return;
            }
            C4878b.m18868g("Submit bug failed: " + hVar.mo38259c());
            BugReport S1 = reportBugActivity.f10077D;
            C13706o.m87926c(S1);
            List<Macro> e = S1.mo27506e();
            C13706o.m87928e(e, "bugReport!!.macroList");
            reportBugActivity.m15142j2(str, e);
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static final void m15155u(ReportBugActivity reportBugActivity, String str, Throwable th) {
            C4878b.m18868g("Submit bug failed: " + th);
            BugReport S1 = reportBugActivity.f10077D;
            C13706o.m87926c(S1);
            List<Macro> e = S1.mo27506e();
            C13706o.m87928e(e, "bugReport!!.macroList");
            reportBugActivity.m15142j2(str, e);
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C3888e(this.this$0, this.$emailBody, this.$macroList, this.$screenshotUris, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3888e) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x010d A[Catch:{ all -> 0x0168 }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x011d A[Catch:{ all -> 0x0168 }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0124 A[Catch:{ all -> 0x0168 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0030
                if (r1 == r3) goto L_0x0023
                if (r1 != r2) goto L_0x001b
                java.lang.Object r0 = r10.L$1
                r1.f r0 = (p155r1.C8189f) r0
                java.lang.Object r1 = r10.L$0
                r1.c r1 = (p155r1.C8187c) r1
                p297ja.C13332o.m85685b(r11)     // Catch:{ all -> 0x0168 }
                goto L_0x0109
            L_0x001b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0023:
                java.lang.Object r1 = r10.L$1
                r1.f r1 = (p155r1.C8189f) r1
                java.lang.Object r3 = r10.L$0
                r1.c r3 = (p155r1.C8187c) r3
                p297ja.C13332o.m85685b(r11)     // Catch:{ all -> 0x0168 }
                goto L_0x00ec
            L_0x0030:
                p297ja.C13332o.m85685b(r11)
                java.lang.String r11 = "rM2LZ7ZtdliGhZIp5l7p5p2bEboIcD/ShDO211LtH4RqPkh7U67clJ4mcA9j6zVRm1kTHCt2RJ97\nvqTbOMeEF/qk5Ai3En4l"
                java.lang.String r11 = com.arlosoft.macrodroid.extensions.C4660g.m18123a(r11)     // Catch:{ all -> 0x0168 }
                r1.c r11 = p155r1.C8187c.m33948a(r11)     // Catch:{ all -> 0x0168 }
                r1.f r1 = new r1.f     // Catch:{ all -> 0x0168 }
                r1.<init>()     // Catch:{ all -> 0x0168 }
                java.lang.String r4 = "arlosoftmacrodroid@gmail.com"
                r5 = 0
                r1.mo38239c(r4, r5)     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.bugreporting.ReportBugActivity r4 = r10.this$0     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.bugreporting.model.BugReport r4 = r4.f10077D     // Catch:{ all -> 0x0168 }
                kotlin.jvm.internal.C13706o.m87926c(r4)     // Catch:{ all -> 0x0168 }
                java.lang.String r4 = r4.mo27503c()     // Catch:{ all -> 0x0168 }
                boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0168 }
                if (r4 != 0) goto L_0x0069
                com.arlosoft.macrodroid.bugreporting.ReportBugActivity r4 = r10.this$0     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.bugreporting.model.BugReport r4 = r4.f10077D     // Catch:{ all -> 0x0168 }
                kotlin.jvm.internal.C13706o.m87926c(r4)     // Catch:{ all -> 0x0168 }
                java.lang.String r4 = r4.mo27503c()     // Catch:{ all -> 0x0168 }
                goto L_0x006b
            L_0x0069:
                java.lang.String r4 = "Anonymous@macrodroid.com"
            L_0x006b:
                java.lang.String r5 = "bugs@macrodroid.com"
                r1.mo38253q(r5, r4)     // Catch:{ all -> 0x0168 }
                r1.mo38254r(r4, r4)     // Catch:{ all -> 0x0168 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0168 }
                r5.<init>()     // Catch:{ all -> 0x0168 }
                java.lang.String r6 = "Bug Report from "
                r5.append(r6)     // Catch:{ all -> 0x0168 }
                r5.append(r4)     // Catch:{ all -> 0x0168 }
                java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0168 }
                r1.mo38255s(r4)     // Catch:{ all -> 0x0168 }
                java.lang.String r4 = r10.$emailBody     // Catch:{ all -> 0x0168 }
                r1.mo38252p(r4)     // Catch:{ all -> 0x0168 }
                java.util.List<com.arlosoft.macrodroid.macro.Macro> r4 = r10.$macroList     // Catch:{ all -> 0x0168 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0168 }
            L_0x0092:
                boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0168 }
                if (r5 == 0) goto L_0x00bb
                java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.macro.Macro r5 = (com.arlosoft.macrodroid.macro.Macro) r5     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.utils.r0 r6 = com.arlosoft.macrodroid.utils.C6422r0.f15045a     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.bugreporting.ReportBugActivity r7 = r10.this$0     // Catch:{ all -> 0x0168 }
                java.io.File r7 = r7.getFilesDir()     // Catch:{ all -> 0x0168 }
                java.lang.String r8 = "filesDir"
                kotlin.jvm.internal.C13706o.m87928e(r7, r8)     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.bugreporting.ReportBugActivity r8 = r10.this$0     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.macro.a r8 = r8.mo27487Y1()     // Catch:{ all -> 0x0168 }
                java.io.File r5 = r6.mo32452b(r7, r5, r8)     // Catch:{ all -> 0x0168 }
                if (r5 == 0) goto L_0x0092
                r1.mo38238b(r5)     // Catch:{ all -> 0x0168 }
                goto L_0x0092
            L_0x00bb:
                com.arlosoft.macrodroid.bugreporting.ReportBugActivity r4 = r10.this$0     // Catch:{ all -> 0x0168 }
                android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0168 }
                android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0168 }
                int r4 = r4.uiMode     // Catch:{ all -> 0x0168 }
                r4 = r4 & 48
                r5 = 32
                r6 = 0
                if (r4 != r5) goto L_0x00d0
                r4 = 1
                goto L_0x00d1
            L_0x00d0:
                r4 = 0
            L_0x00d1:
                com.arlosoft.macrodroid.bugreporting.ReportBugActivity r5 = r10.this$0     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.logging.systemlog.q r5 = r5.mo27491e2()     // Catch:{ all -> 0x0168 }
                if (r4 == 0) goto L_0x00da
                r6 = 1
            L_0x00da:
                com.arlosoft.macrodroid.database.room.i r4 = com.arlosoft.macrodroid.database.room.C4403i.DEBUG     // Catch:{ all -> 0x0168 }
                r10.L$0 = r11     // Catch:{ all -> 0x0168 }
                r10.L$1 = r1     // Catch:{ all -> 0x0168 }
                r10.label = r3     // Catch:{ all -> 0x0168 }
                java.lang.Object r3 = r5.mo29495a(r6, r4, r10)     // Catch:{ all -> 0x0168 }
                if (r3 != r0) goto L_0x00e9
                return r0
            L_0x00e9:
                r9 = r3
                r3 = r11
                r11 = r9
            L_0x00ec:
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0168 }
                if (r11 == 0) goto L_0x00f8
                java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0168 }
                r4.<init>(r11)     // Catch:{ all -> 0x0168 }
                r1.mo38238b(r4)     // Catch:{ all -> 0x0168 }
            L_0x00f8:
                com.arlosoft.macrodroid.bugreporting.ReportBugActivity r11 = r10.this$0     // Catch:{ all -> 0x0168 }
                r10.L$0 = r3     // Catch:{ all -> 0x0168 }
                r10.L$1 = r1     // Catch:{ all -> 0x0168 }
                r10.label = r2     // Catch:{ all -> 0x0168 }
                java.lang.Object r11 = r11.m15137W1(r10)     // Catch:{ all -> 0x0168 }
                if (r11 != r0) goto L_0x0107
                return r0
            L_0x0107:
                r0 = r1
                r1 = r3
            L_0x0109:
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0168 }
                if (r11 == 0) goto L_0x0115
                java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0168 }
                r2.<init>(r11)     // Catch:{ all -> 0x0168 }
                r0.mo38238b(r2)     // Catch:{ all -> 0x0168 }
            L_0x0115:
                com.arlosoft.macrodroid.bugreporting.ReportBugActivity r11 = r10.this$0     // Catch:{ all -> 0x0168 }
                java.io.File r11 = r11.m15140f2()     // Catch:{ all -> 0x0168 }
                if (r11 == 0) goto L_0x0120
                r0.mo38238b(r11)     // Catch:{ all -> 0x0168 }
            L_0x0120:
                java.util.ArrayList<android.net.Uri> r11 = r10.$screenshotUris     // Catch:{ all -> 0x0168 }
                if (r11 == 0) goto L_0x013a
                com.arlosoft.macrodroid.bugreporting.ReportBugActivity r2 = r10.this$0     // Catch:{ all -> 0x0168 }
                java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0168 }
            L_0x012a:
                boolean r3 = r11.hasNext()     // Catch:{ all -> 0x0168 }
                if (r3 == 0) goto L_0x013a
                java.lang.Object r3 = r11.next()     // Catch:{ all -> 0x0168 }
                android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x0168 }
                r0.mo38237a(r2, r3)     // Catch:{ all -> 0x0168 }
                goto L_0x012a
            L_0x013a:
                java.util.concurrent.Callable r11 = r1.mo38235c(r0)     // Catch:{ all -> 0x0168 }
                v9.p r11 = p414v9.C16747p.m99411j(r11)     // Catch:{ all -> 0x0168 }
                v9.o r0 = p270ga.C12318a.m83030b()     // Catch:{ all -> 0x0168 }
                v9.p r11 = r11.mo79730q(r0)     // Catch:{ all -> 0x0168 }
                v9.o r0 = p440y9.C16971a.m100210a()     // Catch:{ all -> 0x0168 }
                v9.p r11 = r11.mo79726l(r0)     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.bugreporting.ReportBugActivity r0 = r10.this$0     // Catch:{ all -> 0x0168 }
                java.lang.String r1 = r10.$emailBody     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.bugreporting.a r2 = new com.arlosoft.macrodroid.bugreporting.a     // Catch:{ all -> 0x0168 }
                r2.<init>(r0, r1)     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.bugreporting.ReportBugActivity r0 = r10.this$0     // Catch:{ all -> 0x0168 }
                java.lang.String r1 = r10.$emailBody     // Catch:{ all -> 0x0168 }
                com.arlosoft.macrodroid.bugreporting.b r3 = new com.arlosoft.macrodroid.bugreporting.b     // Catch:{ all -> 0x0168 }
                r3.<init>(r0, r1)     // Catch:{ all -> 0x0168 }
                r11.mo79729o(r2, r3)     // Catch:{ all -> 0x0168 }
                goto L_0x0194
            L_0x0168:
                r11 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Submit bug failed: "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r11)
                com.arlosoft.macrodroid.bugreporting.ReportBugActivity r11 = r10.this$0
                java.lang.String r0 = r10.$emailBody
                com.arlosoft.macrodroid.bugreporting.model.BugReport r1 = r11.f10077D
                kotlin.jvm.internal.C13706o.m87926c(r1)
                java.util.List r1 = r1.mo27506e()
                java.lang.String r2 = "bugReport!!.macroList"
                kotlin.jvm.internal.C13706o.m87928e(r1, r2)
                r11.m15142j2(r0, r1)
            L_0x0194:
                ja.u r11 = p297ja.C13339u.f61331a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.bugreporting.ReportBugActivity.C3888e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.bugreporting.ReportBugActivity$f */
    /* compiled from: ReportBugActivity.kt */
    public static final class C3889f implements EmailListener {

        /* renamed from: a */
        final /* synthetic */ ReportBugActivity f10085a;

        C3889f(ReportBugActivity reportBugActivity) {
            this.f10085a = reportBugActivity;
        }

        public void onError(String str) {
            C13706o.m87929f(str, "errorMessage");
            C4878b.m18868g("Submit bug failed: " + str);
            C15626c.makeText(this.f10085a.getApplicationContext(), C17541R$string.submit_bug_upload_failed, 1).show();
            if (!this.f10085a.mo27315N1()) {
                this.f10085a.mo27488Z1().setVisibility(8);
            }
        }

        public void onSuccess() {
            C15626c.makeText(this.f10085a.getApplicationContext(), C17541R$string.bug_submitted_ok, 0).show();
            if (!this.f10085a.mo27315N1()) {
                this.f10085a.finish();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087 A[Catch:{ Exception -> 0x00dd }, LOOP:0: B:21:0x0081->B:23:0x0087, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: W1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m15137W1(kotlin.coroutines.C13635d<? super java.lang.String> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.arlosoft.macrodroid.bugreporting.ReportBugActivity.C3887d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.arlosoft.macrodroid.bugreporting.ReportBugActivity$d r0 = (com.arlosoft.macrodroid.bugreporting.ReportBugActivity.C3887d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.bugreporting.ReportBugActivity$d r0 = new com.arlosoft.macrodroid.bugreporting.ReportBugActivity$d
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.arlosoft.macrodroid.bugreporting.ReportBugActivity r0 = (com.arlosoft.macrodroid.bugreporting.ReportBugActivity) r0
            p297ja.C13332o.m85685b(r10)     // Catch:{ Exception -> 0x00dd }
            goto L_0x006c
        L_0x0032:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003a:
            p297ja.C13332o.m85685b(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dd }
            r10.<init>()     // Catch:{ Exception -> 0x00dd }
            java.io.File r2 = r9.getExternalFilesDir(r3)     // Catch:{ Exception -> 0x00dd }
            r10.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = "/SystemLog.txt"
            r10.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x00dd }
            com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r2 = r9.mo27490c2()     // Catch:{ Exception -> 0x00dd }
            com.arlosoft.macrodroid.database.room.s r2 = r2.mo28681g()     // Catch:{ Exception -> 0x00dd }
            com.arlosoft.macrodroid.database.room.i r5 = com.arlosoft.macrodroid.database.room.C4403i.DEBUG     // Catch:{ Exception -> 0x00dd }
            r0.L$0 = r9     // Catch:{ Exception -> 0x00dd }
            r0.L$1 = r10     // Catch:{ Exception -> 0x00dd }
            r0.label = r4     // Catch:{ Exception -> 0x00dd }
            java.lang.Object r0 = r2.mo28777b(r5, r0)     // Catch:{ Exception -> 0x00dd }
            if (r0 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r1 = r10
            r10 = r0
            r0 = r9
        L_0x006c:
            java.util.List r10 = (java.util.List) r10     // Catch:{ Exception -> 0x00dd }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x00dd }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00dd }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x00dd }
            r5.<init>(r1)     // Catch:{ Exception -> 0x00dd }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00dd }
            r2.<init>(r4)     // Catch:{ Exception -> 0x00dd }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x00dd }
        L_0x0081:
            boolean r4 = r10.hasNext()     // Catch:{ Exception -> 0x00dd }
            if (r4 == 0) goto L_0x00d9
            java.lang.Object r4 = r10.next()     // Catch:{ Exception -> 0x00dd }
            com.arlosoft.macrodroid.database.room.SystemLogEntry r4 = (com.arlosoft.macrodroid.database.room.SystemLogEntry) r4     // Catch:{ Exception -> 0x00dd }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dd }
            r5.<init>()     // Catch:{ Exception -> 0x00dd }
            java.text.SimpleDateFormat r6 = r0.f10078E     // Catch:{ Exception -> 0x00dd }
            long r7 = r4.mo28691g()     // Catch:{ Exception -> 0x00dd }
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.C13654b.m87835c(r7)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r6 = r6.format(r7)     // Catch:{ Exception -> 0x00dd }
            r5.append(r6)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r6 = " - "
            r5.append(r6)     // Catch:{ Exception -> 0x00dd }
            com.arlosoft.macrodroid.database.room.h r6 = r4.mo28683a()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r6 = r0.m15138a2(r6)     // Catch:{ Exception -> 0x00dd }
            r5.append(r6)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r6 = r4.mo28688e()     // Catch:{ Exception -> 0x00dd }
            r5.append(r6)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r4 = r0.m15139d2(r4)     // Catch:{ Exception -> 0x00dd }
            r5.append(r4)     // Catch:{ Exception -> 0x00dd }
            r4 = 10
            r5.append(r4)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00dd }
            java.nio.charset.Charset r5 = kotlin.text.C15147d.f64349b     // Catch:{ Exception -> 0x00dd }
            byte[] r4 = r4.getBytes(r5)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r5 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C13706o.m87928e(r4, r5)     // Catch:{ Exception -> 0x00dd }
            r2.write(r4)     // Catch:{ Exception -> 0x00dd }
            goto L_0x0081
        L_0x00d9:
            r2.close()     // Catch:{ Exception -> 0x00dd }
            return r1
        L_0x00dd:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to output system log file: "
            r1.append(r2)
            java.lang.String r10 = r10.getMessage()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            p148q0.C8151a.m33873n(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.bugreporting.ReportBugActivity.m15137W1(kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: a2 */
    private final String m15138a2(C4402h hVar) {
        int i = C3886c.f10084a[hVar.ordinal()];
        return i != 1 ? i != 2 ? "" : "A: " : "T: ";
    }

    /* renamed from: d2 */
    private final String m15139d2(SystemLogEntry systemLogEntry) {
        String str = "";
        if (systemLogEntry.mo28690f() != 0) {
            if (C4934n.m18998M().mo29682Q(systemLogEntry.mo28690f()) != null) {
                Macro Q = C4934n.m18998M().mo29682Q(systemLogEntry.mo28690f());
                String name = Q != null ? Q.getName() : null;
                if (name != null) {
                    str = name;
                }
                return " (" + str + ')';
            }
        } else if (systemLogEntry.mo28694i() != null) {
            return " (<a href=\"" + systemLogEntry.mo28694i() + "\">" + systemLogEntry.mo28694i() + "</a>)";
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public final File m15140f2() throws Exception {
        String v = C4064u.m16048t().mo27995v();
        if (v == null) {
            return null;
        }
        File file = new File(getFilesDir(), "variables.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bytes = v.getBytes(C15147d.f64349b);
            C13706o.m87928e(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            return file;
        } finally {
            fileOutputStream.close();
        }
    }

    /* renamed from: i2 */
    private final void m15141i2(String str, List<? extends Macro> list, ArrayList<Uri> arrayList) {
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93730b(), (C15486m0) null, new C3888e(this, str, list, arrayList, (C13635d<? super C3888e>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final void m15142j2(String str, List<? extends Macro> list) {
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        for (Macro macro : list) {
            String s = C10283c.m40413c().mo64006e(Macro.class, new C4921g(getApplicationContext(), true, true, true)).mo64006e(ActionBlock.class, new C4921g(getApplicationContext(), true, true, true)).mo64004c().mo63984s(macro);
            String name = macro.getName();
            C13706o.m87928e(name, "macro.name");
            C13706o.m87928e(s, "json");
            byte[] bytes = s.getBytes(C15147d.f64349b);
            C13706o.m87928e(bytes, "this as java.lang.String).getBytes(charset)");
            arrayList.add(new SparkPostFile("text/plain", new C15159j("[\\\\/:*?\"<>|]").mo74469d(C15176v.m93629D(name, ' ', '_', false, 4, (Object) null), HelpFormatter.DEFAULT_OPT_PREFIX) + ".macro", Base64.m72635b(bytes)));
        }
        List<String> b = C4043o.m15937b(this);
        StringBuilder sb = new StringBuilder();
        if (b != null) {
            for (String append : b) {
                sb.append(append);
            }
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "stringBuilder.toString()");
        Charset charset = C15147d.f64349b;
        byte[] bytes2 = sb2.getBytes(charset);
        C13706o.m87928e(bytes2, "this as java.lang.String).getBytes(charset)");
        arrayList.add(new SparkPostFile("text/html", "MacroDroidLog.txt", Base64.m72635b(bytes2)));
        String v = C4064u.m16048t().mo27995v();
        if (v != null) {
            byte[] bytes3 = v.getBytes(charset);
            C13706o.m87928e(bytes3, "this as java.lang.String).getBytes(charset)");
            arrayList.add(new SparkPostFile("text/html", "Variables.txt", Base64.m72635b(bytes3)));
        }
        String a = C4660g.m18123a("D/NWBiug1Nkcs0NvDDo2HUdZ+Kp+WkyiaMsY63gBZtF7j7iWc7lRl5hGk9kqzGo9");
        SparkPostRecipient sparkPostRecipient = new SparkPostRecipient("arlosoftmacrodroid@gmail.com");
        BugReport bugReport = this.f10077D;
        C13706o.m87926c(bugReport);
        if (!TextUtils.isEmpty(bugReport.mo27503c())) {
            BugReport bugReport2 = this.f10077D;
            C13706o.m87926c(bugReport2);
            str2 = bugReport2.mo27503c();
        } else {
            str2 = "Anonymous";
        }
        SparkPostSender sparkPostSender = new SparkPostSender("support@macrodroid.com", str2);
        BugReport bugReport3 = this.f10077D;
        C13706o.m87926c(bugReport3);
        if (!TextUtils.isEmpty(bugReport3.mo27503c())) {
            BugReport bugReport4 = this.f10077D;
            C13706o.m87926c(bugReport4);
            str3 = bugReport4.mo27503c();
        } else {
            str3 = "noreply@macrodroid.com";
        }
        SparkPostEmailUtil.sendEmail((Context) this, a, "Bug Report", str, sparkPostRecipient, sparkPostSender, str, (ArrayList<SparkPostFile>) arrayList, str3, (EmailListener) new C3889f(this));
    }

    /* renamed from: X1 */
    public final void mo27486X1(String str, ArrayList<Uri> arrayList) {
        C13706o.m87929f(arrayList, "screenshotUris");
        mo27492g2().setCurrentItem(mo27492g2().getCurrentItem() + 1);
        BugReport bugReport = this.f10077D;
        C13706o.m87926c(bugReport);
        bugReport.mo27511j(str);
        BugReport bugReport2 = this.f10077D;
        C13706o.m87926c(bugReport2);
        bugReport2.mo27515n(arrayList);
    }

    /* renamed from: Y1 */
    public final C4915a mo27487Y1() {
        C4915a aVar = this.f10074A;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("actionBlockStore");
        return null;
    }

    /* renamed from: Z1 */
    public final ViewGroup mo27488Z1() {
        ViewGroup viewGroup = this.loadingView;
        if (viewGroup != null) {
            return viewGroup;
        }
        C13706o.m87945v("loadingView");
        return null;
    }

    /* renamed from: b2 */
    public final C4083b mo27489b2() {
        C4083b bVar = this.f10081z;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: c2 */
    public final MacroDroidRoomDatabase mo27490c2() {
        MacroDroidRoomDatabase macroDroidRoomDatabase = this.f10080s;
        if (macroDroidRoomDatabase != null) {
            return macroDroidRoomDatabase;
        }
        C13706o.m87945v("roomDatabase");
        return null;
    }

    /* renamed from: e2 */
    public final C4900q mo27491e2() {
        C4900q qVar = this.f10075B;
        if (qVar != null) {
            return qVar;
        }
        C13706o.m87945v("systemLogHelper");
        return null;
    }

    /* renamed from: g2 */
    public final ViewPager mo27492g2() {
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        C13706o.m87945v("viewPager");
        return null;
    }

    /* renamed from: h2 */
    public final void mo27493h2(List<? extends Macro> list) {
        mo27492g2().setCurrentItem(mo27492g2().getCurrentItem() + 1);
        BugReport bugReport = this.f10077D;
        C13706o.m87926c(bugReport);
        bugReport.mo27514m(list);
    }

    /* renamed from: k2 */
    public final void mo27494k2(String str) {
        BugReport bugReport = this.f10077D;
        C13706o.m87926c(bugReport);
        bugReport.mo27512k(str);
        BugReport bugReport2 = this.f10077D;
        C13706o.m87926c(bugReport2);
        bugReport2.mo27513l(C5163j2.m20040Q(this));
        View currentFocus = getCurrentFocus();
        boolean z = false;
        if (currentFocus != null) {
            Object systemService = getSystemService("input_method");
            C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        mo27488Z1().setVisibility(0);
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(Build.MANUFACTURER);
        sb.append(' ');
        sb.append(C15804b.m95366f());
        sb.append(" - ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("], ");
        BugReport bugReport3 = this.f10077D;
        C13706o.m87926c(bugReport3);
        sb.append(bugReport3.mo27501a());
        BugReport bugReport4 = this.f10077D;
        C13706o.m87926c(bugReport4);
        String str2 = "";
        sb.append(bugReport4.mo27509h() ? " Pro" : str2);
        BugReport bugReport5 = this.f10077D;
        C13706o.m87926c(bugReport5);
        sb.append(bugReport5.mo27508g() ? " (Pirate)" : str2);
        BugReport bugReport6 = this.f10077D;
        C13706o.m87926c(bugReport6);
        if (bugReport6.mo27510i()) {
            str2 = " (Root)";
        }
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("\r\n\r\n");
        BugReport bugReport7 = this.f10077D;
        C13706o.m87926c(bugReport7);
        sb3.append(bugReport7.mo27502b());
        String sb4 = sb3.toString();
        BugReport bugReport8 = this.f10077D;
        C13706o.m87926c(bugReport8);
        if (bugReport8.mo27504d() == null) {
            sb4 = sb4 + "\r\n\r\n(Google account unknown)";
        } else {
            BugReport bugReport9 = this.f10077D;
            C13706o.m87926c(bugReport9);
            String d = bugReport9.mo27504d();
            BugReport bugReport10 = this.f10077D;
            C13706o.m87926c(bugReport10);
            if (!C13706o.m87924a(d, bugReport10.mo27503c())) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append("\r\n\r\nGoogle account = ");
                BugReport bugReport11 = this.f10077D;
                C13706o.m87926c(bugReport11);
                sb5.append(bugReport11.mo27504d());
                sb4 = sb5.toString();
            }
        }
        if (mo27489b2().mo28009e().mo28008a()) {
            String e1 = C5163j2.m20144e1(this);
            if (e1 != null) {
                sb4 = sb4 + "\r\n\r\nOrder id = " + e1;
            } else if (C5163j2.m20233p2(this) != null) {
                sb4 = sb4 + "\r\n\r\nSerial = " + e1;
            } else {
                sb4 = sb4 + "\r\n\r\nPurchase Info Unknown";
            }
        }
        if (Settings.Global.getInt(getContentResolver(), "always_finish_activities", 0) != 0) {
            sb4 = sb4 + "\r\n\r\nDon't keep activities enabled";
        }
        if (Build.VERSION.SDK_INT >= 23) {
            Object systemService2 = getSystemService("power");
            C13706o.m87927d(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
            sb4 = sb4 + "\r\n\r\nBattery optimization disabled: " + ((PowerManager) systemService2).isIgnoringBatteryOptimizations(getPackageName());
        }
        try {
            int i = Settings.Secure.getInt(getContentResolver(), "location_mode");
            StringBuilder sb6 = new StringBuilder();
            sb6.append(sb4);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("\r\n\r\nLocation services: ");
            sb7.append(i != 0 ? i != 1 ? i != 2 ? "High Accuracy" : "Battery Saving" : "Sensors Only" : "Off");
            sb6.append(C15167o.m93614f(sb7.toString()));
            sb4 = sb6.toString();
        } catch (Settings.SettingNotFoundException unused) {
        }
        boolean z2 = ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        StringBuilder sb8 = new StringBuilder();
        sb8.append(sb4);
        sb8.append("\r\nCoarse location permission: ");
        String str3 = "Enabled";
        sb8.append(z2 ? str3 : "Disabled");
        String sb9 = sb8.toString();
        if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            z = true;
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(sb9);
        sb10.append("\r\nFine location permission: ");
        if (!z) {
            str3 = "Disabled";
        }
        sb10.append(str3);
        StringBuilder sb11 = new StringBuilder();
        sb11.append(((sb10.toString() + "\r\nAccessibility enabled: " + C4061t1.m15992f0(this)) + "\r\nUI Interaction accessibility enabled: " + C4061t1.m15996h0(this)) + "\r\nVolume button accessibility enabled: " + C4061t1.m15994g0(this));
        sb11.append("\r\nNotification service enabled: ");
        Object systemService3 = getSystemService("notification");
        C13706o.m87927d(systemService3, "null cannot be cast to non-null type android.app.NotificationManager");
        sb11.append(((NotificationManager) systemService3).isNotificationPolicyAccessGranted());
        String sb12 = sb11.toString();
        String e = C4031k.m15905e();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(sb12);
        sb13.append("\r\nHelper File: ");
        if (e == null) {
            e = "Not installed";
        }
        sb13.append(e);
        String sb14 = sb13.toString();
        if (!NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            sb14 = sb14 + "\r\nNotifications are disabled for MacroDroid.";
        }
        if (!C4031k.m15913m()) {
            sb14 = sb14 + "\r\n\r\nGoogle Play Store is not installed";
        }
        BugReport bugReport12 = this.f10077D;
        C13706o.m87926c(bugReport12);
        List<Macro> e2 = bugReport12.mo27506e();
        C13706o.m87928e(e2, "bugReport!!.macroList");
        BugReport bugReport13 = this.f10077D;
        C13706o.m87926c(bugReport13);
        m15141i2(sb14 + "\r\n\r\nId: " + C5163j2.m20174i(this), e2, bugReport13.mo27507f());
    }

    public void onBackPressed() {
        if (mo27492g2().getCurrentItem() > 0) {
            mo27492g2().setCurrentItem(mo27492g2().getCurrentItem() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_report_bug);
        ButterKnife.bind((Activity) this);
        setTitle(C17541R$string.report_a_bug);
        this.f10076C = C4934n.m18998M().mo29710z().size() > 0;
        try {
            str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            C13706o.m87928e(str, "{\n            val pkg = … 0).versionName\n        }");
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        if (bundle != null) {
            this.f10077D = (BugReport) bundle.getParcelable("bug_report_data");
        } else {
            BugReport bugReport = new BugReport(str, C4917c.m18992a(this), C8164a.m33886a(), mo27489b2().mo28009e().mo28008a());
            this.f10077D = bugReport;
            C13706o.m87926c(bugReport);
            bugReport.mo27514m(new ArrayList());
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C13706o.m87928e(supportFragmentManager, "this.supportFragmentManager");
        BugReport bugReport2 = this.f10077D;
        C13706o.m87926c(bugReport2);
        mo27492g2().setAdapter(new C3885b(this, supportFragmentManager, bugReport2));
        mo27492g2().setOffscreenPageLimit(3);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C13706o.m87929f(bundle, "outState");
        bundle.putParcelable("bug_report_data", this.f10077D);
        super.onSaveInstanceState(bundle);
    }
}
