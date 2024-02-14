package com.facebook.stetho.common.android;

import android.content.res.Resources;
import com.facebook.stetho.common.LogUtil;

public class ResourcesUtil {
    private ResourcesUtil() {
    }

    private static String getFallbackIdString(int i) {
        return "#" + Integer.toHexString(i);
    }

    public static String getIdString(Resources resources, int i) throws Resources.NotFoundException {
        String str;
        if (resources == null) {
            return getFallbackIdString(i);
        }
        String str2 = "";
        if (getResourcePackageId(i) != 127) {
            str2 = resources.getResourcePackageName(i);
            str = ":";
        } else {
            str = str2;
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(str2);
        sb.append(str);
        sb.append(resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        return sb.toString();
    }

    public static String getIdStringQuietly(Object obj, Resources resources, int i) {
        try {
            return getIdString(resources, i);
        } catch (Resources.NotFoundException unused) {
            String fallbackIdString = getFallbackIdString(i);
            LogUtil.m25490w("Unknown identifier encountered on " + obj + ": " + fallbackIdString);
            return fallbackIdString;
        }
    }

    private static int getResourcePackageId(int i) {
        return (i >>> 24) & 255;
    }
}
