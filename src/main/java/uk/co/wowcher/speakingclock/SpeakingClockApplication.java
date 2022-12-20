package uk.co.wowcher.speakingclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static uk.co.wowcher.speakingclock.TimeConverter.convertTimeToWords;

@SpringBootApplication
public class SpeakingClockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeakingClockApplication.class, args);

		String time = "08:34";
		String timeInWords = convertTimeToWords(time);
		System.out.println(timeInWords);

	}
}
