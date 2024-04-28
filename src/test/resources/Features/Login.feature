Feature: Validating the login credentials

	Scenario Outline:  verifying the OMR user input username and password
	
		Given Login page on omr branch
		When Enter the "<userName>" and "<password>"
		And Click the login button
		Then verify successful login message  
		
		
	Examples:

			|userName|password|
			|rajaachandramohan@gmail.com|Ayyappan!1991|
			|spprem.act@gmail.com|Ajeesh@1234|
			
			
		Scenario Outline: Verifying the search functionality of Amazon page
		Given User is on Amazon page
		When User enter the "<productName>" 
		Then verify search results message
		
		Examples: 
		 |productName|
		 |iPhone|			