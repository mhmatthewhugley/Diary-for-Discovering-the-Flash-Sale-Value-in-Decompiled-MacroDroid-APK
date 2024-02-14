package com.arlosoft.macrodroid.macro;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.documentfile.provider.DocumentFile;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.autobackup.worker.AutoBackupCloudWorker;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.celltowers.C3932l;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.data.ExportData;
import com.arlosoft.macrodroid.data.HomeScreenTileConfig;
import com.arlosoft.macrodroid.data.UserIconData;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.geofences.GeofenceStore;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.quicksettings.QuickSettingsData;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.AndroidWearTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6362a0;
import com.arlosoft.macrodroid.utils.C6375e;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p106i2.C7396b;
import p148q0.C8151a;
import p149q1.C8152a;
import p172u1.C10283c;
import p183w2.C10330a;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.macro.n */
/* compiled from: MacroStore */
public class C4934n implements C4915a {

    /* renamed from: h */
    private static ExecutorService f12394h = Executors.newSingleThreadExecutor();

    /* renamed from: i */
    private static List<Macro> f12395i;

    /* renamed from: j */
    private static C4934n f12396j;

    /* renamed from: k */
    private static final Object f12397k = new Object();

    /* renamed from: a */
    private HashMap<Long, Macro> f12398a;

    /* renamed from: b */
    private HashMap<Long, Macro> f12399b;

    /* renamed from: c */
    private HashMap<Long, Macro> f12400c;

    /* renamed from: d */
    private boolean f12401d = false;

    /* renamed from: e */
    private final Object f12402e = new Object();

    /* renamed from: f */
    private final Context f12403f;

    /* renamed from: g */
    private C4083b f12404g;

    /* renamed from: com.arlosoft.macrodroid.macro.n$a */
    /* compiled from: MacroStore */
    class C4935a extends Thread {

        /* renamed from: a */
        final /* synthetic */ Macro f12405a;

        C4935a(Macro macro) {
            this.f12405a = macro;
        }

