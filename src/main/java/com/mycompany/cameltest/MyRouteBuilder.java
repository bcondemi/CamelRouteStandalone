package com.mycompany.cameltest;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        // here is a sample which processes the input files
        // (leaving them in place - see the 'noop' flag)
        // then performs content based routing on the message using XPath
        from("stream:file?fileName=c:\\test\\input\\stream.txt&scanStream=true&scanStreamDelay=1000")
                .log("route message")
                .convertBodyTo(String.class)
                .log(this.body().toString())
                .bean(new HelperLog(),"log")
                
                .log("ritorno"+this.body().toString())
                
                ;
    }

}
