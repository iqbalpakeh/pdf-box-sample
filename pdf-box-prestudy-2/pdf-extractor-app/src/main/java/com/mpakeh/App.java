package com.mpakeh;

import org.apache.pdfbox.text.TextPosition;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    // 1. Build first project structure with maven
    // 2. Download dependency jar file and use local
    // 3. Follow the example here on POM
    // 4. NOTE: SystemPath is deprecated, use this instead
    //    http://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html

    public static void main( String[] args )
    {
        List<TextPosition> rowContent = new ArrayList();
        System.out.println( "Hello World!" );
    }
}
