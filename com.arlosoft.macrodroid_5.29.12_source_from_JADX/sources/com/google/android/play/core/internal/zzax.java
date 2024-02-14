package com.google.android.play.core.internal;

import android.content.res.AssetManager;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitcompat.zza;
import java.io.File;
import java.io.IOException;
import javax.mail.UIDFolder;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzax {

    /* renamed from: a */
    private final zza f51694a;
    @Nullable

    /* renamed from: b */
    private XmlPullParser f51695b;

    public zzax(zza zza) {
        this.f51694a = zza;
    }

    /* renamed from: a */
    public final long mo59825a() throws IOException, XmlPullParserException {
        if (this.f51695b != null) {
            while (true) {
                int next = this.f51695b.next();
                if (next != 2) {
                    if (next == 1) {
                        break;
                    }
                } else if (this.f51695b.getName().equals("manifest")) {
                    String attributeValue = this.f51695b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                    String attributeValue2 = this.f51695b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                    if (attributeValue != null) {
                        try {
                            int parseInt = Integer.parseInt(attributeValue);
                            if (attributeValue2 == null) {
                                return (long) parseInt;
                            }
                            try {
                                return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) parseInt) & UIDFolder.MAXUID);
                            } catch (NumberFormatException e) {
                                throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", new Object[]{e.getMessage()}));
                            }
                        } catch (NumberFormatException e2) {
                            throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", new Object[]{e2.getMessage()}));
                        }
                    } else {
                        throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                    }
                }
            }
            throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
        }
        throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
    }

    /* renamed from: b */
    public final void mo59826b(AssetManager assetManager, File file) throws IOException {
        this.f51695b = assetManager.openXmlResourceParser(zza.m71064b(assetManager, file), "AndroidManifest.xml");
    }
}
