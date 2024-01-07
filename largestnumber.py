def largest_number(number1,number2,number3):
	largest_number = number1

	if number2 > number1:
		largest_number = number2

	elif number3 > number2:
		largest_number = number3   
	return largest_number
print(largest_number(4,8,5))