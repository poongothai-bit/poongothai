a = raw_input("Enter string")
for i in range(len(a)):
    if a.index(a)==i:
        print a[i]
        break
