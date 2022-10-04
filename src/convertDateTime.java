import java.time.*;
        import java.time.format.DateTimeFormatter;

public class convertDateTime {

    public static void main(String[]args){

        //Date pattern 2020-06-01
        LocalDate localDate = LocalDate.parse("2020-06-01");
        System.out.println(localDate);

        //Time pattern 10:15:30
        LocalTime localTime = LocalTime.parse("12:23:44");
        System.out.println(localTime);

        //pattern 2020-06-01Т11:20:15
        LocalDateTime localDateTime = LocalDateTime.parse("2020-06-01T11:20:15");
        System.out.println(localDateTime);

        //pattern 2020-06-01T10:15:30+09:00[Asia/Tokyo]
        //ZonedDateTime ZonedDateTime = ZonedDateTime.parse("2020-06-01Т10:15:30+09:00[Asia/Tokyo]");

        //pattern 2007-12-03Т10:15:30+01:00
        //OffsetDateTime offsetDateTime = OffsetDateTime.parse("2007-12-03Т10:15:30+01:00");

        //pattern 10:15:30+01:00
        OffsetTime offsetTime = OffsetTime.parse("10:15:30+01:00");
        System.out.println(offsetTime);

        //Custom formate
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDateFormatted = LocalDate.parse("01.06.2020", dateFormatter);
        System.out.println(localDateFormatted);


    }

}
