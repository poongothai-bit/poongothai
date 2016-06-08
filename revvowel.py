def vowel(x):
    x = x.lower()
    s = 'aeiou'
    if x in s:
        return True
    else:
        return False

def main():
    string = str(input("Enter the String : "))
    a = []
    r = []
    for s in reversed(string):
        r.append(s)
        y = vowel(s)
        if(y == False):
            a.append(s)
    rev = r[0]
    for i in range(1,len(r)):
        rev += r[i]
    print("Reversed output : %s" %rev)
    ans = a[0]
    for i in range(1,len(a)):
        ans += a[i]
    print("Removed output : %s"%ans)

if __name__ == '__main__':
    main()
