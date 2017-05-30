package com.epam.javatc.rest.task.model.filling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateAdapter {

    private final SimpleDateFormat format;

    public DateAdapter(SimpleDateFormat format) {
        this.format = format;
    }

    public Date toDateFormat(String date) {

        Date dateFormat = null;
        try {
            dateFormat = format.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(ComposeReports.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dateFormat;
    }

}
