package basic.java.clasic.utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.*;
import java.util.stream.Stream;

public class MathTest {
    public static void main(String[] args) {


        try (Stream<String> lines = Files.lines(Paths.get("sample.txt"));) {
            lines.forEach(System.out::print);
        } catch (Exception e) {
            e.printStackTrace();
        }


        List<? extends Number> a = new ArrayList<>();




    }





}

