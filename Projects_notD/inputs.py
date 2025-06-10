fname = input("plesse enter your name:")
lname = input("plese enter the last name ")
id = (input("plese enter ur id:"))
if (len(fname)<=2):
    print(fname," is not a valid first name. It is too short")
if (len(lname) <=2 or lname== "" ):
    print("The last name must be filled in")
if (id==[1234567890]):
    print(id," is not a valid ID")