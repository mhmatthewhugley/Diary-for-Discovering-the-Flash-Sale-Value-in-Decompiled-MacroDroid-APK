package com.twofortyfouram.locale.sdk.host.internal;

import androidx.annotation.NonNull;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginType;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p276h8.C12406a;
import p295j8.C13301a;

final class PluginCharacteristics {
    @NonNull
    private static final Set<String> CONDITIONS_REQUIRING_BACKWARDS_COMPATIBILITY = Collections.unmodifiableSet(getConditionsRequiringBackwardsCompatibility());
    @NonNull
    private static final Set<String> CONDITIONS_THAT_ARE_BLACKLISTED = Collections.unmodifiableSet(getConditionsThatAreBlacklisted());
    @NonNull
    private static final Set<String> CONDITIONS_THAT_ARE_BUGGY = Collections.unmodifiableSet(getConditionsThatAreBuggy());
    @NonNull
    private static final Set<String> CONDITIONS_THAT_DISRUPT_CONNECTIVITY = Collections.unmodifiableSet(getConditionsThatDisruptConnectivity());
    @NonNull
    private static final Set<String> CONDITIONS_THAT_DRAIN_BATTERY = Collections.unmodifiableSet(getConditionsThatDrainBattery());
    @NonNull
    private static final Map<String, Set<String>> CONDITIONS_THAT_HAVE_ALTERNATIVES = Collections.unmodifiableMap(getConditionsThatHaveAlternatives());
    @NonNull
    private static final Set<String> CONDITIONS_THAT_REQUIRE_CONNECTIVITY = Collections.unmodifiableSet(getConditionsThatRequireConnectivity());
    @NonNull
    private static final Set<String> SETTINGS_REQUIRING_BACKWARDS_COMPATIBILITY = Collections.unmodifiableSet(getSettingsRequiringBackwardsCompatibility());
    @NonNull
    private static final Set<String> SETTINGS_THAT_ARE_BLACKLISTED = Collections.unmodifiableSet(getSettingsThatAreBlacklisted());
    @NonNull
    private static final Set<String> SETTINGS_THAT_ARE_BUGGY = Collections.unmodifiableSet(getSettingsThatAreBuggy());
    @NonNull
    private static final Set<String> SETTINGS_THAT_DISRUPT_CONNECTIVITY = Collections.unmodifiableSet(getSettingsThatDisruptConnectivity());
    @NonNull
    private static final Set<String> SETTINGS_THAT_DRAIN_BATTERY = Collections.unmodifiableSet(getSettingsThatDrainBattery());
    @NonNull
    private static final Map<String, Set<String>> SETTINGS_THAT_HAVE_ALTERNATIVES = Collections.unmodifiableMap(getSettingsThatHaveAlternatives());
    @NonNull
    private static final Set<String> SETTINGS_THAT_REQUIRE_CONNECTIVITY = Collections.unmodifiableSet(getSettingsThatRequireConnectivity());

