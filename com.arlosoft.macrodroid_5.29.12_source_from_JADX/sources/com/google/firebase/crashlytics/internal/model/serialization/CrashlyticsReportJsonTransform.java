package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import org.apache.http.cookie.ClientCookie;

public class CrashlyticsReportJsonTransform {

    /* renamed from: a */
    private static final DataEncoder f5425a = new JsonDataEncoderBuilder().mo23614j(AutoCrashlyticsReportEncoder.f5086a).mo23615k(true).mo23613i();

    private interface ObjectParser<T> {
        /* renamed from: a */
        T mo23483a(@NonNull JsonReader jsonReader) throws IOException;
    }

    @NonNull
    /* renamed from: A */
    private static CrashlyticsReport m7451A(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Builder b = CrashlyticsReport.m7179b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.mo23150f(m7476y(jsonReader));
                    break;
                case 1:
                    b.mo23152h(jsonReader.nextString());
                    break;
                case 2:
                    b.mo23146b(jsonReader.nextString());
                    break;
                case 3:
                    b.mo23148d(jsonReader.nextString());
                    break;
                case 4:
                    b.mo23149e(jsonReader.nextString());
                    break;
                case 5:
                    b.mo23151g(jsonReader.nextInt());
                    break;
                case 6:
                    b.mo23147c(jsonReader.nextString());
                    break;
                case 7:
                    b.mo23153i(m7452B(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.mo23145a();
    }

    @NonNull
    /* renamed from: B */
    private static CrashlyticsReport.Session m7452B(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Builder a = CrashlyticsReport.Session.m7237a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = 9;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23223l(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo23451j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a.mo23217e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    a.mo23216d(m7464m(jsonReader));
                    break;
                case 4:
                    a.mo23218f(m7462k(jsonReader, C1911a.f5426a));
                    break;
                case 5:
                    a.mo23222k(m7477z(jsonReader));
                    break;
                case 6:
                    a.mo23214b(m7460i(jsonReader));
                    break;
                case 7:
                    a.mo23224m(m7453C(jsonReader));
                    break;
                case 8:
                    a.mo23219g(jsonReader.nextString());
                    break;
                case 9:
                    a.mo23215c(jsonReader.nextBoolean());
                    break;
                case 10:
                    a.mo23220h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23213a();
    }

    @NonNull
    /* renamed from: C */
    private static CrashlyticsReport.Session.User m7453C(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.User.Builder a = CrashlyticsReport.Session.User.m7420a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a.mo23411b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo23410a();
    }

    @NonNull
    /* renamed from: i */
    private static CrashlyticsReport.Session.Application m7460i(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Application.Builder a = CrashlyticsReport.Session.Application.m7253a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals(ClientCookie.VERSION_ATTR)) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23239e(jsonReader.nextString());
                    break;
                case 1:
                    a.mo23236b(jsonReader.nextString());
                    break;
                case 2:
                    a.mo23237c(jsonReader.nextString());
                    break;
                case 3:
                    a.mo23241g(jsonReader.nextString());
                    break;
                case 4:
                    a.mo23240f(jsonReader.nextString());
                    break;
                case 5:
                    a.mo23238d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23235a();
    }

    @NonNull
    /* renamed from: j */
    private static CrashlyticsReport.ApplicationExitInfo m7461j(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.ApplicationExitInfo.Builder a = CrashlyticsReport.ApplicationExitInfo.m7192a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 1;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 3;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 4;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 5;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23167c(jsonReader.nextInt());
                    break;
                case 1:
                    a.mo23169e(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo23171g(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo23172h(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo23168d(jsonReader.nextString());
                    break;
                case 5:
                    a.mo23170f(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo23173i(jsonReader.nextString());
                    break;
                case 7:
                    a.mo23166b(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23165a();
    }

    @NonNull
    /* renamed from: k */
    private static <T> ImmutableList<T> m7462k(@NonNull JsonReader jsonReader, @NonNull ObjectParser<T> objectParser) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(objectParser.mo23483a(jsonReader));
        }
        jsonReader.endArray();
        return ImmutableList.m7424c(arrayList);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: l */
    public static CrashlyticsReport.CustomAttribute m7463l(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.CustomAttribute.Builder a = CrashlyticsReport.CustomAttribute.m7219a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a.mo23180b(jsonReader.nextString());
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                a.mo23181c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo23179a();
    }

    @NonNull
    /* renamed from: m */
    private static CrashlyticsReport.Session.Device m7464m(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Device.Builder a = CrashlyticsReport.Session.Device.m7282a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23266i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a.mo23262e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo23265h(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo23259b(jsonReader.nextInt());
                    break;
                case 4:
                    a.mo23261d(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo23260c(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo23263f(jsonReader.nextString());
                    break;
                case 7:
                    a.mo23267j(jsonReader.nextInt());
                    break;
                case 8:
                    a.mo23264g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23258a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: n */
    public static CrashlyticsReport.Session.Event m7465n(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Builder a = CrashlyticsReport.Session.Event.m7302a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23279c(m7468q(jsonReader));
                    break;
                case 1:
                    a.mo23278b(m7466o(jsonReader));
                    break;
                case 2:
                    a.mo23280d(m7472u(jsonReader));
                    break;
                case 3:
                    a.mo23282f(jsonReader.nextString());
                    break;
                case 4:
                    a.mo23281e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23277a();
    }

    @NonNull
    /* renamed from: o */
    private static CrashlyticsReport.Session.Event.Application m7466o(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Builder a = CrashlyticsReport.Session.Event.Application.m7309a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23293b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a.mo23295d(m7469r(jsonReader));
                    break;
                case 2:
                    a.mo23296e(m7462k(jsonReader, C1916f.f5431a));
                    break;
                case 3:
                    a.mo23294c(m7462k(jsonReader, C1916f.f5431a));
                    break;
                case 4:
                    a.mo23297f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23292a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: p */
    public static CrashlyticsReport.Session.Event.Application.Execution.BinaryImage m7467p(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder a = CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.m7328a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23321c(jsonReader.nextString());
                    break;
                case 1:
                    a.mo23322d(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo23453f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a.mo23320b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23319a();
    }

    @NonNull
    /* renamed from: q */
    private static CrashlyticsReport.Session.Event.Device m7468q(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Device.Builder a = CrashlyticsReport.Session.Event.Device.m7392a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23382b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a.mo23383c(jsonReader.nextInt());
                    break;
                case 2:
                    a.mo23385e(jsonReader.nextInt());
                    break;
                case 3:
                    a.mo23384d(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo23387g(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo23386f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23381a();
    }

    @NonNull
    /* renamed from: r */
    private static CrashlyticsReport.Session.Event.Application.Execution m7469r(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Builder a = CrashlyticsReport.Session.Event.Application.Execution.m7322a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23307b(m7461j(jsonReader));
                    break;
                case 1:
                    a.mo23311f(m7462k(jsonReader, C1913c.f5428a));
                    break;
                case 2:
                    a.mo23310e(m7473v(jsonReader));
                    break;
                case 3:
                    a.mo23308c(m7462k(jsonReader, C1915e.f5430a));
                    break;
                case 4:
                    a.mo23309d(m7470s(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23306a();
    }

    @NonNull
    /* renamed from: s */
    private static CrashlyticsReport.Session.Event.Application.Execution.Exception m7470s(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder a = CrashlyticsReport.Session.Event.Application.Execution.Exception.m7346a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23334c(m7462k(jsonReader, C1912b.f5427a));
                    break;
                case 1:
                    a.mo23336e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo23337f(jsonReader.nextString());
                    break;
                case 3:
                    a.mo23333b(m7470s(jsonReader));
                    break;
                case 4:
                    a.mo23335d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23332a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: t */
    public static CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame m7471t(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder a = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.m7374a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals(TypedValues.Cycle.S_WAVE_OFFSET)) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23369d(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo23371f(jsonReader.nextString());
                    break;
                case 2:
                    a.mo23370e(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo23367b(jsonReader.nextString());
                    break;
                case 4:
                    a.mo23368c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23366a();
    }

    @NonNull
    /* renamed from: u */
    private static CrashlyticsReport.Session.Event.Log m7472u(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Log.Builder a = CrashlyticsReport.Session.Event.Log.m7406a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                a.mo23393b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo23392a();
    }

    @NonNull
    /* renamed from: v */
    private static CrashlyticsReport.Session.Event.Application.Execution.Signal m7473v(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder a = CrashlyticsReport.Session.Event.Application.Execution.Signal.m7358a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23345b(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo23346c(jsonReader.nextString());
                    break;
                case 2:
                    a.mo23347d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23344a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: w */
    public static CrashlyticsReport.Session.Event.Application.Execution.Thread m7474w(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder a = CrashlyticsReport.Session.Event.Application.Execution.Thread.m7366a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23355b(m7462k(jsonReader, C1912b.f5427a));
                    break;
                case 1:
                    a.mo23357d(jsonReader.nextString());
                    break;
                case 2:
                    a.mo23356c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23354a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: x */
    public static CrashlyticsReport.FilesPayload.File m7475x(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.FilesPayload.File.Builder a = CrashlyticsReport.FilesPayload.File.m7231a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a.mo23197c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                a.mo23196b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a.mo23195a();
    }

    @NonNull
    /* renamed from: y */
    private static CrashlyticsReport.FilesPayload m7476y(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.FilesPayload.Builder a = CrashlyticsReport.FilesPayload.m7225a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a.mo23188b(m7462k(jsonReader, C1914d.f5429a));
            } else if (!nextName.equals("orgId")) {
                jsonReader.skipValue();
            } else {
                a.mo23189c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo23187a();
    }

    @NonNull
    /* renamed from: z */
    private static CrashlyticsReport.Session.OperatingSystem m7477z(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.OperatingSystem.Builder a = CrashlyticsReport.Session.OperatingSystem.m7410a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals(ClientCookie.VERSION_ATTR)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo23402b(jsonReader.nextString());
                    break;
                case 1:
                    a.mo23403c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a.mo23405e(jsonReader.nextString());
                    break;
                case 3:
                    a.mo23404d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo23401a();
    }

    @NonNull
    /* renamed from: D */
    public CrashlyticsReport mo23479D(@NonNull String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            CrashlyticsReport A = m7451A(jsonReader);
            jsonReader.close();
            return A;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    /* renamed from: E */
    public String mo23480E(@NonNull CrashlyticsReport crashlyticsReport) {
        return f5425a.encode(crashlyticsReport);
    }

    @NonNull
    /* renamed from: g */
    public CrashlyticsReport.Session.Event mo23481g(@NonNull String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            CrashlyticsReport.Session.Event n = m7465n(jsonReader);
            jsonReader.close();
            return n;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    /* renamed from: h */
    public String mo23482h(@NonNull CrashlyticsReport.Session.Event event) {
        return f5425a.encode(event);
    }
}
