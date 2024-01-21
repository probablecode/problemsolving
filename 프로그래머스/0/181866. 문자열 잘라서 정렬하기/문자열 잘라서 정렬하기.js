function solution(myString) {
    return myString.split('x').filter(v => 0 < v.length).sort();
}