    /* renamed from: com.twofortyfouram.locale.sdk.host.internal.PluginCharacteristics$1 */
    static /* synthetic */ class C117971 {
        static final /* synthetic */ int[] $SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.twofortyfouram.locale.sdk.host.model.PluginType[] r0 = com.twofortyfouram.locale.sdk.host.model.PluginType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType = r0
                com.twofortyfouram.locale.sdk.host.model.PluginType r1 = com.twofortyfouram.locale.sdk.host.model.PluginType.EVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.twofortyfouram.locale.sdk.host.model.PluginType r1 = com.twofortyfouram.locale.sdk.host.model.PluginType.CONDITION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.twofortyfouram.locale.sdk.host.model.PluginType r1 = com.twofortyfouram.locale.sdk.host.model.PluginType.SETTING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.twofortyfouram.locale.sdk.host.internal.PluginCharacteristics.C117971.<clinit>():void");
        }
    }

    private PluginCharacteristics() {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }

    @NonNull
    public static Set<String> getBuiltInAlternative(@NonNull PluginType pluginType, @NonNull String str) {
        Set<String> set;
        C12406a.m83260d(pluginType, "type");
        C12406a.m83259c(str, "registryName");
        int i = C117971.$SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType[pluginType.ordinal()];
        if (i == 1 || i == 2) {
            set = CONDITIONS_THAT_HAVE_ALTERNATIVES.get(str);
        } else if (i == 3) {
            set = SETTINGS_THAT_HAVE_ALTERNATIVES.get(str);
        } else {
            throw new AssertionError();
        }
        return set == null ? Collections.emptySet() : set;
    }

    @NonNull
    private static Set<String> getConditionsRequiringBackwardsCompatibility() {
        HashSet hashSet = new HashSet();
        hashSet.add(Plugin.generateRegistryName("com.DriftingAway.Skim", "com.DriftingAway.Skim.EditActivity"));
        return hashSet;
    }

    @NonNull
    private static Set<String> getConditionsThatAreBlacklisted() {
        return new HashSet();
    }

    @NonNull
    private static Set<String> getConditionsThatAreBuggy() {
        HashSet hashSet = new HashSet();
        hashSet.add(Plugin.generateRegistryName("org.acm.steidinger.calendar.localePlugin", "org.acm.steidinger.calendar.localePlugin.EditConditionActivity"));
        return hashSet;
    }

    @NonNull
    private static Set<String> getConditionsThatDisruptConnectivity() {
        return new HashSet();
    }

    @NonNull
    private static Set<String> getConditionsThatDrainBattery() {
        HashSet hashSet = new HashSet();
        hashSet.add(Plugin.generateRegistryName("com.DriftingAway.Skim", "com.DriftingAway.Skim.EditActivity"));
        return hashSet;
    }

    @NonNull
    private static Map<String, Set<String>> getConditionsThatHaveAlternatives() {
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Plugin.generateRegistryName("com.twofortyfouram.locale", "com.twofortyfouram.locale.ui.activities.CalendarConditionActivity"));
        Set unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        hashMap.put(Plugin.generateRegistryName("org.acm.steidinger.calendar.localePlugin", "org.acm.steidinger.calendar.localePlugin.EditConditionActivity"), unmodifiableSet);
        hashMap.put(Plugin.generateRegistryName("com.DroidMunkey.LocaleCalendarConditions", "com.DroidMunkey.LocaleCalendarConditions.EditActivity"), unmodifiableSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(Plugin.generateRegistryName("com.twofortyfouram.locale", "com.twofortyfouram.locale.ui.activities.LocationConditionActivity"));
        Set unmodifiableSet2 = Collections.unmodifiableSet(linkedHashSet2);
        hashMap.put(Plugin.generateRegistryName("at.pansy.droid.locale.location", "at.pansy.droid.locale.location.EditActivity"), unmodifiableSet2);
        hashMap.put(Plugin.generateRegistryName("com.DroidMunkey.LocaleWifiConditions", "com.DroidMunkey.LocaleWifiConditions.EditActivity"), unmodifiableSet2);
        hashMap.put(Plugin.generateRegistryName("com.hush.locale.cell_beta", "com.hush.locale.cell_beta.EditActivity"), unmodifiableSet2);
        hashMap.put(Plugin.generateRegistryName("com.joaomgcd.autolocation", "com.joaomgcd.autolocation.activity.ActivityConfigRequestGeofenceReport"), unmodifiableSet2);
        hashMap.put(Plugin.generateRegistryName("com.kanetik.geofence", "com.kanetik.geofence.ui.EditActivity"), unmodifiableSet2);
        hashMap.put(Plugin.generateRegistryName("com.suttco.locale.condition.poi", "com.suttco.locale.condition.poi.EditActivity"), unmodifiableSet2);
        hashMap.put(Plugin.generateRegistryName("net.appstalk.wifimatch", "net.appstalk.wifimatch.ui.EditActivity"), unmodifiableSet2);
        hashMap.put(Plugin.generateRegistryName("org.johanhil.ssid", "org.johanhil.ssid.EditActivity"), unmodifiableSet2);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(Plugin.generateRegistryName("com.twofortyfouram.locale", "com.twofortyfouram.locale.ui.activities.MovementConditionActivity"));
        Set unmodifiableSet3 = Collections.unmodifiableSet(linkedHashSet3);
        hashMap.put(Plugin.generateRegistryName("com.jarettmillard.localeactivityplugin", "com.jarettmillard.localeactivityplugin.EditActivity"), unmodifiableSet3);
        hashMap.put(Plugin.generateRegistryName("com.kanetik.movement_detection", "com.kanetik.movement_detection.ui.EditActivity"), unmodifiableSet3);
        return hashMap;
    }

    @NonNull
    private static Set<String> getConditionsThatRequireConnectivity() {
        HashSet hashSet = new HashSet();
        hashSet.add(Plugin.generateRegistryName("com.twofortyfouram.locale", "com.twofortyfouram.locale.ui.activities.LocationConditionActivity"));
        return hashSet;
    }

    @NonNull
    private static Set<String> getSettingsRequiringBackwardsCompatibility() {
        HashSet hashSet = new HashSet();
        hashSet.add(Plugin.generateRegistryName("com.dattasmoon.gtalkcontrol", "com.dattasmoon.gtalkcontrol.LocaleEdit"));
        hashSet.add(Plugin.generateRegistryName("com.droidmunkey.localePlaySound", "com.droidmunkey.localePlaySound.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.droidmunkey.LocaleSpeakerphone", "com.droidmunkey.LocaleSpeakerphone.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.DroidMunkey.localeTextToSpeech", "com.DroidMunkey.localeTextToSpeech.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.DroidMunkey.LocaleTimer", "com.DroidMunkey.LocaleTimer.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.DroidMunkey.localeVariables", "com.DroidMunkey.localeVariables.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.DroidMunkey.LocaleVibrate", "com.DroidMunkey.LocaleVibrate.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.google.ase", "com.google.ase.locale.LocalePlugin"));
        hashSet.add(Plugin.generateRegistryName("com.googlecode.android_scripting", "com.googlecode.android_scripting.LocalePlugin"));
        hashSet.add(Plugin.generateRegistryName("com.handyandy.whoisit", "com.handyandy.whoisit.TaskerActivateProfile"));
        hashSet.add(Plugin.generateRegistryName("org.handydroid.openwatch.locale.button", "org.handydroid.openwatch.locale.button.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("org.handydroid.openwatch.locale.graphic", "org.handydroid.openwatch.locale.graphic.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("org.handydroid.openwatch.locale.message", "org.handydroid.openwatch.locale.message.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.levelup.foxyring", "com.levelup.foxyring.EditYourSettingActivity"));
        hashSet.add(Plugin.generateRegistryName("com.mariobialos.LocaleDialPlugIn", "com.mariobialos.LocaleDialPlugIn.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.mariobialos.LocaleHapticPlugIn", "com.mariobialos.LocaleHapticPlugIn.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.mariobialos.LocalePrevLocationPlugIn", "com.mariobialos.LocalePrevLocationPlugIn.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.mariobialos.LocaleRotateScreenPlugIn", "com.mariobialos.LocaleRotateScreenPlugIn.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.mariobialos.LocaleVoiceCallPlugIn", "com.mariobialos.LocaleVoiceCallPlugIn.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.mb.locale.cardock", "com.mb.locale.cardock.LocaleEditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.mooapps.autolock", "com.mooapps.autolock.LocaleSettings"));
        hashSet.add(Plugin.generateRegistryName("com.mooapps.autolock2", "com.mooapps.autolock2.LocaleSettings"));
        hashSet.add(Plugin.generateRegistryName("com.olib.locplug.scenemode", "com.olib.locplug.scenemode.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.olib.locplug.scenemodepro", "com.olib.locplug.scenemodepro.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.smartideas.handsfreesmsdemo", "com.smartideas.handsfreesmsdemo.locale.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.smartideas.handsfreesms", "com.smartideas.handsfreesms.locale.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.splunchy.android.speakingringtone", "com.splunchy.android.speakingringtone.LocaleSettingEditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.steelgirder.LocaleSendEmailPlugin", "com.steelgirder.LocaleSendEmailPlugin.EditYourSettingActivity"));
        hashSet.add(Plugin.generateRegistryName("com.steelgirder.LocaleWOLPlugin", "com.steelgirder.LocaleWOLPlugin.EditYourSettingActivity"));
        hashSet.add(Plugin.generateRegistryName("com.steelgirder.LocalePingFMPlugin", "com.steelgirder.LocalePingFMPlugin.EditYourSettingActivity"));
        hashSet.add(Plugin.generateRegistryName("com.sugree.jibjib", "com.sugree.jibjib.LocaleSettingActivity"));
        hashSet.add(Plugin.generateRegistryName("com.al.SmartReply.Deluxe", "com.al.SmartReply.Deluxe.LocaleEditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.al.SmartReply.Pro", "com.al.SmartReply.Pro.LocaleEditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.pwnwithyourphone.talkingcalendar", "com.pwnwithyourphone.talkingcalendar.locale.SetupActivity"));
        hashSet.add(Plugin.generateRegistryName("com.pwnwithyourphone.talkingcalendar.trial", "com.pwnwithyourphone.talkingcalendar.locale.SetupActivity"));
        hashSet.add(Plugin.generateRegistryName("com.tenromans.locale.systemnotification", "com.tenromans.locale.systemnotification.EditSystemNotificationActivity"));
        hashSet.add(Plugin.generateRegistryName("com.tenromans.locale.emailsilencer", "com.tenromans.locale.emailsilencer.EditSystemNotificationActivity"));
        hashSet.add(Plugin.generateRegistryName("com.twofortyfouram.locale.setting.gps", "com.twofortyfouram.locale.setting.gps.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.yurivolkov.android.locale_audio_update_notifier", "com.yurivolkov.android.locale_audio_update_notifier.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("de.elmicha.app.LocaleExecute", "de.elmicha.app.LocaleExecute.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("de.sifl.wolcale", "de.sifl.wolcale.EditYourSettingActivity"));
        hashSet.add(Plugin.generateRegistryName("mobi.gearsoft.android.wifisync", "mobi.gearsoft.android.wifisync.LocaleEditSettings"));
        hashSet.add(Plugin.generateRegistryName("net.andvari.android.notificationsetting", "net.andvari.android.notificationsetting.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("net.andvari.android.syncsetting", "net.andvari.android.syncsetting.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("org.adaptroid.habitats", "org.adaptroid.habitats.EditLocaleSettingActivity"));
        hashSet.add(Plugin.generateRegistryName("org.damazio.notifier.locale.notify", "org.damazio.notifier.locale.notify.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("org.darune.autowakeonlan", "org.darune.autowakeonlan.AutoWakeOnLan"));
        hashSet.add(Plugin.generateRegistryName("org.mailboxer.saymyname", "com.announcify.ui.activity.LocaleActivity"));
        return hashSet;
    }

    @NonNull
    private static Set<String> getSettingsThatAreBlacklisted() {
        HashSet hashSet = new HashSet();
        if (C13301a.m85633a(16)) {
            hashSet.add(Plugin.generateRegistryName("com.kludgenics.locale.superplane", "com.kludgenics.locale.superplane.EditActivity"));
            hashSet.add(Plugin.generateRegistryName("com.twofortyfouram.locale.setting.airplanemode", "com.twofortyfouram.locale.setting.airplanemode.EditActivity"));
            hashSet.add(Plugin.generateRegistryName("com.willemstoker.AutoPilot", "com.willemstoker.AutoPilot.EditYourSettingActivity"));
        }
        return hashSet;
    }

    @NonNull
    private static Set<String> getSettingsThatAreBuggy() {
        HashSet hashSet = new HashSet();
        hashSet.add(Plugin.generateRegistryName("com.akiware.locale.allvolumes", "com.akiware.locale.allvolumes.EditActivity"));
        return hashSet;
    }

    @NonNull
    private static Set<String> getSettingsThatDisruptConnectivity() {
        HashSet hashSet = new HashSet();
        hashSet.add(Plugin.generateRegistryName("com.codecarpet.apndroid.locale", "com.google.code.apndroid.LocaleActivity"));
        hashSet.add(Plugin.generateRegistryName("com.kludgenics.locale.superplane", "com.kludgenics.locale.superplane.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.twofortyfouram.locale.setting.airplanemode", "com.twofortyfouram.locale.setting.airplanemode.EditActivity"));
        hashSet.add(Plugin.generateRegistryName("com.willemstoker.AutoPilot", "com.willemstoker.AutoPilot.EditYourSettingActivity"));
        hashSet.add(Plugin.generateRegistryName("com.suttco.locale.net", "com.suttco.locale.net.DataEnabledSettingActivity"));
        return hashSet;
    }

    @NonNull
    private static Set<String> getSettingsThatDrainBattery() {
        return new HashSet();
    }

    @NonNull
    private static Map<String, Set<String>> getSettingsThatHaveAlternatives() {
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Plugin.generateRegistryName("com.twofortyfouram.locale", "com.twofortyfouram.locale.ui.activities.VolumeSettingActivity"));
        linkedHashSet.add(Plugin.generateRegistryName("com.twofortyfouram.locale", "com.twofortyfouram.locale.ui.activities.VolumeMediaSettingActivity"));
        Set unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        hashMap.put(Plugin.generateRegistryName("com.akiware.locale.allvolumes", "com.akiware.locale.allvolumes.EditActivity"), unmodifiableSet);
        hashMap.put(Plugin.generateRegistryName("com.olib.locplug.scenemode", "com.olib.locplug.scenemode.EditActivity"), unmodifiableSet);
        hashMap.put(Plugin.generateRegistryName("com.olib.locplug.scenemodepro", "com.olib.locplug.scenemodepro.EditActivity"), unmodifiableSet);
        return hashMap;
    }

    @NonNull
    private static Set<String> getSettingsThatRequireConnectivity() {
        return new HashSet();
    }

    public static boolean isBackwardsCompatibilityEnabled(@NonNull PluginType pluginType, @NonNull String str) {
        C12406a.m83260d(pluginType, "type");
        C12406a.m83259c(str, "registryName");
        int i = C117971.$SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType[pluginType.ordinal()];
        if (i == 1) {
            return CONDITIONS_REQUIRING_BACKWARDS_COMPATIBILITY.contains(str);
        }
        if (i == 2) {
            return CONDITIONS_REQUIRING_BACKWARDS_COMPATIBILITY.contains(str);
        }
        if (i == 3) {
            return SETTINGS_REQUIRING_BACKWARDS_COMPATIBILITY.contains(str);
        }
        throw new AssertionError();
    }

    public static boolean isBlacklisted(@NonNull PluginType pluginType, @NonNull String str) {
        C12406a.m83260d(pluginType, "type");
        C12406a.m83259c(str, "registryName");
        int i = C117971.$SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType[pluginType.ordinal()];
        if (i == 1 || i == 2) {
            return CONDITIONS_THAT_ARE_BLACKLISTED.contains(str);
        }
        if (i == 3) {
            return SETTINGS_THAT_ARE_BLACKLISTED.contains(str);
        }
        throw new AssertionError();
    }

    public static boolean isBuggy(@NonNull PluginType pluginType, @NonNull String str) {
        C12406a.m83260d(pluginType, "type");
        C12406a.m83259c(str, "registryName");
        int i = C117971.$SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType[pluginType.ordinal()];
        if (i == 1 || i == 2) {
            return CONDITIONS_THAT_ARE_BUGGY.contains(str);
        }
        if (i == 3) {
            return SETTINGS_THAT_ARE_BUGGY.contains(str);
        }
        throw new AssertionError();
    }

    public static boolean isDisruptsConnectivity(@NonNull PluginType pluginType, @NonNull String str) {
        C12406a.m83260d(pluginType, "type");
        C12406a.m83259c(str, "registryName");
        int i = C117971.$SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType[pluginType.ordinal()];
        if (i == 1 || i == 2) {
            return CONDITIONS_THAT_DISRUPT_CONNECTIVITY.contains(str);
        }
        if (i == 3) {
            return SETTINGS_THAT_DISRUPT_CONNECTIVITY.contains(str);
        }
        throw new AssertionError();
    }

    public static boolean isDrainsBattery(@NonNull PluginType pluginType, @NonNull String str) {
        C12406a.m83260d(pluginType, "type");
        C12406a.m83259c(str, "registryName");
        int i = C117971.$SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType[pluginType.ordinal()];
        if (i == 1 || i == 2) {
            return CONDITIONS_THAT_DRAIN_BATTERY.contains(str);
        }
        if (i == 3) {
            return SETTINGS_THAT_DRAIN_BATTERY.contains(str);
        }
        throw new AssertionError();
    }

    public static boolean isRequiresConnectivity(@NonNull PluginType pluginType, @NonNull String str) {
        C12406a.m83260d(pluginType, "type");
        C12406a.m83259c(str, "registryName");
        int i = C117971.$SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType[pluginType.ordinal()];
        if (i == 1 || i == 2) {
            return CONDITIONS_THAT_REQUIRE_CONNECTIVITY.contains(str);
        }
        if (i == 3) {
            return SETTINGS_THAT_REQUIRE_CONNECTIVITY.contains(str);
        }
        throw new AssertionError();
    }
}
