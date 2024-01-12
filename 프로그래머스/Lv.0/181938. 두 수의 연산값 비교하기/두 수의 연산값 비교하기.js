function solution(a, b) {    
    num1 = Number(`${a}${b}`);
    num2 = 2 * a * b;
    return num1 < num2 ? num2 : num1;
}