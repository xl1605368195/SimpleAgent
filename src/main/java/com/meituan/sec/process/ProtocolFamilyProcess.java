package com.meituan.sec.process;

import java.net.ProtocolFamily;

public class ProtocolFamilyProcess {
    public static Object transform(Object object) {
        if (object == null)
            return null;
        return ((ProtocolFamily)object).name();
    }
}
