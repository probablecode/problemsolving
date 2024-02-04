function solution(arr) {
    var row = arr.length;
    var col = arr[0].length;
    if (row < col)
        for (var i = 0; i < col - row; i++)
            arr.push(new Array(col).fill(0));
    else if (col < row)
        for (var i = 0; i < row; i++)
            arr[i].push(... new Array(row - col).fill(0));
    return arr;
}