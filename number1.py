number1 = int(input("Enter 3 integers"))

number2 = int(input("Enter another 3 integer"))

number3 = int(input("Enter another 3 integer"))

if number1 > number2 and number1 > number3:
	print("The greatest is", number1)

if number2 > number1 and number2 > number3:
	print("The greatest is", number2)

if number3 > number1 and number3 > number2:
	print("The greatest is", number3)

