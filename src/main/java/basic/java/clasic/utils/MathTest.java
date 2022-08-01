package basic.java.clasic.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.*;

public class MathTest {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        now = now.with(DayOfWeek.MONDAY);
        System.out.println(now);

    }






}

