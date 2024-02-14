package com.twofortyfouram.locale.sdk.host.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginConfiguration;
import com.twofortyfouram.locale.sdk.host.model.PluginErrorRegister;
import com.twofortyfouram.locale.sdk.host.model.PluginType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p276h8.C12406a;
import p285i8.C12447a;
import p295j8.C13301a;
import p295j8.C13304d;

final class PluginPackageScanner {
    @NonNull
    private static final Comparator<ResolveInfo> PACKAGE_NAME_COMPARATOR = new PackageNameComparator();

    private PluginPackageScanner() {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }

    private static EnumSet<PluginErrorRegister> checkPluginForErrors(@NonNull Context context, @NonNull PluginType pluginType, @NonNull ResolveInfo resolveInfo, @NonNull List<ResolveInfo> list) {
        C12406a.m83260d(context, "context");
        C12406a.m83260d(pluginType, "type");
        C12406a.m83260d(resolveInfo, "activityResolveInfo");
        C12406a.m83260d(list, "receiverResolveInfos");
        EnumSet<PluginErrorRegister> noneOf = EnumSet.noneOf(PluginErrorRegister.class);
        if (!isTargetSdkCorrect(context, resolveInfo)) {
            C12447a.m83384a("WARNING: %s targetSdkVersion is older than %s", resolveInfo.activityInfo.packageName, context.getPackageName());
        }
        if (!isInstallLocationCorrect(context, resolveInfo)) {
            noneOf.add(PluginErrorRegister.INSTALL_LOCATION_BAD);
        }
        if (!isApplicationEnabled(resolveInfo)) {
            noneOf.add(PluginErrorRegister.APPLICATION_NOT_ENABLED);
        }
        if (!isComponentEnabled(resolveInfo)) {
            noneOf.add(PluginErrorRegister.ACTIVITY_NOT_ENABLED);
        }
        if (!isComponentExported(resolveInfo)) {
            noneOf.add(PluginErrorRegister.ACTIVITY_NOT_EXPORTED);
        }
        if (!isComponentPermissionGranted(context, resolveInfo)) {
            noneOf.add(PluginErrorRegister.ACTIVITY_REQUIRES_PERMISSION);
        }
        if (1 == list.size()) {
            ResolveInfo resolveInfo2 = list.get(0);
            if (!isComponentEnabled(resolveInfo2)) {
                noneOf.add(PluginErrorRegister.RECEIVER_NOT_ENABLED);
            }
            if (!isComponentExported(resolveInfo2)) {
                noneOf.add(PluginErrorRegister.RECEIVER_NOT_EXPORTED);
            }
            if (!isComponentPermissionGranted(context, resolveInfo2)) {
                noneOf.add(PluginErrorRegister.RECEIVER_REQUIRES_PERMISSION);
            }
        } else if (2 >= list.size()) {
            noneOf.add(PluginErrorRegister.RECEIVER_DUPLICATE);
        } else {
            noneOf.add(PluginErrorRegister.MISSING_RECEIVER);
        }
        return noneOf;
    }

