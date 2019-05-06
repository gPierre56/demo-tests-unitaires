package dev.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() {

		Assert.assertEquals(1, StringUtils.levenshteinDistance("chats", "chat"));
		Assert.assertEquals(1, StringUtils.levenshteinDistance("machins", "machine"));
		Assert.assertEquals(1, StringUtils.levenshteinDistance("aviron", "avion"));
		Assert.assertEquals(2, StringUtils.levenshteinDistance("Chien", "Chine"));
		Assert.assertEquals(0, StringUtils.levenshteinDistance(null, "instance"));

	}

}
