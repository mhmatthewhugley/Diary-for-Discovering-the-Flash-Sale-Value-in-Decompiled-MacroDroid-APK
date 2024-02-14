package com.arlosoft.macrodroid.plugins;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.plugins.api.UploadPluginBody;
import com.arlosoft.macrodroid.plugins.data.AppBrainPackageInfo;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.utils.C6388h1;
import com.twofortyfouram.locale.sdk.host.api.PluginRegistry;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p118k2.C7470a;
import p118k2.C7471b;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.plugins.h */
/* compiled from: PluginsViewModel.kt */
public final class C5012h extends ViewModel {

    /* renamed from: i */
    public static final C5013a f12595i = new C5013a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final List<String> f12596j = C13614t.m87751m("84603.643puiug6j4qnrja6vaf1", "983510.h4klnfj3vg5gu0ney8e2d");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7471b f12597a;

    /* renamed from: b */
    private final C7470a f12598b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5527g f12599c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f12600d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final List<String> f12601e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f12602f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f12603g;

    /* renamed from: h */
    private final C6388h1<C5014b> f12604h = new C6388h1<>();

    /* renamed from: com.arlosoft.macrodroid.plugins.h$a */
    /* compiled from: PluginsViewModel.kt */
    public static final class C5013a {
        private C5013a() {
        }

