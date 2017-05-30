package com.epam.javatc.rest.task.model.filling;

import com.epam.javatc.rest.task.model.Report;
import java.util.HashSet;
import java.util.Set;

public class ComposeReports {

    public Set<Report> composeTestData() {

        HashSet<Report> reports = new HashSet<>();
        Creator creator = new Creator();

        reports.add(creator.createReport("cube", "ali", "2017-05-25", 10));
        reports.add(creator.createReport("cube", "ozon", "2017-05-25", 50));
        reports.add(creator.createReport("cube", "ulmart", "2017-05-25", 40));

        reports.add(creator.createReport("pyramid", "ali", "2017-05-25", 25));
        reports.add(creator.createReport("pyramid", "ozon", "2017-05-25", 84));
        reports.add(creator.createReport("pyramid", "ulmart", "2017-05-25", 76));

        reports.add(creator.createReport("skewb", "ali", "2017-05-25", 67));
        reports.add(creator.createReport("skewb", "ozon", "2017-05-25", 45));
        reports.add(creator.createReport("skewb", "ulmart", "2017-05-25", 58));

        reports.add(creator.createReport("cube", "ali", "2017-05-20", 55));
        reports.add(creator.createReport("cube", "ozon", "2017-05-20", 45));
        reports.add(creator.createReport("cube", "ulmart", "2017-05-20", 76));

        reports.add(creator.createReport("pyramid", "ali", "2017-05-20", 86));
        reports.add(creator.createReport("pyramid", "ozon", "2017-05-20", 48));
        reports.add(creator.createReport("pyramid", "ulmart", "2017-05-20", 79));

        reports.add(creator.createReport("skewb", "ali", "2017-05-20", 57));
        reports.add(creator.createReport("skewb", "ozon", "2017-05-20", 76));
        reports.add(creator.createReport("skewb", "ulmart", "2017-05-20", 36));

        return reports;
    }

}
