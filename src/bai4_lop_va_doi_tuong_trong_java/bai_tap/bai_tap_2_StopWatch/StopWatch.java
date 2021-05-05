package bai4_lop_va_doi_tuong_trong_java.bai_tap.bai_tap_2_StopWatch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime starTime, endTime;

    public StopWatch() {
        starTime = LocalTime.now();
    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.starTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStarTime() {
        return starTime;
    }

    public LocalTime getEndTime() {

        return endTime;
    }

    public void start() {
        starTime = LocalTime.now();
    }

    public void stop() {
        endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        int miliSecond = ((endTime.getHour() - starTime.getHour()) * 3600 + (endTime.getMinute() - starTime.getMinute()) * 60 + (endTime.getSecond() - starTime.getSecond()) * 1000);
        return miliSecond;
    }
}
