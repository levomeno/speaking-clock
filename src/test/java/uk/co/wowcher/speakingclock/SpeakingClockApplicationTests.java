package uk.co.wowcher.speakingclock;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class SpeakingClockApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testConvertToWords() {
		assertEquals("It's eight thirty four", TimeConverter.convertTimeToWords("08:34"));
		assertEquals("It's noon", TimeConverter.convertTimeToWords("12:00"));
		assertEquals("It's midnight", TimeConverter.convertTimeToWords("00:00"));
		assertEquals("It's eight forty", TimeConverter.convertTimeToWords("08:40"));
		assertEquals("It's five forty five", TimeConverter.convertTimeToWords("05:45"));
		assertEquals("It's six fifteen", TimeConverter.convertTimeToWords("06:15"));

	}
}
