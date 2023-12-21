package com.example.maintanencerequestserver.domain.maintanencerequest.models;

import com.example.maintanencerequestserver.domain.maintenceRequest.models.MaintenceRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class maintanenceRequestTest {
    @Test
    public void constructorTest01() {
        // Note: The constructor for Date is deprecated; consider using java.time.LocalDate instead

        // Creating a date using java.util.Calendar (deprecated)
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.DECEMBER, 23);
        Date date = calendar.getTime();

        MaintenceRequest maintenceRequest = new MaintenceRequest("Sam", "Mcc", "sam@sam.com", "H26", "Broken pipe", date);
        maintenceRequest.setId(1L);

        String expected = "1 Sam Mcc sam@sam.com H26 Broken pipe 2023-12-23";
        String actual = maintenceRequest.toString();

        Assertions.assertEquals(expected, actual);
    }
}

