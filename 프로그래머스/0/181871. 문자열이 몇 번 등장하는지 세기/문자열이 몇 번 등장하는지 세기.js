function solution(myString, pat) {
    var  i = 0, x = 0;
    while (true) {
        i = myString.indexOf(pat, i);
        if (i === -1)
            return x;
        i++;
        x++;
    }
}