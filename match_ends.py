strings  = ["hello", "I", "A", "mom", "yummy"]

def match_ends(strings):
    count =0;
    for x in range(len(strings)):
        if len(strings[x]) >= 2 and strings[x][0] == strings[x][len(strings[x])-1]:
            count+=1
    return count
print(match_ends(strings))