        public void run() {
            Iterator<Trigger> it = this.f12405a.getTriggerList().iterator();
            while (it.hasNext()) {
                for (Constraint U2 : it.next().mo27826J0()) {
                    U2.mo28113U2();
                }
            }
            Iterator<Action> it2 = this.f12405a.getActions().iterator();
            while (it2.hasNext()) {
                Action next = it2.next();
                next.mo24699c3();
                next.mo24691T2();
                for (Constraint U22 : next.mo27826J0()) {
                    U22.mo28113U2();
                }
            }
            for (Constraint U23 : this.f12405a.getConstraints()) {
                U23.mo28113U2();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macro.n$b */
    /* compiled from: MacroStore */
    class C4936b extends TypeToken<Collection<Macro>> {
        C4936b() {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macro.n$c */
    /* compiled from: MacroStore */
    class C4937c extends TypeToken<List<String>> {
        C4937c() {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macro.n$d */
    /* compiled from: MacroStore */
    class C4938d extends TypeToken<Collection<Macro>> {
        C4938d() {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macro.n$e */
    /* compiled from: MacroStore */
    class C4939e extends Thread {

        /* renamed from: a */
        final /* synthetic */ Macro f12410a;

        C4939e(Macro macro) {
            this.f12410a = macro;
        }

        public void run() {
            Iterator<Action> it = this.f12410a.getActions().iterator();
            while (it.hasNext()) {
                Action next = it.next();
                next.mo24699c3();
                next.mo24691T2();
                for (Constraint U2 : next.mo27826J0()) {
                    U2.mo28113U2();
                }
            }
        }
    }

    private C4934n(Context context) {
        this.f12403f = context;
        this.f12398a = new HashMap<>();
        this.f12399b = new HashMap<>();
        this.f12400c = new HashMap<>();
        this.f12404g = ((MacroDroidApplication) context).f9902p;
        if (!this.f12401d) {
            this.f12401d = true;
        }
    }

    /* renamed from: K */
    private ExportData m18997K(boolean z) {
        File[] listFiles;
        ExportData exportData = new ExportData();
        exportData.macroList = mo29673C();
        exportData.notificationButtonBarConfig = C5163j2.m20112a1(this.f12403f);
        exportData.notificationButtonBarIconTint = C5163j2.m20238q(this.f12403f);
        exportData.forceBlackBackground = C5163j2.m20230p(this.f12403f);
        exportData.drawerConfiguration = C5163j2.m20012M(this.f12403f);
        exportData.cellTowerGroups = C3932l.m15307e().mo27629b();
        exportData.cellTowersIgnore = C4373a.m17337i(this.f12403f).mo28640g();
        exportData.categoryList = (CategoryList) MacroDroidApplication.m14845u().mo27293q(Category.CATEGORY_CACHE).mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        exportData.geofenceData = (GeofenceStore) MacroDroidApplication.m14845u().mo27293q("GeofenceInfo").mo37133c("GeofenceInfo", GeofenceStore.class);
        exportData.quickSettingsData = (QuickSettingsData) MacroDroidApplication.m14845u().mo27293q(QuickSettingsData.QUICK_SETTINGS_CACHE).mo37133c(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, QuickSettingsData.class);
        exportData.stopWatches = C10330a.m40553e(this.f12403f);
        exportData.notificationChannelList = (C7396b) MacroDroidApplication.m14845u().mo27293q("NotificationChannels").mo37133c("NotificationChannels", C7396b.class);
        exportData.variables = C4064u.m16048t().mo27993r(true);
        exportData.homeScreenTileConfig = (HomeScreenTileConfig) MacroDroidApplication.m14845u().mo27293q("HomeScreenTiles").mo37133c("HomeScreenTiles", HomeScreenTileConfig.class);
        exportData.smtpServerConfig = C5163j2.m20121b2(this.f12403f);
        exportData.databaseHash = C5163j2.m19992J0(this.f12403f);
        exportData.quickRunMacroIds = C5163j2.m20272u1(this.f12403f);
        exportData.enableRootFeatures = C5163j2.m20304y1(this.f12403f);
        exportData.enableExperimentalFeatures = C5163j2.m20118b(this.f12403f);
        exportData.spokenTextAudioStream = C5163j2.m20137d2(this.f12403f);
        exportData.activityRecognitionUpdateRate = C5163j2.m20166h(this.f12403f);
        exportData.smsMonitorInbox = C5163j2.m20249r2(this.f12403f);
        exportData.widgetButtonVibrateOnPress = C5163j2.m20313z2(this.f12403f);
        exportData.wifiSSIDBackgroundScanRate = C5163j2.m19925A2(this.f12403f);
        exportData.cellTowerUpdateRate = C5163j2.m20286w(this.f12403f);
        exportData.cellTowerUseAlarm = C5163j2.m20294x(this.f12403f);
        exportData.locationUpdateRate = C5163j2.m19978H0(this.f12403f);
        exportData.shakeWorkWithScreenOff = C5163j2.m19932B1(this.f12403f);
        exportData.vibrateOnShake = C5163j2.m19948D1(this.f12403f);
        exportData.shakeSensitivity = C5163j2.m19940C1(this.f12403f);
        exportData.shakeDetectionRate = C5163j2.m19924A1(this.f12403f);
        exportData.flipWithScreenOff = C5163j2.m20089X(this.f12403f);
        exportData.vibrateOnFlip = C5163j2.m20096Y(this.f12403f);
        exportData.proximityWorkWithScreenOff = C5163j2.m20216n1(this.f12403f);
        exportData.weatherTriggerLocation = C5163j2.m20297x2(this.f12403f);
        exportData.weatherUpdateRate = C5163j2.m20305y2(this.f12403f);
        exportData.sunsetSunriseLocation = C5163j2.m20145e2(this.f12403f);
        exportData.lightSensorUpdateRate = C5163j2.m19939C0(this.f12403f);
        exportData.mediaButtonPassThroughUnhandled = C5163j2.m20069U0(this.f12403f);
        exportData.udpNotifyFailure = C5163j2.m20136d1(this.f12403f);
        exportData.deviceFacingConstraintWorkWithScreenOff = C5163j2.m19984I(this.f12403f);
        exportData.templateMacrosAutoTranslate = C5163j2.m20214n(this.f12403f);
        if (z) {
            File h = C6362a0.m24602h(this.f12403f);
            ArrayList arrayList = new ArrayList();
            if (h.exists() && (listFiles = h.listFiles()) != null) {
                for (File file : listFiles) {
                    UserIconData userIconData = new UserIconData();
                    Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                    if (decodeFile != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        decodeFile.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        userIconData.fileName = file.getName();
                        userIconData.data = Base64.encodeToString(byteArray, 0);
                        arrayList.add(userIconData);
                    }
                }
            }
            exportData.userIcons = arrayList;
        }
        return exportData;
    }

    /* renamed from: M */
    public static C4934n m18998M() {
        return m19000O(true);
    }

    /* renamed from: N */
    public static synchronized C4934n m18999N(Context context) {
        C4934n nVar;
        synchronized (C4934n.class) {
            if (f12396j == null) {
                f12396j = new C4934n(context);
                C4878b.m18879r("Reading JSON file on startup");
                f12396j.mo29689g0(false);
            }
            nVar = f12396j;
        }
        return nVar;
    }

    /* renamed from: O */
    public static synchronized C4934n m19000O(boolean z) {
        C4934n nVar;
        synchronized (C4934n.class) {
            if (f12396j == null) {
                f12396j = new C4934n(MacroDroidApplication.m14845u());
                if (z) {
                    C4878b.m18879r("Reading JSON file on startup");
                    f12396j.mo29689g0(false);
                }
            }
            nVar = f12396j;
        }
        return nVar;
    }

    @Nullable
    /* renamed from: P */
    public static synchronized C4934n m19001P() {
        C4934n nVar;
        synchronized (C4934n.class) {
            nVar = f12396j;
        }
        return nVar;
    }

    /* renamed from: V */
    private List<Macro> m19002V(String str, boolean z, boolean z2) {
        if (str.startsWith("{{")) {
            String substring = str.substring(2, str.indexOf("}}"));
            try {
                if (Integer.valueOf(substring).intValue() > this.f12403f.getPackageManager().getPackageInfo(this.f12403f.getPackageName(), 0).versionCode) {
                    C15626c.m94876a(this.f12403f.getApplicationContext(), "Cannot import file - it was exported from a later version of MacroDroid.\n\nPlease update this version of MacroDroid to the latest version.", 1).show();
                    return null;
                }
            } catch (PackageManager.NameNotFoundException e) {
                C8151a.m33873n(new RuntimeException("Failed to get version code when exporting: " + e.getMessage()));
            }
            str = str.substring(str.indexOf("}}") + 2);
        }
        Gson c = C10283c.m40413c().mo64006e(Macro.class, new C4921g(this.f12403f, z, true, z2)).mo64004c();
        if (str.startsWith("StopWatchesStart")) {
            try {
                C10330a.m40557i(this.f12403f, (List) c.mo63976j(str.substring(16, str.indexOf("StopWatchesEnd")), List.class));
            } catch (Exception e2) {
                C8151a.m33873n(new RuntimeException("Failed to import stop watches data: " + e2.toString()));
            }
            str = str.substring(str.indexOf("StopWatchesEnd") + 14);
        }
        if (str.startsWith("QuickSettingsStart")) {
            try {
                MacroDroidApplication.m14845u().mo27293q(QuickSettingsData.QUICK_SETTINGS_CACHE).mo37132b(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, (QuickSettingsData) c.mo63976j(str.substring(18, str.indexOf("QuickSettingsEnd")), QuickSettingsData.class));
            } catch (Exception e3) {
                C8151a.m33873n(new RuntimeException("Failed to import quick settings data: " + e3.toString()));
            }
            str = str.substring(str.indexOf("QuickSettingsEnd") + 16);
        }
        if (str.startsWith("GeofencesStart")) {
            try {
                MacroDroidApplication.m14845u().mo27293q("GeofenceInfo").mo37132b("GeofenceInfo", (GeofenceStore) c.mo63976j(str.substring(14, str.indexOf("GeofencesEnd")), GeofenceStore.class));
            } catch (Exception e4) {
                C8151a.m33873n(new RuntimeException("Failed to import geofence info: " + e4.toString()));
            }
            str = str.substring(str.indexOf("GeofencesEnd") + 12);
        }
        if (str.startsWith("CategoryInfoStart")) {
            try {
                CategoryList categoryList = (CategoryList) c.mo63976j(str.substring(17, str.indexOf("CategoryInfoEnd")), CategoryList.class);
                if (categoryList.getCategories() == null) {
                    categoryList = new CategoryList(new ArrayList());
                }
                MacroDroidApplication.m14845u().mo27293q(Category.CATEGORY_CACHE).mo37132b(Category.CATEGORIES_KEY, categoryList);
            } catch (Exception e5) {
                C8151a.m33873n(new RuntimeException("Failed to import categories info: " + e5.toString()));
            }
            str = str.substring(str.indexOf("CategoryInfoEnd") + 15);
        }
        if (str.startsWith("CellTowersIgnoreStart")) {
            String substring2 = str.substring(21, str.indexOf("CellTowersIgnoreEnd"));
            try {
                C4373a h = C4373a.m17336h();
                h.mo28636b();
                for (String v : (List) C10283c.m40413c().mo64004c().mo63977k(substring2, new C4937c().mo64307e())) {
                    h.mo28651v(v, true);
                }
            } catch (Exception e6) {
                C8151a.m33873n(new RuntimeException("Failed to import cell tower ignore groups: " + e6.toString()));
            }
            str = str.substring(str.indexOf("CellTowersIgnoreEnd") + 19);
        }
        if (str.startsWith("CellTowersStart")) {
            try {
                C3932l.m15307e().mo27632g(str.substring(15, str.indexOf("CellTowersEnd")));
                C3932l.m15307e().mo27633h();
            } catch (Exception e7) {
                C8151a.m33873n(new RuntimeException("Failed to import cell tower groups: " + e7.toString()));
            }
            str = str.substring(str.indexOf("CellTowersEnd") + 13);
        }
        if (str.startsWith("DrawerConfigStart")) {
            String substring3 = str.substring(17, str.indexOf("DrawerConfigEnd"));
            try {
                C5163j2.m19974G3(this.f12403f, (C8152a) C10283c.m40411a().mo63976j(substring3, C8152a.class));
            } catch (Exception e8) {
                C8151a.m33873n(new RuntimeException("Failed to import drawer configuration: " + e8.toString()));
            }
            str = str.substring(str.indexOf("DrawerConfigEnd") + 15);
        }
        if (str.startsWith("<<")) {
            try {
                C5163j2.m20243q4(this.f12403f, Integer.valueOf(str.substring(2, str.indexOf(">>"))).intValue());
            } catch (Exception e9) {
                C8151a.m33873n(new RuntimeException("Failed to get version code when exporting: " + e9.getMessage()));
            }
            str = str.substring(str.indexOf(">>") + 2);
        }
        if (str.startsWith("[[")) {
            try {
                C5163j2.m20038P4(MacroDroidApplication.m14845u(), str.substring(2, str.indexOf("]]")));
            } catch (Exception e10) {
                C8151a.m33873n(new RuntimeException("Failed to get version code when exporting: " + e10.toString()));
            }
            str = str.substring(str.indexOf("]]") + 2);
        }
        if (str.startsWith("((")) {
            try {
                String substring4 = str.substring(2, str.lastIndexOf("))["));
                if (substring4.length() > 0) {
                    C4064u.m16048t().mo27973C(substring4);
                    C4064u.m16048t().mo27974H();
                }
            } catch (Exception e11) {
                C8151a.m33873n(new RuntimeException("Failed to import variables from macro export: " + e11.toString()));
            }
            str = str.substring(str.lastIndexOf("))[") + 2);
        }
        List<Macro> list = (List) c.mo63977k(str, new C4938d().mo64307e());
        if (list == null) {
            list = new ArrayList<>();
        }
        int f0 = C5163j2.m20151f0(this.f12403f);
        if (!this.f12404g.mo28009e().mo28008a() && list.size() > f0) {
            list.subList(f0, list.size()).clear();
        }
        return list;
    }

    @Nullable
    /* renamed from: X */
    private List<Macro> m19003X(String str, boolean z) {
        int i = 0;
        List<Macro> list = (List) C10283c.m40413c().mo64006e(Macro.class, new C4921g(this.f12403f, z, false, false)).mo64004c().mo63977k(str, new C4936b().mo64307e());
        if (list == null) {
            return null;
        }
        int f0 = C5163j2.m20151f0(this.f12403f);
        if (!this.f12404g.mo28009e().mo28008a()) {
            int i2 = 0;
            for (Macro macro : list) {
                if (!macro.isActionBlock) {
                    i2++;
                }
            }
            if (i2 > 5) {
                ArrayList arrayList = new ArrayList();
                for (Macro next : list) {
                    if (next instanceof ActionBlock) {
                        arrayList.add(next);
                    } else if (i < f0) {
                        arrayList.add(next);
                        i++;
                    }
                }
                return arrayList;
            }
        }
        return list;
    }

    /* renamed from: Y */
    public static boolean m19004Y() {
        return f12396j != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public static /* synthetic */ int m19005Z(Locale locale, Macro macro, Macro macro2) {
        Collator instance = Collator.getInstance(locale);
        instance.setStrength(0);
        return instance.compare(macro.getName(), macro2.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public static /* synthetic */ int m19006a0(boolean z, Locale locale, Macro macro, Macro macro2) {
        if (z && macro.getIsFavourite() != macro2.getIsFavourite()) {
            return macro.getIsFavourite() ? -1 : 1;
        }
        Collator instance = Collator.getInstance(locale);
        instance.setStrength(0);
        return instance.compare(macro.getName(), macro2.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ int m19007b0(Macro macro, Macro macro2) {
        boolean z = macro.isActionBlock;
        if (z != macro2.isActionBlock) {
            return z ? 1 : -1;
        }
        Collator instance = Collator.getInstance(C5163j2.m19963F0(this.f12403f));
        instance.setStrength(0);
        return instance.compare(macro.getName(), macro2.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ int m19008c0(Macro macro, Macro macro2) {
        boolean z = macro.isActionBlock;
        if (z != macro2.isActionBlock) {
            return z ? 1 : -1;
        }
        Collator instance = Collator.getInstance(C5163j2.m19963F0(this.f12403f));
        instance.setStrength(0);
        return instance.compare(macro.getName(), macro2.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public static /* synthetic */ int m19009d0(Locale locale, Macro macro, Macro macro2) {
        Collator instance = Collator.getInstance(locale);
        instance.setStrength(0);
        return instance.compare(macro.getName(), macro2.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m19010e0() {
        mo29706v0("macros.json", false, false, true);
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:39|40|41|42|43|44|45|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2 = m19003X(r0.toString(), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c3, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0136 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m19011i0(java.lang.String r13, boolean r14, boolean r15) {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r15 == 0) goto L_0x000c
            java.lang.String r1 = "Loading Macros"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r1)
        L_0x000c:
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            java.lang.Object r4 = r12.f12402e     // Catch:{ FileNotFoundException -> 0x013a, Exception -> 0x00cc }
            monitor-enter(r4)     // Catch:{ FileNotFoundException -> 0x013a, Exception -> 0x00cc }
            if (r15 == 0) goto L_0x0029
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r5.<init>()     // Catch:{ all -> 0x00be }
            java.lang.String r6 = "Opening File: "
            r5.append(r6)     // Catch:{ all -> 0x00be }
            r5.append(r13)     // Catch:{ all -> 0x00be }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00be }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r5)     // Catch:{ all -> 0x00be }
        L_0x0029:
            com.arlosoft.macrodroid.app.MacroDroidApplication r5 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ all -> 0x00be }
            java.io.FileInputStream r5 = r5.openFileInput(r13)     // Catch:{ all -> 0x00be }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00c7 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r7.<init>()     // Catch:{ all -> 0x00c7 }
            com.arlosoft.macrodroid.app.MacroDroidApplication r8 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ all -> 0x00c7 }
            java.io.File r8 = r8.getFilesDir()     // Catch:{ all -> 0x00c7 }
            java.lang.String r8 = r8.getAbsolutePath()     // Catch:{ all -> 0x00c7 }
            r7.append(r8)     // Catch:{ all -> 0x00c7 }
            java.lang.String r8 = "/"
            r7.append(r8)     // Catch:{ all -> 0x00c7 }
            r7.append(r13)     // Catch:{ all -> 0x00c7 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00c7 }
            r6.<init>(r7)     // Catch:{ all -> 0x00c7 }
            boolean r7 = r6.exists()     // Catch:{ all -> 0x00c7 }
            if (r7 == 0) goto L_0x0076
            if (r15 == 0) goto L_0x0076
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r7.<init>()     // Catch:{ all -> 0x00c7 }
            java.lang.String r8 = "File Length is: "
            r7.append(r8)     // Catch:{ all -> 0x00c7 }
            long r8 = r6.length()     // Catch:{ all -> 0x00c7 }
            r7.append(r8)     // Catch:{ all -> 0x00c7 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00c7 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r6)     // Catch:{ all -> 0x00c7 }
        L_0x0076:
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x00c7 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x00c7 }
            java.lang.String r8 = "UTF-8"
            r7.<init>(r5, r8)     // Catch:{ all -> 0x00c7 }
            r6.<init>(r7)     // Catch:{ all -> 0x00c7 }
            r7 = 1024(0x400, float:1.435E-42)
            char[] r8 = new char[r7]     // Catch:{ all -> 0x00c7 }
            int r9 = r6.read(r8, r3, r7)     // Catch:{ all -> 0x00c7 }
            if (r15 == 0) goto L_0x00a0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r10.<init>()     // Catch:{ all -> 0x00c7 }
            java.lang.String r11 = "First Read Returned: "
            r10.append(r11)     // Catch:{ all -> 0x00c7 }
            r10.append(r9)     // Catch:{ all -> 0x00c7 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00c7 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r10)     // Catch:{ all -> 0x00c7 }
        L_0x00a0:
            if (r9 <= 0) goto L_0x00aa
            r0.append(r8, r3, r9)     // Catch:{ all -> 0x00c7 }
            int r9 = r6.read(r8, r3, r7)     // Catch:{ all -> 0x00c7 }
            goto L_0x00a0
        L_0x00aa:
            r6.close()     // Catch:{ all -> 0x00c7 }
            monitor-exit(r4)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = r0.toString()     // Catch:{ FileNotFoundException -> 0x00c5, Exception -> 0x00c2 }
            java.util.List r2 = r12.m19003X(r1, r14)     // Catch:{ FileNotFoundException -> 0x00c5, Exception -> 0x00c2 }
        L_0x00b6:
            r5.close()     // Catch:{ Exception -> 0x00bb }
            goto L_0x014a
        L_0x00bb:
            goto L_0x014a
        L_0x00be:
            r14 = move-exception
            r5 = r2
        L_0x00c0:
            monitor-exit(r4)     // Catch:{ all -> 0x00c7 }
            throw r14     // Catch:{ FileNotFoundException -> 0x00c5, Exception -> 0x00c2 }
        L_0x00c2:
            r14 = move-exception
            r2 = r5
            goto L_0x00cd
        L_0x00c5:
            goto L_0x013b
        L_0x00c7:
            r14 = move-exception
            goto L_0x00c0
        L_0x00c9:
            r13 = move-exception
            goto L_0x0146
        L_0x00cc:
            r14 = move-exception
        L_0x00cd:
            java.lang.String r15 = com.arlosoft.macrodroid.common.C4061t1.m15961I0(r14)     // Catch:{ all -> 0x00c9 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00c9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r4.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r5 = "Failed to import "
            r4.append(r5)     // Catch:{ all -> 0x00c9 }
            r4.append(r13)     // Catch:{ all -> 0x00c9 }
            java.lang.String r13 = " : "
            r4.append(r13)     // Catch:{ all -> 0x00c9 }
            java.lang.String r13 = r14.getMessage()     // Catch:{ all -> 0x00c9 }
            r4.append(r13)     // Catch:{ all -> 0x00c9 }
            r13 = 200(0xc8, float:2.8E-43)
            int r5 = r15.length()     // Catch:{ all -> 0x00c9 }
            int r13 = java.lang.Math.max(r13, r5)     // Catch:{ all -> 0x00c9 }
            java.lang.String r13 = r15.substring(r3, r13)     // Catch:{ all -> 0x00c9 }
            r4.append(r13)     // Catch:{ all -> 0x00c9 }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x00c9 }
            r0.<init>(r13)     // Catch:{ all -> 0x00c9 }
            p148q0.C8151a.m33873n(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r13.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r15 = "Failed to load macro file: "
            r13.append(r15)     // Catch:{ all -> 0x00c9 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x00c9 }
            r13.append(r14)     // Catch:{ all -> 0x00c9 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00c9 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r13)     // Catch:{ all -> 0x00c9 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r13.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r14 = "File contents: "
            r13.append(r14)     // Catch:{ all -> 0x00c9 }
            r13.append(r1)     // Catch:{ all -> 0x00c9 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00c9 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r13)     // Catch:{ all -> 0x00c9 }
            r2.close()     // Catch:{ Exception -> 0x0136 }
        L_0x0136:
            r2.close()     // Catch:{ Exception -> 0x0139 }
        L_0x0139:
            return r3
        L_0x013a:
            r5 = r2
        L_0x013b:
            if (r15 == 0) goto L_0x00b6
            java.lang.String r13 = "No MacroDroid data file found"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18873l(r13)     // Catch:{ all -> 0x0144 }
            goto L_0x00b6
        L_0x0144:
            r13 = move-exception
            r2 = r5
        L_0x0146:
            r2.close()     // Catch:{ Exception -> 0x0149 }
        L_0x0149:
            throw r13
        L_0x014a:
            if (r2 != 0) goto L_0x014d
            return r3
        L_0x014d:
            r12.mo29693m0(r2)
            android.content.Context r13 = r12.f12403f
            java.util.Set r13 = com.arlosoft.macrodroid.settings.C5163j2.m19991J(r13)
            java.util.Iterator r14 = r2.iterator()
        L_0x015a:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x01b3
            java.lang.Object r15 = r14.next()
            com.arlosoft.macrodroid.macro.Macro r15 = (com.arlosoft.macrodroid.macro.Macro) r15
            java.lang.String r0 = r15.getCategory()
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x01ab
            boolean r0 = r15.getEnabledStateDuringLoad()     // Catch:{ Exception -> 0x0178 }
            r15.setEnabled(r0)     // Catch:{ Exception -> 0x0178 }
            goto L_0x015a
        L_0x0178:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not enable macro: "
            r1.append(r2)
            java.lang.String r2 = r15.getName()
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            java.lang.String r2 = r0.toString()
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r1)
            p148q0.C8151a.m33873n(r0)
            r15.setEnabled(r3)     // Catch:{ Exception -> 0x01a9 }
            goto L_0x015a
        L_0x01a9:
            goto L_0x015a
        L_0x01ab:
            boolean r0 = r15.getEnabledStateDuringLoad()
            r15.setEnabledFlag(r0)
            goto L_0x015a
        L_0x01b3:
            r13 = 1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.macro.C4934n.m19011i0(java.lang.String, boolean, boolean):boolean");
    }

    /* renamed from: l0 */
    public static void m19014l0() {
        synchronized (f12397k) {
            f12395i = null;
        }
    }

    /* renamed from: u */
    private String m19019u(String str) {
        return ("((" + C4064u.m16048t().mo27994u() + "))") + str;
    }

    /* renamed from: v */
    private void m19020v(Iterator<Macro> it) {
        while (it.hasNext()) {
            Macro next = it.next();
            if (next.isActionBlock) {
                new C4939e(next).start();
                it.remove();
            }
        }
    }

    /* renamed from: A */
    public List<Macro> mo29671A(Macro macro, boolean z) {
        List<Macro> B = mo29672B(z);
        Iterator<Macro> it = B.iterator();
        while (it.hasNext()) {
            if (it.next().getGUID() == macro.getGUID()) {
                it.remove();
            }
        }
        return B;
    }

    /* renamed from: B */
    public List<Macro> mo29672B(boolean z) {
        List<Macro> z2;
        synchronized (f12397k) {
            z2 = mo29710z();
            if (z2.size() > 0) {
                Collections.sort(z2, new C4933m(z, C5163j2.m19963F0(this.f12403f)));
            }
        }
        return z2;
    }

    /* renamed from: C */
    public List<Macro> mo29673C() {
        ArrayList arrayList = new ArrayList();
        synchronized (f12397k) {
            for (Macro next : this.f12398a.values()) {
                if (next.isCompleted()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    public List<Macro> mo29674D() {
        ArrayList arrayList = new ArrayList();
        synchronized (f12397k) {
            for (Macro next : this.f12398a.values()) {
                if (next.isCompleted()) {
                    arrayList.add(next);
                }
            }
            Collections.sort(arrayList, new C4929i(this));
        }
        return arrayList;
    }

    /* renamed from: E */
    public List<Macro> mo29675E() {
        ArrayList arrayList = new ArrayList();
        synchronized (f12397k) {
            for (Macro next : this.f12398a.values()) {
                if (!next.isActionBlock) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public List<Macro> mo29676F() {
        ArrayList arrayList = new ArrayList();
        synchronized (f12397k) {
            for (Macro add : this.f12398a.values()) {
                arrayList.add(add);
            }
            Collections.sort(arrayList, new C4930j(this));
        }
        return arrayList;
    }

    /* renamed from: G */
    public HashMap<String, List<Macro>> mo29677G() {
        HashMap<String, List<Macro>> hashMap = new HashMap<>();
        for (Macro next : m18998M().mo29672B(false)) {
            String category = next.getCategory();
            if (category == null) {
                category = this.f12403f.getString(C17541R$string.uncategorized);
            }
            List list = hashMap.get(category);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(category, list);
            }
            list.add(next);
        }
        return hashMap;
    }

    /* renamed from: H */
    public HashMap<String, List<Macro>> mo29678H() {
        HashMap<String, List<Macro>> hashMap = new HashMap<>();
        for (Macro next : m18998M().mo29681L()) {
            String category = next.getCategory();
            if (category == null) {
                category = this.f12403f.getString(C17541R$string.uncategorized);
            }
            List list = hashMap.get(category);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(category, list);
            }
            list.add(next);
        }
        return hashMap;
    }

    /* renamed from: I */
    public List<Macro> mo29679I() {
        List<Macro> list;
        synchronized (f12397k) {
            if (f12395i == null) {
                f12395i = new ArrayList();
                Set<String> J = C5163j2.m19991J(this.f12403f);
                for (Macro next : this.f12398a.values()) {
                    if (next.isCompleted() && next.isEnabled() && !next.isActionBlock && !J.contains(next.getCategory())) {
                        f12395i.add(next);
                    }
                }
            }
            list = f12395i;
        }
        return list;
    }

    /* renamed from: J */
    public List<Macro> mo29680J() {
        ArrayList arrayList;
        synchronized (f12397k) {
            arrayList = new ArrayList();
            Set<String> J = C5163j2.m19991J(this.f12403f);
            for (Macro next : this.f12398a.values()) {
                if (next.isCompleted() && next.isEnabled() && !J.contains(next.getCategory())) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: L */
    public List<Macro> mo29681L() {
        ArrayList arrayList = new ArrayList();
        synchronized (f12397k) {
            for (Macro next : this.f12398a.values()) {
                if (!next.isActionBlock && next.isCompleted() && next.getIsFavourite()) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() > 0) {
                Collections.sort(arrayList, new C4931k(C5163j2.m19963F0(this.f12403f)));
            }
        }
        return arrayList;
    }

    /* renamed from: Q */
    public Macro mo29682Q(long j) {
        Macro macro;
        synchronized (f12397k) {
            macro = this.f12398a.get(Long.valueOf(j));
            if (macro == null) {
                macro = this.f12399b.get(Long.valueOf(j));
            }
            if (macro == null) {
                macro = this.f12400c.get(Long.valueOf(j));
            }
        }
        return macro;
    }

    @Nullable
    /* renamed from: R */
    public Macro mo29683R(int i) {
        Macro macro;
        synchronized (f12397k) {
            Iterator<Macro> it = this.f12398a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    macro = null;
                    break;
                }
                macro = it.next();
                if (macro.getId() == i) {
                    break;
                }
            }
            if (macro == null) {
                Iterator<Macro> it2 = this.f12399b.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Macro next = it2.next();
                    if (next.getId() == i) {
                        macro = next;
                        break;
                    }
                }
            }
            if (macro == null) {
                Iterator<Macro> it3 = this.f12400c.values().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Macro next2 = it3.next();
                    if (next2.getId() == i) {
                        macro = next2;
                        break;
                    }
                }
            }
        }
        return macro;
    }

    /* renamed from: S */
    public Macro mo29684S(String str) {
        Macro macro;
        Iterator<Macro> it = this.f12398a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                macro = null;
                break;
            }
            macro = it.next();
            if (macro.getName().equals(str)) {
                break;
            }
        }
        if (macro == null) {
            Iterator<Macro> it2 = this.f12399b.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Macro next = it2.next();
                if (next.getName().equals(str)) {
                    macro = next;
                    break;
                }
            }
        }
        if (macro != null) {
            return macro;
        }
        for (Macro next2 : this.f12400c.values()) {
            if (next2.getName().equals(str)) {
                return next2;
            }
        }
        return macro;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List<com.arlosoft.macrodroid.macro.Macro>] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = mo29686U(r0.toString(), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
        r14 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.arlosoft.macrodroid.macro.Macro> mo29685T(java.lang.String r13, boolean r14) {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Import Macro List"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r1)
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            java.lang.Object r4 = r12.f12402e     // Catch:{ FileNotFoundException -> 0x0128, Exception -> 0x00bf, all -> 0x00bc }
            monitor-enter(r4)     // Catch:{ FileNotFoundException -> 0x0128, Exception -> 0x00bf, all -> 0x00bc }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x00b4 }
            r5.<init>(r13)     // Catch:{ all -> 0x00b4 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            com.arlosoft.macrodroid.app.MacroDroidApplication r8 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ all -> 0x00ba }
            java.io.File r8 = r8.getFilesDir()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r8.getAbsolutePath()     // Catch:{ all -> 0x00ba }
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "/"
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r13)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ba }
            r6.<init>(r7)     // Catch:{ all -> 0x00ba }
            boolean r7 = r6.exists()     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x0059
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "File Length is: "
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            long r8 = r6.length()     // Catch:{ all -> 0x00ba }
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00ba }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r6)     // Catch:{ all -> 0x00ba }
        L_0x0059:
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x00ba }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "UTF-8"
            r7.<init>(r5, r8)     // Catch:{ all -> 0x00ba }
            r6.<init>(r7)     // Catch:{ all -> 0x00ba }
            r7 = 1024(0x400, float:1.435E-42)
            char[] r8 = new char[r7]     // Catch:{ all -> 0x00ba }
            int r9 = r6.read(r8, r3, r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r11 = "First Read Returned: "
            r10.append(r11)     // Catch:{ all -> 0x00ba }
            r10.append(r9)     // Catch:{ all -> 0x00ba }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00ba }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r10)     // Catch:{ all -> 0x00ba }
        L_0x0081:
            if (r9 <= 0) goto L_0x008b
            r0.append(r8, r3, r9)     // Catch:{ all -> 0x00ba }
            int r9 = r6.read(r8, r3, r7)     // Catch:{ all -> 0x00ba }
            goto L_0x0081
        L_0x008b:
            r6.close()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r6.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "READ FILE - LENGTH = "
            r6.append(r7)     // Catch:{ all -> 0x00ba }
            int r7 = r0.length()     // Catch:{ all -> 0x00ba }
            r6.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ba }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r6)     // Catch:{ all -> 0x00ba }
            monitor-exit(r4)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = r0.toString()     // Catch:{ FileNotFoundException -> 0x0129, Exception -> 0x00b8 }
            java.util.List r2 = r12.mo29686U(r1, r14)     // Catch:{ FileNotFoundException -> 0x0129, Exception -> 0x00b8 }
        L_0x00af:
            r5.close()     // Catch:{ Exception -> 0x0137 }
            goto L_0x0137
        L_0x00b4:
            r14 = move-exception
            r5 = r2
        L_0x00b6:
            monitor-exit(r4)     // Catch:{ all -> 0x00ba }
            throw r14     // Catch:{ FileNotFoundException -> 0x0129, Exception -> 0x00b8 }
        L_0x00b8:
            r14 = move-exception
            goto L_0x00c1
        L_0x00ba:
            r14 = move-exception
            goto L_0x00b6
        L_0x00bc:
            r13 = move-exception
            goto L_0x013a
        L_0x00bf:
            r14 = move-exception
            r5 = r2
        L_0x00c1:
            java.lang.String r0 = com.arlosoft.macrodroid.common.C4061t1.m15961I0(r14)     // Catch:{ all -> 0x0138 }
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r6.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r7 = "Failed to import "
            r6.append(r7)     // Catch:{ all -> 0x0138 }
            r6.append(r13)     // Catch:{ all -> 0x0138 }
            java.lang.String r13 = " : "
            r6.append(r13)     // Catch:{ all -> 0x0138 }
            java.lang.String r13 = r14.getMessage()     // Catch:{ all -> 0x0138 }
            r6.append(r13)     // Catch:{ all -> 0x0138 }
            r13 = 200(0xc8, float:2.8E-43)
            int r7 = r0.length()     // Catch:{ all -> 0x0138 }
            int r13 = java.lang.Math.max(r13, r7)     // Catch:{ all -> 0x0138 }
            java.lang.String r13 = r0.substring(r3, r13)     // Catch:{ all -> 0x0138 }
            r6.append(r13)     // Catch:{ all -> 0x0138 }
            java.lang.String r13 = r6.toString()     // Catch:{ all -> 0x0138 }
            r4.<init>(r13)     // Catch:{ all -> 0x0138 }
            p148q0.C8151a.m33873n(r4)     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r13.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "Failed to import macro file: "
            r13.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x0138 }
            r13.append(r14)     // Catch:{ all -> 0x0138 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0138 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r13)     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r13.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r14 = "File contents: "
            r13.append(r14)     // Catch:{ all -> 0x0138 }
            r13.append(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0138 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r13)     // Catch:{ all -> 0x0138 }
            goto L_0x00af
        L_0x0128:
            r5 = r2
        L_0x0129:
            java.lang.String r13 = "No MacroDroid data file found"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r13)     // Catch:{ all -> 0x0138 }
            java.lang.String r13 = "MacroStore"
            java.lang.String r14 = "No MacroDroid data file found"
            android.util.Log.w(r13, r14)     // Catch:{ all -> 0x0138 }
            goto L_0x00af
        L_0x0137:
            return r2
        L_0x0138:
            r13 = move-exception
            r2 = r5
        L_0x013a:
            r2.close()     // Catch:{ Exception -> 0x013d }
        L_0x013d:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.macro.C4934n.mo29685T(java.lang.String, boolean):java.util.List");
    }

    /* renamed from: U */
    public List<Macro> mo29686U(String str, boolean z) {
        if (str.startsWith("[")) {
            return m19003X(str, true);
        }
        if (str.startsWith("{{")) {
            return m19002V(str, true, z);
        }
        return mo29687W(str, true, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0250 A[SYNTHETIC, Splitter:B:103:0x0250] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x025b A[SYNTHETIC, Splitter:B:108:0x025b] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01f9 A[SYNTHETIC] */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.arlosoft.macrodroid.macro.Macro> mo29687W(java.lang.String r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            com.arlosoft.macrodroid.app.MacroDroidApplication r0 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            com.google.gson.GsonBuilder r1 = p172u1.C10283c.m40413c()
            java.lang.Class<com.arlosoft.macrodroid.macro.Macro> r2 = com.arlosoft.macrodroid.macro.Macro.class
            com.arlosoft.macrodroid.macro.g r3 = new com.arlosoft.macrodroid.macro.g
            android.content.Context r4 = r7.f12403f
            r5 = 0
            r3.<init>(r4, r9, r5, r10)
            com.google.gson.GsonBuilder r9 = r1.mo64006e(r2, r3)
            com.google.gson.Gson r9 = r9.mo64004c()
            java.lang.Class<com.arlosoft.macrodroid.data.ExportData> r1 = com.arlosoft.macrodroid.data.ExportData.class
            java.lang.Object r8 = r9.mo63976j(r8, r1)
            com.arlosoft.macrodroid.data.ExportData r8 = (com.arlosoft.macrodroid.data.ExportData) r8
            int r9 = r8.notificationButtonBarIconTint
            r1 = -1
            if (r9 == 0) goto L_0x002b
            com.arlosoft.macrodroid.settings.C5163j2.m20234p3(r0, r9)
            goto L_0x0049
        L_0x002b:
            android.content.res.Resources r9 = r0.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            int r9 = r9.uiMode
            r9 = r9 & 48
            r2 = 32
            if (r9 == r2) goto L_0x0045
            boolean r9 = com.arlosoft.macrodroid.settings.C5163j2.m20230p(r0)
            if (r9 == 0) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0046
        L_0x0045:
            r9 = -1
        L_0x0046:
            com.arlosoft.macrodroid.settings.C5163j2.m20234p3(r0, r9)
        L_0x0049:
            boolean r9 = r8.forceBlackBackground
            com.arlosoft.macrodroid.settings.C5163j2.m20226o3(r0, r9)
            java.lang.String r9 = r8.notificationButtonBarConfig
            r2 = 1
            if (r9 == 0) goto L_0x0080
            com.arlosoft.macrodroid.settings.C5163j2.m20038P4(r0, r9)
            java.util.List r9 = com.arlosoft.macrodroid.settings.C5163j2.m20120b1(r0)
            int r3 = r9.size()
            if (r3 <= 0) goto L_0x0080
            java.util.Iterator r9 = r9.iterator()
        L_0x0064:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r9.next()
            com.arlosoft.macrodroid.common.NotificationButton r3 = (com.arlosoft.macrodroid.common.NotificationButton) r3
            int r3 = r3.mo27791a()
            int r1 = java.lang.Math.max(r3, r1)
            goto L_0x0064
        L_0x0079:
            int r1 = r1 + r2
            com.arlosoft.macrodroid.settings.C5163j2.m20243q4(r0, r1)
            com.arlosoft.macrodroid.MacroDroidService.m9502g(r0, r2)
        L_0x0080:
            com.arlosoft.macrodroid.geofences.GeofenceStore r9 = r8.geofenceData
            if (r9 == 0) goto L_0x008b
            android.content.Context r9 = r7.f12403f
            q1.a r1 = r8.drawerConfiguration
            com.arlosoft.macrodroid.settings.C5163j2.m19974G3(r9, r1)
        L_0x008b:
            java.util.List<n1.a> r9 = r8.cellTowerGroups
            if (r9 == 0) goto L_0x009f
            com.arlosoft.macrodroid.celltowers.l r9 = com.arlosoft.macrodroid.celltowers.C3932l.m15307e()
            java.util.List<n1.a> r1 = r8.cellTowerGroups
            r9.mo27635j(r1)
            com.arlosoft.macrodroid.celltowers.l r9 = com.arlosoft.macrodroid.celltowers.C3932l.m15307e()
            r9.mo27633h()
        L_0x009f:
            java.util.List<java.lang.String> r9 = r8.cellTowersIgnore
            if (r9 == 0) goto L_0x00c0
            com.arlosoft.macrodroid.database.a r9 = com.arlosoft.macrodroid.database.C4373a.m17336h()
            r9.mo28636b()
            java.util.List<java.lang.String> r1 = r8.cellTowersIgnore
            java.util.Iterator r1 = r1.iterator()
        L_0x00b0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00c0
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r9.mo28651v(r3, r2)
            goto L_0x00b0
        L_0x00c0:
            com.arlosoft.macrodroid.categories.CategoryList r9 = r8.categoryList
            if (r9 == 0) goto L_0x00d5
            com.arlosoft.macrodroid.app.MacroDroidApplication r9 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.lang.String r1 = "Categories"
            e1.a r9 = r9.mo27293q(r1)
            com.arlosoft.macrodroid.categories.CategoryList r1 = r8.categoryList
            java.lang.String r2 = "CategoryList"
            r9.mo37132b(r2, r1)
        L_0x00d5:
            com.arlosoft.macrodroid.geofences.GeofenceStore r9 = r8.geofenceData
            if (r9 == 0) goto L_0x00e8
            com.arlosoft.macrodroid.app.MacroDroidApplication r9 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.lang.String r1 = "GeofenceInfo"
            e1.a r9 = r9.mo27293q(r1)
            com.arlosoft.macrodroid.geofences.GeofenceStore r2 = r8.geofenceData
            r9.mo37132b(r1, r2)
        L_0x00e8:
            com.arlosoft.macrodroid.quicksettings.QuickSettingsData r9 = r8.quickSettingsData
            if (r9 == 0) goto L_0x00fd
            com.arlosoft.macrodroid.app.MacroDroidApplication r9 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.lang.String r1 = "QuickSettings"
            e1.a r9 = r9.mo27293q(r1)
            com.arlosoft.macrodroid.quicksettings.QuickSettingsData r1 = r8.quickSettingsData
            java.lang.String r2 = "QuickSettingsData"
            r9.mo37132b(r2, r1)
        L_0x00fd:
            java.util.List<java.lang.String> r9 = r8.stopWatches
            if (r9 == 0) goto L_0x0106
            android.content.Context r1 = r7.f12403f
            p183w2.C10330a.m40557i(r1, r9)
        L_0x0106:
            i2.b r9 = r8.notificationChannelList
            if (r9 == 0) goto L_0x0119
            com.arlosoft.macrodroid.app.MacroDroidApplication r9 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.lang.String r1 = "NotificationChannels"
            e1.a r9 = r9.mo27293q(r1)
            i2.b r2 = r8.notificationChannelList
            r9.mo37132b(r1, r2)
        L_0x0119:
            java.util.List<com.arlosoft.macrodroid.common.MacroDroidVariable> r9 = r8.variables
            if (r9 == 0) goto L_0x012d
            com.arlosoft.macrodroid.common.u r9 = com.arlosoft.macrodroid.common.C4064u.m16048t()
            java.util.List<com.arlosoft.macrodroid.common.MacroDroidVariable> r1 = r8.variables
            r9.mo27979N(r1)
            com.arlosoft.macrodroid.common.u r9 = com.arlosoft.macrodroid.common.C4064u.m16048t()
            r9.mo27974H()
        L_0x012d:
            q1.a r9 = r8.drawerConfiguration
            if (r9 == 0) goto L_0x013a
            com.arlosoft.macrodroid.app.MacroDroidApplication r9 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            q1.a r1 = r8.drawerConfiguration
            com.arlosoft.macrodroid.settings.C5163j2.m19974G3(r9, r1)
        L_0x013a:
            com.arlosoft.macrodroid.data.HomeScreenTileConfig r9 = r8.homeScreenTileConfig
            if (r9 == 0) goto L_0x0152
            com.arlosoft.macrodroid.app.MacroDroidApplication r9 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.lang.String r1 = "HomeScreenTiles"
            e1.a r9 = r9.mo27293q(r1)
            com.google.gson.Gson r2 = new com.google.gson.Gson
            r2.<init>()
            com.arlosoft.macrodroid.data.HomeScreenTileConfig r3 = r8.homeScreenTileConfig
            r9.mo37131a(r2, r1, r3)
        L_0x0152:
            com.arlosoft.macrodroid.data.SmtpServerConfig r9 = r8.smtpServerConfig
            if (r9 == 0) goto L_0x015f
            com.arlosoft.macrodroid.app.MacroDroidApplication r9 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            com.arlosoft.macrodroid.data.SmtpServerConfig r1 = r8.smtpServerConfig
            com.arlosoft.macrodroid.settings.C5163j2.m20046Q5(r9, r1)
        L_0x015f:
            java.util.List<java.lang.Long> r9 = r8.quickRunMacroIds
            if (r9 == 0) goto L_0x016c
            com.arlosoft.macrodroid.app.MacroDroidApplication r9 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.util.List<java.lang.Long> r1 = r8.quickRunMacroIds
            com.arlosoft.macrodroid.settings.C5163j2.m20180i5(r9, r1)
        L_0x016c:
            boolean r9 = r8.enableRootFeatures
            com.arlosoft.macrodroid.settings.C5163j2.m20212m5(r0, r9)
            boolean r9 = r8.enableExperimentalFeatures
            com.arlosoft.macrodroid.settings.C5163j2.m20009L3(r0, r9)
            int r9 = r8.spokenTextAudioStream
            com.arlosoft.macrodroid.settings.C5163j2.m20060S5(r0, r9)
            int r9 = r8.activityRecognitionUpdateRate
            com.arlosoft.macrodroid.settings.C5163j2.m20170h3(r0, r9)
            boolean r9 = r8.smsMonitorInbox
            com.arlosoft.macrodroid.settings.C5163j2.m20173h6(r0, r9)
            boolean r9 = r8.widgetButtonVibrateOnPress
            com.arlosoft.macrodroid.settings.C5163j2.m20221n6(r0, r9)
            int r9 = r8.wifiSSIDBackgroundScanRate
            com.arlosoft.macrodroid.settings.C5163j2.m20229o6(r0, r9)
            int r9 = r8.cellTowerUpdateRate
            com.arlosoft.macrodroid.settings.C5163j2.m20266t3(r0, r9)
            boolean r9 = r8.cellTowerUseAlarm
            com.arlosoft.macrodroid.settings.C5163j2.m20274u3(r0, r9)
            int r9 = r8.locationUpdateRate
            com.arlosoft.macrodroid.settings.C5163j2.m20291w4(r0, r9)
            boolean r9 = r8.shakeWorkWithScreenOff
            com.arlosoft.macrodroid.settings.C5163j2.m20236p5(r0, r9)
            boolean r9 = r8.vibrateOnShake
            com.arlosoft.macrodroid.settings.C5163j2.m20252r5(r0, r9)
            java.lang.String r9 = r8.shakeSensitivity
            if (r9 == 0) goto L_0x01af
            com.arlosoft.macrodroid.settings.C5163j2.m20244q5(r0, r9)
        L_0x01af:
            java.lang.String r9 = r8.shakeDetectionRate
            if (r9 == 0) goto L_0x01b6
            com.arlosoft.macrodroid.settings.C5163j2.m20228o5(r0, r9)
        L_0x01b6:
            boolean r9 = r8.flipWithScreenOff
            com.arlosoft.macrodroid.settings.C5163j2.m20023N3(r0, r9)
            boolean r9 = r8.vibrateOnFlip
            com.arlosoft.macrodroid.settings.C5163j2.m20030O3(r0, r9)
            boolean r9 = r8.proximityWorkWithScreenOff
            com.arlosoft.macrodroid.settings.C5163j2.m20124b5(r0, r9)
            java.lang.String r9 = r8.weatherTriggerLocation
            if (r9 == 0) goto L_0x01cc
            com.arlosoft.macrodroid.settings.C5163j2.m20205l6(r0, r9)
        L_0x01cc:
            int r9 = r8.weatherUpdateRate
            com.arlosoft.macrodroid.settings.C5163j2.m20213m6(r0, r9)
            java.lang.String r9 = r8.sunsetSunriseLocation
            if (r9 == 0) goto L_0x01d8
            com.arlosoft.macrodroid.settings.C5163j2.m20067T5(r0, r9)
        L_0x01d8:
            int r9 = r8.lightSensorUpdateRate
            com.arlosoft.macrodroid.settings.C5163j2.m20259s4(r0, r9)
            boolean r9 = r8.mediaButtonPassThroughUnhandled
            com.arlosoft.macrodroid.settings.C5163j2.m19996J4(r0, r9)
            boolean r9 = r8.udpNotifyFailure
            com.arlosoft.macrodroid.settings.C5163j2.m20059S4(r0, r9)
            boolean r9 = r8.deviceFacingConstraintWorkWithScreenOff
            com.arlosoft.macrodroid.settings.C5163j2.m19958E3(r0, r9)
            boolean r9 = r8.templateMacrosAutoTranslate
            com.arlosoft.macrodroid.settings.C5163j2.m20210m3(r0, r9)
            java.util.List<com.arlosoft.macrodroid.data.UserIconData> r9 = r8.userIcons
            if (r9 == 0) goto L_0x0264
            java.util.Iterator r9 = r9.iterator()
        L_0x01f9:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0264
            java.lang.Object r1 = r9.next()
            com.arlosoft.macrodroid.data.UserIconData r1 = (com.arlosoft.macrodroid.data.UserIconData) r1
            java.lang.String r2 = r1.data
            if (r2 == 0) goto L_0x01f9
            byte[] r2 = android.util.Base64.decode(r2, r5)
            int r3 = r2.length
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r5, r3)
            r3 = 0
            java.io.File r4 = com.arlosoft.macrodroid.utils.C6362a0.m24602h(r0)     // Catch:{ Exception -> 0x024a }
            boolean r6 = r4.exists()     // Catch:{ Exception -> 0x024a }
            if (r6 != 0) goto L_0x0220
            r4.mkdirs()     // Catch:{ Exception -> 0x024a }
        L_0x0220:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x024a }
            java.lang.String r1 = r1.fileName     // Catch:{ Exception -> 0x024a }
            r6.<init>(r4, r1)     // Catch:{ Exception -> 0x024a }
            boolean r1 = r6.exists()     // Catch:{ Exception -> 0x024a }
            if (r1 != 0) goto L_0x0242
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x024a }
            r1.<init>(r6)     // Catch:{ Exception -> 0x024a }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x023e, all -> 0x023b }
            r4 = 100
            r2.compress(r3, r4, r1)     // Catch:{ Exception -> 0x023e, all -> 0x023b }
            r3 = r1
            goto L_0x0242
        L_0x023b:
            r8 = move-exception
            r3 = r1
            goto L_0x0259
        L_0x023e:
            r2 = move-exception
            r3 = r1
            r1 = r2
            goto L_0x024b
        L_0x0242:
            if (r3 == 0) goto L_0x01f9
            r3.close()     // Catch:{ IOException -> 0x0254 }
            goto L_0x01f9
        L_0x0248:
            r8 = move-exception
            goto L_0x0259
        L_0x024a:
            r1 = move-exception
        L_0x024b:
            r1.printStackTrace()     // Catch:{ all -> 0x0248 }
            if (r3 == 0) goto L_0x01f9
            r3.close()     // Catch:{ IOException -> 0x0254 }
            goto L_0x01f9
        L_0x0254:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x01f9
        L_0x0259:
            if (r3 == 0) goto L_0x0263
            r3.close()     // Catch:{ IOException -> 0x025f }
            goto L_0x0263
        L_0x025f:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0263:
            throw r8
        L_0x0264:
            java.lang.String r9 = r8.databaseHash
            if (r9 == 0) goto L_0x026b
            com.arlosoft.macrodroid.settings.C5163j2.m20307y4(r0, r9)
        L_0x026b:
            java.util.Set r9 = com.arlosoft.macrodroid.settings.C5163j2.m19991J(r0)
            java.util.List<com.arlosoft.macrodroid.macro.Macro> r0 = r8.macroList
            java.util.Iterator r0 = r0.iterator()
        L_0x0275:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02d8
            java.lang.Object r1 = r0.next()
            com.arlosoft.macrodroid.macro.Macro r1 = (com.arlosoft.macrodroid.macro.Macro) r1
            java.lang.String r2 = r1.getCategory()
            boolean r2 = r9.contains(r2)
            if (r2 != 0) goto L_0x02d0
            if (r10 == 0) goto L_0x0295
            boolean r2 = r1.getEnabledStateDuringLoad()
            r1.setEnabledFlag(r2)
            goto L_0x0275
        L_0x0295:
            boolean r2 = r1.getEnabledStateDuringLoad()     // Catch:{ Exception -> 0x029d }
            r1.setEnabled(r2)     // Catch:{ Exception -> 0x029d }
            goto L_0x0275
        L_0x029d:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not enable macro: "
            r3.append(r4)
            java.lang.String r4 = r1.getName()
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            java.lang.String r4 = r2.toString()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r3)
            p148q0.C8151a.m33873n(r2)
            r1.setEnabled(r5)     // Catch:{ Exception -> 0x02ce }
            goto L_0x0275
        L_0x02ce:
            goto L_0x0275
        L_0x02d0:
            boolean r2 = r1.getEnabledStateDuringLoad()
            r1.setEnabledFlag(r2)
            goto L_0x0275
        L_0x02d8:
            java.util.List<com.arlosoft.macrodroid.macro.Macro> r8 = r8.macroList
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.macro.C4934n.mo29687W(java.lang.String, boolean, boolean):java.util.List");
    }

    /* renamed from: a */
    public void mo29643a() {
        m19020v(this.f12398a.values().iterator());
        m19020v(this.f12399b.values().iterator());
        mo29702s0();
    }

    /* renamed from: b */
    public void mo29644b() {
        this.f12400c.clear();
    }

    @NonNull
    /* renamed from: c */
    public List<ActionBlock> mo29645c() {
        ArrayList arrayList = new ArrayList();
        for (Macro next : this.f12398a.values()) {
            if (next.isActionBlock) {
                arrayList.add((ActionBlock) next);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public void mo29646d(@NonNull ActionBlock actionBlock) {
        if (!actionBlock.isClonedInstance()) {
            mo29692k0(actionBlock, true);
        } else {
            this.f12399b.remove(Long.valueOf(actionBlock.getGUID()));
        }
    }

    /* renamed from: e */
    public void mo29647e(@NonNull ActionBlock actionBlock) {
        if (actionBlock.isClonedInstance()) {
            this.f12399b.put(Long.valueOf(actionBlock.getGUID()), actionBlock);
        } else if (actionBlock.getIsBeingImported()) {
            this.f12400c.put(Long.valueOf(actionBlock.getGUID()), actionBlock);
        } else if (mo29649g(actionBlock.getGUID()) == null) {
            mo29701s(actionBlock, true);
        }
    }

    /* renamed from: f */
    public List<ActionBlock> mo29648f() {
        ArrayList arrayList = new ArrayList();
        for (Macro next : this.f12400c.values()) {
            if (next.isActionBlock) {
                arrayList.add((ActionBlock) next);
            }
        }
        return arrayList;
    }

    /* renamed from: f0 */
    public void mo29688f0(Macro macro) {
        if (!macro.isClonedInstance()) {
            this.f12398a.put(Long.valueOf(macro.getGUID()), macro);
            mo29704t0(false);
            return;
        }
        this.f12399b.put(Long.valueOf(macro.getGUID()), macro);
    }

    @Nullable
    /* renamed from: g */
    public ActionBlock mo29649g(long j) {
        Macro Q = mo29682Q(j);
        if (Q == null || !Q.isActionBlock) {
            return null;
        }
        return (ActionBlock) Q;
    }

    /* renamed from: g0 */
    public void mo29689g0(boolean z) {
        mo29690h0(z, true);
    }

    @Nullable
    /* renamed from: h */
    public ActionBlock mo29650h(String str) {
        Macro S = mo29684S(str);
        if (S == null || !S.isActionBlock) {
            return null;
        }
        return (ActionBlock) S;
    }

    /* renamed from: h0 */
    public void mo29690h0(boolean z, boolean z2) {
        if (!m19011i0("macros.json", z, z2)) {
            C4878b.m18879r("Failed to read macro file - Attempting backup file");
            if (!m19011i0("macros.json.bak", z, z2)) {
                C4878b.m18879r("Failed to read backup macro file - No macros found");
                return;
            }
            C4878b.m18879r("Backup file loaded - attempting to clear original file");
            File file = new File(MacroDroidApplication.m14845u().getFilesDir().getAbsolutePath() + "/" + "macros.json");
            if (file.exists()) {
                boolean delete = file.delete();
                C4878b.m18879r("Original file delete = " + delete);
            } else {
                C4878b.m18879r("Original file did not exist");
            }
            try {
                C6362a0.m24599e(new File(MacroDroidApplication.m14845u().getFilesDir().getAbsolutePath() + "/" + "macros.json"), file);
                C4878b.m18879r("Copied backup file over original file");
            } catch (IOException e) {
                C4878b.m18879r("Failed to copy backup file over original file: " + e.getMessage());
            }
        }
    }

    @NonNull
    /* renamed from: i */
    public List<ActionBlock> mo29651i() {
        ArrayList arrayList = new ArrayList();
        List<Macro> C = mo29673C();
        Collections.sort(C, new C4932l(C5163j2.m19963F0(this.f12403f)));
        for (Macro next : C) {
            if (next.isActionBlock) {
                arrayList.add((ActionBlock) next);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public void mo29652j(@NonNull ActionBlock actionBlock) {
        mo29696p0(actionBlock, true);
    }

    /* renamed from: j0 */
    public void mo29691j0() {
        C4878b.m18873l("Removing all macros");
        synchronized (f12397k) {
            Iterator<Macro> it = this.f12398a.values().iterator();
            while (it.hasNext()) {
                Macro next = it.next();
                if (!(next instanceof ActionBlock)) {
                    if (next.isEnabled()) {
                        Iterator<Trigger> it2 = next.getTriggerList().iterator();
                        while (it2.hasNext()) {
                            it2.next().mo31543T2();
                        }
                    }
                    new C4935a(next).start();
                    it.remove();
                }
            }
        }
        mo29702s0();
    }

    /* renamed from: k0 */
    public void mo29692k0(Macro macro, boolean z) {
        Iterator<Trigger> it = macro.getTriggerList().iterator();
        while (it.hasNext()) {
            it.next().mo31543T2();
        }
        Iterator<Action> it2 = macro.getActions().iterator();
        while (it2.hasNext()) {
            Action next = it2.next();
            next.mo24699c3();
            next.mo24691T2();
            for (Constraint U2 : next.mo27826J0()) {
                U2.mo28113U2();
            }
        }
        for (Constraint U22 : macro.getConstraints()) {
            U22.mo28113U2();
        }
        synchronized (f12397k) {
            macro.cancelActiveMacro(this.f12403f);
            this.f12398a.remove(Long.valueOf(macro.getGUID()));
            f12395i = null;
        }
        if (z) {
            mo29702s0();
        }
    }

    /* renamed from: m0 */
    public void mo29693m0(List<Macro> list) {
        synchronized (f12397k) {
            this.f12398a = new HashMap<>();
            if (list != null) {
                for (Macro next : list) {
                    this.f12398a.put(Long.valueOf(next.getGUID()), next);
                }
            }
            f12395i = null;
        }
    }

    /* renamed from: n0 */
    public void mo29694n0() {
        List<Macro> z = mo29710z();
        Set<String> J = C5163j2.m19991J(this.f12403f);
        for (Macro updateEnabledStateBasedOnGlobalState : z) {
            updateEnabledStateBasedOnGlobalState.updateEnabledStateBasedOnGlobalState(J);
        }
    }

    /* renamed from: o0 */
    public void mo29695o0(Macro macro) {
        mo29698q0(macro, true, true);
    }

    /* renamed from: p0 */
    public void mo29696p0(Macro macro, boolean z) {
        mo29698q0(macro, z, true);
    }

    /* renamed from: q */
    public void mo29697q(Macro macro) {
        synchronized (f12397k) {
            this.f12398a.put(Long.valueOf(macro.getGUID()), macro);
            f12395i = null;
        }
        mo29702s0();
    }

    /* renamed from: q0 */
    public void mo29698q0(Macro macro, boolean z, boolean z2) {
        synchronized (f12397k) {
            boolean isEnabled = macro.isEnabled();
            if (isEnabled) {
                macro.setEnabled(false, z2);
            }
            if (macro.isClonedInstance()) {
                this.f12399b.put(Long.valueOf(macro.getGUID()), macro);
            } else if (!macro.getIsBeingImported()) {
                this.f12398a.put(Long.valueOf(macro.getGUID()), macro);
                f12395i = null;
                this.f12400c.remove(Long.valueOf(macro.getGUID()));
            } else {
                this.f12400c.put(Long.valueOf(macro.getGUID()), macro);
            }
            if (isEnabled) {
                macro.setEnabled(true);
            }
        }
        if (z) {
            mo29702s0();
        }
    }

    /* renamed from: r */
    public void mo29699r(Macro macro) {
        mo29701s(macro, true);
    }

    /* renamed from: r0 */
    public void mo29700r0(Macro macro) {
        if (macro != null) {
            synchronized (f12397k) {
                this.f12398a.put(Long.valueOf(macro.getGUID()), macro);
                f12395i = null;
            }
            mo29702s0();
        }
    }

    /* renamed from: s */
    public void mo29701s(Macro macro, boolean z) {
        mo29703t(macro, z, true);
    }

    /* renamed from: s0 */
    public void mo29702s0() {
        mo29704t0(true);
    }

    /* renamed from: t */
    public void mo29703t(Macro macro, boolean z, boolean z2) {
        Iterator<Trigger> it = macro.getTriggerList().iterator();
        while (it.hasNext()) {
            it.next().mo24687G2(macro);
        }
        Iterator<Action> it2 = macro.getActions().iterator();
        while (it2.hasNext()) {
            it2.next().mo24687G2(macro);
        }
        if (macro.getConstraints().size() > 0) {
            for (Constraint G2 : macro.getConstraints()) {
                G2.mo24687G2(macro);
            }
        }
        synchronized (f12397k) {
            this.f12398a.put(Long.valueOf(macro.getGUID()), macro);
            f12395i = null;
        }
        if (z) {
            mo29702s0();
            if (z2) {
                macro.setEnabled(true);
            }
        }
    }

    /* renamed from: t0 */
    public void mo29704t0(boolean z) {
        if (z) {
            AutoBackupCloudWorker.m15059a(this.f12403f, 6);
        }
        if (AndroidWearTrigger.f13569d) {
            try {
                C6375e.m24619c(this.f12403f, false);
            } catch (Exception unused) {
            }
        }
        f12394h.execute(new Thread(new C4928h(this)));
    }

    /* renamed from: u0 */
    public boolean mo29705u0(DocumentFile documentFile, String str, boolean z, boolean z2) {
        String str2;
        DocumentFile findFile = documentFile.findFile(str);
        if (findFile != null && findFile.exists()) {
            findFile.delete();
        }
        Gson c = C10283c.m40414d(false, false).mo64004c();
        if (z) {
            str2 = c.mo63984s(m18997K(true));
        } else {
            str2 = c.mo63984s(mo29710z());
            if (z2) {
                str2 = m19019u(str2);
            }
        }
        OutputStreamWriter outputStreamWriter = null;
        try {
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(this.f12403f.getContentResolver().openOutputStream(documentFile.createFile("*/*", str).getUri()), "UTF-8");
            try {
                outputStreamWriter2.write(str2);
                outputStreamWriter2.close();
                try {
                    outputStreamWriter2.close();
                } catch (Exception unused) {
                }
                return true;
            } catch (Exception e) {
                e = e;
                outputStreamWriter = outputStreamWriter2;
                try {
                    C4878b.m18868g("Failed to store macro list: " + e.getMessage());
                    try {
                        outputStreamWriter.close();
                    } catch (Exception unused2) {
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    try {
                        outputStreamWriter.close();
                    } catch (Exception unused3) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter = outputStreamWriter2;
                outputStreamWriter.close();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C4878b.m18868g("Failed to store macro list: " + e.getMessage());
            outputStreamWriter.close();
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:66|67|68|70|71) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x01d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0217 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:62:0x01d1=Splitter:B:62:0x01d1, B:70:0x0217=Splitter:B:70:0x0217} */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo29706v0(java.lang.String r19, boolean r20, boolean r21, boolean r22) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 0
            com.google.gson.GsonBuilder r0 = p172u1.C10283c.m40414d(r5, r5)
            com.google.gson.Gson r6 = r0.mo64004c()
            if (r20 == 0) goto L_0x0038
            r0 = r22
            com.arlosoft.macrodroid.data.ExportData r0 = r1.m18997K(r0)     // Catch:{ OutOfMemoryError -> 0x001e }
            java.lang.String r0 = r6.mo63984s(r0)     // Catch:{ OutOfMemoryError -> 0x001e }
            goto L_0x0085
        L_0x001e:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Out of memory while trying to save macros - Check local variables/macros for enormous content: "
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            return r5
        L_0x0038:
            java.util.List r7 = r18.mo29673C()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "Saving Macro List ("
            r0.append(r8)
            int r8 = r7.size()
            r0.append(r8)
            java.lang.String r8 = " macros)"
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r0)
            java.lang.String r0 = r6.mo63984s(r7)     // Catch:{ ConcurrentModificationException -> 0x0079, OutOfMemoryError -> 0x005e }
            goto L_0x007f
        L_0x005e:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Out of memory while trying to save macros - Check local variables/macros for enormous content: "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            return r5
        L_0x0079:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = r6.mo63984s(r7)     // Catch:{ ConcurrentModificationException -> 0x021a }
        L_0x007f:
            if (r21 == 0) goto L_0x0085
            java.lang.String r0 = r1.m19019u(r0)
        L_0x0085:
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r9 = r1.f12402e
            monitor-enter(r9)
            r8 = 0
            if (r20 == 0) goto L_0x0098
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            r10.<init>(r2)     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            r2 = r8
            r11 = r2
            goto L_0x0123
        L_0x0098:
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            r11.<init>()     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            com.arlosoft.macrodroid.app.MacroDroidApplication r12 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.io.File r12 = r12.getFilesDir()     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            r11.append(r12)     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.lang.String r12 = "/"
            r11.append(r12)     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            r11.append(r2)     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.lang.String r2 = r11.toString()     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            r10.<init>(r2)     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            r11.<init>()     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            com.arlosoft.macrodroid.app.MacroDroidApplication r12 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.io.File r12 = r12.getFilesDir()     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            r11.append(r12)     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.lang.String r12 = "/"
            r11.append(r12)     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.lang.String r12 = "macros.json.bak"
            r11.append(r12)     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            r2.<init>(r11)     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            com.arlosoft.macrodroid.app.MacroDroidApplication r11 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.lang.String r12 = "macros.json.bak"
            java.io.FileOutputStream r11 = r11.openFileOutput(r12, r5)     // Catch:{ Exception -> 0x01b1, all -> 0x01ae }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            r12.<init>()     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            java.lang.String r13 = "originalFile = "
            r12.append(r13)     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            java.lang.String r13 = r10.getName()     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            r12.append(r13)     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r12)     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            r12.<init>()     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            java.lang.String r13 = "backupFile = "
            r12.append(r13)     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            java.lang.String r13 = r2.getName()     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            r12.append(r13)     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r12)     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            r17 = r11
            r11 = r10
            r10 = r17
        L_0x0123:
            java.lang.String r12 = "Saving to backup file"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r12)     // Catch:{ Exception -> 0x01a6 }
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r13 = "UTF-8"
            r12.<init>(r10, r13)     // Catch:{ Exception -> 0x01a6 }
            r12.write(r0)     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            r12.close()     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            java.lang.String r0 = "backup file complete"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r0)     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            if (r20 != 0) goto L_0x0197
            boolean r0 = r2.exists()     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            if (r0 == 0) goto L_0x0197
            long r13 = r2.length()     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            r15 = 0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0197
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            r0.<init>()     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            java.lang.String r8 = "backup file size = "
            r0.append(r8)     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            long r13 = r2.length()     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            r0.append(r13)     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r0)     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            com.arlosoft.macrodroid.utils.C6362a0.m24599e(r2, r11)     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            r0.<init>()     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            java.lang.String r2 = "copied to original file, original file size = "
            r0.append(r2)     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            long r13 = r11.length()     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            r0.append(r13)     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r0)     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            r0.<init>()     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            java.lang.String r2 = "copied to original file, original file size = "
            r0.append(r2)     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            long r13 = r11.length()     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            r0.append(r13)     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
            p148q0.C8151a.m33860a(r0)     // Catch:{ Exception -> 0x01a3, all -> 0x019f }
        L_0x0197:
            r12.close()     // Catch:{ Exception -> 0x019d }
            r10.close()     // Catch:{ Exception -> 0x019d }
        L_0x019d:
            r5 = 1
            goto L_0x01d1
        L_0x019f:
            r0 = move-exception
            r8 = r12
            goto L_0x020e
        L_0x01a3:
            r0 = move-exception
            r8 = r12
            goto L_0x01b3
        L_0x01a6:
            r0 = move-exception
            goto L_0x01b3
        L_0x01a8:
            r0 = move-exception
            r10 = r11
            goto L_0x020e
        L_0x01ab:
            r0 = move-exception
            r10 = r11
            goto L_0x01b3
        L_0x01ae:
            r0 = move-exception
            r10 = r8
            goto L_0x020e
        L_0x01b1:
            r0 = move-exception
            r10 = r8
        L_0x01b3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x020d }
            r2.<init>()     // Catch:{ all -> 0x020d }
            java.lang.String r11 = "Failed to store macro list: "
            r2.append(r11)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x020d }
            r2.append(r0)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x020d }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)     // Catch:{ all -> 0x020d }
            r8.close()     // Catch:{ Exception -> 0x01d1 }
            r10.close()     // Catch:{ Exception -> 0x01d1 }
        L_0x01d1:
            monitor-exit(r9)     // Catch:{ all -> 0x0215 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Persist took: "
            r0.append(r2)
            long r6 = r6 - r3
            r0.append(r6)
            java.lang.String r2 = "/"
            r0.append(r2)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r3
            r0.append(r6)
            java.lang.String r2 = "ms. Main thread = "
            r0.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            boolean r2 = r2.equals(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r0)
            return r5
        L_0x020d:
            r0 = move-exception
        L_0x020e:
            r8.close()     // Catch:{ Exception -> 0x0217 }
            r10.close()     // Catch:{ Exception -> 0x0217 }
            goto L_0x0217
        L_0x0215:
            r0 = move-exception
            goto L_0x0218
        L_0x0217:
            throw r0     // Catch:{ all -> 0x0215 }
        L_0x0218:
            monitor-exit(r9)     // Catch:{ all -> 0x0215 }
            throw r0
        L_0x021a:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Failed to persist macro file: "
            r0.append(r3)
            java.lang.String r3 = r8.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            p148q0.C8151a.m33873n(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.macro.C4934n.mo29706v0(java.lang.String, boolean, boolean, boolean):boolean");
    }

    /* renamed from: w */
    public void mo29707w(Macro macro, boolean z) {
        synchronized (f12397k) {
            if (macro.isEnabled()) {
                macro.setEnabled(false);
                this.f12398a.put(Long.valueOf(macro.getGUID()), macro);
                f12395i = null;
            }
        }
        if (z) {
            mo29704t0(false);
        }
    }

    /* renamed from: x */
    public void mo29708x(Macro macro, boolean z) {
        synchronized (f12397k) {
            macro.setEnabled(true);
            this.f12398a.put(Long.valueOf(macro.getGUID()), macro);
            f12395i = null;
        }
        if (z) {
            mo29704t0(false);
        }
    }

    /* renamed from: y */
    public List<Macro> mo29709y() {
        ArrayList arrayList;
        synchronized (f12397k) {
            arrayList = new ArrayList();
            C5163j2.m19991J(this.f12403f);
            for (Macro add : this.f12399b.values()) {
                arrayList.add(add);
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    public List<Macro> mo29710z() {
        ArrayList arrayList = new ArrayList();
        synchronized (f12397k) {
            for (Macro next : this.f12398a.values()) {
                if (!next.isActionBlock && next.isCompleted()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }
}
