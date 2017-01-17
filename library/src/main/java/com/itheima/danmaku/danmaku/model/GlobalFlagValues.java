package com.itheima.danmaku.danmaku.model;

public class GlobalFlagValues {

    public int MEASURE_RESET_FLAG = 0;
    public int VISIBLE_RESET_FLAG = 0;
    public int FILTER_RESET_FLAG = 0;
    public int FIRST_SHOWN_RESET_FLAG = 0;
    public int SYNC_TIME_OFFSET_RESET_FLAG = 0;
    public int PREPARE_RESET_FLAG = 0;

    public void resetAll() {
        VISIBLE_RESET_FLAG = 0;
        MEASURE_RESET_FLAG = 0;
        FILTER_RESET_FLAG = 0;
        FIRST_SHOWN_RESET_FLAG = 0;
        SYNC_TIME_OFFSET_RESET_FLAG = 0;
        PREPARE_RESET_FLAG = 0;
    }

    public void updateVisibleFlag() {
        VISIBLE_RESET_FLAG++;
    }

    public void updateMeasureFlag() {
        MEASURE_RESET_FLAG++;
    }

    public void updateFilterFlag() {
        FILTER_RESET_FLAG++;
    }

    public void updateFirstShownFlag() {
        FIRST_SHOWN_RESET_FLAG++;
    }

    public void updateSyncOffsetTimeFlag() {
        SYNC_TIME_OFFSET_RESET_FLAG++;
    }

    public void updatePrepareFlag() {
        PREPARE_RESET_FLAG++;
    }
}
