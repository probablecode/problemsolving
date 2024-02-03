function solution(picture, k) {
    return picture.reduce((ret, row) => ret.concat(Array(k).fill(
        row.split('').reduce((str, ch) => str + ch.repeat(k), ""))
    ), []);
}