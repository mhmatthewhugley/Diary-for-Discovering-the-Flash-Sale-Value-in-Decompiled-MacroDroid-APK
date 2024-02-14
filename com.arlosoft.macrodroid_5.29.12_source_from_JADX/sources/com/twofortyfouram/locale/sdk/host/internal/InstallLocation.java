package com.twofortyfouram.locale.sdk.host.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import androidx.annotation.NonNull;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p276h8.C12406a;
import p295j8.C13301a;

public enum InstallLocation {
    auto,
    internalOnly,
    preferExternal,
    MISSING,
    UNKNOWN;
    
    static final int MANIFEST_INSTALL_LOCATION_AUTO = 0;
    static final int MANIFEST_INSTALL_LOCATION_INTERNAL_ONLY = 1;
    static final int MANIFEST_INSTALL_LOCATION_PREFER_EXTERNAL = 2;

    @NonNull
    static InstallLocation getInstallLocation(int i) {
        if (i == 0) {
            return auto;
        }
        if (i == 1) {
            return internalOnly;
        }
        if (i != 2) {
            return UNKNOWN;
        }
        return preferExternal;
    }

    @NonNull
    private static InstallLocation getInstallLocationLegacy(@NonNull Context context, @NonNull String str) throws PackageManager.NameNotFoundException, XmlPullParserException, IOException {
        C12406a.m83260d(context, "context");
        C12406a.m83260d(str, "packageName");
        XmlResourceParser openXmlResourceParser = context.createPackageContext(str, 4).getAssets().openXmlResourceParser("AndroidManifest.xml");
        try {
            for (int eventType = openXmlResourceParser.getEventType(); 1 != eventType; eventType = openXmlResourceParser.nextToken()) {
                if (eventType == 2) {
                    if (openXmlResourceParser.getName().matches("manifest")) {
                        for (int i = 0; i < openXmlResourceParser.getAttributeCount(); i++) {
                            if (openXmlResourceParser.getAttributeName(i).matches("installLocation")) {
                                return getInstallLocation(Integer.parseInt(openXmlResourceParser.getAttributeValue(i)));
                            }
                        }
                    }
                }
            }
            InstallLocation installLocation = MISSING;
            openXmlResourceParser.close();
            return installLocation;
        } finally {
            openXmlResourceParser.close();
        }
    }

    @NonNull
    private static InstallLocation getInstallLocationLollipop(@NonNull Context context, @NonNull String str) throws PackageManager.NameNotFoundException {
        C12406a.m83260d(context, "context");
        C12406a.m83260d(str, "packageName");
        return getInstallLocation(context.getPackageManager().getPackageInfo(str, 0).installLocation);
    }

    @NonNull
    public static InstallLocation getManifestInstallLocation(@NonNull Context context, @NonNull String str) throws PackageManager.NameNotFoundException, XmlPullParserException, IOException {
        C12406a.m83260d(context, "context");
        C12406a.m83260d(str, "packageName");
        if (C13301a.m85633a(21)) {
            return getInstallLocationLollipop(context, str);
        }
        return getInstallLocationLegacy(context, str);
    }
}
