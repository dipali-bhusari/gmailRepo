Feature: This file contains tests of different products of"https://www.igp.com"
	
	
	
	
	Scenario: Verify search result for polo men
	Given openChrome
	And application url launched
	When user serches polo men
	Then all result related to polo men should be displayed 

	