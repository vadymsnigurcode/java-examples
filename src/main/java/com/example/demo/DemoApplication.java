package com.example.demo;

import com.example.thread.execute.DeadLockingAction;
import com.example.thread.execute.race.condition.action.LongWrapper;
import com.example.thread.execute.race.condition.action.RaceCondition;
import com.example.thread.execute.singlethread.RunSingleThread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		// console examples section
//		RunSingleThread runSingleThread = new RunSingleThread();
//		runSingleThread.executeThread();

		//Race Condition example
//		RaceCondition raceCondition = new RaceCondition();
//		raceCondition.execute();

		// DeadLockExample
//		DeadLockingAction deadLockingAction = new DeadLockingAction();
//		deadLockingAction.execute();

		//SpringApplication.run(DemoApplication.class, args);
	}

}
