counter = 0

def incr():
    global counter
    counter += 1
    return counter


x = lambda: incr()

print(x())
print(x())
print(x())
print(x())