        public /* synthetic */ C5013a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final List<String> mo29890a() {
            return C5012h.f12596j;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.h$b */
    /* compiled from: PluginsViewModel.kt */
    public static abstract class C5014b {

        /* renamed from: com.arlosoft.macrodroid.plugins.h$b$a */
        /* compiled from: PluginsViewModel.kt */
        public static final class C5015a extends C5014b {

            /* renamed from: a */
            public static final C5015a f12605a = new C5015a();

            private C5015a() {
                super((C13695i) null);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.h$b$b */
        /* compiled from: PluginsViewModel.kt */
        public static final class C5016b extends C5014b {

            /* renamed from: a */
            public static final C5016b f12606a = new C5016b();

            private C5016b() {
                super((C13695i) null);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.h$b$c */
        /* compiled from: PluginsViewModel.kt */
        public static final class C5017c extends C5014b {

            /* renamed from: a */
            private final String f12607a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5017c(String str) {
                super((C13695i) null);
                C13706o.m87929f(str, "packageName");
                this.f12607a = str;
            }

            /* renamed from: a */
            public final String mo29891a() {
                return this.f12607a;
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.h$b$d */
        /* compiled from: PluginsViewModel.kt */
        public static final class C5018d extends C5014b {

            /* renamed from: a */
            private final AppBrainPackageInfo f12608a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5018d(AppBrainPackageInfo appBrainPackageInfo) {
                super((C13695i) null);
                C13706o.m87929f(appBrainPackageInfo, "packageInfo");
                this.f12608a = appBrainPackageInfo;
            }

            /* renamed from: a */
            public final AppBrainPackageInfo mo29892a() {
                return this.f12608a;
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.h$b$e */
        /* compiled from: PluginsViewModel.kt */
        public static final class C5019e extends C5014b {

            /* renamed from: a */
            public static final C5019e f12609a = new C5019e();

            private C5019e() {
                super((C13695i) null);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.h$b$f */
        /* compiled from: PluginsViewModel.kt */
        public static final class C5020f extends C5014b {

            /* renamed from: a */
            private final List<C4013g> f12610a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5020f(List<? extends C4013g> list) {
                super((C13695i) null);
                C13706o.m87929f(list, "appInfoList");
                this.f12610a = list;
            }

            /* renamed from: a */
            public final List<C4013g> mo29893a() {
                return this.f12610a;
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.h$b$g */
        /* compiled from: PluginsViewModel.kt */
        public static final class C5021g extends C5014b {

            /* renamed from: a */
            private final String f12611a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5021g(String str) {
                super((C13695i) null);
                C13706o.m87929f(str, "pluginName");
                this.f12611a = str;
            }

            /* renamed from: a */
            public final String mo29894a() {
                return this.f12611a;
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.h$b$h */
        /* compiled from: PluginsViewModel.kt */
        public static final class C5022h extends C5014b {

            /* renamed from: a */
            private final C5023c f12612a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5022h(C5023c cVar) {
                super((C13695i) null);
                C13706o.m87929f(cVar, "uploadFailReason");
                this.f12612a = cVar;
            }

            /* renamed from: a */
            public final C5023c mo29895a() {
                return this.f12612a;
            }
        }

        private C5014b() {
        }

        public /* synthetic */ C5014b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.h$c */
    /* compiled from: PluginsViewModel.kt */
    public enum C5023c {
        CONNECTION_ERROR,
        ALREADY_EXISTS,
        USER_NOT_ALLOWED
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.h$d */
    /* compiled from: PluginsViewModel.kt */
    static final class C5024d extends C13656d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C5012h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5024d(C5012h hVar, C13635d<? super C5024d> dVar) {
            super(dVar);
            this.this$0 = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m19418q((String) null, this);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.h$e */
    /* compiled from: PluginsViewModel.kt */
    static final class C5025e extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C5012h this$0;

        /* renamed from: com.arlosoft.macrodroid.plugins.h$e$a */
        /* compiled from: Comparisons.kt */
        public static final class C5026a<T> implements Comparator {
            public final int compare(T t, T t2) {
                return C15612b.m94865a(((C4013g) t).f10396a, ((C4013g) t2).f10396a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5025e(C5012h hVar, C13635d<? super C5025e> dVar) {
            super(2, dVar);
            this.this$0 = hVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5025e(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5025e) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                Map<String, Plugin> pluginMap = PluginRegistry.getInstance(this.this$0.f12600d).getPluginMap(PluginType.SETTING);
                C13706o.m87928e(pluginMap, "getInstance(context).get…inMap(PluginType.SETTING)");
                Map<String, Plugin> pluginMap2 = PluginRegistry.getInstance(this.this$0.f12600d).getPluginMap(PluginType.CONDITION);
                C13706o.m87928e(pluginMap2, "getInstance(context).get…Map(PluginType.CONDITION)");
                Map<String, Plugin> pluginMap3 = PluginRegistry.getInstance(this.this$0.f12600d).getPluginMap(PluginType.EVENT);
                C13706o.m87928e(pluginMap3, "getInstance(context).get…uginMap(PluginType.EVENT)");
                PackageManager packageManager = this.this$0.f12600d.getPackageManager();
                List<Plugin> q0 = C13566b0.m87442q0(C13566b0.m87442q0(pluginMap.values(), pluginMap2.values()), pluginMap3.values());
                ArrayList arrayList = new ArrayList(C13616u.m87774u(q0, 10));
                for (Plugin packageName : q0) {
                    arrayList.add(packageName.getPackageName());
                }
                List P = C13566b0.m87415P(arrayList);
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.CREATE_SHORTCUT"), 0);
                C13706o.m87928e(queryIntentActivities, "packageManager.queryInte…ion.CREATE_SHORTCUT\"), 0)");
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(queryIntentActivities, 10));
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    arrayList2.add(resolveInfo.activityInfo.packageName);
                }
                List<String> P2 = C13566b0.m87415P(C13566b0.m87442q0(P, C13566b0.m87415P(arrayList2)));
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : P2) {
                    C4013g gVar = new C4013g();
                    gVar.f10397b = str2;
                    try {
                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str2, 0);
                        C13706o.m87928e(applicationInfo, "packageManager.getApplicationInfo(pkg, 0)");
                        str = packageManager.getApplicationLabel(applicationInfo).toString();
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = null;
                    }
                    gVar.f10396a = str;
                    if (str != null) {
                        arrayList3.add(gVar);
                    }
                }
                this.this$0.mo29886t().postValue(new C5014b.C5020f(C13566b0.m87450y0(arrayList3, new C5026a())));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.h$f */
    /* compiled from: PluginsViewModel.kt */
    static final class C5027f extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ String $packageName;
        int I$0;
        int I$1;
        int label;
        final /* synthetic */ C5012h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5027f(C5012h hVar, String str, C13635d<? super C5027f> dVar) {
            super(2, dVar);
            this.this$0 = hVar;
            this.$packageName = str;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5027f(this.this$0, this.$packageName, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5027f) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:59:0x014e, code lost:
            if (r6 == 0) goto L_0x0150;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0109  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x010b  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x012a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r11.label
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x002f
                if (r1 == r4) goto L_0x002b
                if (r1 != r2) goto L_0x0023
                int r1 = r11.I$1
                int r5 = r11.I$0
                p297ja.C13332o.m85685b(r12)     // Catch:{ Exception -> 0x001c }
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r11
                goto L_0x00c8
            L_0x001c:
                r12 = move-exception
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r11
                goto L_0x00eb
            L_0x0023:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x002b:
                p297ja.C13332o.m85685b(r12)
                goto L_0x008f
            L_0x002f:
                p297ja.C13332o.m85685b(r12)
                com.arlosoft.macrodroid.plugins.h r12 = r11.this$0
                boolean r12 = r12.f12603g
                if (r12 == 0) goto L_0x004c
                com.arlosoft.macrodroid.plugins.h r12 = r11.this$0
                com.arlosoft.macrodroid.utils.h1 r12 = r12.mo29886t()
                com.arlosoft.macrodroid.plugins.h$b$h r0 = new com.arlosoft.macrodroid.plugins.h$b$h
                com.arlosoft.macrodroid.plugins.h$c r1 = com.arlosoft.macrodroid.plugins.C5012h.C5023c.USER_NOT_ALLOWED
                r0.<init>(r1)
                r12.postValue(r0)
                goto L_0x0150
            L_0x004c:
                com.arlosoft.macrodroid.plugins.h r12 = r11.this$0
                java.util.List r12 = r12.f12601e
                java.lang.String r1 = r11.$packageName
                boolean r12 = r12.contains(r1)
                if (r12 == 0) goto L_0x006c
                com.arlosoft.macrodroid.plugins.h r12 = r11.this$0
                com.arlosoft.macrodroid.utils.h1 r12 = r12.mo29886t()
                com.arlosoft.macrodroid.plugins.h$b$c r0 = new com.arlosoft.macrodroid.plugins.h$b$c
                java.lang.String r1 = r11.$packageName
                r0.<init>(r1)
                r12.postValue(r0)
                goto L_0x0150
            L_0x006c:
                com.arlosoft.macrodroid.plugins.h r12 = r11.this$0
                int r12 = r12.f12602f
                r1 = 5
                if (r12 < r1) goto L_0x0082
                com.arlosoft.macrodroid.plugins.h r12 = r11.this$0
                com.arlosoft.macrodroid.utils.h1 r12 = r12.mo29886t()
                com.arlosoft.macrodroid.plugins.h$b$b r0 = com.arlosoft.macrodroid.plugins.C5012h.C5014b.C5016b.f12606a
                r12.postValue(r0)
                goto L_0x0150
            L_0x0082:
                com.arlosoft.macrodroid.plugins.h r12 = r11.this$0
                java.lang.String r1 = r11.$packageName
                r11.label = r4
                java.lang.Object r12 = r12.m19418q(r1, r11)
                if (r12 != r0) goto L_0x008f
                return r0
            L_0x008f:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L_0x0150
                com.arlosoft.macrodroid.plugins.h r12 = r11.this$0
                int r1 = r12.f12602f
                int r1 = r1 + r4
                r12.f12602f = r1
                r12 = r11
            L_0x00a2:
                p148q0.C8151a.m33866g(r3)     // Catch:{ Exception -> 0x00e4 }
                com.arlosoft.macrodroid.plugins.h r1 = r12.this$0     // Catch:{ Exception -> 0x00e4 }
                com.arlosoft.macrodroid.plugins.h$a r5 = com.arlosoft.macrodroid.plugins.C5012h.f12595i     // Catch:{ Exception -> 0x00e4 }
                java.util.List r5 = r5.mo29890a()     // Catch:{ Exception -> 0x00e4 }
                java.lang.Object r5 = r5.get(r3)     // Catch:{ Exception -> 0x00e4 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00e4 }
                java.lang.String r6 = r12.$packageName     // Catch:{ Exception -> 0x00e4 }
                r12.I$0 = r3     // Catch:{ Exception -> 0x00e4 }
                r12.I$1 = r3     // Catch:{ Exception -> 0x00e4 }
                r12.label = r2     // Catch:{ Exception -> 0x00e4 }
                java.lang.Object r1 = r1.m19419r(r5, r6, r12)     // Catch:{ Exception -> 0x00e4 }
                if (r1 != r0) goto L_0x00c2
                return r0
            L_0x00c2:
                r5 = 0
                r6 = 0
                r10 = r0
                r0 = r12
                r12 = r1
                r1 = r10
            L_0x00c8:
                com.arlosoft.macrodroid.plugins.data.AppBrainPackageInfo r12 = (com.arlosoft.macrodroid.plugins.data.AppBrainPackageInfo) r12     // Catch:{ Exception -> 0x00e2 }
                com.arlosoft.macrodroid.plugins.h r7 = r0.this$0     // Catch:{ Exception -> 0x00e2 }
                com.arlosoft.macrodroid.utils.h1 r7 = r7.mo29886t()     // Catch:{ Exception -> 0x00e2 }
                com.arlosoft.macrodroid.plugins.h$b$d r8 = new com.arlosoft.macrodroid.plugins.h$b$d     // Catch:{ Exception -> 0x00e2 }
                r8.<init>(r12)     // Catch:{ Exception -> 0x00e2 }
                r7.postValue(r8)     // Catch:{ Exception -> 0x00e2 }
                com.arlosoft.macrodroid.plugins.h r12 = r0.this$0     // Catch:{ Exception -> 0x00e2 }
                r12.f12602f = r3     // Catch:{ Exception -> 0x00e2 }
                r12 = r0
                r0 = r1
                r6 = 0
                goto L_0x014e
            L_0x00e2:
                r12 = move-exception
                goto L_0x00eb
            L_0x00e4:
                r1 = move-exception
                r5 = 0
                r6 = 0
                r10 = r0
                r0 = r12
                r12 = r1
                r1 = r10
            L_0x00eb:
                boolean r7 = r12 instanceof retrofit2.HttpException
                if (r7 == 0) goto L_0x00fc
                r8 = r12
                retrofit2.HttpException r8 = (retrofit2.HttpException) r8
                int r8 = r8.mo80527a()
                r9 = 400(0x190, float:5.6E-43)
                if (r8 != r9) goto L_0x00fc
                r8 = 1
                goto L_0x00fd
            L_0x00fc:
                r8 = 0
            L_0x00fd:
                if (r7 == 0) goto L_0x010b
                retrofit2.HttpException r12 = (retrofit2.HttpException) r12
                int r12 = r12.mo80527a()
                r7 = 429(0x1ad, float:6.01E-43)
                if (r12 != r7) goto L_0x010b
                r12 = 1
                goto L_0x010c
            L_0x010b:
                r12 = 0
            L_0x010c:
                if (r8 == 0) goto L_0x012a
                com.arlosoft.macrodroid.plugins.h r12 = r0.this$0
                java.util.List r12 = r12.f12601e
                java.lang.String r5 = r0.$packageName
                r12.add(r5)
                com.arlosoft.macrodroid.plugins.h r12 = r0.this$0
                com.arlosoft.macrodroid.utils.h1 r12 = r12.mo29886t()
                com.arlosoft.macrodroid.plugins.h$b$c r5 = new com.arlosoft.macrodroid.plugins.h$b$c
                java.lang.String r7 = r0.$packageName
                r5.<init>(r7)
                r12.postValue(r5)
                goto L_0x014c
            L_0x012a:
                if (r12 == 0) goto L_0x0141
                int r5 = r5 + r4
                com.arlosoft.macrodroid.plugins.h$a r12 = com.arlosoft.macrodroid.plugins.C5012h.f12595i
                java.util.List r12 = r12.mo29890a()
                int r12 = r12.size()
                if (r5 >= r12) goto L_0x013d
                r12 = r0
                r0 = r1
                r6 = 1
                goto L_0x014e
            L_0x013d:
                p148q0.C8151a.m33867h()
                goto L_0x014c
            L_0x0141:
                com.arlosoft.macrodroid.plugins.h r12 = r0.this$0
                com.arlosoft.macrodroid.utils.h1 r12 = r12.mo29886t()
                com.arlosoft.macrodroid.plugins.h$b$a r5 = com.arlosoft.macrodroid.plugins.C5012h.C5014b.C5015a.f12605a
                r12.postValue(r5)
            L_0x014c:
                r12 = r0
                r0 = r1
            L_0x014e:
                if (r6 != 0) goto L_0x00a2
            L_0x0150:
                ja.u r12 = p297ja.C13339u.f61331a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.plugins.C5012h.C5027f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.h$g */
    /* compiled from: PluginsViewModel.kt */
    static final class C5028g extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ String $developerName;
        final /* synthetic */ String $downloadLink;
        final /* synthetic */ Drawable $drawable;
        final /* synthetic */ String $hash;
        final /* synthetic */ String $iconUrl;
        final /* synthetic */ String $name;
        final /* synthetic */ String $packageName;
        final /* synthetic */ String $shortDescription;
        final /* synthetic */ String $website;
        int label;
        final /* synthetic */ C5012h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5028g(Drawable drawable, C5012h hVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C13635d<? super C5028g> dVar) {
            super(2, dVar);
            this.$drawable = drawable;
            this.this$0 = hVar;
            this.$name = str;
            this.$developerName = str2;
            this.$shortDescription = str3;
            this.$packageName = str4;
            this.$downloadLink = str5;
            this.$iconUrl = str6;
            this.$website = str7;
            this.$hash = str8;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5028g(this.$drawable, this.this$0, this.$name, this.$developerName, this.$shortDescription, this.$packageName, this.$downloadLink, this.$iconUrl, this.$website, this.$hash, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5028g) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d A[Catch:{ Exception -> 0x001f }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a8 A[Catch:{ Exception -> 0x001f }, RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r14.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                p297ja.C13332o.m85685b(r15)     // Catch:{ Exception -> 0x001f }
                goto L_0x00a9
            L_0x0013:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x001b:
                p297ja.C13332o.m85685b(r15)     // Catch:{ Exception -> 0x001f }
                goto L_0x006f
            L_0x001f:
                r15 = move-exception
                goto L_0x00ba
            L_0x0022:
                p297ja.C13332o.m85685b(r15)
                r15 = 0
                android.graphics.drawable.Drawable r1 = r14.$drawable     // Catch:{ Exception -> 0x001f }
                if (r1 == 0) goto L_0x0071
                android.graphics.Bitmap r15 = com.arlosoft.macrodroid.utils.C6443v.m24755a(r1)     // Catch:{ Exception -> 0x001f }
                java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x001f }
                r1.<init>()     // Catch:{ Exception -> 0x001f }
                android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x001f }
                r5 = 100
                r15.compress(r4, r5, r1)     // Catch:{ Exception -> 0x001f }
                byte[] r8 = r1.toByteArray()     // Catch:{ Exception -> 0x001f }
                okhttp3.c0$a r6 = okhttp3.C15907c0.f65424a     // Catch:{ Exception -> 0x001f }
                okhttp3.x$a r15 = okhttp3.C15995x.f65817g     // Catch:{ Exception -> 0x001f }
                java.lang.String r1 = "image/*"
                okhttp3.x r7 = r15.mo76320b(r1)     // Catch:{ Exception -> 0x001f }
                java.lang.String r15 = "bitmapBytes"
                kotlin.jvm.internal.C13706o.m87928e(r8, r15)     // Catch:{ Exception -> 0x001f }
                r9 = 0
                r10 = 0
                r11 = 12
                r12 = 0
                okhttp3.c0 r15 = okhttp3.C15907c0.C15908a.m95950i(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x001f }
                okhttp3.y$c$a r1 = okhttp3.C15997y.C16000c.f65839c     // Catch:{ Exception -> 0x001f }
                java.lang.String r4 = "upload"
                java.lang.String r5 = "icon"
                okhttp3.y$c r15 = r1.mo76330b(r4, r5, r15)     // Catch:{ Exception -> 0x001f }
                com.arlosoft.macrodroid.plugins.h r1 = r14.this$0     // Catch:{ Exception -> 0x001f }
                k2.b r1 = r1.f12597a     // Catch:{ Exception -> 0x001f }
                r14.label = r3     // Catch:{ Exception -> 0x001f }
                java.lang.Object r15 = r1.mo37631f(r15, r14)     // Catch:{ Exception -> 0x001f }
                if (r15 != r0) goto L_0x006f
                return r0
            L_0x006f:
                java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x001f }
            L_0x0071:
                com.arlosoft.macrodroid.plugins.api.UploadPluginBody r1 = new com.arlosoft.macrodroid.plugins.api.UploadPluginBody     // Catch:{ Exception -> 0x001f }
                com.arlosoft.macrodroid.plugins.h r4 = r14.this$0     // Catch:{ Exception -> 0x001f }
                com.arlosoft.macrodroid.templatestore.ui.user.g r4 = r4.f12599c     // Catch:{ Exception -> 0x001f }
                com.arlosoft.macrodroid.templatestore.model.User r4 = r4.mo30790b()     // Catch:{ Exception -> 0x001f }
                int r5 = r4.getUserId()     // Catch:{ Exception -> 0x001f }
                java.lang.String r6 = r14.$name     // Catch:{ Exception -> 0x001f }
                java.lang.String r7 = r14.$developerName     // Catch:{ Exception -> 0x001f }
                java.lang.String r8 = r14.$shortDescription     // Catch:{ Exception -> 0x001f }
                java.lang.String r9 = r14.$packageName     // Catch:{ Exception -> 0x001f }
                java.lang.String r10 = r14.$downloadLink     // Catch:{ Exception -> 0x001f }
                if (r15 != 0) goto L_0x008f
                java.lang.String r15 = r14.$iconUrl     // Catch:{ Exception -> 0x001f }
            L_0x008f:
                r11 = r15
                java.lang.String r12 = r14.$website     // Catch:{ Exception -> 0x001f }
                java.lang.String r13 = "en"
                r4 = r1
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x001f }
                com.arlosoft.macrodroid.plugins.h r15 = r14.this$0     // Catch:{ Exception -> 0x001f }
                k2.b r15 = r15.f12597a     // Catch:{ Exception -> 0x001f }
                java.lang.String r4 = r14.$hash     // Catch:{ Exception -> 0x001f }
                r14.label = r2     // Catch:{ Exception -> 0x001f }
                java.lang.Object r15 = r15.mo37632g(r4, r1, r14)     // Catch:{ Exception -> 0x001f }
                if (r15 != r0) goto L_0x00a9
                return r0
            L_0x00a9:
                com.arlosoft.macrodroid.plugins.h r15 = r14.this$0     // Catch:{ Exception -> 0x001f }
                com.arlosoft.macrodroid.utils.h1 r15 = r15.mo29886t()     // Catch:{ Exception -> 0x001f }
                com.arlosoft.macrodroid.plugins.h$b$g r0 = new com.arlosoft.macrodroid.plugins.h$b$g     // Catch:{ Exception -> 0x001f }
                java.lang.String r1 = r14.$name     // Catch:{ Exception -> 0x001f }
                r0.<init>(r1)     // Catch:{ Exception -> 0x001f }
                r15.postValue(r0)     // Catch:{ Exception -> 0x001f }
                goto L_0x0119
            L_0x00ba:
                boolean r0 = r15 instanceof retrofit2.HttpException
                r1 = 0
                if (r0 == 0) goto L_0x00cc
                r2 = r15
                retrofit2.HttpException r2 = (retrofit2.HttpException) r2
                int r2 = r2.mo80527a()
                r4 = 409(0x199, float:5.73E-43)
                if (r2 != r4) goto L_0x00cc
                r2 = 1
                goto L_0x00cd
            L_0x00cc:
                r2 = 0
            L_0x00cd:
                if (r0 == 0) goto L_0x00db
                r0 = r15
                retrofit2.HttpException r0 = (retrofit2.HttpException) r0
                int r0 = r0.mo80527a()
                r4 = 403(0x193, float:5.65E-43)
                if (r0 != r4) goto L_0x00db
                r1 = 1
            L_0x00db:
                if (r2 == 0) goto L_0x00ee
                com.arlosoft.macrodroid.plugins.h r15 = r14.this$0
                com.arlosoft.macrodroid.utils.h1 r15 = r15.mo29886t()
                com.arlosoft.macrodroid.plugins.h$b$h r0 = new com.arlosoft.macrodroid.plugins.h$b$h
                com.arlosoft.macrodroid.plugins.h$c r1 = com.arlosoft.macrodroid.plugins.C5012h.C5023c.ALREADY_EXISTS
                r0.<init>(r1)
                r15.postValue(r0)
                goto L_0x0119
            L_0x00ee:
                if (r1 == 0) goto L_0x0106
                com.arlosoft.macrodroid.plugins.h r15 = r14.this$0
                r15.f12603g = r3
                com.arlosoft.macrodroid.plugins.h r15 = r14.this$0
                com.arlosoft.macrodroid.utils.h1 r15 = r15.mo29886t()
                com.arlosoft.macrodroid.plugins.h$b$h r0 = new com.arlosoft.macrodroid.plugins.h$b$h
                com.arlosoft.macrodroid.plugins.h$c r1 = com.arlosoft.macrodroid.plugins.C5012h.C5023c.USER_NOT_ALLOWED
                r0.<init>(r1)
                r15.postValue(r0)
                goto L_0x0119
            L_0x0106:
                com.arlosoft.macrodroid.plugins.h r0 = r14.this$0
                com.arlosoft.macrodroid.utils.h1 r0 = r0.mo29886t()
                com.arlosoft.macrodroid.plugins.h$b$h r1 = new com.arlosoft.macrodroid.plugins.h$b$h
                com.arlosoft.macrodroid.plugins.h$c r2 = com.arlosoft.macrodroid.plugins.C5012h.C5023c.CONNECTION_ERROR
                r1.<init>(r2)
                r0.postValue(r1)
                p455ag.C17105a.m100582d(r15)
            L_0x0119:
                ja.u r15 = p297ja.C13339u.f61331a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.plugins.C5012h.C5028g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C5012h(C7471b bVar, C7470a aVar, C5527g gVar, Context context) {
        C13706o.m87929f(bVar, "pluginListApi");
        C13706o.m87929f(aVar, "appBrainApi");
        C13706o.m87929f(gVar, "userProvider");
        C13706o.m87929f(context, "context");
        this.f12597a = bVar;
        this.f12598b = aVar;
        this.f12599c = gVar;
        this.f12600d = context;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m19418q(java.lang.String r5, kotlin.coroutines.C13635d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.arlosoft.macrodroid.plugins.C5012h.C5024d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.arlosoft.macrodroid.plugins.h$d r0 = (com.arlosoft.macrodroid.plugins.C5012h.C5024d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.plugins.h$d r0 = new com.arlosoft.macrodroid.plugins.h$d
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.L$0
            com.arlosoft.macrodroid.plugins.h r5 = (com.arlosoft.macrodroid.plugins.C5012h) r5
            p297ja.C13332o.m85685b(r6)     // Catch:{ Exception -> 0x002d }
            goto L_0x0048
        L_0x002d:
            r6 = move-exception
            goto L_0x004f
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            p297ja.C13332o.m85685b(r6)
            k2.b r6 = r4.f12597a     // Catch:{ Exception -> 0x004d }
            r0.L$0 = r4     // Catch:{ Exception -> 0x004d }
            r0.label = r3     // Catch:{ Exception -> 0x004d }
            java.lang.Object r5 = r6.mo37635j(r5, r0)     // Catch:{ Exception -> 0x004d }
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r5 = r4
        L_0x0048:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C13654b.m87833a(r3)     // Catch:{ Exception -> 0x002d }
            return r5
        L_0x004d:
            r6 = move-exception
            r5 = r4
        L_0x004f:
            boolean r0 = r6 instanceof retrofit2.HttpException
            r1 = 0
            if (r0 == 0) goto L_0x005f
            retrofit2.HttpException r6 = (retrofit2.HttpException) r6
            int r6 = r6.mo80527a()
            r0 = 403(0x193, float:5.65E-43)
            if (r6 != r0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            if (r3 == 0) goto L_0x006f
            com.arlosoft.macrodroid.utils.h1<com.arlosoft.macrodroid.plugins.h$b> r5 = r5.f12604h
            com.arlosoft.macrodroid.plugins.h$b$h r6 = new com.arlosoft.macrodroid.plugins.h$b$h
            com.arlosoft.macrodroid.plugins.h$c r0 = com.arlosoft.macrodroid.plugins.C5012h.C5023c.ALREADY_EXISTS
            r6.<init>(r0)
            r5.postValue(r6)
            goto L_0x0076
        L_0x006f:
            com.arlosoft.macrodroid.utils.h1<com.arlosoft.macrodroid.plugins.h$b> r5 = r5.f12604h
            com.arlosoft.macrodroid.plugins.h$b$a r6 = com.arlosoft.macrodroid.plugins.C5012h.C5014b.C5015a.f12605a
            r5.postValue(r6)
        L_0x0076:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C13654b.m87833a(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.plugins.C5012h.m19418q(java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final Object m19419r(String str, String str2, C13635d<? super AppBrainPackageInfo> dVar) {
        return this.f12598b.mo37625a(str, str2, dVar);
    }

    /* renamed from: s */
    public final void mo29885s() {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5025e(this, (C13635d<? super C5025e>) null), 2, (Object) null);
    }

    /* renamed from: t */
    public final C6388h1<C5014b> mo29886t() {
        return this.f12604h;
    }

    /* renamed from: u */
    public final void mo29887u() {
        this.f12603g = false;
    }

    /* renamed from: v */
    public final void mo29888v(String str) {
        C13706o.m87929f(str, "packageName");
        this.f12604h.postValue(C5014b.C5019e.f12609a);
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5027f(this, str, (C13635d<? super C5027f>) null), 2, (Object) null);
    }

    /* renamed from: w */
    public final void mo29889w(String str, String str2, String str3, String str4, String str5, String str6, String str7, Drawable drawable) {
        String str8 = str2;
        String str9 = str4;
        C13706o.m87929f(str, "packageName");
        C13706o.m87929f(str8, "name");
        C13706o.m87929f(str3, "developerName");
        C13706o.m87929f(str9, "shortDescription");
        C13706o.m87929f(str5, "website");
        C13706o.m87929f(str6, "downloadLink");
        String g = C4660g.m18129g(str9 + str8 + "adb97ac6-f780-4a41-8475-ce661b574999" + this.f12599c.mo30790b().getUserId());
        new UploadPluginBody(this.f12599c.mo30790b().getUserId(), str2, str3, str4, str, str6, str7, str5, "en");
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5028g(drawable, this, str2, str3, str4, str, str6, str7, str5, g, (C13635d<? super C5028g>) null), 2, (Object) null);
    }
}
