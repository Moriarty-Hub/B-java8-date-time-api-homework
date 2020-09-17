package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    LocalDate labourDayOfThisYear = LocalDate.of(date.getYear(), Month.MAY, 1);

    if (date.isAfter(labourDayOfThisYear)) {
      LocalDate labourDayOfNextYear = labourDayOfThisYear.plusYears(1);
      return DAYS.between(date, labourDayOfNextYear);
    }

    return DAYS.between(date, labourDayOfThisYear);
  }
}
