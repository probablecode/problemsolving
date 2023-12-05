function solution(numbers) {
    var sum = numbers.reduce((acc, val, idx, ths) => {
        return acc + val;
    }, 0);
    return sum / numbers.length;
}