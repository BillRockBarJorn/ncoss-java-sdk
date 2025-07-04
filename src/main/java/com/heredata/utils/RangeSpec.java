package com.heredata.utils;

import static com.heredata.utils.LogUtils.getLog;

/**
 * <p>Title: RangeSpec</p>
 * <p>Description: 范围工具类，当需要取文件范围流信息时会用到此类 </p>
 * <p>Copyright: Copyright (c) 2022</p>
 * <p>Company: Here-Data </p>
 * @author wuzz
 * @version 1.0.0
 * @createtime 2022/10/27 15:37
 */
public class RangeSpec {

    private static final String RANGE_PREFIX = "bytes=";

    public enum Type {
        NORMAL_RANGE, // a-b
        START_TO, // a-
        TO_END // -b
    }

    private long start;
    private long end;
    private Type type;

    public RangeSpec() {
        this(0, 0, Type.NORMAL_RANGE);
    }

    public RangeSpec(long start, long end, Type type) {
        this.start = start;
        this.end = end;
        this.type = type;
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public Type getType() {
        return type;
    }

    public static RangeSpec parse(long[] range) {
        if (range == null || range.length != 2) {
            getLog().warn("Invalid range value " + range + ", ignore it and just get entire object");
        }

        long start = range[0];
        long end = range[1];

        if (start < 0 && end < 0 || (start > 0 && end > 0 && start > end)) {
            getLog().warn("Invalid range value [" + start + ", " + end + "], ignore it and just get entire object");
        }

        RangeSpec rs;
        if (start < 0) {
            rs = new RangeSpec(-1, end, Type.TO_END);
        } else if (end < 0) {
            rs = new RangeSpec(start, -1, Type.START_TO);
        } else {
            rs = new RangeSpec(start, end, Type.NORMAL_RANGE);
        }

        return rs;
    }

    @Override
    public String toString() {
        String formatted = null;

        switch (type) {
            case NORMAL_RANGE:
                formatted = String.format("%s%d-%d", RANGE_PREFIX, start, end);
                break;

            case START_TO:
                formatted = String.format("%s%d-", RANGE_PREFIX, start);
                break;

            case TO_END:
                formatted = String.format("%s-%d", RANGE_PREFIX, end);
                break;
        }

        return formatted;
    }
}
