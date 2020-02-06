package com.mpakeh;

import com.giaybac.traprange.MAIN;
import com.giaybac.traprange.PDFTableExtractor;
import com.giaybac.traprange.entity.Table;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import java.io.File;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PropertyConfigurator.configure(MAIN.class.getResource("log4j.properties"));

        List<Logger> loggers = Collections.<Logger>list(LogManager.getCurrentLoggers());
        loggers.add(LogManager.getRootLogger());
        for ( Logger logger : loggers ) {
            logger.setLevel(Level.OFF);
        }

        PDFTableExtractor extractor = new PDFTableExtractor();
        List<Table> tables = extractor.setSource("res" + File.separator + "sample-1.pdf")
                .addPage(0)
                .addPage(1)
                .exceptLine(new int[]{0, 1, -1}) //the first line in each page, the second line in each page, the last line in each page
                .extract();
        String html = tables.get(0).toHtml();//table in html format
        String csv = tables.get(0).toString();//table in csv format using semicolon as a delimiter

        System.out.println(csv);
    }

}
