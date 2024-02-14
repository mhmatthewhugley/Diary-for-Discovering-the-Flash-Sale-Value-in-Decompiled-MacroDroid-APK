package com.google.firebase.abt;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class AbtExperimentInfo {

    /* renamed from: g */
    private static final String[] f53762g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    @VisibleForTesting

    /* renamed from: h */
    static final DateFormat f53763h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    private final String f53764a;

    /* renamed from: b */
    private final String f53765b;

    /* renamed from: c */
    private final String f53766c;

    /* renamed from: d */
    private final Date f53767d;

    /* renamed from: e */
    private final long f53768e;

    /* renamed from: f */
    private final long f53769f;

    public AbtExperimentInfo(String str, String str2, String str3, Date date, long j, long j2) {
        this.f53764a = str;
        this.f53765b = str2;
        this.f53766c = str3;
        this.f53767d = date;
        this.f53768e = j;
        this.f53769f = j2;
    }

    /* renamed from: a */
    static AbtExperimentInfo m74432a(Map<String, String> map) throws AbtException {
        m74433e(map);
        try {
            return new AbtExperimentInfo(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f53763h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (ParseException e) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e);
        } catch (NumberFormatException e2) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e2);
        }
    }

    /* renamed from: e */
    private static void m74433e(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f53762g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo61982b() {
        return this.f53764a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo61983c() {
        return this.f53767d.getTime();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public AnalyticsConnector.ConditionalUserProperty mo61984d(String str) {
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.f53784a = str;
        conditionalUserProperty.f53796m = mo61983c();
        conditionalUserProperty.f53785b = this.f53764a;
        conditionalUserProperty.f53786c = this.f53765b;
        conditionalUserProperty.f53787d = TextUtils.isEmpty(this.f53766c) ? null : this.f53766c;
        conditionalUserProperty.f53788e = this.f53768e;
        conditionalUserProperty.f53793j = this.f53769f;
        return conditionalUserProperty;
    }
}
