def valid(num):
    ip_arr =[]
    if ( len(num) > 12 or len(num) < 4):
        print("Enter a valid ip address!")
        exit
    else:
        return ip_arr

def check(new,arr):
    check1 = map(lambda x: True if 0 <= int(x) < 256 else False, new)
    check2 = map(lambda x: True if 0 < len(x) < 4 else False, new)
    if (all(check1) and all(check2) == True):
        add = [str(int(l)) for l in new]
        joint = '.'.join(add)
        if joint not in arr:
            arr.append(joint)

def possiblecombination(x,arr):
    for i in range(1, 4):
        for j in range(i+1, i+4):
            for k in range(j+1, len(x)):
                y = [x[:i], x[i:j], x[j:k], x[k:]]
                check(y,arr)
    return arr

def main(x):
    arr = valid(x)
    result = possiblecombination(x,arr)
    print(result)

if __name__ == '__main__':
    string = str(input('Enter the String : '))
    main(string)
