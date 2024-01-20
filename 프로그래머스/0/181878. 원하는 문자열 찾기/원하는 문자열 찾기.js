function solution(myString, pat) {
    return RegExp(pat, 'i').test(myString) ? 1 : 0;
}