package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* renamed from: com.google.protobuf.ExtensionSchemaLite$1 */
    static /* synthetic */ class C115801 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56783a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56783a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f56783a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ExtensionSchemaLite.C115801.<clinit>():void");
        }
    }

    ExtensionSchemaLite() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo65100a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).mo65145c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo65101b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return extensionRegistryLite.mo65097a(messageLite, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public FieldSet<GeneratedMessageLite.ExtensionDescriptor> mo65102c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public FieldSet<GeneratedMessageLite.ExtensionDescriptor> mo65103d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).mo65203T();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo65104e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo65105f(Object obj) {
        mo65102c(obj).mo65139t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public <UT, UB> UB mo65106g(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) throws IOException {
        Object i;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        int c = generatedExtension.mo65209c();
        if (!generatedExtension.f56921d.mo65147u() || !generatedExtension.f56921d.mo65144O()) {
            Object obj2 = null;
            if (generatedExtension.mo65207a() != WireFormat.FieldType.ENUM) {
                switch (C115801.f56783a[generatedExtension.mo65207a().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(reader.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(reader.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(reader.mo64780O());
                        break;
                    case 4:
                        obj2 = Long.valueOf(reader.mo64809w());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(reader.mo64806t());
                        break;
                    case 6:
                        obj2 = Long.valueOf(reader.mo64784b());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(reader.mo64812z());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(reader.mo64790f());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(reader.mo64794j());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(reader.mo64777L());
                        break;
                    case 11:
                        obj2 = Long.valueOf(reader.mo64792h());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(reader.mo64798n());
                        break;
                    case 13:
                        obj2 = Long.valueOf(reader.mo64770E());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = reader.mo64805s();
                        break;
                    case 16:
                        obj2 = reader.mo64771F();
                        break;
                    case 17:
                        obj2 = reader.mo64800p(generatedExtension.mo65208b().getClass(), extensionRegistryLite);
                        break;
                    case 18:
                        obj2 = reader.mo64811y(generatedExtension.mo65208b().getClass(), extensionRegistryLite);
                        break;
                }
            } else {
                int t = reader.mo64806t();
                if (generatedExtension.f56921d.mo65206d().mo60053a(t) == null) {
                    return SchemaUtil.m81156L(c, t, ub, unknownFieldSchema);
                }
                obj2 = Integer.valueOf(t);
            }
            if (generatedExtension.mo65210d()) {
                fieldSet.mo65126a(generatedExtension.f56921d, obj2);
            } else {
                int i2 = C115801.f56783a[generatedExtension.mo65207a().ordinal()];
                if ((i2 == 17 || i2 == 18) && (i = fieldSet.mo65132i(generatedExtension.f56921d)) != null) {
                    obj2 = Internal.m80739h(i, obj2);
                }
                fieldSet.mo65141x(generatedExtension.f56921d, obj2);
            }
        } else {
            switch (C115801.f56783a[generatedExtension.mo65207a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    reader.mo64779N(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    reader.mo64775J(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    reader.mo64795k(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    reader.mo64793i(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    reader.mo64768C(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    reader.mo64807u(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    reader.mo64769D(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    reader.mo64799o(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    reader.mo64810x(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    reader.mo64786c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    reader.mo64767B(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    reader.mo64808v(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    reader.mo64787d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    reader.mo64796l(arrayList);
                    ub = SchemaUtil.m81201z(c, arrayList, generatedExtension.f56921d.mo65206d(), ub, unknownFieldSchema);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.f56921d.mo65142D());
            }
            fieldSet.mo65141x(generatedExtension.f56921d, arrayList);
        }
        return ub;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo65107h(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.mo65141x(generatedExtension.f56921d, reader.mo64811y(generatedExtension.mo65208b().getClass(), extensionRegistryLite));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo65108i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite E0 = generatedExtension.mo65208b().mo65175d().mo65192E0();
        BinaryReader Q = BinaryReader.m79393Q(ByteBuffer.wrap(byteString.mo64916V()), true);
        Protobuf.m81041a().mo65364b(E0, Q, extensionRegistryLite);
        fieldSet.mo65141x(generatedExtension.f56921d, E0);
        if (Q.mo64772G() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.m80758a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo65109j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        if (extensionDescriptor.mo65147u()) {
            switch (C115801.f56783a[extensionDescriptor.mo65142D().ordinal()]) {
                case 1:
                    SchemaUtil.m81160P(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 2:
                    SchemaUtil.m81164T(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 3:
                    SchemaUtil.m81167W(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 4:
                    SchemaUtil.m81180e0(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 5:
                    SchemaUtil.m81166V(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 6:
                    SchemaUtil.m81163S(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 7:
                    SchemaUtil.m81162R(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 8:
                    SchemaUtil.m81158N(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 9:
                    SchemaUtil.m81178d0(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 10:
                    SchemaUtil.m81169Y(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 11:
                    SchemaUtil.m81170Z(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 12:
                    SchemaUtil.m81172a0(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 13:
                    SchemaUtil.m81174b0(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 14:
                    SchemaUtil.m81166V(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, extensionDescriptor.mo65144O());
                    return;
                case 15:
                    SchemaUtil.m81159O(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer);
                    return;
                case 16:
                    SchemaUtil.m81176c0(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        SchemaUtil.m81165U(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, Protobuf.m81041a().mo65366d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        SchemaUtil.m81168X(extensionDescriptor.mo65145c(), (List) entry.getValue(), writer, Protobuf.m81041a().mo65366d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (C115801.f56783a[extensionDescriptor.mo65142D().ordinal()]) {
                case 1:
                    writer.mo64848t(extensionDescriptor.mo65145c(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    writer.mo64821I(extensionDescriptor.mo65145c(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    writer.mo64813A(extensionDescriptor.mo65145c(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    writer.mo64867g(extensionDescriptor.mo65145c(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    writer.mo64870k(extensionDescriptor.mo65145c(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    writer.mo64874x(extensionDescriptor.mo65145c(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    writer.mo64865d(extensionDescriptor.mo65145c(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    writer.mo64855B(extensionDescriptor.mo65145c(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    writer.mo64872s(extensionDescriptor.mo65145c(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    writer.mo64814C(extensionDescriptor.mo65145c(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    writer.mo64841l(extensionDescriptor.mo65145c(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    writer.mo64861O(extensionDescriptor.mo65145c(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    writer.mo64871p(extensionDescriptor.mo65145c(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    writer.mo64870k(extensionDescriptor.mo65145c(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    writer.mo64869j(extensionDescriptor.mo65145c(), (ByteString) entry.getValue());
                    return;
                case 16:
                    writer.mo64866f(extensionDescriptor.mo65145c(), (String) entry.getValue());
                    return;
                case 17:
                    writer.mo64868i(extensionDescriptor.mo65145c(), entry.getValue(), Protobuf.m81041a().mo65366d(entry.getValue().getClass()));
                    return;
                case 18:
                    writer.mo64873w(extensionDescriptor.mo65145c(), entry.getValue(), Protobuf.m81041a().mo65366d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
