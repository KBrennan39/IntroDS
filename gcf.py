num1 = input("Enter a number: ")
num2 = input("Enter another number:")
num1 = int(num1)
num2 = int(num2)
count = 2
gcf = 1
while count <= min(num1, num2):
    if num1 % count == 0 and num2 % count ==0:
        gcf = count
    count = count + 1
print(gcf)

fname = input('Enter the file name: ')
try:
    fhand = open(fname)
except:
    print('File cannot be opened: ', fname)
    exit()
count = 0
for line in fhand:
    if line.startswith('Subject: '):
        count = count + 1
print('There were', count, 'subject lines in', fname)
