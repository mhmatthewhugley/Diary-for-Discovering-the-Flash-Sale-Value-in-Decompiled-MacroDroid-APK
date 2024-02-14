package dev.skomlach.biometric.compat.utils.device;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/device/DeviceInfo;", "", "model", "", "sensors", "", "(Ljava/lang/String;Ljava/util/Set;)V", "getModel", "()Ljava/lang/String;", "getSensors", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: DeviceInfo.kt */
public final class DeviceInfo {
    private final String model;
    private final Set<String> sensors;

    public DeviceInfo(String str, Set<String> set) {
        C13706o.m87929f(str, "model");
        C13706o.m87929f(set, "sensors");
        this.model = str;
        this.sensors = set;
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, Set<String> set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfo.model;
        }
        if ((i & 2) != 0) {
            set = deviceInfo.sensors;
        }
        return deviceInfo.copy(str, set);
    }

    public final String component1() {
        return this.model;
    }

    public final Set<String> component2() {
        return this.sensors;
    }

    public final DeviceInfo copy(String str, Set<String> set) {
        C13706o.m87929f(str, "model");
        C13706o.m87929f(set, "sensors");
        return new DeviceInfo(str, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return C13706o.m87924a(this.model, deviceInfo.model) && C13706o.m87924a(this.sensors, deviceInfo.sensors);
    }

    public final String getModel() {
        return this.model;
    }

    public final Set<String> getSensors() {
        return this.sensors;
    }

    public int hashCode() {
        return (this.model.hashCode() * 31) + this.sensors.hashCode();
    }

    public String toString() {
        String str = this.model;
        Set<String> set = this.sensors;
        return "DeviceInfo(model=" + str + ", sensors=" + set + ")";
    }
}
