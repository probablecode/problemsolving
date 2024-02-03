function solution(myString) {
    return myString.split('').map(v => v < 'l' ? 'l' : v).join('');
}