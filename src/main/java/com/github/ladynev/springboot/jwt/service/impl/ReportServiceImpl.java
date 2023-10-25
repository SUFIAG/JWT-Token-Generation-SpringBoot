package com.github.ladynev.springboot.jwt.service.impl;

import com.github.ladynev.springboot.jwt.domain.Report;
import com.github.ladynev.springboot.jwt.service.ReportService;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author V.Ladynev
 */
public class ReportServiceImpl implements ReportService {

    public Collection<Report> getAllReports() {
        return Arrays.asList(
                new Report("The First Report"),
                new Report("The Second Report")
        );
    }

}