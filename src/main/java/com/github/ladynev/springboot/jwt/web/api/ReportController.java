package com.github.ladynev.springboot.jwt.web.api;

import com.github.ladynev.springboot.jwt.domain.Report;
import com.github.ladynev.springboot.jwt.service.ReportService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Report resource.
 *
 * @author V.Ladynev
 */
@RestController
@RequestMapping("/reports")
public class ReportController {

    private ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ANALYST')")
    public Collection<Report> getReports() {
        return reportService.getAllReports();
    }

}
