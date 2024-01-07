sum = 0
counter = 1000

while(counter <= 5000):

	if counter % 2 != 0:
		sum += counter
	counter += 1

print(sum)