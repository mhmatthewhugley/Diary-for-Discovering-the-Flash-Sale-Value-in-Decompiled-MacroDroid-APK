package com.google.firebase.encoders.json;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {

    /* renamed from: e */
    private static final ObjectEncoder<Object> f5567e = C1938a.f5584a;

    /* renamed from: f */
    private static final ValueEncoder<String> f5568f = C1940c.f5586a;

    /* renamed from: g */
    private static final ValueEncoder<Boolean> f5569g = C1939b.f5585a;

    /* renamed from: h */
    private static final TimestampEncoder f5570h = new TimestampEncoder();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<Class<?>, ObjectEncoder<?>> f5571a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<Class<?>, ValueEncoder<?>> f5572b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ObjectEncoder<Object> f5573c = f5567e;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f5574d = false;

    private static final class TimestampEncoder implements ValueEncoder<Date> {

        /* renamed from: a */
        private static final DateFormat f5576a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f5576a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private TimestampEncoder() {
        }

        /* renamed from: b */
        public void mo23609a(@NonNull Date date, @NonNull ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.mo23610d(f5576a.format(date));
        }
    }

    public JsonDataEncoderBuilder() {
        mo23617p(String.class, f5568f);
        mo23617p(Boolean.class, f5569g);
        mo23617p(Date.class, f5570h);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m7754l(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    /* renamed from: i */
    public DataEncoder mo23613i() {
        return new DataEncoder() {
            /* renamed from: a */
            public void mo23596a(@NonNull Object obj, @NonNull Writer writer) throws IOException {
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, JsonDataEncoderBuilder.this.f5571a, JsonDataEncoderBuilder.this.f5572b, JsonDataEncoderBuilder.this.f5573c, JsonDataEncoderBuilder.this.f5574d);
                jsonValueObjectEncoderContext.mo23621i(obj, false);
                jsonValueObjectEncoderContext.mo23629r();
            }

            public String encode(@NonNull Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    mo23596a(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }

    @NonNull
    /* renamed from: j */
    public JsonDataEncoderBuilder mo23614j(@NonNull Configurator configurator) {
        configurator.mo19313a(this);
        return this;
    }

    @NonNull
    /* renamed from: k */
    public JsonDataEncoderBuilder mo23615k(boolean z) {
        this.f5574d = z;
        return this;
    }

    @NonNull
    /* renamed from: o */
    public <T> JsonDataEncoderBuilder mo23612a(@NonNull Class<T> cls, @NonNull ObjectEncoder<? super T> objectEncoder) {
        this.f5571a.put(cls, objectEncoder);
        this.f5572b.remove(cls);
        return this;
    }

    @NonNull
    /* renamed from: p */
    public <T> JsonDataEncoderBuilder mo23617p(@NonNull Class<T> cls, @NonNull ValueEncoder<? super T> valueEncoder) {
        this.f5572b.put(cls, valueEncoder);
        this.f5571a.remove(cls);
        return this;
    }
}
