def largest(number1, number2, number3)
	largest = number1

	if number2 > number1
		largest = number2

	elif number3 > number2
		largest = number3

	return largest
print(largest(8,9,2))