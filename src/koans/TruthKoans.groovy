package koans;

/**
* Groovy Truth
* 
* Instructions: Replace __ with either a true or false.
*
* For more information, See:
* - http://groovy.codehaus.org/Groovy+Truth
*
*/
class TruthKoans extends Koans {
	public static ZERO = 0
	public static NON_ZERO = 3
	public static EMPTY_STRING = ""
	public static NEGATIVE_NUMBER = -1

	// Boolean expressions
	
	void testTrueForTruth() {
		assertTruth __, true
	}
	
	void testFalseForTruth() {
		assertTruth __, false
	}
	
	// Objects
	
	void testNullForTruth() {
		assertTruth __, null
	}

	void testObjectReferencesForTruth() {
		assertTruth __, new Object()
	}
	
	// Numbers
	
	void testZeroForTruth() {
		assertTruth __, ZERO
	}
	
	void testNonZeroForTruth() {
		assertTruth __, NON_ZERO
	}
	
	void testNegativeNumberForTruth() {
		assertTruth __, NEGATIVE_NUMBER
	}
	
	// Strings
	
	void testEmptyStringForTruth() {
		assertTruth __, EMPTY_STRING
	}
	
	void testNonEmptyForTruth() {
		assertTruth __, "Groovy is cool!!!"
	}
	
	// Collections
	
	void testEmptyCollectionForTruth() {
		assertTruth __, []
	}
	
	void testCollectionWithItemsForTruth() {
		assertTruth __, [1,2,3] 
	}
	
	void testIteratorOnEmptyCollectionForTruth() {
		assertTruth __, [].iterator()
	}
	
	void testIteratorOnNonEmptyForTruth() {
		assertTruth __, [1,2,3].iterator()
	}
	
	// Maps
	
	void testEmptyMapForTruth() {
		assertTruth __, [:]
	}
	
	void testPopulatedMapForTruth() {
		assertTruth __, ['one':1]
	}
	
	// Matchers
	
	void testUnMatchingMatcherForTruth() {
		assertEquals __, 'Hello Groovy' =~ /World/
	}
	
	void testMatchingMatcherForTruth() {
		assertEquals __, 'Hello World' =~ /World/
	}
	
}