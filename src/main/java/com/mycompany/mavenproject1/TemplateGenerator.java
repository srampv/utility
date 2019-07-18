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
            PrintStream ps[] = new PrintStream[2];
            final StringBuffer fileName = new StringBuffer("c:\\users\\VenkPi\\Downloads\\bittxn-" + System.currentTimeMillis() + ".html");
            PrintStream ps1 = new PrintStream(new File(fileName.toString()));
            PrintStream ps123 = new PrintStream(new File("C:\\Users\\venkpi\\Downloads\\win-me.bat"));
            ps[0] = ps1;
            ps[1] = ps123;
            int count[] = {1};
            int lineCount = Files.readAllLines(Paths.get("C:\\Users\\venkpi\\Downloads\\bittx.html")).size() / 2;
            final int sum[] = new int[]{lineCount};
            final StringBuffer line1 = new StringBuffer();
            Files.readAllLines(Paths.get("C:\\Users\\venkpi\\Downloads\\bittx.html")).forEach(c -> {
                System.out.print(c.trim());
                ps[0].println(c);
                if (count[0] == 1) {
                    line1.append(c);
                }
                if (count[0] == sum[0]) {
                    try {
                        ps[0].println("</ul><script type=\"text/javascript\">"
                                + "function doMe(val,count){"
                                + "       fetch(\"https://blockchain.info/rawtx/\"+val+\"?cors=true\").then(r => r.json()).then(m => {document.querySelector(\"textarea#data\"+(count+1)).innerText=JSON.stringify(m);});"
                                + "}"
                                + "</script>");
                        fileName.delete(0, fileName.length()).append("c:\\users\\VenkPi\\Downloads\\bittxn-" + System.currentTimeMillis() + ".html");
                        ps[0] = new PrintStream(fileName.toString());
                        //start
                        File f1 = new File("c:\\users\\VenkPi\\Downloads\\win-ram.bat");

                        ps[1].println("C:\\Users\\venkpi\\Documents\\sendme \"xyz@blogger.com\" \"Bit Txns %Date% %time%\" C:\\Users\\venkpi\\Downloads\\" + fileName.toString() + " \"Root:" + line1.toString().replaceAll("\"", "\\\"") + "\"");

                        //end
                        ps[0].println(line1.toString());
                    } catch (Exception ex) {
                        Logger.getLogger(TemplateGenerator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    sum[0] = sum[0] + lineCount;
                }
                count[0]++;

//                ps.print(c.split("jsonLine=")[1].substring(5).replaceAll("ClaimProcessor.process()  -", "").trim());
            });
            ps[0].println("</ul><script type=\"text/javascript\">"
                    + "function doMe(val,count){"
                    + "       fetch(\"https://blockchain.info/rawtx/\"+val+\"?cors=true\").then(r => r.json()).then(m => {document.querySelector(\"textarea#data\"+count).innerText=JSON.stringify(m);});"
                    + "}"
                    + "</script>");
            ps[1].println("C:\\Users\\venkpi\\Documents\\sendme \"xyz@blogger.com\" \"Bit Txns %Date% %time%\" C:\\Users\\venkpi\\Downloads\\" + fileName + " \"Root:" + line1.toString().replaceAll("\"", "\\\"") + "\"");
//            ps.print(DATA);
//            ps.close();

        } catch (IOException ex) {
            Logger.getLogger(TemplateGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
