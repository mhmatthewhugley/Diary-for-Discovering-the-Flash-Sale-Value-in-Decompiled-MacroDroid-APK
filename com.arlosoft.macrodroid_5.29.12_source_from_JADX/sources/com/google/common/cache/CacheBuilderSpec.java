package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Splitter;
import com.google.common.cache.LocalCache;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class CacheBuilderSpec {

    /* renamed from: o */
    private static final Splitter f4302o = Splitter.m5427f(',').mo22237m();

    /* renamed from: p */
    private static final Splitter f4303p = Splitter.m5427f('=').mo22237m();

    /* renamed from: q */
    private static final ImmutableMap<String, ValueParser> f4304q;
    @VisibleForTesting

    /* renamed from: a */
    Integer f4305a;
    @VisibleForTesting

    /* renamed from: b */
    Long f4306b;
    @VisibleForTesting

    /* renamed from: c */
    Long f4307c;
    @VisibleForTesting

    /* renamed from: d */
    Integer f4308d;
    @VisibleForTesting

    /* renamed from: e */
    LocalCache.Strength f4309e;
    @VisibleForTesting

    /* renamed from: f */
    LocalCache.Strength f4310f;
    @VisibleForTesting

    /* renamed from: g */
    Boolean f4311g;
    @VisibleForTesting

    /* renamed from: h */
    long f4312h;
    @VisibleForTesting

    /* renamed from: i */
    TimeUnit f4313i;
    @VisibleForTesting

    /* renamed from: j */
    long f4314j;
    @VisibleForTesting

    /* renamed from: k */
    TimeUnit f4315k;
    @VisibleForTesting

    /* renamed from: l */
    long f4316l;
    @VisibleForTesting

    /* renamed from: m */
    TimeUnit f4317m;

    /* renamed from: n */
    private final String f4318n;

    /* renamed from: com.google.common.cache.CacheBuilderSpec$1 */
    static /* synthetic */ class C17801 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4319a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.cache.LocalCache$Strength[] r0 = com.google.common.cache.LocalCache.Strength.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4319a = r0
                com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.WEAK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4319a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.SOFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.CacheBuilderSpec.C17801.<clinit>():void");
        }
    }

    static class AccessDurationParser extends DurationParser {
        AccessDurationParser() {
        }
    }

    static class ConcurrencyLevelParser extends IntegerParser {
        ConcurrencyLevelParser() {
        }
    }

    static abstract class DurationParser implements ValueParser {
        DurationParser() {
        }
    }

    static class InitialCapacityParser extends IntegerParser {
        InitialCapacityParser() {
        }
    }

    static abstract class IntegerParser implements ValueParser {
        IntegerParser() {
        }
    }

    static class KeyStrengthParser implements ValueParser {

        /* renamed from: a */
        private final LocalCache.Strength f4320a;

        public KeyStrengthParser(LocalCache.Strength strength) {
            this.f4320a = strength;
        }
    }

    static abstract class LongParser implements ValueParser {
        LongParser() {
        }
    }

    static class MaximumSizeParser extends LongParser {
        MaximumSizeParser() {
        }
    }

    static class MaximumWeightParser extends LongParser {
        MaximumWeightParser() {
        }
    }

    static class RecordStatsParser implements ValueParser {
        RecordStatsParser() {
        }
    }

    static class RefreshDurationParser extends DurationParser {
        RefreshDurationParser() {
        }
    }

    private interface ValueParser {
    }

    static class ValueStrengthParser implements ValueParser {

        /* renamed from: a */
        private final LocalCache.Strength f4321a;

        public ValueStrengthParser(LocalCache.Strength strength) {
            this.f4321a = strength;
        }
    }

    static class WriteDurationParser extends DurationParser {
        WriteDurationParser() {
        }
    }

    static {
        ImmutableMap.Builder g = ImmutableMap.m27348a().mo35338g("initialCapacity", new InitialCapacityParser()).mo35338g("maximumSize", new MaximumSizeParser()).mo35338g("maximumWeight", new MaximumWeightParser()).mo35338g("concurrencyLevel", new ConcurrencyLevelParser());
        LocalCache.Strength strength = LocalCache.Strength.WEAK;
        f4304q = g.mo35338g("weakKeys", new KeyStrengthParser(strength)).mo35338g("softValues", new ValueStrengthParser(LocalCache.Strength.SOFT)).mo35338g("weakValues", new ValueStrengthParser(strength)).mo35338g("recordStats", new RecordStatsParser()).mo35338g("expireAfterAccess", new AccessDurationParser()).mo35338g("expireAfterWrite", new WriteDurationParser()).mo35338g("refreshAfterWrite", new RefreshDurationParser()).mo35338g("refreshInterval", new RefreshDurationParser()).mo35337d();
    }

    /* renamed from: a */
    private static Long m5557a(long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j));
    }

    /* renamed from: b */
    public String mo22315b() {
        return this.f4318n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheBuilderSpec)) {
            return false;
        }
        CacheBuilderSpec cacheBuilderSpec = (CacheBuilderSpec) obj;
        if (!Objects.m5349a(this.f4305a, cacheBuilderSpec.f4305a) || !Objects.m5349a(this.f4306b, cacheBuilderSpec.f4306b) || !Objects.m5349a(this.f4307c, cacheBuilderSpec.f4307c) || !Objects.m5349a(this.f4308d, cacheBuilderSpec.f4308d) || !Objects.m5349a(this.f4309e, cacheBuilderSpec.f4309e) || !Objects.m5349a(this.f4310f, cacheBuilderSpec.f4310f) || !Objects.m5349a(this.f4311g, cacheBuilderSpec.f4311g) || !Objects.m5349a(m5557a(this.f4312h, this.f4313i), m5557a(cacheBuilderSpec.f4312h, cacheBuilderSpec.f4313i)) || !Objects.m5349a(m5557a(this.f4314j, this.f4315k), m5557a(cacheBuilderSpec.f4314j, cacheBuilderSpec.f4315k)) || !Objects.m5349a(m5557a(this.f4316l, this.f4317m), m5557a(cacheBuilderSpec.f4316l, cacheBuilderSpec.f4317m))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m5350b(this.f4305a, this.f4306b, this.f4307c, this.f4308d, this.f4309e, this.f4310f, this.f4311g, m5557a(this.f4312h, this.f4313i), m5557a(this.f4314j, this.f4315k), m5557a(this.f4316l, this.f4317m));
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22196k(mo22315b()).toString();
    }
}
