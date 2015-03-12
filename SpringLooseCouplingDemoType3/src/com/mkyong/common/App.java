package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.output.OutputHelper;

public class App 100
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
    	   new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml"});

    	OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	output.generateOutput();

    }
}