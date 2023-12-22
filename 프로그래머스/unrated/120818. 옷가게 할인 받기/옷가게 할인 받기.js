function solution(price) {
    let rate = (500000 <= price) ? 0.8 : (300000 <= price ? 0.9 : (100000 <= price ? 0.95 : 1.0));
    return Math.floor(price * rate);

}