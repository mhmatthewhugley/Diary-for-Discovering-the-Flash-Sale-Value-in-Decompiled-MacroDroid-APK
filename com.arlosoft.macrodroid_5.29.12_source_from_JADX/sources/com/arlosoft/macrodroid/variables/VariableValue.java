package com.arlosoft.macrodroid.variables;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.arlosoft.macrodroid.extensions.C4660g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import org.apache.commons.p353io.IOUtils;
import p014b3.C1405a;
import p148q0.C8151a;
import p370qa.C16265l;

@DontObfuscate
/* compiled from: VariableValue.kt */
public abstract class VariableValue implements Parcelable {
    public static final C6485a Companion = new C6485a((C13695i) null);
    private List<String> parentKeys;
    private final String type;

    @DontObfuscate
    /* compiled from: VariableValue.kt */
    public static final class BooleanValue extends VariableValue {
        public static final Parcelable.Creator<BooleanValue> CREATOR = new C6472b();
        public static final C6471a Companion = new C6471a((C13695i) null);
        private final boolean booleanValue;
        private final List<String> parents;
        private final int variableType;

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$BooleanValue$a */
        /* compiled from: VariableValue.kt */
        public static final class C6471a {
            private C6471a() {
            }

            public /* synthetic */ C6471a(C13695i iVar) {
                this();
            }

            /* renamed from: a */
            public final VariableValue mo32551a(String str, List<String> list) {
                C13706o.m87929f(str, "stringValue");
                String lowerCase = str.toLowerCase(Locale.ROOT);
                C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                boolean z = true;
                if (!C13706o.m87924a(lowerCase, "true") && !C15176v.m93641v(str, MacroDroidApplication.f9883I.mo27303b().getString(C17541R$string.true_label), true)) {
                    z = false;
                }
                return new BooleanValue(z, list);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$BooleanValue$b */
        /* compiled from: VariableValue.kt */
        public static final class C6472b implements Parcelable.Creator<BooleanValue> {
            /* renamed from: a */
            public final BooleanValue createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                return new BooleanValue(parcel.readInt() != 0, parcel.createStringArrayList());
            }

            /* renamed from: b */
            public final BooleanValue[] newArray(int i) {
                return new BooleanValue[i];
            }
        }

        public BooleanValue() {
            this(false, (List) null, 3, (C13695i) null);
        }

        public BooleanValue(boolean z, List<String> list) {
            super(list, (C13695i) null);
            this.booleanValue = z;
            this.parents = list;
        }

        public static /* synthetic */ BooleanValue copy$default(BooleanValue booleanValue2, boolean z, List<String> list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = booleanValue2.booleanValue;
            }
            if ((i & 2) != 0) {
                list = booleanValue2.parents;
            }
            return booleanValue2.copy(z, list);
        }

        public final boolean component1() {
            return this.booleanValue;
        }

        public final List<String> component2() {
            return this.parents;
        }

        public final BooleanValue copy(boolean z, List<String> list) {
            return new BooleanValue(z, list);
        }

