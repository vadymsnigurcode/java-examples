package com.example.demo;

import com.example.data.generate.*;
import com.example.thread.execute.DeadLockingAction;
import com.example.thread.execute.race.condition.action.RaceCondition;
import com.example.thread.execute.singlethread.RunSingleThread;
import com.example.thread.producerconsumer.ProducerConsumerSample;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		// console examples section
//		RunSingleThread runSingleThread = new RunSingleThread();
//		runSingleThread.executeThread();
//		ProducerConsumerSample producerConsumerSample = new ProducerConsumerSample();
//		producerConsumerSample.execute();

		//Race Condition example
//		RaceCondition raceCondition = new RaceCondition();
//		raceCondition.execute();

		// DeadLockExample
//		DeadLockingAction deadLockingAction = new DeadLockingAction();
//		deadLockingAction.execute();

		//generate dates times example
//		CurrentDate currentDate = new CurrentDate();
//		currentDate.GetCurrentDateTime();
//		currentDate.GetCurrentTime();
//		currentDate.GetCurrentDate();
//		DateGenerate dateGenerate = new DateGenerate();
//		dateGenerate.generateDateOnly();
//		dateGenerate.generateDateOnly(2020,2021,1,1,1,1);
//		DateTimeGenerate dateTimeGenerate = new DateTimeGenerate();
//		dateTimeGenerate.GetLocalDateTime();
//		TimeGenerate timeGenerate = new TimeGenerate();
//		timeGenerate.GetRandomTime();
//		MillisecondsGenerate milGenerate = new MillisecondsGenerate();
//		milGenerate.generateTimeInMilliseconds();

		// generate random strings
		StringGenerate stringGenerate = new StringGenerate();
		stringGenerate.GenerateRandomString();
		FakePersonGenerate fakePersonGenerate = new FakePersonGenerate();
		fakePersonGenerate.GenerateRandomPerson();





		//SpringApplication.run(DemoApplication.class, args);
	}

}
