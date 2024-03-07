package com.SpringBootStopwatchApp.runner;

import java.util.Iterator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
@Component
public class TestStopwatchRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("STARTED");
		StopWatch  st=new StopWatch("FULL TASK");
		st.start("LOOP#1");

		for (int i = 1; i < 999999; i++) {
			Math.pow(i*i*i, Math.pow(2*i+1, i*i));
		}
		st.stop();
		st.start("LOOP#2");
		for (int i = 1; i < 888888; i++) {
			Math.pow(i*i*i, Math.pow(2*i+1, i*i));
		}
		st.stop();
		st.start("LOOP#3");
		for (int i = 1; i < 777777; i++) {
			Math.pow(i*i*i, Math.pow(2*i+1, i*i));
		}
		st.stop();
		//st.stop();
		
		String output=st.prettyPrint();
		System.out.println(output);
//		System.out.println("NANO SEC: "+st.getTotalTimeNanos());
//		System.out.println("MILLI SEC: "+st.getTotalTimeMillis());
//		System.out.println("SEC: "+st.getTotalTimeSeconds());
		
		System.out.println("FINISHED");
	}

}