        public VariableValue copy() {
            return new BooleanValue(this.booleanValue, this.parents);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BooleanValue)) {
                return false;
            }
            BooleanValue booleanValue2 = (BooleanValue) obj;
            return this.booleanValue == booleanValue2.booleanValue && C13706o.m87924a(this.parents, booleanValue2.parents);
        }

        public final boolean getBooleanValue() {
            return this.booleanValue;
        }

        public final List<String> getParents() {
            return this.parents;
        }

        public String getValueAsText() {
            return String.valueOf(this.booleanValue);
        }

        public int getVariableType() {
            return this.variableType;
        }

        public int hashCode() {
            boolean z = this.booleanValue;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            List<String> list = this.parents;
            return i + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "BooleanValue(booleanValue=" + this.booleanValue + ", parents=" + this.parents + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeInt(this.booleanValue ? 1 : 0);
            parcel.writeStringList(this.parents);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BooleanValue(boolean z, List list, int i, C13695i iVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list);
        }
    }

    @DontObfuscate
    /* compiled from: VariableValue.kt */
    public static final class Empty extends VariableValue {
        public static final Parcelable.Creator<Empty> CREATOR = new C6480a();
        public static final Empty INSTANCE = new Empty();
        private static final int variableType = -1;

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$Empty$a */
        /* compiled from: VariableValue.kt */
        public static final class C6480a implements Parcelable.Creator<Empty> {
            /* renamed from: a */
            public final Empty createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                parcel.readInt();
                return Empty.INSTANCE;
            }

            /* renamed from: b */
            public final Empty[] newArray(int i) {
                return new Empty[i];
            }
        }

        private Empty() {
            super((C13695i) null);
        }

        public VariableValue copy() {
            return INSTANCE;
        }

        public int describeContents() {
            return 0;
        }

        public String getValueAsText() {
            return "";
        }

        public int getVariableType() {
            return variableType;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$a */
    /* compiled from: VariableValue.kt */
    public static final class C6485a {
        private C6485a() {
        }

        public /* synthetic */ C6485a(C13695i iVar) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ VariableValue m24840d(C6485a aVar, String str, int i, List list, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                list = null;
            }
            return aVar.mo32660c(str, i, list);
        }

        /* renamed from: a */
        public final VariableValue mo32658a(int i) {
            if (i == 0) {
                return new BooleanValue(false, (List) null, 2, (C13695i) null);
            }
            if (i == 1) {
                return new IntegerValue(0, (List) null, 2, (C13695i) null);
            }
            if (i == 2) {
                return new StringValue("", (List) null, 2, (C13695i) null);
            }
            if (i == 3) {
                return new DecimalValue(0.0d, (List) null, 2, (C13695i) null);
            }
            if (i == 4) {
                return new Dictionary(new ArrayList(), false, (List) null, 6, (C13695i) null);
            }
            if (i != 5) {
                return Empty.INSTANCE;
            }
            return new Dictionary(new ArrayList(), true, (List) null, 4, (C13695i) null);
        }

        /* renamed from: b */
        public final VariableValue mo32659b(int i, List<String> list) {
            C13706o.m87929f(list, "parents");
            if (i == 0) {
                return new BooleanValue(false, list);
            }
            if (i == 1) {
                return new IntegerValue(0, list);
            }
            if (i == 2) {
                return new StringValue("", list);
            }
            if (i == 3) {
                return new DecimalValue(0.0d, list);
            }
            if (i == 4) {
                return new Dictionary(new ArrayList(), false, list);
            }
            if (i != 5) {
                return Empty.INSTANCE;
            }
            return new Dictionary(new ArrayList(), true, list);
        }

        /* renamed from: c */
        public final VariableValue mo32660c(String str, int i, List<String> list) {
            if (str == null) {
                str = "";
            }
            if (i == 0) {
                return BooleanValue.Companion.mo32551a(str, list);
            }
            if (i == 1) {
                return IntegerValue.Companion.mo32638a(str, list);
            }
            if (i == 2) {
                return StringValue.Companion.mo32653a(str, list);
            }
            if (i != 3) {
                return Empty.INSTANCE;
            }
            return DecimalValue.Companion.mo32566a(str, list);
        }
    }

    private VariableValue(List<String> list) {
        this.parentKeys = list;
        String simpleName = getClass().getSimpleName();
        C13706o.m87928e(simpleName, "this.javaClass.simpleName");
        this.type = simpleName;
    }

    public /* synthetic */ VariableValue(List list, C13695i iVar) {
        this((List<String>) list);
    }

    public /* synthetic */ VariableValue(C13695i iVar) {
        this();
    }

    public static final VariableValue createForType(int i) {
        return Companion.mo32658a(i);
    }

    public static final VariableValue createForType(int i, List<String> list) {
        return Companion.mo32659b(i, list);
    }

    public static final VariableValue fromTextValueForType(String str, int i, List<String> list) {
        return Companion.mo32660c(str, i, list);
    }

    public abstract VariableValue copy();

    public String getComparisonValueAsText() {
        return getValueAsText();
    }

    public final List<String> getParentKeys() {
        return this.parentKeys;
    }

    public final String getType() {
        return this.type;
    }

    public abstract String getValueAsText();

    public abstract int getVariableType();

    public final void setParentKeys(List<String> list) {
        this.parentKeys = list;
    }

    @DontObfuscate
    /* compiled from: VariableValue.kt */
    public static final class DecimalValue extends VariableValue {
        public static final Parcelable.Creator<DecimalValue> CREATOR = new C6474b();
        public static final C6473a Companion = new C6473a((C13695i) null);
        private final double decimalValue;
        private final List<String> parents;
        private final int variableType;

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$DecimalValue$a */
        /* compiled from: VariableValue.kt */
        public static final class C6473a {
            private C6473a() {
            }

            public /* synthetic */ C6473a(C13695i iVar) {
                this();
            }

            /* renamed from: a */
            public final VariableValue mo32566a(String str, List<String> list) {
                C13706o.m87929f(str, "stringValue");
                Double j = C15174t.m93620j(str);
                return new DecimalValue(j != null ? j.doubleValue() : 0.0d, list);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$DecimalValue$b */
        /* compiled from: VariableValue.kt */
        public static final class C6474b implements Parcelable.Creator<DecimalValue> {
            /* renamed from: a */
            public final DecimalValue createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                return new DecimalValue(parcel.readDouble(), parcel.createStringArrayList());
            }

            /* renamed from: b */
            public final DecimalValue[] newArray(int i) {
                return new DecimalValue[i];
            }
        }

        public DecimalValue() {
            this(0.0d, (List) null, 3, (C13695i) null);
        }

        public DecimalValue(double d, List<String> list) {
            super(list, (C13695i) null);
            this.decimalValue = d;
            this.parents = list;
            this.variableType = 3;
        }

        public static /* synthetic */ DecimalValue copy$default(DecimalValue decimalValue2, double d, List<String> list, int i, Object obj) {
            if ((i & 1) != 0) {
                d = decimalValue2.decimalValue;
            }
            if ((i & 2) != 0) {
                list = decimalValue2.parents;
            }
            return decimalValue2.copy(d, list);
        }

        public final double component1() {
            return this.decimalValue;
        }

        public final List<String> component2() {
            return this.parents;
        }

        public final DecimalValue copy(double d, List<String> list) {
            return new DecimalValue(d, list);
        }

        public VariableValue copy() {
            return new DecimalValue(this.decimalValue, this.parents);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DecimalValue)) {
                return false;
            }
            DecimalValue decimalValue2 = (DecimalValue) obj;
            return C13706o.m87924a(Double.valueOf(this.decimalValue), Double.valueOf(decimalValue2.decimalValue)) && C13706o.m87924a(this.parents, decimalValue2.parents);
        }

        public final double getDecimalValue() {
            return this.decimalValue;
        }

        public final List<String> getParents() {
            return this.parents;
        }

        public String getValueAsText() {
            return String.valueOf(this.decimalValue);
        }

        public int getVariableType() {
            return this.variableType;
        }

        public int hashCode() {
            int a = Double.doubleToLongBits(this.decimalValue) * 31;
            List<String> list = this.parents;
            return a + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "DecimalValue(decimalValue=" + this.decimalValue + ", parents=" + this.parents + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeDouble(this.decimalValue);
            parcel.writeStringList(this.parents);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DecimalValue(double d, List list, int i, C13695i iVar) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? null : list);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DecimalValue(java.lang.String r9) {
            /*
                r8 = this;
                java.lang.String r0 = "valueAsString"
                kotlin.jvm.internal.C13706o.m87929f(r9, r0)
                double r0 = java.lang.Double.parseDouble(r9)     // Catch:{ Exception -> 0x000b }
            L_0x0009:
                r3 = r0
                goto L_0x000e
            L_0x000b:
                r0 = 0
                goto L_0x0009
            L_0x000e:
                r5 = 0
                r6 = 2
                r7 = 0
                r2 = r8
                r2.<init>(r3, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.VariableValue.DecimalValue.<init>(java.lang.String):void");
        }
    }

    @DontObfuscate
    /* compiled from: VariableValue.kt */
    public static final class Dictionary extends VariableValue {
        public static final Parcelable.Creator<Dictionary> CREATOR = new C6475a();
        private final List<DictionaryEntry> entries;
        private final boolean isArray;
        private final List<String> parents;
        private final int variableType;

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$Dictionary$a */
        /* compiled from: VariableValue.kt */
        public static final class C6475a implements Parcelable.Creator<Dictionary> {
            /* renamed from: a */
            public final Dictionary createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                boolean z = false;
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(DictionaryEntry.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new Dictionary(arrayList, z, parcel.createStringArrayList());
            }

            /* renamed from: b */
            public final Dictionary[] newArray(int i) {
                return new Dictionary[i];
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$Dictionary$b */
        /* compiled from: Comparisons.kt */
        public static final class C6476b<T> implements Comparator {
            public final int compare(T t, T t2) {
                int i;
                int i2 = 0;
                try {
                    i = Integer.parseInt(((DictionaryEntry) t).getKey());
                } catch (Exception unused) {
                    i = 0;
                }
                Integer valueOf = Integer.valueOf(i);
                try {
                    i2 = Integer.parseInt(((DictionaryEntry) t2).getKey());
                } catch (Exception unused2) {
                }
                return C15612b.m94865a(valueOf, Integer.valueOf(i2));
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$Dictionary$c */
        /* compiled from: VariableValue.kt */
        static final class C6477c extends C13708q implements C16265l<DictionaryEntry, Boolean> {
            final /* synthetic */ String $keyName;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6477c(String str) {
                super(1);
                this.$keyName = str;
            }

            /* renamed from: a */
            public final Boolean invoke(DictionaryEntry dictionaryEntry) {
                C13706o.m87929f(dictionaryEntry, "it");
                return Boolean.valueOf(C13706o.m87924a(dictionaryEntry.getKey(), this.$keyName));
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$Dictionary$d */
        /* compiled from: VariableValue.kt */
        static final class C6478d extends C13708q implements C16265l<DictionaryEntry, CharSequence> {

            /* renamed from: a */
            public static final C6478d f15106a = new C6478d();

            C6478d() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(DictionaryEntry dictionaryEntry) {
                C13706o.m87929f(dictionaryEntry, "it");
                return '[' + dictionaryEntry.getKey() + "]: " + dictionaryEntry.getVariable().getValueAsText();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Dictionary(List<DictionaryEntry> list, boolean z, List<String> list2) {
            super(list2, (C13695i) null);
            C13706o.m87929f(list, "entries");
            this.entries = list;
            this.isArray = z;
            this.parents = list2;
            this.variableType = z ? 5 : 4;
        }

        public static /* synthetic */ Dictionary copy$default(Dictionary dictionary, List<DictionaryEntry> list, boolean z, List<String> list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = dictionary.entries;
            }
            if ((i & 2) != 0) {
                z = dictionary.isArray;
            }
            if ((i & 4) != 0) {
                list2 = dictionary.parents;
            }
            return dictionary.copy(list, z, list2);
        }

        /* access modifiers changed from: private */
        /* renamed from: getEntriesSorted$lambda-1  reason: not valid java name */
        public static final int m101286getEntriesSorted$lambda1(DictionaryEntry dictionaryEntry, DictionaryEntry dictionaryEntry2) {
            int compareTo = C4660g.m18126d(dictionaryEntry.getKey()).compareTo(C4660g.m18126d(dictionaryEntry2.getKey()));
            if (compareTo == 0) {
                return C4660g.m18124b(dictionaryEntry.getKey()) < C4660g.m18124b(dictionaryEntry2.getKey()) ? -1 : 1;
            }
            return compareTo;
        }

        public final void clearAll() {
            int i = 0;
            for (T next : this.entries) {
                int i2 = i + 1;
                if (i < 0) {
                    C13614t.m87758t();
                }
                this.entries.set(i, DictionaryEntry.copy$default((DictionaryEntry) next, (String) null, Empty.INSTANCE, (List) null, 5, (Object) null));
                i = i2;
            }
        }

        public final List<DictionaryEntry> component1() {
            return this.entries;
        }

        public final boolean component2() {
            return this.isArray;
        }

        public final List<String> component3() {
            return this.parents;
        }

        public final Dictionary copy(List<DictionaryEntry> list, boolean z, List<String> list2) {
            C13706o.m87929f(list, "entries");
            return new Dictionary(list, z, list2);
        }

        public VariableValue copy() {
            return new Dictionary(this.entries, this.isArray, (List) null, 4, (C13695i) null);
        }

        public final void deleteAll() {
            this.entries.clear();
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dictionary)) {
                return false;
            }
            Dictionary dictionary = (Dictionary) obj;
            return C13706o.m87924a(this.entries, dictionary.entries) && this.isArray == dictionary.isArray && C13706o.m87924a(this.parents, dictionary.parents);
        }

        public String getComparisonValueAsText() {
            StringBuilder sb = new StringBuilder();
            for (DictionaryEntry variable : this.entries) {
                sb.append(variable.getVariable().getComparisonValueAsText());
            }
            String sb2 = sb.toString();
            C13706o.m87928e(sb2, "stringBuilder.toString()");
            return sb2;
        }

        public final List<DictionaryEntry> getDictionaryOrArryEntriesOnly() {
            List<DictionaryEntry> list = this.entries;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((DictionaryEntry) next).getVariable() instanceof Dictionary) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public final List<DictionaryEntry> getEntries() {
            return this.entries;
        }

        public final List<DictionaryEntry> getEntriesArrayOrder() {
            return C13566b0.m87450y0(this.entries, new C6476b());
        }

        public final List<DictionaryEntry> getEntriesSorted() {
            if (this.isArray) {
                return getEntriesArrayOrder();
            }
            List<DictionaryEntry> I0 = C13566b0.m87405I0(this.entries);
            try {
                C13622x.m87781y(I0, C6593r0.f15300a);
                return I0;
            } catch (Exception e) {
                C8151a.m33860a(this.entries.toString());
                C8151a.m33873n(e);
                return C13566b0.m87405I0(this.entries);
            }
        }

        public final DictionaryEntry getEntry(String str) {
            T t;
            C13706o.m87929f(str, "keyName");
            Iterator<T> it = this.entries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C13706o.m87924a(((DictionaryEntry) t).getKey(), str)) {
                    break;
                }
            }
            return (DictionaryEntry) t;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
            if (hasNumericalChildren((com.arlosoft.macrodroid.variables.VariableValue.Dictionary) r3) != false) goto L_0x0044;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x000b A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.arlosoft.macrodroid.variables.VariableValue.DictionaryEntry> getNumEntriesOnly() {
            /*
                r5 = this;
                java.util.List<com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry> r0 = r5.entries
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x000b:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x004b
                java.lang.Object r2 = r0.next()
                r3 = r2
                com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry r3 = (com.arlosoft.macrodroid.variables.VariableValue.DictionaryEntry) r3
                com.arlosoft.macrodroid.variables.VariableValue r4 = r3.getVariable()
                boolean r4 = r4 instanceof com.arlosoft.macrodroid.variables.VariableValue.IntegerValue
                if (r4 != 0) goto L_0x0044
                com.arlosoft.macrodroid.variables.VariableValue r4 = r3.getVariable()
                boolean r4 = r4 instanceof com.arlosoft.macrodroid.variables.VariableValue.DecimalValue
                if (r4 != 0) goto L_0x0044
                com.arlosoft.macrodroid.variables.VariableValue r4 = r3.getVariable()
                boolean r4 = r4 instanceof com.arlosoft.macrodroid.variables.VariableValue.Dictionary
                if (r4 == 0) goto L_0x0042
                com.arlosoft.macrodroid.variables.VariableValue r3 = r3.getVariable()
                java.lang.String r4 = "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary"
                kotlin.jvm.internal.C13706o.m87927d(r3, r4)
                com.arlosoft.macrodroid.variables.VariableValue$Dictionary r3 = (com.arlosoft.macrodroid.variables.VariableValue.Dictionary) r3
                boolean r3 = r5.hasNumericalChildren(r3)
                if (r3 == 0) goto L_0x0042
                goto L_0x0044
            L_0x0042:
                r3 = 0
                goto L_0x0045
            L_0x0044:
                r3 = 1
            L_0x0045:
                if (r3 == 0) goto L_0x000b
                r1.add(r2)
                goto L_0x000b
            L_0x004b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.VariableValue.Dictionary.getNumEntriesOnly():java.util.List");
        }

        public final List<String> getParents() {
            return this.parents;
        }

        public String getValueAsText() {
            C13696i0 i0Var = C13696i0.f61931a;
            String string = MacroDroidApplication.f9883I.mo27303b().getString(C17541R$string.variable_multi_entry_num_entries);
            C13706o.m87928e(string, "MacroDroidApplication.in…_multi_entry_num_entries)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.entries.size())}, 1));
            C13706o.m87928e(format, "format(format, *args)");
            return format;
        }

        public int getVariableType() {
            return this.variableType;
        }

        public final boolean hasArrayChildren(Dictionary dictionary) {
            C13706o.m87929f(dictionary, "dictionary");
            for (DictionaryEntry dictionaryEntry : dictionary.entries) {
                if (dictionaryEntry.getVariable() instanceof Dictionary) {
                    VariableValue variable = dictionaryEntry.getVariable();
                    C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                    if (((Dictionary) variable).isArray) {
                        return true;
                    }
                }
                if (dictionaryEntry.getVariable() instanceof Dictionary) {
                    VariableValue variable2 = dictionaryEntry.getVariable();
                    C13706o.m87927d(variable2, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                    if (hasArrayChildren((Dictionary) variable2)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean hasBooleanChildren(Dictionary dictionary) {
            C13706o.m87929f(dictionary, "dictionary");
            for (DictionaryEntry dictionaryEntry : dictionary.entries) {
                if (dictionaryEntry.getVariable() instanceof BooleanValue) {
                    return true;
                }
                if (dictionaryEntry.getVariable() instanceof Dictionary) {
                    VariableValue variable = dictionaryEntry.getVariable();
                    C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                    if (hasBooleanChildren((Dictionary) variable)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean hasDictionaryChildren(Dictionary dictionary) {
            C13706o.m87929f(dictionary, "dictionary");
            for (DictionaryEntry dictionaryEntry : dictionary.entries) {
                if (dictionaryEntry.getVariable() instanceof Dictionary) {
                    VariableValue variable = dictionaryEntry.getVariable();
                    C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                    if (!((Dictionary) variable).isArray) {
                        return true;
                    }
                }
                if (dictionaryEntry.getVariable() instanceof Dictionary) {
                    VariableValue variable2 = dictionaryEntry.getVariable();
                    C13706o.m87927d(variable2, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                    if (hasDictionaryChildren((Dictionary) variable2)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean hasNumericalChildren(Dictionary dictionary) {
            C13706o.m87929f(dictionary, "dictionary");
            for (DictionaryEntry dictionaryEntry : dictionary.entries) {
                if (!(dictionaryEntry.getVariable() instanceof IntegerValue) && !(dictionaryEntry.getVariable() instanceof DecimalValue)) {
                    if (dictionaryEntry.getVariable() instanceof Dictionary) {
                        VariableValue variable = dictionaryEntry.getVariable();
                        C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                        if (hasNumericalChildren((Dictionary) variable)) {
                        }
                    }
                }
                return true;
            }
            return false;
        }

        public final boolean hasStringChildren(Dictionary dictionary) {
            C13706o.m87929f(dictionary, "dictionary");
            for (DictionaryEntry dictionaryEntry : dictionary.entries) {
                if (dictionaryEntry.getVariable() instanceof StringValue) {
                    return true;
                }
                if (dictionaryEntry.getVariable() instanceof Dictionary) {
                    VariableValue variable = dictionaryEntry.getVariable();
                    C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                    if (hasStringChildren((Dictionary) variable)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.entries.hashCode() * 31;
            boolean z = this.isArray;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            List<String> list = this.parents;
            return i + (list == null ? 0 : list.hashCode());
        }

        public final boolean isArray() {
            return this.isArray;
        }

        public final void removeEntry(DictionaryEntry dictionaryEntry) {
            C13706o.m87929f(dictionaryEntry, "entry");
            this.entries.remove(dictionaryEntry);
        }

        public final void removeKey(String str) {
            C13706o.m87929f(str, "keyName");
            boolean unused = C13624y.m87795D(this.entries, new C6477c(str));
        }

        public final void setEntry(DictionaryEntry dictionaryEntry) {
            C13706o.m87929f(dictionaryEntry, "entry");
            Iterator<DictionaryEntry> it = this.entries.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C13706o.m87924a(it.next().getKey(), dictionaryEntry.getKey())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                this.entries.set(i, dictionaryEntry);
            } else {
                this.entries.add(dictionaryEntry);
            }
        }

        public String toString() {
            return C13566b0.m87432g0(getEntriesSorted(), IOUtils.LINE_SEPARATOR_UNIX, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C6478d.f15106a, 30, (Object) null);
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            List<DictionaryEntry> list = this.entries;
            parcel.writeInt(list.size());
            for (DictionaryEntry writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.isArray ? 1 : 0);
            parcel.writeStringList(this.parents);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Dictionary(List list, boolean z, List list2, int i, C13695i iVar) {
            this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : list2);
        }
    }

    @DontObfuscate
    /* compiled from: VariableValue.kt */
    public static final class DictionaryEntry extends VariableValue {
        public static final Parcelable.Creator<DictionaryEntry> CREATOR = new C6479a();
        private final String key;
        private final List<String> parents;
        private VariableValue variable;
        private final int variableType;

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry$a */
        /* compiled from: VariableValue.kt */
        public static final class C6479a implements Parcelable.Creator<DictionaryEntry> {
            /* renamed from: a */
            public final DictionaryEntry createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                return new DictionaryEntry(parcel.readString(), (VariableValue) parcel.readParcelable(DictionaryEntry.class.getClassLoader()), parcel.createStringArrayList());
            }

            /* renamed from: b */
            public final DictionaryEntry[] newArray(int i) {
                return new DictionaryEntry[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DictionaryEntry(String str, VariableValue variableValue, List<String> list) {
            super(list, (C13695i) null);
            C13706o.m87929f(str, "key");
            C13706o.m87929f(variableValue, "variable");
            this.key = str;
            this.variable = variableValue;
            this.parents = list;
            this.variableType = 11;
        }

        public static /* synthetic */ DictionaryEntry copy$default(DictionaryEntry dictionaryEntry, String str, VariableValue variableValue, List<String> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dictionaryEntry.key;
            }
            if ((i & 2) != 0) {
                variableValue = dictionaryEntry.variable;
            }
            if ((i & 4) != 0) {
                list = dictionaryEntry.parents;
            }
            return dictionaryEntry.copy(str, variableValue, list);
        }

        public final String component1() {
            return this.key;
        }

        public final VariableValue component2() {
            return this.variable;
        }

        public final List<String> component3() {
            return this.parents;
        }

        public final DictionaryEntry copy(String str, VariableValue variableValue, List<String> list) {
            C13706o.m87929f(str, "key");
            C13706o.m87929f(variableValue, "variable");
            return new DictionaryEntry(str, variableValue, list);
        }

        public VariableValue copy() {
            return new DictionaryEntry(this.key, this.variable, this.parents);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DictionaryEntry)) {
                return false;
            }
            DictionaryEntry dictionaryEntry = (DictionaryEntry) obj;
            return C13706o.m87924a(this.key, dictionaryEntry.key) && C13706o.m87924a(this.variable, dictionaryEntry.variable) && C13706o.m87924a(this.parents, dictionaryEntry.parents);
        }

        public final String getKey() {
            return this.key;
        }

        public final List<String> getParents() {
            return this.parents;
        }

        public String getValueAsText() {
            return this.variable.getValueAsText();
        }

        public final VariableValue getVariable() {
            return this.variable;
        }

        public int getVariableType() {
            return this.variableType;
        }

        public int hashCode() {
            int hashCode = ((this.key.hashCode() * 31) + this.variable.hashCode()) * 31;
            List<String> list = this.parents;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final void setVariable(VariableValue variableValue) {
            C13706o.m87929f(variableValue, "<set-?>");
            this.variable = variableValue;
        }

        public String toString() {
            return "DictionaryEntry(key=" + this.key + ", variable=" + this.variable + ", parents=" + this.parents + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeString(this.key);
            parcel.writeParcelable(this.variable, i);
            parcel.writeStringList(this.parents);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DictionaryEntry(String str, VariableValue variableValue, List list, int i, C13695i iVar) {
            this(str, variableValue, (i & 4) != 0 ? null : list);
        }
    }

    @DontObfuscate
    /* compiled from: VariableValue.kt */
    public static final class IntegerValue extends VariableValue {
        public static final Parcelable.Creator<IntegerValue> CREATOR = new C6482b();
        public static final C6481a Companion = new C6481a((C13695i) null);
        private final long intValue;
        private final List<String> parents;
        private final int variableType;

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$IntegerValue$a */
        /* compiled from: VariableValue.kt */
        public static final class C6481a {
            private C6481a() {
            }

            public /* synthetic */ C6481a(C13695i iVar) {
                this();
            }

            /* renamed from: a */
            public final VariableValue mo32638a(String str, List<String> list) {
                C13706o.m87929f(str, "stringValue");
                Long n = C15175u.m93624n(str);
                return new IntegerValue(n != null ? n.longValue() : 0, list);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$IntegerValue$b */
        /* compiled from: VariableValue.kt */
        public static final class C6482b implements Parcelable.Creator<IntegerValue> {
            /* renamed from: a */
            public final IntegerValue createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                return new IntegerValue(parcel.readLong(), parcel.createStringArrayList());
            }

            /* renamed from: b */
            public final IntegerValue[] newArray(int i) {
                return new IntegerValue[i];
            }
        }

        public IntegerValue() {
            this(0, (List) null, 3, (C13695i) null);
        }

        public IntegerValue(long j, List<String> list) {
            super(list, (C13695i) null);
            this.intValue = j;
            this.parents = list;
            this.variableType = 1;
        }

        public static /* synthetic */ IntegerValue copy$default(IntegerValue integerValue, long j, List<String> list, int i, Object obj) {
            if ((i & 1) != 0) {
                j = integerValue.intValue;
            }
            if ((i & 2) != 0) {
                list = integerValue.parents;
            }
            return integerValue.copy(j, list);
        }

        public final long component1() {
            return this.intValue;
        }

        public final List<String> component2() {
            return this.parents;
        }

        public final IntegerValue copy(long j, List<String> list) {
            return new IntegerValue(j, list);
        }

        public VariableValue copy() {
            return new IntegerValue(this.intValue, this.parents);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntegerValue)) {
                return false;
            }
            IntegerValue integerValue = (IntegerValue) obj;
            return this.intValue == integerValue.intValue && C13706o.m87924a(this.parents, integerValue.parents);
        }

        public final long getIntValue() {
            return this.intValue;
        }

        public final List<String> getParents() {
            return this.parents;
        }

        public String getValueAsText() {
            return String.valueOf(this.intValue);
        }

        public int getVariableType() {
            return this.variableType;
        }

        public int hashCode() {
            int a = C1405a.m633a(this.intValue) * 31;
            List<String> list = this.parents;
            return a + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "IntegerValue(intValue=" + this.intValue + ", parents=" + this.parents + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeLong(this.intValue);
            parcel.writeStringList(this.parents);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IntegerValue(long j, List list, int i, C13695i iVar) {
            this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : list);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public IntegerValue(java.lang.String r9) {
            /*
                r8 = this;
                java.lang.String r0 = "valueAsString"
                kotlin.jvm.internal.C13706o.m87929f(r9, r0)
                long r0 = java.lang.Long.parseLong(r9)     // Catch:{ Exception -> 0x000b }
            L_0x0009:
                r3 = r0
                goto L_0x000e
            L_0x000b:
                r0 = 0
                goto L_0x0009
            L_0x000e:
                r5 = 0
                r6 = 2
                r7 = 0
                r2 = r8
                r2.<init>(r3, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.variables.VariableValue.IntegerValue.<init>(java.lang.String):void");
        }
    }

    @DontObfuscate
    /* compiled from: VariableValue.kt */
    public static final class StringValue extends VariableValue {
        public static final Parcelable.Creator<StringValue> CREATOR = new C6484b();
        public static final C6483a Companion = new C6483a((C13695i) null);
        private final List<String> parents;
        private final String textValue;
        private final int variableType;

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$StringValue$a */
        /* compiled from: VariableValue.kt */
        public static final class C6483a {
            private C6483a() {
            }

            public /* synthetic */ C6483a(C13695i iVar) {
                this();
            }

            /* renamed from: a */
            public final VariableValue mo32653a(String str, List<String> list) {
                C13706o.m87929f(str, "stringValue");
                return new StringValue(str, list);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.variables.VariableValue$StringValue$b */
        /* compiled from: VariableValue.kt */
        public static final class C6484b implements Parcelable.Creator<StringValue> {
            /* renamed from: a */
            public final StringValue createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                return new StringValue(parcel.readString(), parcel.createStringArrayList());
            }

            /* renamed from: b */
            public final StringValue[] newArray(int i) {
                return new StringValue[i];
            }
        }

        public StringValue() {
            this((String) null, (List) null, 3, (C13695i) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StringValue(String str, List<String> list) {
            super(list, (C13695i) null);
            C13706o.m87929f(str, "textValue");
            this.textValue = str;
            this.parents = list;
            this.variableType = 2;
        }

        public static /* synthetic */ StringValue copy$default(StringValue stringValue, String str, List<String> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stringValue.textValue;
            }
            if ((i & 2) != 0) {
                list = stringValue.parents;
            }
            return stringValue.copy(str, list);
        }

        public final String component1() {
            return this.textValue;
        }

        public final List<String> component2() {
            return this.parents;
        }

        public final StringValue copy(String str, List<String> list) {
            C13706o.m87929f(str, "textValue");
            return new StringValue(str, list);
        }

        public VariableValue copy() {
            return new StringValue(this.textValue, this.parents);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringValue)) {
                return false;
            }
            StringValue stringValue = (StringValue) obj;
            return C13706o.m87924a(this.textValue, stringValue.textValue) && C13706o.m87924a(this.parents, stringValue.parents);
        }

        public final List<String> getParents() {
            return this.parents;
        }

        public final String getTextValue() {
            return this.textValue;
        }

        public String getValueAsText() {
            return this.textValue;
        }

        public int getVariableType() {
            return this.variableType;
        }

        public int hashCode() {
            int hashCode = this.textValue.hashCode() * 31;
            List<String> list = this.parents;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "StringValue(textValue=" + this.textValue + ", parents=" + this.parents + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeString(this.textValue);
            parcel.writeStringList(this.parents);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StringValue(String str, List list, int i, C13695i iVar) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VariableValue(List list, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : list, (C13695i) null);
    }

    private VariableValue() {
        this((List) null, (C13695i) null);
    }
}
