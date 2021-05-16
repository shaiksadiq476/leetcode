package com.sadiqshaik.practise;

/*
 *
 * Author       - Shaik Jaafar Sadiq
 * Created Date - 5/16/21
 * Licensed under the Shaik Jaafar Sadiq, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class JavaTimeDateApi {
 public static void main(String[] args) {
  LocalDate localDate = LocalDate.now();
  System.out.println(localDate);

  System.out.println(localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));

  System.out.println(localDate.atStartOfDay());

  System.out.println(localDate.minus(1, ChronoUnit.DAYS));
  System.out.println(localDate.minus(1, ChronoUnit.MONTHS));

  LocalDateTime localDateTime = LocalDateTime.now();
  System.out.println(localDateTime);

  System.out.println(localDateTime.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));

  System.out.println(localDateTime.minus(1, ChronoUnit.DAYS));
  System.out.println(localDateTime.minus(1, ChronoUnit.MONTHS));

 }
}
