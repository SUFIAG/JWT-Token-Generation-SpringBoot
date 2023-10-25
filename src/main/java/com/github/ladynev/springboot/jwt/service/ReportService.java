package com.github.ladynev.springboot.jwt.service;

import com.github.ladynev.springboot.jwt.domain.Report;

import java.util.Collection;

/**
 * @author V.Ladynev
 */
public interface ReportService {

    Collection<Report> getAllReports();

}