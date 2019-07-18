/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VenkPi
 */
public class TemplateGenerator {

    public static void main(String[] args) {
        try {
            final Integer[] i = new Integer[]{1};

            String DATA = "<html><head><link type='text/css' href='ext-all.css'></link>"
                    + "<link type='text/css' href='forms.css'></link>"
                    + "<link type='text/css' href='examples.css'></link>"
                    + "<script type='text/javascript' src='ext-base.js'></script>"
                    + "<script type='text/javascript' src='ext-all-debug.js'></script>"
                    + "<script type='text/javascript' src='examples.js'></script>"
                    + "<script type='text/javascript' src='dynamic.js'></script>"
                    + "<script type='text/javascript' src='states.js'></script>"
                    + "<script type='text/javascript' src='ext-all.js'></script>"
                    + "<script type='text/javascript' src='ext-base.js'></script><link type='text/css' href='aui-page-layout.css'></link>"
                    + "<link type='text/css' href='aui-reset.css'></link>"
                    + "<link type='text/css' href='batch.css'></link>"
                    + "<link type='text/css' href='codemirror-overrides.css'></link>"
                    + "<link type='text/css' href='codemirror.css'></link>"
                    + "<link type='text/css' href='diff-comment-context.css'></link>"
                    + "<link type='text/css' href='difftree.css'></link>"
                    + "<link type='text/css' href='file-content.css'></link>"
                    + "<link type='text/css' href='text-view.css'></link>"
                    + "<script type='text/javascript' src='jquery.js'></script><div class=\"CodeMirror cm-s-stash-default\" style=\"height: 255px;\">"
                    + "</head><body><script type=\"text/javascript\" src=\"examples.js\"></script>"
                    + "	<div id='viewport'><div id='hd'/><div id='bd'/><div id='ft'/></div>"
                    + "</body></html>";
            PrintStream ps[] = new PrintStream[1];
            PrintStream ps1 = new PrintStream(new File("c:\\users\\VenkPi\\Downloads\\bittxn-" + System.currentTimeMillis() + ".html"));
            ps[0] = ps1;
            int count[] = {1};
            int lineCount=1450;
            final int sum[]=new int[]{lineCount};
            Files.readAllLines(Paths.get("C:\\Users\\venkpi\\Downloads\\bittx.html")).forEach(c -> {
                System.out.print(c.trim());
                ps[0].println(c);
                if (count[0] == sum[0]) {
                    try {
                        ps[0].println("<script type=\"text/javascript\">"
                                + "function doMe(val,count){"
                                + "       fetch(\"https://blockchain.info/rawtx/\"+val+\"?cors=true\").then(r => r.json()).then(m => {document.querySelector(\"textarea#data\"+(count+1)).innerText=JSON.stringify(m);});"
                                + "}"
                                + "</script>");
                        ps[0] = new PrintStream("c:\\users\\VenkPi\\Downloads\\bittxn-" + System.currentTimeMillis() + ".html");
                        ps[0].println("<table><tbody><tr><th></th><td>Select</td><td>TX</td><td>DATA</td></tr><tr><td colspan=\"2\"><a href=\"#\">Merkle Root:f0f9edbf81a230c8c9339d5350b435a19238c7089c76d589dda007fba00005d5</a></td></tr>");
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(TemplateGenerator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     sum[0]=sum[0]+lineCount;
                }
                count[0]++;
               
//                ps.print(c.split("jsonLine=")[1].substring(5).replaceAll("ClaimProcessor.process()  -", "").trim());

            });
            ps[0].println("<script type=\"text/javascript\">"
                    + "function doMe(val,count){"
                    + "       fetch(\"https://blockchain.info/rawtx/\"+val+\"?cors=true\").then(r => r.json()).then(m => {document.querySelector(\"textarea#data\"+count).innerText=JSON.stringify(m);});"
                    + "}"
                    + "</script>");
//            ps.print(DATA);
//            ps.close();
            File f = new File("c:\\users\\VenkPi\\Downloads");
            Arrays.asList(f.list()).stream().forEach(ce -> {
                if (ce.endsWith(".css")) {
                    System.out.println("<link type='text/css' href='" + ce + "'></link>");
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(TemplateGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
