print("Welcome to the tip calculator!")
bill = float(input("What is the total bill? $"))
tip = int(input("How much tip would you like to pay? 10, 12, or 15? "))
people = int(input("How many people to slipt the bill? "))
per_person_payment = ("{:.2f}".format(bill * (1 + tip/100)/people))
print("Each person should pay: $",per_person_payment)