    @NonNull
    private static Collection<ResolveInfo> findActivities(@NonNull Context context, @NonNull PluginType pluginType, @Nullable String str) {
        C12406a.m83260d(context, "context");
        C12406a.m83260d(pluginType, "type");
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(pluginType.getActivityIntentAction());
        if (str != null) {
            intent.setPackage(str);
        }
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 1);
        if (!C13301a.m85633a(11) && queryIntentActivities == null) {
            queryIntentActivities = new ArrayList(0);
        }
        C12406a.m83260d(queryIntentActivities, "activities");
        Collections.sort(queryIntentActivities, PACKAGE_NAME_COMPARATOR);
        return queryIntentActivities;
    }

    @NonNull
    private static List<ResolveInfo> findReceivers(@NonNull Context context, @NonNull PluginType pluginType, @Nullable String str) {
        C12406a.m83260d(context, "context");
        C12406a.m83260d(pluginType, "type");
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(pluginType.getReceiverIntentAction());
        if (str != null) {
            intent.setPackage(str);
        }
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 32);
        if (!C13301a.m85633a(11) && queryBroadcastReceivers == null) {
            queryBroadcastReceivers = new ArrayList<>(0);
        }
        Collections.sort(queryBroadcastReceivers, PACKAGE_NAME_COMPARATOR);
        return queryBroadcastReceivers;
    }

    private static int getVersionCode(@NonNull PackageManager packageManager, @NonNull String str) {
        PackageInfo packageInfo;
        C12406a.m83260d(packageManager, "packageManager");
        C12406a.m83260d(str, "packageName");
        try {
            packageInfo = packageManager.getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return -1;
    }

    private static boolean isApplicationEnabled(@NonNull ResolveInfo resolveInfo) {
        C12406a.m83260d(resolveInfo, "info");
        return resolveInfo.activityInfo.applicationInfo.enabled;
    }

    private static boolean isComponentEnabled(@NonNull ResolveInfo resolveInfo) {
        C12406a.m83260d(resolveInfo, "info");
        return resolveInfo.activityInfo.enabled;
    }

    private static boolean isComponentExported(@NonNull ResolveInfo resolveInfo) {
        C12406a.m83260d(resolveInfo, "info");
        return resolveInfo.activityInfo.exported;
    }

    private static boolean isComponentPermissionGranted(@NonNull Context context, @NonNull ResolveInfo resolveInfo) {
        C12406a.m83260d(context, "context");
        C12406a.m83260d(resolveInfo, "info");
        String str = resolveInfo.activityInfo.permission;
        if (str == null || C13304d.C13305a.GRANTED == C13304d.m85636a(context, str)) {
            return true;
        }
        return false;
    }

    private static boolean isInstallLocationCorrect(@NonNull Context context, @NonNull ResolveInfo resolveInfo) {
        C12406a.m83260d(context, "context");
        C12406a.m83260d(resolveInfo, "resolveInfo");
        try {
            InstallLocation.getManifestInstallLocation(context, resolveInfo.activityInfo.packageName);
            return true;
        } catch (PackageManager.NameNotFoundException | IOException | XmlPullParserException unused) {
            return true;
        }
    }

    private static boolean isTargetSdkCorrect(@NonNull Context context, @NonNull ResolveInfo resolveInfo) {
        C12406a.m83260d(context, "context");
        C12406a.m83260d(resolveInfo, "info");
        return resolveInfo.activityInfo.applicationInfo.targetSdkVersion >= context.getApplicationInfo().targetSdkVersion;
    }

    @NonNull
    public static Map<String, Plugin> loadPluginMap(@NonNull Context context, @NonNull PluginType pluginType, @Nullable String str) {
        Context context2 = context;
        PluginType pluginType2 = pluginType;
        C12406a.m83260d(context2, "context");
        C12406a.m83260d(pluginType2, "type");
        SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        for (ResolveInfo next : findActivities(context, pluginType, str)) {
            String str2 = next.activityInfo.packageName;
            int versionCode = getVersionCode(context.getPackageManager(), str2);
            List<ResolveInfo> findReceivers = findReceivers(context2, pluginType2, str2);
            C12447a.m83384a("Found plug-in %s with package: %s, Activity: %s, BroadcastReceiver: %s, versionCode: %d", pluginType2, str2, next, findReceivers, Integer.valueOf(versionCode));
            checkPluginForErrors(context2, pluginType2, next, findReceivers);
            String generateRegistryName = Plugin.generateRegistryName(str2, next.activityInfo.name);
            Plugin plugin = new Plugin(pluginType, str2, next.activityInfo.name, findReceivers.size() > 0 ? findReceivers.get(0).activityInfo.name : "?", versionCode, new PluginConfiguration(PluginCharacteristics.isBackwardsCompatibilityEnabled(pluginType2, generateRegistryName), PluginCharacteristics.isRequiresConnectivity(pluginType2, generateRegistryName), PluginCharacteristics.isDisruptsConnectivity(pluginType2, generateRegistryName), PluginCharacteristics.isBuggy(pluginType2, generateRegistryName), PluginCharacteristics.isDrainsBattery(pluginType2, generateRegistryName), PluginCharacteristics.isBlacklisted(pluginType2, generateRegistryName), PluginCharacteristics.getBuiltInAlternative(pluginType2, generateRegistryName)));
            hashMap.put(plugin.getRegistryName(), plugin);
        }
        SystemClock.elapsedRealtime();
        return hashMap;
    }
}
