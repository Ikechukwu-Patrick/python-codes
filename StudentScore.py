number_of_pass = 0
number_of_fail = 0
scores = 0


student = int(input("Enter student score: "))

while scores != -1:
	scores = int(input("Enter student score:  "))
	if scores > 45:
		number_of_pass += 1
	
	if scores < 45:
		number_of_fail += 1

	scores = int(input("Enter student score:  "))

	